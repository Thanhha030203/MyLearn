CREATE DATABASE KIDSZONESCHOOL
GO
USE  KIDSZONESCHOOL
GO
CREATE TABLE STANDARD (
standard NVARCHAR(30) PRIMARY KEY,
FEES  FLOAT NOT NULL)

 CREATE TABLE STUDENTS (
RegID int PRIMARY KEY,
Name NVARCHAR(50) not null,
Address nvarchar(50) ,
ParentNAme nvarchar(50),
Phone nvarchar(50) ,
standard nvarchar(30),
RegDate datetime 
)
ALTER TABLE STUDENTS 
ADD CONSTRAINT FK_STUDENTS_STANDARD FOREIGN KEY (standard) REFERENCES STANDARD(standard);

INSERT INTO STANDARD VALUES 
(N'Vip',5000000),
(N'Tốt',3000000),
(N'Trung Bình',1000000),
(N'Bình dân',500000)
INSERT INTO STUDENTS VALUES 
(100,N'Trương Văn Phú',N'A340 Tân Chánh Hiệp Quận 12, TPHCM',N'Trương Văn Tài','0946376482',N'Trung Bình','2021-03-07'),
(101,N'Lê Thị Thảo',N'Phường 10 Gò Vấp, TPHCM',N'Lê Hoàng Nguyên','0764385436',N'Vip','2021-05-13'),
(102,N'Nguyễn Gia Long',N'Trung Mỹ Tây ,quận 12, TPHCM',N'Nguyễn Thị Thuý Hồng','0568937549',N'Tốt','2022-01-025'),
(103,N'Đỗ Anh Tú',N'Phường2 Hốc Môn, TPHCM',N'Trần Thanh Thuý','0689315796',N'Vip','2021-06-012'),
(104,N'Nguyễn Thị Tuyết Nga',N'Lê Hồng Phong, TPHCM',N'Nguyễn Văn Án','0659734682',N'Trung Bình','2021-02-27')
go
select * from STUDENTS
go
drop trigger if exists INSERT_STUDENTS
go
CREATE TRIGGER INSERT_STUDENTS ON STUDENTS after INSERT
AS
BEGIN
			DECLARE @ID INT = (Select max(RegID) from STUDENTS)
			UPDATE STUDENTS SET RegID = @ID+1 where RegID in (select RegID from inserted)
END

