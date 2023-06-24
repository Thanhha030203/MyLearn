USE master
GO

CREATE DATABASE COM2034_PS20673_QLYBANHANG
GO
USE COM2034_PS20673_QLYBANHANG

CREATE TABLE KHACHHANG
(
	MAKH VARCHAR(5) PRIMARY KEY,
	TENKH NVARCHAR(50) NOT NULL,
	DIACHI NVARCHAR(100),
	QUAN NVARCHAR(50),
	TINH NVARCHAR(50)
)

CREATE TABLE HOADON
(
	SOHD VARCHAR(5)PRIMARY KEY,
	NGAYMUA DATE NOT NULL,
	MAKH VARCHAR(5),
	NGUOILAP NVARCHAR(50),
	CONSTRAINT FK_HOADO_KHACHHANG FOREIGN KEY (MAKH) references KHACHHANG(MAKH)
)

INSERT INTO KHACHHANG VALUES
('KH001',N'Lê Hồng Anh',N'123 Nguyễn Huệ',N'Quận 1',N'Tp.HCM'),
('KH002',N'Nguyễn Quốc Bảo',N'234 Ký Con',N'Quận 1',N'Tp.HCM'),
('KH003',N'Trần Minh Hoàng',N'25/7 Nguyễn Huệ',N'Quận Ninh Kiều',N'Cần Thơ'),
('KH004',N'Nguyễn Thu Thủy',N'26 Nguyễn Viết Xuân',N'Quận 3',N'Tp.HCM'),
('KH005',N'Lê Thị Ánh Ngọc',N'17 Lê Lợi',N'Quận Gò Vấp',N'Tp.HCM'),
('KH006',N'Trần Trung Sơn',N'87 Nguyễn Duy Tiến',N'Quận Ba Đình',N'Hà Nội');

INSERT INTO HOADON VALUES
('HD001','2021-02-15','KH001',N'Ngô Tuấn Tú'),
('HD002','2021-02-03','KH002',N'Ngô Tuấn Tú'),
('HD003','2001-03-17','KH002',N'Nguyễn Mai Hồ'),
('HD004','2001-04-30','KH001',N'Trần Thanh Thảo'),
('HD005','2021-01-05','KH005',N'Trần Thanh Thảo'),
('HD006','2021-04-05','KH001',null),
('HD007','2021-10-05','KH001',null);

/*1. Tạo View hiển thị thông tin mua hàng của từng khách hàng, gồm: mã kh, tên kh, 
số lần mua hàng (hiển thị cả khách chưa từng mua hàng).
Viết truy vấn truy xuất từ View đã tạo để hiển thị thông tin mua hàng của khách 
hàng ở Tp.HCM.*/

GO
CREATE VIEW V_TTMUAHANG
AS 
	SELECT HOADON.MAKH, KHACHHANG.TENKH, COUNT(HOADON.SOHD) AS 'SO LAN MUA HANG' 
	FROM  HOADON JOIN KHACHHANG ON HOADON.MAKH= KHACHHANG.MAKH
	GROUP BY HOADON.MAKH,KHACHHANG.TENKH
GO
SELECT *FROM V_TTMUAHANG

/*2. Tạo Function trả về ngày mua hàng sau cùng của khách hàng ‘Lê Hông Anh’.
Viết truy vấn hiển thị danh sách khách hàng có ngày mua hàng sau ngày mua 
hàng sau cùng của khách hàng ‘Lê Hông Anh’ (sử dụng hàm vừa tạo)*/

IF OBJECT_ID('FN_NGAYMUAHANG') IS NOT NULL
DROP FUNCTION FN_NGAYMUAHANG
GO
CREATE FUNCTION FN_NGAYMUAHANG (@MAKH VARCHAR(5))
RETURNS TABLE
AS
			RETURN
			(SELECT NGAYMUA FROM HOADON WHERE @MAKH = MAKH)
GO
SELECT *FROM DBO.FN_NGAYMUAHANG ('KH001')

/*3. Tạo Triger khi thêm mới và sửa dữ liệu của table KHACHHANG thì không cho 
sửa thông tin của khách hàng ở Tp.HCM.
Thực hiện thêm mới hoặc sửa đổi dữ liệu bảng KHACHHANG để kích hoạt Trigger	*/
GO
CREATE TRIGGER TG_KHACHHANG ON KHACHHANG
FOR INSERT, UPDATE
AS
	IF EXISTS (SELECT MAKH,TENKH,DIACHI,QUAN,TINH FROM KHACHHANG)
		BEGIN
			PRINT N'KHÔNG CHO PHÉP CẬP NHẬT HAY THÊM MỚI KHÁCH HÀNG'
			ROLLBACK TRAN
		END

UPDATE KHACHHANG  
SET TENKH = N'NGUYỄN NGỌC HUYỀN' WHERE MAKH = N'KH002'
INSERT INTO  KHACHHANG VALUES ('KH007',N'NGUYỄN NGỌC HUYỀN',N'81 LÀNG PHUNG',N'CHƯPRONG',N'GIA LAI');

/*4. Tạo Store Procedure cập nhật thông tin người lập HOADON là họ tên của sinh 
viên cho những hóa đơn chưa có người lập.
Viết lệnh thực thi Store Procedure vừa tạo.*/

DROP PROC IF EXISTS SP_UPD
GO
CREATE PROC SP_UPD @SOHD VARCHAR(5)

AS
	BEGIN
		IF NOT EXISTS( SELECT*FROM HOADON WHERE @SOHD = SOHD)
			UPDATE HOADON SET NGUOILAP = N'NGUYÊN NGỌC HUYỀN' WHERE NGUOILAP  IS NOT  NULL
			AND @SOHD = SOHD
		ELSE
			PRINT N'HÓA ĐƠN ĐÃ TỒN TẠI NGƯỜI LẬP'
	END

EXEC SP_UPD 'HD001'