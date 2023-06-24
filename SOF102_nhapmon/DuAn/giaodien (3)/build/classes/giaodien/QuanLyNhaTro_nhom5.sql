CREATE DATABASE QLNT
GO
USE QLNT

go
CREATE TABLE LoaiNhaTro(
	MaLoai varchar(20) PRIMARY KEY,
	TenLoai nvarchar(50)
);
--Drop table   NhaTro
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
	TrangThai bit,
	Hinh varchar(200)
);
--Drop table DanhGia
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
	CMND int,
	Hinh varchar(200)
);
--Drop table TaiKhoan
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
	MaTk_NguoiGui varchar(20),
	SoTk_NguoiGui int,
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
	TenCTy nvarchar(100),
	Email varchar(100),
	SDT int,
	Webstie nvarchar(200),
	DiaChi nvarchar(200),
	GhiChu nvarchar(200)
);

CREATE TABLE DanhSach_DangKy_DichVu(
	STT int identity(1,1) PRIMARY KEY,
	MaDV varchar(20),
	MaTK varchar(20),
	NgayDangKy date,
	ThoiHan_Thang int,
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
go
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
add constraint FK_TaiKhoan_Vi_GiaoDich FOREIGN KEY (MaTk_NguoiGui ) REFERENCES TaiKhoan(MaTK);

alter table GiaoDich
add constraint FK_LienKetThe_Vi_GiaoDich FOREIGN KEY (maLK) REFERENCES LienKetThe_Vi(maLK);

alter table DanhSach_DangKy_DichVu
add constraint FK_TaiKhoan_DanhSach FOREIGN KEY (MATK) REFERENCES TaiKhoan(MATK);

alter table DanhSach_DangKy_DichVu
add constraint FK_DichVu_DanhSach FOREIGN KEY (MADV) REFERENCES DichVu(MADV);

alter table DichVu_HoTro
add constraint FK_DichVu_HoTro FOREIGN KEY (MADV) REFERENCES DichVu(MADV);

alter table TaiKhoan
add constraint FK_TaiKhoan_NguoiDung FOREIGN KEY (SDT) REFERENCES NguoiDung(SDT);
go
INSERT INTO NguoiDung VALUES
('0934123789', N'Ngô Bá Khá',     N'1358 Quang Trung, Phường 14, Quận Gò Vấp, TP.Hồ Chí Minh',      '1990-02-25', '1', 'kha1990@gmail.com', '936758901',null),
('0864136263', N'Hà Yến Minh',    N'28/2A, Phường Linh Chiểu, Quận Thủ Đức, TP.Hồ Chí Minh',        '1993-04-15', '0', 'minh1993@gmail.com','768939497',null),
('0945180092', N'Nhâm Ngọc Uyên', N'Hoàng Diệu 2, Phường Linh Chiểu, Quận Thủ Đức, TP.Hồ Chí Minh', '1989-12-5',  '0', 'uyen1989@gmail.com','896416782',null),
('0783799033', N'Đào Vũ Bằng',    N'Dương Quảng Hàm, Phường 5, Quận Gò Vấp, TP.Hồ Chí Minh',        '2000-07-17', '1', 'bang2000@gmail.com','128757390',null),
('0986789214', N'Thiên Minh Quốc',N'Hoàng Hoa Thám, Phường 7, Quận 12, TP.Hồ Chí Minh',             '1998-06-09', '1', 'quoc1998@gmail.com','097245871',null),
('0976893119', N'Trần Minh Dao',  N'Hoàng Quốc Việt, Phường Phú Mỹ, Quận 7, TP.Hồ Chí Minh',        '1995-11-28', '0', 'dao1995@gmail.com', '278615400',null),
('0865789043', N'Hồ Trọng Tỷ',    N'Phạm Văn Chiêu, Phường 14, Quận Gò Vấp, TP.Hồ Chí Minh',        '2001-03-18', '1', 'ty2001@gmail.com',  '385901384',null),
('0964738294', N'Phạm Thanh Hà',  N'Kha Vạn Cân, Phường Linh Trung, Quận Thủ Đức, TP.Hồ Chí Minh',  '2003-04-19', '1', 'ha2003@gmail.com',  '876548731',null),
('0703865323', N'Hà Văn Minh',    N'Quản Trọng Linh, Phường 7, Quận 8, TP.Hồ Chí Minh',             '1995-11-20', '1', 'minh1995@gmail.com','23648148',null),
('0337578234', N'Lê Thiên Khang', N'Quân Tân Bình, Phường 15, Quận Tân Bình, TP.Hồ Chí Minh',       '2002-09-22', '1', 'khang2002@gmail.com','387491480',null),
('0493859239', N'Thi Ngọc Quí',   N'Trần Phú, Phường 4, Quận 5, TP.Hồ Chí Minh',                    '1997-05-04', '1', 'phu1997@gmail.com', '174909653',null),
('0908637836', N'Trần Tâm Cang',  N'Trần Phú Cương, Phường 5, Quận Gò Vấp, TP.Hồ Chí Minh',         '1996-06-26', '1', 'cang1996@gmail.com', '982738274',null);

INSERT INTO TaiKhoan VALUES
('MG11', '0934123789', 'ngobakha123',     'kha123'),
('MG43', '0864136263', 'hayenminh223',    'minh1993'),
('MG22', '0945180092', 'nhamngocuyen356', 'uyen1989'),
('MG13', '0783799033', 'daovubang769',    'bang2000'),
('MG31', '0986789214', 'thienminhquoc234','quoc1998'),
('MG15', '0976893119', 'tranminhdao123',  'dao1995'),
('MG36', '0865789043', 'hotrongty222',    'ty2001'),
('MH01', '0964738294', 'phamthanhha321',  'ha2003'),
('MH02', '0703865323', 'havanminh454',    'minh1995'),
('MH03', '0337578234', 'lethienkhang121', 'khang2002'),
('MH04', '0493859239', 'thingocqui789',   'qui1997'),
('MH05', '0908637836', 'trantamcang090',  'cang1996');

INSERT INTO LoaiNhaTro VALUES
('K01', N'Nhà Trọ'),
('K02', N'Kí Túc Xá'),
('K03', N'Chung Cư'),
('K04', N'HomeStay');
INSERT INTO NhaTro VALUES
('P12', N'Nhà trọ Thanh Hà',   N'Đường 16, Phường Linh Chiểu, Thủ Đức, TP.Hồ Chí Minh','25', N'Sạch sẽ, thông thoáng riêng tư. Vị trí thuận lợi, khang trang mà rẻ',   'K01', '3000000', 'MH01', '1' ,null),
('P02', N'Kí túc xá Văn Minh', N'Đường 72, Phường Tân Phong, Quận 7, TP.Hồ Chí Minh ','40', N'Nhà đẹp mới xây, 2 cửa sổ, thoáng mát, có ban công, lối đi riêng, có Internet','K02', '8100000', 'MH02' ,'1',null),
('P31', N'Nhà trọ Thiên Khang',N'Cách Mạng Tháng Tám, Phường 8, Quận 3, TP>Hồ Chí Minh','20', N'Cho thuê phòng tại Quận 3, gần công viên Lê Thị Riêng, gần siêu thị điện máy chợ Lớn','K01', '2500000', 'MH03', '0',null),
('P26', N'Chung cư Ngọc Quí',  N'Thạn Mỹ Lợi, Phường Thảo Điền, Quận 2, TP.Hồ Chí Minh','30', N' Khu dân trí, cộng đồng thân thiện, đường rộng thông thoáng, xe hơi vô tận nhà','K03', '7200000', 'MH04', '1',null),
('P20', N'Nhà trọ Tâm Cang',   N'Nguyễn Văn Công, Phường 3, Quận Tân Bình, TP.Hồ Chí Minh','25', N'sạch sẽ thoáng mát có ban công view đẹp, cửa sổ có gió tươi vào phòng thoáng mát thoải mái, toilet riêng, tủ bếp', 'K01', '4000000', 'MH05' ,'0',null),
('P06', N'Kí túc xá Đị Láo',   N'Hồ Tùng Mậu, Phường Mai Dịch, Quận Cầu Giấy, TP.Hồ Chí Minh','35', N'Phòng khép kín, cửa sổ thoáng, có điều hòa, nóng lạnh, giường, tủ, kệ bếp, chậu rửa tiện lợi','K02', '7000000', 'MH02', '1',null),
('P27', N'HomeStay Hoàng Vinh',N'Xô Viết Nghệ Tĩnh, Phường 13, Quận Bình Thạnh, TP.Hồ Chí Minh', '20', N'Vị trí thuận lợi, khang trang mà rẻ. Sạch sẽ, thông thoáng riêng tư','K04', '4100000', 'MH01', '1',null);
INSERT INTO DanhGia VALUES
('DG01', 'MG11', 'P12', '1', N'Giá cả hợp lí, sạch đẹp'),
('DG02', 'MG43', 'P02', '0', N'Hơi mắc so với KTX khác'),
('DG03', 'MG22', 'P31', '1', N'Rẻ hơn so với dự tính'),
('DG04', 'MG13', 'P26', '0', N'Giá hơi cao so với chất lượng'),
('DG05', 'MG31', 'P20', '1', N'Nhà đẹp giá tốt'),
('DG06', 'MG15', 'P06', '1', N'Khá ổn, giá hợp lí'),
('DG07', 'MG36', 'P26', '1', N'Phòng sạch, vị trí thuận tiện');


INSERT INTO LienKetThe_Vi VALUES
('LKT1001VN', 'MG11', 'VietinBank' , '837400938', '098237380', '1', '32000000'),
('LKT1002VN', 'MG43', 'Vietcombank', '763412839', '913874747', '1', '48000000'),
('LKT1003VN', 'MG22', 'BIDV'       , '612537898', '647325531', '1', '15000000'),
('LKT1004VN', 'MG13', 'ACB'        , '863471290', '043898318', '1', '24000000'),
('LKT1005VN', 'MG31', 'HDBank'     , '937164820', '728423400', '1', '16000000'),
('LKT1006VN', 'MG15', 'Sacombank'  , '786341984', '019487471', '1', '22000000'),
('LKT1007VN', 'MG36', 'MBBank'     , '918374838', '019488647', '1', '30000000'),
('LKT1008VN', 'MH01', 'VIB'        , '436987726', '831740913', '1', '41000000'),
('LKT1009VN', 'MH02', 'VPBank'     , '317834678', '236316748', '1', '52480000'),
('LKT1010VN', 'MH03', 'TechcomBank', '927467216', '309732881', '1', '54097000'),
('LKT1011VN', 'MH04', 'ACB'        , '390413740', '019432731', '1', '76000000'),
('LKT1012VN', 'MH05', 'VietinBank' , '591938013', '324789901', '1', '64000000');
INSERT INTO GiaoDich VALUES
('GDVN1001', 'LKT1001VN',null, 'MG11', '098237380', '309732881', N'Phí cọc trọ','2019/12/14 15:20:30', '2500000', '1'),
('GDVN1002', 'LKT1002VN', NULL, 'MG43', '913874747', '324789901', N'Phí cọc trọ', '2019/05/16 9:56:10', '4000000', '0');
INSERT INTO DichVu VALUES

('DV001VN', N'Dọn trọ'               , '100000', '2017/01/03', '2024/01/03'),
('DV002VN', N'Quảng cáo kinh doanh' , '545000', '2017/01/03', '2024/01/03'),
('DV003VN', N'Quảng cáo liên kết'             , '365000', '2017/01/03', '2024/01/03'),
('DV004VN', N'Quảng cáo game'             , '1340000', '2017/01/03', '2024/01/03'),
('DV005VN', N'Tìm ghép trọ'             , '120000', '2017/01/03', '2024/01/03'),
('DV006VN', N'Đăng ký kinh doanh'             , '570000', '2017/01/03', '2024/01/03'),
('DV007VN', N'phát triển bài đăng'             , '150000', '2017/01/03', '2024/01/03'),
('DV008VN', N'Đăng ký ưu tiên'             , '170000', '2017/01/03', '2024/01/03'),
('DV009VN', N'Thuê số tổng đài'             , '200000', '2017/01/03', '2024/01/03')

INSERT INTO DichVu_HoTro VALUES
('DV001VN', N'Clean_house','kha1990@gmail.com' , '0934123744',N'http://wwwcleanhouse.com.vn', N'1358 Quang Trung, Phường 14, Quận Gò Vấp, TP.Hồ Chí Minh'     , N'Bạn hãy tư vấn về dịch vụ dọn trọ của bên mình'),
('DV003VN',N'Bank_connect', 'minh1993@gmail.com', '0864136353',N'http://wwwbankconnect.com.vn', N'28/2A, Phường Linh Chiểu, Quận Thủ Đức, TP.Hồ Chí Minh'       ,N'Dịch vụ dọn trọ bên mình sẽ làm những gì vậy'),
('DV004VN',N'Go_Live', 'uyen1989@gmail.com', '0945180092',N'http://wwwgolive.com.vn', N'Hoàng Diệu 2, Phường Linh Chiểu, Quận Thủ Đức, TP.Hồ Chí Minh', N'Mình không biết cách nạp tiền nhờ bạn hãy tư vấn '),
('DV005VN',N'Global', 'bang2000@gmail.com', '0783799033',N'http://wwwglobal.com.vn', N'Dương Quảng Hàm, Phường 5, Quận Gò Vấp, TP.Hồ Chí Minh'       , N'Về phần liên kết thẻ rất khó hiểu mong bạn tư vấn cho mình'),
('DV002VN',N'MoCo_CityNow', 'cang1996@gmail.com', '0908637836',N'http://wwwmococity.com.vn', N'Trần Phú Cương, Phường 7, Quận Gò Vấp, TP.Hồ Chí Minh'        , N'Bạn tư vấn cho mình kĩ hơn về dịch vụ quảng cáo nhà trọ'),
('DV007VN',N'Dev_Post', 'cang1996@gmail.com', '0908637836',N'http://wwwdevpost.com.vn', N'Trần Phú Cương, Phường 8, Quận Gò Vấp, TP.Hồ Chí Minh'        , N'Bạn tư vấn cho mình kĩ hơn về dịch vụ quảng cáo nhà trọ'),
('DV008VN', N'Vin_OFF','cang1996@gmail.com', '0908637836',N'http://wwwvinoff.com.vn', N'Trung Mỹ Tây , Quận 12, TP.Hồ Chí Minh'        ,N'Bạn tư vấn cho mình kĩ hơn về dịch vụ quảng cáo nhà trọ'),
('DV009VN',N'Sara_Call', 'cang1996@gmail.com', '0908637836', N'http://wwwsaracall.com.vn',N'Trần Phú Cương, Phường 14, Quận Gò Vấp, TP.Hồ Chí Minh'        , N'Bạn tư vấn cho mình kĩ hơn về dịch vụ quảng cáo nhà trọ');
INSERT INTO DanhSach_DangKy_DichVu VALUES
('DV001VN', 'MG11', '2022-06-12',2, '1'),
('DV001VN', 'MG43', '2022-07-22',1, '1'),
('DV001VN', 'MG22', '2022-08-15',4, '1'),
('DV001VN', 'MG13', '2022-10-23',1, '1'),
('DV003VN', 'MG31', '2022-06-09', 1, '1'),
('DV001VN', 'MG15', '2022-08-10', 3, '1'),
('DV002VN', 'MG36', '2022-09-05', 2, '1'),
('DV001VN', 'MH01', '2022-08-25', 1, '1'),
('DV001VN', 'MH02', '2022-09-30', 3, '1'),
('DV001VN', 'MH03', '2022-06-24',3, '1'),
('DV006VN', 'MH04', '2022-08-08', 7, '1'),
('DV001VN', 'MH05', '2022-07-18', 4, '1'),
('DV001VN', 'MG15', '2022-10-11', 1, '0'),
('DV001VN', 'MG36', '2022-10-28',1, '0'),
('DV007VN', 'MH01', '2022-09-03', 2, '1'),
('DV001VN', 'MH02', '2022-07-08', 1, '1'),
('DV002VN', 'MH03', '2022-07-13', 3, '1'),
('DV002VN', 'MH04', '2022-08-18',5, '1'),
('DV001VN', 'MH05', '2022-08-01', 1, '1');

INSERT INTO BaiDang VALUES
('MH01',N'Phòng vừa được tu sửa, có máy lạnh, tủ lạnh, bếp , có lang can , Gần với siêu thị, đối diện là bách hoá xanh, gần trường đại học Tôn Đức Thắng , giá rẻ , rộng rãi, ưu tiên cho sinh viên','','2018/12/12',null,''),
('MH02',N'Phòng cho thuê giá rẻ, thoáng mát, thuận tiện cho đi học, ngay uốc lộ 1A','','2018/12/12',null,''),
('MH01',N'Phòng gọn gàng, có máy giặt, có bếp, tủ lạnh, được hỗ trợ tiền trong tháng đầu','','2018/12/12',null,''),
('MH05',N'Phòng dành cho học sinh, sinh viên có đầy đủ dụng cụ, gần trường thpt, thcs, đại học, gần với bách hoa xanh, chợ, siêu thị','','2018/12/12',null,'');
go

CREATE TRIGGER DELETE_TaiKhoan ON TaiKhoan  INSTEAD OF DELETE
	AS
		BEGIN
			DELETE FROM GiaoDich WHERE MaTk_NguoiGui IN (Select MaTK FROM deleted)
			DELETE FROM LienKetThe_Vi WHERE MaTK IN (Select MaTK FROM deleted)
			DELETE FROM BaiDang WHERE MaTK IN (Select MaTK FROM deleted)
			DELETE FROM DanhGia WHERE Ma_NDG IN (Select MaTK FROM deleted)
			DELETE FROM DanhSach_DangKy_DichVu WHERE MaTK IN (Select MaTK FROM deleted)
			DELETE FROM TaiKhoan WHERE SDT IN (Select SDT FROM deleted)
		END

go
CREATE TRIGGER DELETE_NGUOIDUNG ON NguoiDung  INSTEAD OF DELETE
	AS
		BEGIN
			DELETE FROM TaiKhoan WHERE SDT IN (Select SDT FROM deleted)
			DELETE FROM NguoiDung WHERE SDT IN (Select SDT FROM deleted)
END

go
CREATE TRIGGER DELETE_NhaTro ON NhaTro  INSTEAD OF DELETE
	AS
		BEGIN
			DELETE FROM DanhGia WHERE MaNT IN (Select MaNT FROM deleted)
			DELETE FROM NhaTro WHERE MaNT IN (Select MaNT FROM deleted)
END

go
CREATE TRIGGER DELETE_LienKet ON LienKetThe_Vi  INSTEAD OF DELETE
	AS
		BEGIN
			DELETE FROM GiaoDich WHERE MaLK IN (Select MaLK FROM deleted)
			DELETE FROM LienKetThe_Vi WHERE MaLK IN (Select MaLK FROM deleted)
END

go
CREATE TRIGGER DELETE_DichVu ON DichVu  INSTEAD OF DELETE
	AS
		BEGIN
			DELETE FROM DanhSach_DangKy_DichVu WHERE MaDV IN (Select MADV FROM deleted)
			DELETE FROM DichVu_HoTro  WHERE MaDV IN (Select MADV FROM deleted)
			DELETE FROM DichVu  WHERE MaDV IN (Select MADV FROM deleted)
END

select * from NguoiDung
select * from TaiKhoan
select * from LoaiNhaTro
select * from NhaTro
select * from DanhGia
select * from LienKetThe_Vi
select * from GiaoDich
select * from BaiDang
select * from DichVu
select * from DichVu_HoTro
select * from DanhSach_DangKy_DichVu