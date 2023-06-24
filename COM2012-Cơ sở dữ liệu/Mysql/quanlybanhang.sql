CREATE database quanLyBanHang;
USE quanLyBanHang;
CREATE TABLE KHACH_HANG(
ma_KH VARCHAR(5) PRIMARY KEY NOT NULL,
HO_VA_TENLOT VARCHAR(50) NOT NULL, 
TEN VARCHAR(50) NOT NULL,
DIA_CHI VARCHAR(255) NOT NULL,
EMAIL VARCHAR(50) NOT NULL,
DIEN_THOAI VARCHAR(13) NOT NULL
);
CREATE TABLE San_Pham(
ma_SP INT PRIMARY KEY NOT NULL ,
MO_TA VARCHAR(255) NOT NULL,
SO_LUONG INT NOT NULL,
DON_GIA numeric NOT NULL,
TEN_SP VARCHAR(30) NOT NULL
);
CREATE TABLE HOA_DON(
Ma_HD INT PRIMARY KEY NOT NULL,
NGAY_MUAHANG DATE NOT NULL,
MA_KHACHHANG VARCHAR(5) NOT null,
TRANG_THAI VARCHAR(30) NOT NULL
);
CREATE TABLE HOA_DON_CHI_TIET(
MA_HD INT NOT NULL,
Ma_SP INT NOT NULL,
SO_LUONG INT NOT NULL,
Ma_HDCT INT PRIMARY KEY NOT NULL
);
alter table hoa_don_chi_tiet
ADD CONSTRAINT FK_HOADON FOREIGN KEY (Ma_SP)REFERENCES san_pham(Ma_SP);
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10001', '2016-03-12', 'KH002', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10002', '2020-12-08', 'KH006', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10003', '2016-08-03', 'KH002', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10004', '2017-09-20', 'KH009', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10005', '2019-07-12', 'KH005', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10006', '2016-12-25', 'KH005', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10007', '2016-12-12', 'KH007', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10008', '2020-06-17', 'KH008', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10009', '2018-08-05', 'KH004', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10010', '2022-11-30', 'KH003', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10011', '2018-01-08', 'KH001', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10012', '2016-12-31', 'KH004', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10013', '2021-10-17', 'KH011', 'Đã thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10014', '2017-05-19', 'KH012', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`hoa_don` (`Ma_HD`, `NGAY_MUAHANG`, `MA_KHACHHANG`, `TRANG_THAI`) VALUES ('10015', '2022-01-31', 'KH009', 'Chưa thanh toán');
INSERT INTO `quanlybanhang`.`san_pham` (`ma_SP`, `MO_TA`, `SO_LUONG`, `DON_GIA`, `TEN_SP`) VALUES ('1', 'tủ lạnh', '140', '2750', 'Tủ Lạnh');
INSERT INTO `quanlybanhang`.`san_pham` (`ma_SP`, `MO_TA`, `SO_LUONG`, `DON_GIA`, `TEN_SP`) VALUES ('2', 'máy giặt', '320', '2690', 'Máy Giặt');
INSERT INTO `quanlybanhang`.`san_pham` (`ma_SP`, `MO_TA`, `SO_LUONG`, `DON_GIA`, `TEN_SP`) VALUES ('3', 'máy lạnh', '90', '2800', 'Máy Lạnh');
INSERT INTO `quanlybanhang`.`san_pham` (`ma_SP`, `MO_TA`, `SO_LUONG`, `DON_GIA`, `TEN_SP`) VALUES ('4', 'máy quạt trần', '460', '1200', 'Máy Quạt');
INSERT INTO `quanlybanhang`.`san_pham` (`ma_SP`, `MO_TA`, `SO_LUONG`, `DON_GIA`, `TEN_SP`) VALUES ('5', 'bếp ', '570', '1000', 'Bếp Điện');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH001', 'Lê Thị', 'Diệu', 'Hà Nội', 'lethi@gmail.com', '0982748273');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH002', 'Trần Văn', 'Nghĩa', 'Đà Nẵng', 'nghĩa12@gmail.com', '0627462824');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH003', 'Nguyễn Phương', 'Thảo', 'Phú Yên', 'thao78n@gmail.com', '0828742974');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH004', 'Phạm Công', 'Thành', 'Đà Nẵng', 'thanh12kj@gmail.com', '0389028402');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH005', 'Trương Văn ', 'Phú', 'Huế', 'phutruongi@gmail.com', '0649274274');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH006', 'Đoàn Thị', 'Huế', 'Cao Bằng', 'hue34doan@gmail.com', '0759375939');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH007', 'Nguyện Thị', 'Lệ', 'Hồ Chí Minh', 'lethanhthi@gmail.com', '0973846838');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH008', 'Lê Văn', 'Tùng', 'Hồ Chí Minh', 'tungle@gmail.com', '0385938596');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH009', 'Nguyễn Văn', 'Hưng', 'Đà Nẵng', 'hung35van@gmail.com', '0658975920');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH010', 'Phan Nhật', 'Nguyên', 'Cần Thơ', 'nguyenphan134@gmail.com', '0793749295');
INSERT INTO `quanlybanhang`.`khach_hang` (`ma_KH`, `HO_VA_TENLOT`, `TEN`, `DIA_CHI`, `EMAIL`, `DIEN_THOAI`) VALUES ('KH011', 'Nguyễn Phương', 'Lan', 'Hà Nội', 'lannguyen78@gmail.com', '0097462912');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10002', '2', '40', '11001');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10003', '5', '65', '11002');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10005', '1', '34', '11003');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10002', '4', '87', '11004');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10006', '3', '33', '11005');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10010', '2', '22', '11006');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10002', '1', '82', '11007');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10011', '2', '25', '11008');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10004', '5', '63', '11009');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10009', '3', '12', '11010');
INSERT INTO `quanlybanhang`.`hoa_don_chi_tiet` (`MA_HD`, `Ma_SP`, `SO_LUONG`, `Ma_HDCT`) VALUES ('10010', '2', '14', '11011');