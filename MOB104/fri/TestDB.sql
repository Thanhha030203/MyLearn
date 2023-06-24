create database dtbnn
use dtbnn
go

create table ContainAcc (
	nameacc varchar(15) primary key not null,
	passacc varchar(15)
)

create table In4Acc(
	nameacc varchar(15) foreign key references ContainAcc(nameacc) ,
	hovaten nvarchar(50),
	ngaysinh date,
	diachi nvarchar(60),
	sdt numeric(11),
	gioitinh bit,
	mavi numeric(10) primary key not null,
	stk numeric(12) foreign key references sotaikhoan(stk),
	soduvi money,
	CCCD numeric(12)
	)
create table sotaikhoan(
	stk numeric(12) primary key not null, 
	sodu money,
	mapin numeric(6)
)
create table RegAcc (
	nameacc varchar(15) foreign key references ContainAcc(nameacc) ,
	hovaten nvarchar(50),
	ngaysinh date,
	diachi nvarchar(60),
	sdt numeric(11),
	gioitinh bit,
	CCCD numeric(12)
	)

create table EditAcc(
	nameacc varchar(15) foreign key references ContainAcc(nameacc) ,
	hovaten nvarchar(50),
	ngaysinh date,
	diachi nvarchar(60),
	sdt numeric(11),
	gioitinh bit,
	CCCD numeric(12)
	)

create table ChuyenTien (
	mavi numeric(10) foreign key references In4Acc(mavi),
	stk numeric(12) foreign key references sotaikhoan(stk),
	passacc varchar(15),
	mavinhan numeric(10),
	stknhan numeric(12),
	tennganhang nvarchar(50),
	sotien money,
	noidung nvarchar(100)
	)
create table NapTien (
	tennganhang nvarchar(50),
	stk numeric(12) foreign key references sotaikhoan(stk),
	mavi numeric(10) foreign key references In4Acc(mavi),
	mapin numeric(6),
	noidung nvarchar(100),
	sotiennap money
)

create table RutTien (
	tennganhang nvarchar(50),
	stk numeric(12) foreign key references sotaikhoan(stk),
	mavi numeric(10) foreign key references In4Acc(mavi),
	mapin numeric(6),
	noidung nvarchar(100),
	sotiennap money
)

create table NapThe (
	tennganhang nvarchar(50),
	stk numeric(12) foreign key references sotaikhoan(stk),
	mavi numeric(10) foreign key references In4Acc(mavi),
	sdt numeric(11),
	tennhamang varchar(15),
	sotiennapthe money
	)






	