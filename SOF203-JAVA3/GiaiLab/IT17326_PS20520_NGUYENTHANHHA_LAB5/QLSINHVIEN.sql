CREATE DATABASE QLSINHVIEN
GO
USE QLSINHVIEN
GO
CREATE TABLE STUDENTS(
MASV NVARCHAR(50) PRIMARY KEY,
HoTen nvarchar(50) ,
Email nvarchar(50) ,
SoDT nvarchar(12),
GioiTinh bit,
Diachi nvarchar(100) )

INSERT INTO STUDENTS VALUES 
('SV001',N'Le Van Phung',N'phunglv@fpt.edu.vn',N'0903414749',1,N'Ninh Thuan'),
('SV002',N'Le Quang Trung',N'trunglv@gmail.com',N'0901234567',1,N'222 Le Van Si'),
('SV003',N'Le Thi Bao Hieu',N'hieultb@gmail.com',N'0682872432',0,N'Phan Rang'),
('SV004',N'Le Thi H Hanh',N'hanhlthh@gmail.com',N'0909999999',0,N'Quan 12');

select * from STUDENTS
