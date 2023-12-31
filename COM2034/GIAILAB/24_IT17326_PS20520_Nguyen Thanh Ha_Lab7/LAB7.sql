﻿USE QLDA
--➢ Nhập vào MaNV cho biết tuổi của nhân viên này.
DROP FUNCTION IF EXISTS FN_TINHTUOI;
GO
CREATE FUNCTION FN_TINHTUOI (@MANV NVARCHAR(9)) 
RETURNS INT
AS
BEGIN
	DECLARE @TUOI INT
	SELECT @TUOI =  YEAR(GETDATE())- YEAR(NGSINH)
	FROM NHANVIEN WHERE MANV = @MANV
	RETURN @TUOI
END

SELECT dbo.FN_TINHTUOI ('003') AS N'Tuổi'
-- C2
SELECT MANV, HONV, TENLOT, TENNV, NGSINH, dbo.FN_TINHTUOI(MANV)AS N'TUỔI' FROM NHANVIEN


-- + NHẬP VÀO MANV CHO BIẾT SỐ LƯỢNG ĐỀ ÁN NHÂN VIÊN NÀY ĐÃ THAM GIA
DROP FUNCTION IF EXISTS FN_BAIY2;
GO
CREATE FUNCTION FN_BAIY2(@MANV NVARCHAR(9)) RETURNS INT
AS
BEGIN
	DECLARE @TONGDEAN INT
	SET @TONGDEAN = (SELECT COUNT(MA_NVIEN) FROM PHANCONG WHERE MA_NVIEN = @MANV)
	RETURN @TONGDEAN
END

SELECT DBO.FN_BAIY2 ('003') AS N'TỔNG ĐỀ ÁN CỦA MANV 003'


-- TRUYỀN THAM SỐ VÀO PHÁI NAM HOẶC NỮ, XUẤT SỐ LƯỢNG NHÂN VIÊN THEO PHÁI
DROP FUNCTION IF EXISTS FN_PHAI;
GO
CREATE FUNCTION FN_PHAI (@PHAI NVARCHAR(3)) RETURNS INT
AS
BEGIN
	DECLARE @TONGNV INT
	SELECT @TONGNV = COUNT(*) FROM NHANVIEN WHERE PHAI = @PHAI
	RETURN @TONGNV
END

SELECT DBO.FN_PHAI('Nam') AS N'TỔNG NHÂN VIÊN NAM'

-- TRUYỀN THAM SỐ ĐẦU VÀO LÀ TÊN PHÒNG, TÍNH MỨC LƯƠNG TRUNG BÌNH CỦA PHÒNG ĐÓ, CHO BIẾT HỌ TÊN NHÂN VIÊN (HONV, TENLOT, TENNV) CÓ MỨC LƯƠNG TRÊN MỨC LƯƠNG TRUNG BÌNH
DROP FUNCTION IF EXISTS  FN_LUONGTB;
GO
CREATE FUNCTION FN_LUONGTB (@TENPHONG NVARCHAR(15))
RETURNS TABLE
AS
	RETURN
	(SELECT HONV, TENLOT, TENNV FROM NHANVIEN WHERE LUONG >( SELECT AVG(LUONG) FROM NHANVIEN WHERE PHG = @TENPHONG))
GO
SELECT *FROM FN_LUONGTB(4)

SELECT*fROM NHANVIEN
--SELECT HONV, TENLOT, TENNV FROM NHANVIEN WHERE LUONG > DBO.FN_LUONGTB(4)
SELECT * FROM DEAN
--➢ Tryền tham số đầu vào là Mã Phòng, cho biết tên phòng ban, họ tên người trưởng phòng 
--và số lượng đề án mà phòng ban đó chủ trì
DROP FUNCTION IF EXISTS FN_PB
GO
CREATE FUNCTION FN_PB (@MAPHONG INT)
RETURNS TABLE
AS
		RETURN (SELECT TENPHG, HONV,TENLOT,TENNV, SLDA FROM NHANVIEN  INNER JOIN PHONGBAN   ON NHANVIEN.MANV = PHONGBAN.TRPHG INNER JOIN (SELECT PHONG,  COUNT(PHONG) AS SLDA FROM PHONGBAN INNER JOIN DEAN ON PHONGBAN.MAPHG = DEAN.PHONG GROUP BY PHONG )A ON PHONGBAN.MAPHG = PHONG )
		GO
SELECT * FROM FN_PB(4);
-- BÀI 2: TẠO CÁC VIEW:
-- HIỂN THỊ THÔNG TIN HONV, TENLOT, TENPHG, DIADIEMPHG
 DROP VIEW IF EXISTS VIEW_THONGTINNV 
GO
CREATE VIEW VIEW_THONGTINNV 
AS
	SELECT HONV, TENLOT, TENPHG, DIADIEM FROM NHANVIEN JOIN PHONGBAN ON NHANVIEN.PHG = PHONGBAN.MAPHG 
		INNER   JOIN DIADIEM_PHG ON PHONGBAN.MAPHG = DIADIEM_PHG.MAPHG
-- XEM DL
SELECT *FROM VIEW_THONGTINNV

-- HIỂN THỊ THÔNG TIN TENNV, LƯƠNG,TUỔI
DROP VIEW IF EXISTS BAI2_Y2 
GO
CREATE VIEW BAI2_Y2 
AS
	SELECT TENNV, LUONG, YEAR(GETDATE()) - YEAR(NHANVIEN.NGSINH) AS N'TUỔI' FROM NHANVIEN
 GO
 SELECT * FROM BAI2_Y2


-- HIỂN THỊ TÊN PHÒNG BAN VÀ HỌ VÀ TÊN TRƯỜNG PHÒNG CỦA PHÒNG BAN CÓ ĐÔNG NHÂN VIÊN NHẤT
GO
DROP VIEW IF EXISTS TRPHG_PB ;
GO
--CÁCH1
CREATE VIEW TRPHG_PB
AS
	SELECT PHONGBAN.TENPHG, (NHANVIEN.HONV + ' ' + NHANVIEN.TENLOT + ' ' + NHANVIEN.TENNV) AS 'HỌ TÊN TRƯỞNG PHÒNG CỦA PHÒNG BAN CÓ ĐÔNG NHÂN VIÊN NHẤT'
	FROM NHANVIEN, PHONGBAN
	WHERE NHANVIEN.MANV = PHONGBAN.TRPHG AND
		  PHONGBAN.MAPHG = (SELECT TOP 1 PHONGBAN.MAPHG
							FROM NHANVIEN, PHONGBAN
							WHERE NHANVIEN.PHG = PHONGBAN.MAPHG
							GROUP BY PHONGBAN.MAPHG
							ORDER BY COUNT (NHANVIEN.PHG) DESC
							)
--CACH2
GO
DROP VIEW IF EXISTS BAI2_Y3
GO
CREATE VIEW BAI2_Y3
AS
	SELECT TOP (1)  WITH TIES PB.TENPHG,TP.HONV+''+TP.TENLOT+''+TP.TENNV AS N'HỌ TÊN TRƯỞNG PHÒNG',COUNT (NV.MANV) AS N'SỐ NHÂN VIÊN'
	FROM NHANVIEN NV JOIN PHONGBAN PB ON NV.PHG = PB.MAPHG JOIN NHANVIEN TP ON TP.MANV = PB.TRPHG
	GROUP BY  PB.TENPHG, TP.HONV+''+TP.TENLOT+''+TP.TENNV
	ORDER BY COUNT(NV.MANV) DESC
SELECT*FROM BAI2_Y3

-- BÀI 3: 
--Tạo View THONGTIN hiển thị danh sách nhân viên đang tham gia dự án, thông tin gồm: MADA, TENDA,TENNV, MANV, HOTENNV, PHAI, NGSINH, LUONG, MAPHG, TENPHG, THOIGIAN.
GO
	DROP VIEW IF EXISTS VIEW_JOIN_DUAN;
	GO
	CREATE VIEW VIEW_JOIN_DUAN 
	AS
		SELECT MADAN ,TENDA ,MANV, CONCAT(HONV,TENLOT,TENNV) AS HOTEN, PHAI,NGSINH,LUONG,MAPHG,TENPHG,THOIGIAN 
		FROM DEAN D INNER JOIN PHONGBAN P ON D.PHONG = P.MAPHG INNER JOIN NHANVIEN N ON P.MAPHG = N.PHG INNER JOIN PHANCONG C ON N.MANV = C.MA_NVIEN AND D.MADA = C.MADAN 
		SELECT * FROM VIEW_JOIN_DUAN
--- Viết truy vấn dựa trên View THONGTIN để hiện thị danh sách nhân viên thuộc phòng ‘Nghiên cứu’tham gia dự án.
			SELECT * FROM VIEW_JOIN_DUAN WHERE MAPHG = 5
--- Viết truy vấn dựa trên View THONGTIN để đếm số lượng nhân viên tham gia từng đề án
		SELECT MADAN , COUNT(MANV) AS SLNHANVIEN FROM VIEW_JOIN_DUAN GROUP BY MADAN
--- Viết truy vấn dựa trên View THONGTIN để hiện thị tổng lương phải trả cho nhân viên tham gia đề áncủa từng phòng ban.
	SELECT MAPHG,SUM(LUONG) FROM VIEW_JOIN_DUAN GROUP BY MAPHG
--- Viết truy vấn dựa trên View THONGTIN để hiện thị danh sách nhân viên có tuổi lớn hơn tuổi trungbình của các nhân viên tham gia đề án
		SELECT * FROM VIEW_JOIN_DUAN WHERE (YEAR(GETDATE()) - YEAR(NGSINH)) > (SELECT AVG(YEAR(GETDATE()) - YEAR(NGSINH)) FROM VIEW_JOIN_DUAN) ;
SELECT * FROM DEAN
SELECT * FROM PHANCONG
SELECT * FROM NHANVIEN
