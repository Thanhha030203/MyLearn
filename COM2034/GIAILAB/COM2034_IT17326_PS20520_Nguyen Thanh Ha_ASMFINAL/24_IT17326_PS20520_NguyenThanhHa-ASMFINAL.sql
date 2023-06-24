 --BUOC 1 : TẠO DATABASE : 
CREATE DATABASE QLNHATRO_PS20520THANHHA;
GO
 --BUOC 2 : SỬ DỤNG DATABASE : 
USE QLNHATRO_PS20520THANHHA;
GO
 --BUOC 3 : TẠO BẢNG : 
CREATE TABLE LOAINHA
(
MALOAI VARCHAR(10) NOT NULL,
TENLOAI NVARCHAR(50) NOT NULL,
 CONSTRAINT PK_LN PRIMARY KEY (MALOAI)
);
 CREATE TABLE NHATRO (
 MANT VARCHAR(10) NOT NULL,
 TENNT NVARCHAR(50),
 MALOAI VARCHAR(10) NOT NULL,
 DIENTICH NUMERIC(10,2) ,
 GIANHA MONEY NOT NULL,
 DIACHINHA NVARCHAR(150) NOT NULL,
 QUAN NVARCHAR(20), 
 MOTA NVARCHAR(150) ,
 NGAYDANG DATE ,
 MA_NGLH NVARCHAR(20) NOT NULL,
 CONSTRAINT PK_NT PRIMARY KEY (MANT)
 );
 CREATE TABLE NGUOIDUNG(
 MA_NGD NVARCHAR(20) NOT NULL,
 MANT VARCHAR(10) NOT NULL,
 TENND NVARCHAR(30) NOT NULL,
 GIOITINH NVARCHAR(10) ,
 DIENTHOAI INT ,
 DIACHI NVARCHAR(50) NOT NULL,
 QUAN NVARCHAR(20),
 EMAIL VARCHAR(50) NOT NULL
  CONSTRAINT PK_ND PRIMARY KEY (MA_NGD)
 );
 CREATE TABLE DANHGIA (
 STT INT NOT NULL,
 MA_NGD NVARCHAR(20) NOT NULL,
 MANTR VARCHAR(10) NOT NULL,
 TRANGTHAI  NVARCHAR(10) NOT NULL,
 ND NVARCHAR(200)
  CONSTRAINT PK_DG PRIMARY KEY (STT)
 );

  --BUOC 4: CHÈN DỮ LIỆU VÀO BẢNG
INSERT INTO LOAINHA(MALOAI,TENLOAI) VALUES
		('LN001',N'Căn hộ chung cư'),
		('LN002',N'Nhà riêng'),
		('LN003',N'Phòng trọ khép kín'),
		('LN004',N'Kí túc xá');

INSERT INTO NHATRO(MANT, TENNT,MALOAI,DIENTICH,GIANHA,DIACHINHA,QUAN,MOTA,NGAYDANG,MA_NGLH)
VALUES
('NT0101',null, 'LN003',16.2,3500000 , N'89/3 đường Thạnh Mỹ Lợi', N'Quận 2',N'Giờ giấc tự do, có thang máy, trệt để xe bao rộng' ,'2022/04/28','N01LH004'),
('NT0102',null, 'LN002',120,35000000 , N'92/16/3 Nguyễn Tư Nghiêm, Phường Bình Trưng Tây', N'Tp.Thủ Đức',N'Nhà đã trang bị đầy đủ,kết cấu 1 trệt 1 lầu' ,'2022/01/15','N02LH001'),
('NT0103',null, 'LN003',20.5,2300000 , N'124, liên khu 1-6, Bình trị đông', N'bình tân',N'Quy mô toà nhà 5 tầng, gần chợ, siêu thị, trường học, bệnh viện' ,'2021/12/12','N03LH007'),
('NT0104',null, 'LN003',20,3500000 , N'Bà Hom, Phường 13', N'Quận 6',N'Ban công, cửa sổ thoáng mát' ,'2022/03/21','N04LH001'),
('NT0105',null, 'LN001',40,6800000 , N'Đường Bạch Đằng, Phường 15', N'Bình Thạnh',N'Được trang bị đầy đủ nội thất y hình, căn hộ thoáng mát' ,'2022/05/17','N05LH034'),
('NT0106',null, 'LN001',67,8300000 , N'140/6 Hẻm 140 Đường Lê Đức Thọ Phường 6', N'Quận Gò Vấp',N'Thuận tiện di chuyển sang các quận trung tâm như quận 1, 4, 7, Phú Nhuận' ,'2022/05/05','N06LH018'),
('NT0107',N'Homestay Hoang Phuc', 'LN004 ',25,1100000 , N'Đường Nguyễn Tất Thành, Phường 13', N'Quận 4',N'Homestay Hoang Phuc- KTX Q4 Cao Cấp, Sạch sẽ, Tiện nghi.' ,'2022/03/01','N07LH309'),
('NT0108',null, 'LN001',35,5200000 , N'41 Đường Trục, phường 13', N'Bình Thạnh',N'Đầy đủ nội thất,Khu vực nhiều tiện ích, siêu thị, trung tâm thương mại' ,'2021/12/30','N08LH007'),
('NT0109',null, 'LN004',40,1200000 , N'Đường Xô Viết Nghệ Tĩnh, Phường 26', N'Quận Bình Thạnh',N'Vị trí nằm gần hàng xanh nên di chuyển qua các quận 1, quận 2, phú nhuận, gò vấp, quận 10Thủ Đức chỉ 5 phút.','2022/05/19','N09LH001'),
('NT0110',null, 'LN003',30.6,4000000 , N' 532/8, Đường Nguyễn Văn Công, Phường 3', N'Quận Gò Vấp',N'Nhà có thang máy, cửa vân tay và cửa cuốn tự động' ,'2022/03/05','N10LH005');

INSERT INTO NGUOIDUNG (MA_NGD,MANT,TENND,GIOITINH,DIENTHOAI,DIACHI,QUAN,EMAIL)
VALUES ('N01LH004','NT0101',N'Minh Thi',N'Nữ',0979330927,N'Đường số 54A, phường Tân Tạo', N'Quận Bình Tân' ,'thi123@gmail.com'),
			 ('N01LH018','NT0101',N'Hoàng Phúc',N'Nam',0931313570,N'89/3 đường Thạnh Mỹ Lợi',N'Quận 2' ,'phuchoang@gmail.com'),
			 ('N02LH001','NT0102',N'Thanh Ngân',N'Nữ',0982233407,N'65/13 đường Chu Văn An, phường 26', N'quận Bình Thạnh' ,'ngan321@gmail.com'),
			 ('N03LH007','NT0103',N'Trần Minh Tú',N'Nam',0906953375,N'25 Đường Xuân Thủy', N'Quận 2' ,'tumtnt@gmail.com'),
			 ('N03LH009','NT0103',N'Hằng Nguyễn',N'Nữ',0865864869,N'124, liên khu 1-6, Bình trị đông', N'bình tân' ,'hangn56@gmail.com'),
			 ('N04LH001','NT0104',N'Vinhhomes Land',N'Nam',0938899375,N'68 Hẻm 68 Trần Quang Khải', N'Quận 1' ,'landvs1234@gmail.com'),
			 ('N05LH034','NT0105',N'Nguyễn Anh Đông',N'Nam',0901476013,N'20 Đường Mã Lò', N'Quận Bình Tân' ,'dongan13@gmail.com'),
			  ('N05LH168','NT0105',N'Nguyễn Anh Tuấn',N'Nam',0865864869,N'Đường Bạch Đằng, Phường 15', N'Bình Thạnh' ,'tuananhnguyen@gmail.com'),
			 ('N06LH018','NT0106',N'Phạm Thị Ngọc Vy',N'Nữ',0915970274,N' 532/8, Đường Nguyễn Văn Công, Phường 3', N'Quận Gò Vấp' ,'ngocvy615@gmail.com'),
			  ('N07LH309','NT0107',N'Phương Dung',N'Nữ',0908499692,N'166/131 Đoàn Văn Bơ, Phường 14', N'Quận 4' ,'pdung@gmail.com'),
			   ('N07LH255','NT0107',N'Đỗ Hoàng Trung',N'Nam',0977644405,N'Đường Nguyễn Tất Thành, Phường 13', N'Quận 4' ,'hoangdt12@gmail.com'),
			  ('N08LH007','NT0108',N'Lưu Khánh Ngọc',N'Nữ',0778606848,N'43/4 Bình Tây Phường 1' ,N'Quận 6' ,'lkngoc848@gmail.com'),
			  ('N09LH001','NT0109',N'Nguyễn Ngọc Ánh',N'Nữ',0902513620,N'20, D9, Phường Phước Long B', N'Thủ Đức' ,'ngocanh321@gmail.com'),
			    ('N09LH047','NT0109',N'Diễm My',N'Nữ',0865864869,N'Đường Xô Viết Nghệ Tĩnh, Phường 26', N'Bình Thạnh' ,'diemmy20@gmail.com'),
				('N10LH005','NT0110',N'Hoàng Văn Kiệt',N'Nam',0946322816,N'34 Đường TK7, Xã Bà Điểm', N'Hóc Môn' ,'hoangkiet@gmail.com');
 INSERT INTO DANHGIA(STT,MA_NGD,MANTR,TRANGTHAI,ND) VALUES 
 (1,'N01LH018','NT0109',N'LIKE',NULL),
  (2,'N03LH009','NT0108',N'LIKE',N'Phòng rất đẹp và thuận lợi đi lại'),
   (3,'N05LH168','NT0103',N'DISLIKE',NULL),
    (4,'N07LH255','NT0107',N'LIKE',N'Giá phòng hợp lí'),
	 (5,'N09LH047','NT0110',N'DISLIKE',N'Phòng rất nóng, ồn ào'),
	  (6,'N09LH001','NT0110',N'DISLIKE',N'An ninh không an toàn'),
	   (7,'N10LH005','NT0102',N'LIKE',N'Nhà khá rộng và đẹp'),
	   (8,'N04LH001','NT0103',N'LIKE',NULL),
	   (9,'N06LH018','NT0104',N'LIKE',N'Phòng đẹp, sạch và mát'),
  (10,'N08LH007','NT0103',N'DISLIKE',NULL);


   --BUOC 5: TẠO LIÊN KẾT CÁC BẢNG
 ALTER TABLE NHATRO 
 ADD CONSTRAINT FK_NT FOREIGN KEY( MALOAI) REFERENCES LOAINHA(MALOAI);
  ALTER TABLE NGUOIDUNG 
 ADD CONSTRAINT FK_NG  FOREIGN KEY( MANT) REFERENCES NHATRO(MANT);
  ALTER TABLE DANHGIA 
 ADD CONSTRAINT FK_DG FOREIGN KEY( MA_NGD) REFERENCES NGUOIDUNG(MA_NGD);
  ALTER TABLE DANHGIA 
 ADD CONSTRAINT FK_DG1 FOREIGN KEY( MANTR) REFERENCES NHATRO(MANT);

 --BUOC 6 : KIỂM TRA : 
  SELECT * FROM LOAINHA;
  SELECT  * FROM NHATRO;
  SELECT * FROM NGUOIDUNG;
  SELECT * FROM DANHGIA;