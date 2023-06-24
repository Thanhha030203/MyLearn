CREATE DATABASE QLNT_NHOM5
GO
USE QLNT_NHOM5

go
CREATE TABLE LoaiNhaTro(
	MaLoai varchar(20) PRIMARY KEY,
	TenLoai nvarchar(50)
);
Drop table NhaTro
go
CREATE TABLE NhaTro(
	MaNT varchar(20) PRIMARY KEY,
	TenNT nvarchar(50),
	DiaChi nvarchar(200),
	DienTich int,
	MoTa nvarchar(200),
	MaLoai varchar(20),
	Gia float ,
	MA_NLH varchar(20),
	TrangThai bit
);
Drop table DanhGia
go
CREATE TABLE DanhGia(
	MaDG varchar(20) PRIMARY KEY,
	Ma_NDG varchar(20),
	MaNT varchar(20),
	Like_Dislike bit,
	NoiDung nvarchar(50)
);

CREATE TABLE NguoiDung(
	SDT int PRIMARY KEY,
	TenNgD nvarchar(30),
	DiaChi nvarchar(200),
	NgaySinh date,
	GioiTinh bit,
	Email varchar(100),
	CMND int
);
Drop table TaiKhoan
go
CREATE TABLE TaiKhoan(
	MaTK varchar(20) primary key,
	SDT int,
	UserName nvarchar(200),
	Passwordd varchar(100),
);

CREATE TABLE LienKetThe_Vi(
	MaLK varchar(20) PRIMARY KEY,
	MaTK varchar(20),
	TenNganHang nvarchar(50),
	SoThe int,
	SoTK int,
	TrangThai bit,
	SoDu float
);

CREATE TABLE GiaoDich(
	MaGD varchar(20) PRIMARY KEY,
	MaLK varchar(20),
	TenGD nvarchar(50),
	MaTk_NguoiGui int,
	SoTk_NguoiGui int,
	MaTk_NguoiNhan bit,
	SoTk_NguoiNhan int,
	NoiDung nvarchar(50),
	ThoiGian datetime,
	SoTien float,
	TrangThai bit
);

CREATE TABLE DichVu(
	MaDV varchar(20) PRIMARY KEY,
	TenDV varchar(20),
	PhiDV nvarchar(50),
	NgayPhatHanh date,
	HanKetThuc date
);

CREATE TABLE DichVu_HoTro(
	STT int identity(1,1) PRIMARY KEY,
	MaDV varchar(20),
	Email varchar(100),
	SDT int,
	DiaChi nvarchar(200),
	GhiChu nvarchar(200)
);

CREATE TABLE DanhSach_DangKy_DichVu(
	STT int identity(1,1) PRIMARY KEY,
	MaDV varchar(20),
	MaTK varchar(20),
	NgayDangKy date,
	ThoiHan int,
	TrangThaiDangKy bit
);

CREATE TABLE BaiDang(
	STT int identity(1,1) PRIMARY KEY,
	MaTK varchar(20),
	NoiDung nvarchar(500),
	HinhAnh nvarchar(200),
	NgayDang date,
	Like_Dislike bit,
	ND_DanhGia nvarchar(200)
);
alter table NhaTro
add constraint FK_LOAITRO_NHATRO FOREIGN KEY (maLoai) REFERENCES LoaiNhaTro(maLoai) ;

alter table NhaTro
add constraint FK_TAIKHOAN_NHATRO FOREIGN KEY (MA_NLH) REFERENCES TaiKhoan(MaTK) ;

alter table DanhGia
add constraint FK_NhaTro_DanhGia FOREIGN KEY (MANT) REFERENCES NhaTro(maNT) ;

alter table DanhGia
add constraint FK_TaiKhoan_DanhGia FOREIGN KEY (MA_NDG) REFERENCES TaiKhoan(maTK);

alter table BaiDang
add constraint FK_TaiKhoan_BaiDang FOREIGN KEY (MATK) REFERENCES TaiKhoan(maTK);

alter table LienKetThe_Vi
add constraint FK_TaiKhoan_LienketThe_Vi FOREIGN KEY (MATK) REFERENCES TaiKhoan(maTK);

alter table GiaoDich
add constraint FK_LienKetThe_Vi_GiaDich FOREIGN KEY (maLK) REFERENCES LienKetThe_Vi(maLK);

alter table DanhSach_DangKy_DichVu
add constraint FK_TaiKhoan_DanhSach FOREIGN KEY (MATK) REFERENCES TaiKhoan(MATK);

alter table DanhSach_DangKy_DichVu
add constraint FK_DichVu_DanhSach FOREIGN KEY (MADV) REFERENCES DichVu(MADV);

alter table DichVu_HoTro
add constraint FK_DichVu_HoTro FOREIGN KEY (MADV) REFERENCES DichVu(MADV);

alter table TaiKhoan
add constraint FK_TaiKhoan_NguoiDung FOREIGN KEY (SDT) REFERENCES NguoiDung(SDT);