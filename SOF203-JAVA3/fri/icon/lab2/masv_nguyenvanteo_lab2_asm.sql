use master
go
drop database masv_nguyenvanteo_asm
go
create database masv_nguyenvanteo_asm
go
use masv_nguyenvanteo_asm
go
create table Users
(
	username varchar(50) primary key,
	password varchar(50),
	role varchar(50)
)
go
insert into Users values('admin','123','admin')
go
insert into Users values('phuc','123','user')
go
select * from Users
go
create table Students
(
	masv varchar(50) primary key,
	hoten nvarchar(50),
	email varchar(50),
	soDT varchar(15),
	gioitinh bit,
	diachi nvarchar(50),
	hinh varchar(50)
)
go
create table Grade
(
	id int identity(1,1) primary key,
	masv varchar(50) references Students(masv),
	tienganh int,
	tinhoc int,
	GDTC int
)
go 
--1. Nhập bảng Students
insert into Students values('PS001',N'Nguyễn Văn Tèo','teo@gmail.com','0907774677',1,N'123 Hai Bà Trưng','teo.jpg')
go
insert into Students values('PS002',N'Thị Nở','no@gmail.com','0907774677',1,N'456 Hai Bà Trưng','no.jpg')
go
select * from Students
go
--2. Nhập bảng Grade
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS001',7,8,9)
go
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS002',10,9,9)
go
select * from Grade
go

