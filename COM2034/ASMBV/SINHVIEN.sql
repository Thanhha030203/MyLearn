use master
go
create database COM2034_PS20692_QLDETAI
go
use COM2034_PS20692_QLDETAI

create table SinhVien(
Masv int not null primary key,
Hotensv nvarchar(40),
Namsinh int ,
Quequan nvarchar(30)
)

---
create table DETAI(
Madt char(10) primary key not null ,
Tendt nvarchar(30) ,
KinhPhi int ,
Noithuctap nvarchar(30),
Masv int FOREIGN KEY REFERENCES SinhVien(Masv),
KetQua decimal(5,2) 
)

----
-- Nhập dữ liệu

insert into SinhVien values (1,N'Lê Văn Nam',1990,N'Nghệ An'),
(2,N'Nguyễn Thị Mỹ',1990,N'Thanh Hóa'),
(3,N'Bùi Xuân Đức',1992,N'Hà Nội'),
(4,N'Nguyễn Văn Tùng',null,N'Hà Tĩnh'),
(5,N'Lê Khánh Linh',1989,N'Hà Nam')



insert into DETAI values
					('Dt01','GIS',100,N'Nghệ An',1,6.80),
					('Dt02','ARC GIS',500,N'Nam ĐỊnh',2,7.65),
					('Dt03','Spatial DB',100,N'Nghệ An',2,8.25),
					('Dt04','Blockchain',300,N'Nghệ An',null,null),
					('Dt05','Cloud Computing',700,N'Nghệ An',null,null)


					-------------

--1. Tạo Stored Procedure hiển thị đề tài của sinh viên thực hiện với điều kiện có kết quả thực tập thấp
--hơn giá trị được truyền vào qua tham số, thông tin gồm có: Madt, Tendt, HoTenSv, Kinhphi,
--NoiThucTap, KetQua.
DROP PROC IF EXISTS SP_HT
GO
CREATE PROC SP_HT @KETQUA DECIMAL(5,2)
AS 
	BEGIN
		SELECT MADT, TENDT, HOTENSV, KINHPHI,NOITHUCTAP, KETQUA 
		FROM DETAI JOIN  SINHVIEN ON DETAI.MASV = SINHVIEN.MASV
		WHERE KETQUA < @KETQUA
	END
--Viết câu lệnh Execute cho Stored Procedure vừa tạo.
EXEC SP_HT 7.75

select * from DETAi
------------------
--Tạo Function trả về trung bình cộng kinh phí thực hiện đề tài của một sinh viên, biết Masv truyền qua tham số.
GO
CREATE FUNCTION FN_TBC (@MASV INT)
RETURNS INT
AS

	BEGIN
		DECLARE @TBKP INT
		SET @TBKP = (SELECT AVG(KINHPHI)AS 'KINH PHI TRUNG BINH'  FROM DETAI WHERE MASV = @MASV)
		RETURN @TBKP
	END
GO
-- CÁCH 1
DECLARE @TBKINHPHI INT

EXEC @TBKINHPHI =  DBO.FN_TBC 2  
-- CÁCH 2
PRINT N'TB KINH PHÍ: '+CONVERT(VARCHAR,DBO.FN_TBC (2))

--Viết truy vấn hiển thị tất cả danh sách sinh viên, thông tin: MaSV, HoTenSV, TBKinhphi
--Chú ý: TBKinhphi sử dụng hàm vừa tạo để tính

SELECT DETAI.MASV, SINHVIEN.HOTENSV, DBO.FN_TBC(DETAI.MASV) AS'TB KINH PHI' FROM SINHVIEN JOIN DETAI ON SINHVIEN.MASV = DETAI.MASV GROUP BY DETAI.MASV, SINHVIEN.HOTENSV


------------------------------------
--Tạo Triger xóa sinh viên (giả sử mỗi lần xóa nhiều sinh viên) và xóa các đề tài có liên quan đến sinh viên
--này.
GO
CREATE TRIGGER TG_DLSINHVIEN ON SINHVIEN 
INSTEAD OF DELETE
AS
	BEGIN

		DELETE FROM DETAI WHERE MASV IN(SELECT MASV FROM DELETED)
		DELETE FROM SINHVIEN WHERE MASV IN (SELECT MASV FROM DELETED)

	END

	DELETE SINHVIEN WHERE MASV = 1

select * from SinhVien
select * from DETAi

	---------------------
--Tạo View DeAnKhongTacGia gồm tất cả các thông tin: MaSv, TenDeAN, KinhPhi, NoiThucTap, KetQua
GO
CREATE VIEW V_DEANKHONGTACIA
AS
	SELECT DETAI.MASV, TENDT, KINHPHI,NOITHUCTAP,KETQUA FROM SINHVIEN JOIN DETAI ON SINHVIEN.MASV = DETAI.MASV
	
go
SELECT *FROM V_DEANKHONGTACIA
DROP VIEW V_DEANKHONGTACIA

-- update V_DEANKHONGTACGIA set Masv = 7, KetQua = 7.5 where Masv is null
	

