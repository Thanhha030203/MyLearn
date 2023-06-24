CREATE database quanLiBanHang;
USE quanLiBanHang;
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
SO_LUONG INT ,
DON_GIA numeric ,
TEN_SP VARCHAR(30) 
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
INSERT INTO KHACH_HANG(ma_KH,HO_VA_TENLOT,TEN,DIA_CHI,EMAIL,DIEN_THOAI) VALUES 
		("KH001","Nguyễn Thị ","Nga","15 Quang Trung TP Đà Nẵng","ngant@gmail.com","0912345670"),
        ("KH002","Trần Công ","Thành","234 Lê Lợi Quange Nam","thanhtc@gmail.com","0109423443"),
        ("KH003","Lê Hoàng ","Nam","23 Trần Phú TP Huế","namlt@yahoo.com","06109423443"),
        ("KH004","Vũ Ngọc ","Hiền","37 Nguyễn Thị Thập TP Đà Nẵng","hienvn@gmail.com","0894545435");
INSERT INTO SAN_PHAM(ma_SP,MO_TA,SO_LUONG,DON_GIA,TEN_SP) VALUES 
		("1","Samsung Galaxy J7 Pro là một chiếc smartphone phù hợp với những người yêu thích một sản phẩm pin tốt, thích hệ điều hành mới cùng những tính năng đi kèm độc quyền","800","6600000","Samsung Galaxy J7 Pro"),
         ("2","iPhone 6 là một trong những smartphone được yêu thích nhất. Lắng nghe nhu cầu về thiết kế, khả năng lưu trữ và giá cả, iPhone 6 32GB được chính thức phân phối chính hãng tại Việt Nam hứa hẹn sẽ là một sản phẩm rất 'Hot'","500","8900000"," iPhone 6 32GB"),
        ("3","Dell Inspiron 3467 i3 7100U/4GB/1TB/Win10/(M20NR21)","600","11290000","Laptop Dell Inspiron 3467"),
        ("4","Pin sạc dự phòng Polymer 5.000 mAh eSaver JP85","600","200000","Pin sạc dự phòng"),
         ("5","Nokia 3100 phù hợp với SINH VIÊN","100","700000","Nokia 3100");
INSERT INTO HOA_DON(MA_HD,NGAY_MUAHANG,MA_KHACHHANG,TRANG_THAI) values 
		("120954","2016-03-23","KH001","Đã thanh toán"),
        ("120955","2016-04-02","KH002","Đã thanh toán"),
       ("120956","2016-07-12","KH001","Chưa thanh toán"),
       ("120957","2016-12-04","KH004","Chưa thanh toán");
INSERT INTO HOA_DON_CHI_TIET(MA_HD,MA_SP,SO_LUONG,MA_HDCT) VALUES
		("120954","3","40","1"),
        ("120954","1","20","2"),
        ("120955","2","100","3"),
        ("120956","4","6","4"),
        ("120956","2","60","5"),
        ("120956","1","10","6"),
         ("120957","2","50","7");