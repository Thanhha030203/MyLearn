 CREATE DATABASE SQL_SV1;
 USE SQL_SV1
CREATE TABLE LOAINHA(
  maLoaiNha NVARCHAR(10) PRIMARY KEY NOT NULL,
  tenLoaiNha NVARCHAR(50) NOT NULL
);

CREATE TABLE NGUOIDUNG(
  maNguoiDung NVARCHAR(10) PRIMARY KEY NOT NULL,
  tenNguoiDung NVARCHAR(50) NOT NULL, 
  dienThoai NVARCHAR(11) NOT NULL,
  diaChi NVARCHAR(50) NOT NULL ,
  gioiTinh NVARCHAR(10) NOT NULL ,
  Email NVARCHAR(100) NOT NULL,

);
CREATE TABLE DANHGIA(
 sttDanhGia int NOT NULL PRIMARY KEY ,
 noiDungDanhGia NVARCHAR(50) NOT NULL ,
 maNhaTro NVARCHAR(10) NOT NULL ,
 maNguoiDung NVARCHAR(10) NOT NULL 

);

CREATE TABLE NHATRO(
 maNhaTro NVARCHAR(10) PRIMARY KEY NOT NULL ,
 thongTinNhaTro NVARCHAR(100)  NOT NULL ,
 ngayDang DATE NOT NULL ,
 dienTich NVARCHAR(10) NOT NULL ,
 giaPhong MONEY NOT NULL ,
 nguoiLienHe NVARCHAR(50) , 
 maLoaiNha NVARCHAR(10) NOT NULL ,
 diaChi NVARCHAR(50) NOT NULL ,
  maNguoiDung NVARCHAR(10) NOT NULL 
);


ALTER TABLE NHATRO
ADD CONSTRAINT FK_maLoaiNha
FOREIGN KEY(maLoaiNha) REFERENCES  LOAINHA(maLoaiNha),
FOREIGN KEY(maNguoiDung) REFERENCES NGUOIDUNG(maNguoiDung);

ALTER TABLE DANHGIA
ADD CONSTRAINT FK_maNhaTro
FOREIGN KEY(maNhaTro) REFERENCES NHATRO(maNhaTro) ,
FOREIGN KEY(maNguoiDung) REFERENCES NGUOIDUNG(maNguoiDung);

INSERT INTO LOAINHA 
VALUES('NT1',N'Nhà cấp 3'),
      ('NT2',N'Nhà ở cấp 4'),
	  ('NT3',N'Nhà cấp 1'),
      ('NT4',N'Nhà cấp 2'),
      ('NT5',N'Nhà ở xã hội'),
      ('NT6',N'Nhà ở tái định cư'),
      ('NT7',N'Nhà ở riêng lẻ'),
      ('NT8',N'Nhà cấp 2'),
      ('NT9',N'Nhà cấp 1'),
      ('NT10',N'Nhà cấp 4')
;

INSERT INTO NGUOIDUNG
VALUES
('ND1','Hieu','0909102030',N'Thôn sú 2, xã Lâm Động,thành phố Hải Phòng',N'Nam','thanhhieu03@gmail.com'),
('ND2','Vy','0909102333',N'12/2/2 Dương Bạch Mai p5q8 TPHCM',N'Nữ','thanhha@gmail.com'),
('ND3','Kien','0905522030',N'243/2 Trần Văn Ơn Q5 TPHCM',N'Nam','du123@gmail.com'),
('ND4','Vu','0909162330',N'Thôn 2, xã Lâm Động,thành phố Hải Dương',N'Nam','kai93@gmail.com'),
('ND5','Lam','0909528030',N'123/25/1 Phạm Thế Hiển p5q8 TPHCM',N'Nam','aqua93@gmail.com'),
('ND6','Hieu','0900032030',N'Số nhà 18,quận Thanh Xuân, thành phố Hà Nội',N'Nam','dunga312@gmail.com'),
('ND7','Ha','0909123430',N'Số nhà 923 quận Từ Liêm, thành phố Hà Nội',N'Nữ','vy92@gmail.com'),
('ND8','Bao','0909967030',N'Thôn 9 huyện Thủy Nguyên, thành phố Hải Phòng',N'Nữ','thanhhieu03@gmail.com'),
('ND9','Hieu','0900092030',N'16/9L ấp xuân thới đông hóc môn TPHCM',N'Nam','lam2123@gmail.com'),
('ND10','Ha','0909123030',N'Thôn sú 2, thành phố Hải Phòng',N'Nữ','loa23@gmail.com')

;

INSERT INTO NHATRO
VALUES 
('NTRO1',N'Cho thuê','2022-12-05','25m',15000000,N'Bạn bè','NT1',N'Thôn sú 2, thành phố Hải Phòng','ND2'),
('NTRO2',N'Cho thuê 1 ngày','2022-05-05','25m',150000,N'Ba mẹ','NT2',N'12/2/2 Dương Bạch Mai p5q8 TPHCM','ND3'),
('NTRO3',N'Cho thuê 1 tháng','2022-11-15','25m',15000000,N'Bạn học','NT3',N'Thôn 3 thành phố Hải Dương','ND4'),
('NTRO4',N'Cho thuê vài ngày','2022-06-25','25m',8000000,N'Bạn bè','NT4',N'242/2/1 Phạm Ngũ Lão Q5 TPHCM','ND2'),
('NTRO5',N'Cho thuê ở ghép','2022-12-10','25m',900000,N'Anh em','NT4',N'Thôn sú 2, thành phố Hải Phòng','ND5'),
('NTRO6',N'Cho thuê 1 ngày','2022-12-10','25m',150000,N'Bạn bè','NT5',N'Số nhà 18,quận Thanh Xuân, thành phố Hà Nội','ND4'),
('NTRO7',N'Cho thuê 1 tháng','2022-12-05','25m',15000000,N'Bạn bè','NT5',N'Số 99 đường Nguyễn Thái Học Q5 TPHC,','ND6'),
('NTRO8',N'Cho thuê qua đêm','2022-01-30','25m',200000,N'Bạn bè','NT6',N'009 Phạm Thế Hiển P5Q8 TPHCM','ND5'),
('NTRO9',N'Cho thuê 1 giờ','2022-09-05','25m',80000,N'Bạn bè','NT8',N'16/9L ấp xuân thới đông hóc môn TPHCM','ND2'),
('NTRO10',N'Cho thuê 1 ngày','2022-12-05','25m',150000,N'Bạn bè','NT1',N'Thôn sú 2, thành phố Hải Phòng','ND2');

INSERT INTO DANHGIA
VALUES
(1,N'Tốt','NTR01','ND2'),
(2,N'Rất tốt','NTR03','ND3'),
(3,N'Tốt','NTR04','ND4'),
(4,N'Tốt','NTR05','ND5'),
(5,N'Tệ','NTR06','ND6'),
(6,N'Tạm','NTR07','ND7'),
(7,N'Tốt','NTR08','ND8'),
(8,N'Tốt','NTR09','ND9'),
(9,N'Tốt','NTR010','ND10');

SELECT * FROM NHATRO;
SELECT * FROM NGUOIDUNG

