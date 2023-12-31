﻿CREATE DATABASE COM2034_PS20520_NGUYENTHANHHA;
GO
USE COM2034_PS20520_NGUYENTHANHHA;
GO 
CREATE TABLE DETAI(
MADT CHAR(4) NOT NULL PRIMARY KEY,
TENDT NVARCHAR(50) NOT NULL,
KINHPHI MONEY,
NOITHUCTAP NVARCHAR(50));

CREATE TABLE HUONGDAN(
MASV INT NOT NULL PRIMARY KEY ,
MADT CHAR(4) ,
MAGV INT ,
KETQUA DECIMAL(5,2) );
 

 INSERT INTO DETAI(MADT,TENDT,KINHPHI,NOITHUCTAP) VALUES ('DT01',N'GIS',100,N'Nghệ An'),
('DT02',N'ARC GIS',500,N'Nam Định'),
('DT03',N'Spatial',100,N'Hà Tĩnh'),
('DT04',N'MAP',100,N'Quảng Bình');
INSERT INTO HUONGDAN(MASV,MADT,MAGV,KETQUA) VALUES
(1,'DT01',13,8.00),
(2,'DT03',14,0.00),
(3,'DT03',12,10.00),
(5,'DT04',14,7.00),
(6,'DT01',13,NULL),
(7,'DT04',11,10.00),
(8,'DT03',15,6.00);

ALTER TABLE HUONGDAN
ADD CONSTRAINT FK_HUONGDAN FOREIGN KEY (MADT) REFERENCES DETAI(MADT);

--2.1
DROP VIEW IF EXISTS  VI_MaxKinhphi 
GO
CREATE VIEW VI_MaxKinhphi  
AS
 SELECT MADT, TENDT, KINHPHI  FROM DETAI WHERE KINHPHI = (SELECT MAX(KINHPHI) FROM DETAI )
 SELECT * FROM VI_MaxKinhphi

 --2.2

 DROP FUNCTION IF EXISTS BANG_SV
 GO
 CREATE FUNCTION BANG_SV (@MADT CHAR(4))
 RETURNS TABLE 
 AS

 RETURN SELECT MASV,HUONGDAN.MADT,KETQUA FROM HUONGDAN INNER JOIN DETAI ON HUONGDAN.MADT = DETAI.MADT AND DETAI.MADT = @MADT;


SELECT * FROM  DBO.BANG_SV ('DT03');

--2.3
DROP PROC IF EXISTS  THONG_TIN
GO
CREATE PROC THONG_TIN @NOITHUCTAP NVARCHAR(50)
AS
BEGIN
		IF EXISTS (SELECT NOITHUCTAP FROM DETAI WHERE NOITHUCTAP = @NOITHUCTAP)
				BEGIN
						SELECT MADT, TENDT,KINHPHI ,NOITHUCTAP FROM DETAI WHERE NOITHUCTAP = @NOITHUCTAP
				END
		ELSE
				PRINT(N'Không tồn tại nơi thực tập này');
END

exec THONG_TIN N'Hà Tĩnh'
DROP PROC IF EXISTS  THONG_TIN1
GO
CREATE PROC THONG_TIN1 @NOITHUCTAP NVARCHAR(50)
AS
BEGIN	
		IF EXISTS (SELECT NOITHUCTAP FROM DETAI WHERE NOITHUCTAP = @NOITHUCTAP)
				BEGIN
						SELECT MADT, TENDT,KINHPHI ,NOITHUCTAP FROM DETAI WHERE NOITHUCTAP = @NOITHUCTAP
				END
		ELSE
				PRINT(N'Không tồn tại nơi thực tập này');
END

--2.4
DROP trigger IF EXISTS  XOA_SV_TRIGGER
go
CREATE TRIGGER XOA_SV_TRIGGER  ON HUONGDAN FOR DELETE
AS
BEGIN
		IF  (SELECT KETQUA FROM deleted ) IS NOT NULL
		BEGIN
		print(N'Không được xoá sinh viễn đã có kết quả thực tập ')
		ROLLBACK TRANSACTION
		END
END

DELETE  FROM HUONGDAN WHERE MASV = 3;

