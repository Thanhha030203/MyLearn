CREATE DATABASE QUANLYSINHVIEN;
GO
USE QUANLYSINHVIEN
GO
CREATE TABLE STUDENTS (
MASV NVARCHAR(50) PRIMARY KEY,
Hoten NVARCHAR(50) ,
Email NVARCHAR(  50),
SoDT NVARCHAR(15),
Gioitinh bit ,
Diachi NVARCHAR(50) ,
Hinh NVARCHAR(300) )

CREATE TABLE GRADE (
ID INT PRIMARY KEY,
MASV NVARCHAR(50),
Tienganh float,
Tinhoc float,
GDTC float,
CONSTRAINT FK_STUDENT_GRADE FOREIGN KEY (MASV) REFERENCES STUDENTS(MASV)
)
drop table IF EXISTS USERS
CREATE TABLE USERS(
username NVARCHAR(50) PRIMARY KEY,
password NVARCHAR(50),
role NVARCHAR(50)
)

INSERT INTO STUDENTS VALUES 
('SV001',N'Nguyễn Thanh Hà','ha@gmail.com','0928133003',0,N'A20 Tô kí Trung Mỹ Tây','img1.png'),     
('SV002',N'Nguyễn Ngọc Huyền','huyen@gmail.com','0972940344',0,N'A20 Tô kí Trung Mỹ Tây','img2.png'),   
('SV003',N'Phạm thị Cẩm Vy','vy@gmail.com','0928548934',0,N'340 Tân Chánh Hiệp Quận 12, Thành phố Hồ Chí Minh','img3.png'),   
('SV004',N'Nguyễn Văn A','Aa@gmail.com','0239348934',1,N'569 Đông Hưng Thuận Quận 12, Thành phố Hồ Chí Minh','img4.png');

INSERT INTO GRADE VALUES
(1,'SV001',8,9,6),
(2,'SV003',7,9,8),
(3,'SV002',9,7,9),
(4,'SV004',7,7,8);

INSERT INTO USERS VALUES
(N'Thanh Phong','thanhphong207',N'Cán bộ đào tạo'),
(N'Vũ Ngọc','ngoc1234321',N'Giáo Viên');
go
CREATE TRIGGER DEL_STUDENT ON STUDENTS INSTEAD OF DELETE
AS
BEGIN
			DELETE FROM GRADE WHERE MASV IN (SELECT MASV from deleted);
			DELETE FROM STUDENTS WHERE MASV IN (SELECT MASV from deleted );
END
GO
drop view if exists INSERT_GRADE
GO
CREATE TRIGGER INSERT_GRADE ON GRADE FOR INSERT
AS
BEGIN
		DECLARE @ID INT = (SELECT MAX(ID) FROM GRADE);
		UPDATE GRADE SET ID = @ID +1 WHERE MASV IN (SELECT MASV FROM inserted);
END
go
drop view if exists Slect_View
go
create view Slect_View
as
 select S.MASV, Hoten,Tienganh,Tinhoc,GDTC,Email,Diachi,SoDT,Gioitinh,Hinh  from STUDENTS S LEFT JOIN GRADE G ON S.MASV = G.MASV
 go


select * from STUDENTS
select * from GRADE
select * from USERS

--select TOP 3 *, (Tienganh+Tinhoc+GDTC)/3 AS 'D' from students s inner join GRADE g on s.MASV = g.MASV order by D DESC