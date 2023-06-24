﻿CREATE DATABASE QLDA;
GO
USE QLDA
GO
CREATE TABLE DEAN (
		TENDA  NVARCHAR(15),
		MADA INT NOT NULL,
		DDIEM_DA NVARCHAR(15),
		PHONG INT  ,
			CONSTRAINT PK_dean PRIMARY KEY (MADA),
);
CREATE TABLE CONGVIEC(
		MADA INT NOT NULL ,
		STT  INT NOT NULL  ,
		TEN_CONG_VIEC  NVARCHAR(50),
		CONSTRAINT PK_CONGVIEC PRIMARY KEY (MADA,STT),
			
);
CREATE TABLE PHONGBAN( 
		TENPHG  NVARCHAR(15),
		MAPHG INT NOT NULL,
		TRPHG nVARCHAR(9) NOT NULL,
		NG_NHANCHUC DATE ,
		CONSTRAINT PK_PHONG PRIMARY KEY (MAPHG),
	);
	CREATE TABLE NHANVIEN(
			HONV  NVARCHAR(15),
			TENLOT NVARCHAR(15),
			TENNV NVARCHAR(15),
			MANV NVARCHAR(9) NOT NULL,
			NGSINH DATE,
			DCHI NVARCHAR(30),
			PHAI NVARCHAR(3),
			LUONG NUMERIC(10,2),
			MA_NQL NVARCHAR(9),
			PHG INT NOT NULL,
				CONSTRAINT PK_NHANVIEN PRIMARY KEY (MANV)
			);
			CREATE TABLE PHANCONG(
			MA_NVIEN NVARCHAR(9) NOT NULL ,
			MADAN INT NOT NULL ,
			STT INT NOT NULL ,
			THOIGIAN NUMERIC(5,2),
			CONSTRAINT PK_PHANCONG PRIMARY KEY (MADAN,STT,MA_NVIEN),

			);
			CREATE TABLE DIADIEM_PHG(
			MAPHG INT NOT NULL,
			DIADIEM  nVARCHAR(15) NOT NULL ,
				CONSTRAINT PK_DIADIEM PRIMARY KEY (MAPHG,DIADIEM)
			);
			CREATE TABLE THANNHAN(
			MA_NVIEN NVARCHAR(9) NOT  NULL ,
			TENTN NVARCHAR(15) NOT NULL, 
			PHAI NVARCHAR(3),
			NGSINH DATE ,
			QUANHE NVARCHAR(15),
				CONSTRAINT PK_THANNHAN PRIMARY KEY (MA_NVIEN, TENTN)
			);
			ALTER TABLE CONGVIEC
			ADD CONSTRAINT FK_CV FOREIGN KEY (MADA) REFERENCES  DEAN (MADA);
		
			ALTER TABLE  PHANCONG 
			ADD CONSTRAINT FK_NV FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN(MANV);
			ALTER TABLE NHANVIEN 
			ADD CONSTRAINT FK_PB FOREIGN KEY (PHG) REFERENCES PHONGBAN(MAPHG);
			ALTER TABLE PHONGBAN 
			ADD CONSTRAINT FK_NV1 FOREIGN KEY (TRPHG) REFERENCES NHANVIEN(MANV);
			ALTER TABLE DIADIEM_PHG 
			ADD CONSTRAINT FK_PHG FOREIGN KEY (MAPHG) REFERENCES PHONGBAN(MAPHG);
			ALTER TABLE THANNHAN 
			ADD CONSTRAINT FK_NV2 FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN(MANV);
			ALTER TABLE DEAN 
			ADD CONSTRAINT FK_PHONG FOREIGN KEY (PHONG) REFERENCES PHONGBAN(MAPHG);
			ALTER TABLE PHANCONG 
			ADD CONSTRAINT FK_PC FOREIGN KEY (MADAN,STT) REFERENCES CONGVIEC(MADA,STT);
			-- PHAIR LIEEN KEETS 2 CAIS KHOAS LAIJ

			INSERT INTO NHANVIEN(HONV,TENLOT,TENNV,MANV,NGSINH,DCHI,PHAI,LUONG,MA_NQL,PHG) VALUES 
			(N'Đình',N'Bá',N'Tiên','009','1960/02/11',N'.119 Cống Quỳnh, tp hcm',N'Nam',30000,'005',5),
			(N'Nguyễn',N'Thanh',N'Tùng','005','1962/08/20',N'222 Nguyễn Văn Cừ, TP HCM',N'Nam',40000,'006',5),
			(N'Bùi',N'Ngọc',N'Hằng','007','1954/03/11',N'332 Nguyễn Thái Học, TP HCM',N'Nam',25000,'001',4),
			(N'Lê',N'Quỳnh',N'Như','001','1967/02/11',N'291 Hồ Văn Huế TP HCM',N'Nữ',43000,'006',4),
			(N'Nguyễn',N'Mạnh',N'Hùng','004','1967/03/04',N'95 Bà Rịa, Vũng Tàu',N'Nam',38000,'005',5),
			(N'Trần',N'Thanh',N'Tâm','003','1957/05/04',N'34 MAi Lý Lự',N'Nam',25000,'005',5),
			(N'Trần',N'Hồng',N'Quang','008','1967/09/01',N'80 Lê Hồng Phong, TP HCM',N'Nam',25000,'001',4),
			(N'Phạm',N'Văn',N'Vinh','006','1965/01/01',N'.45 Trưng Vương, Hà Nội',N'Nữ',55000,'',1);
			INSERT INTO PHONGBAN(TENPHG,MAPHG,TRPHG,NG_NHANCHUC) VALUES 
			(N'Nghiên cứu',5,'005','1978/05/22'),
			(N'Điều hành',4,'008','1985/01/01'),
			(N'Quản lý',1,'006','1971/06/19');
			INSERT INTO DEAN(TENDA,MADA,DDIEM_DA,PHONG) VALUES
			(N'Sản phẩm X',1,N'Vũng Tàu',5),
			(N'Sản phẩm Y',2,N'Nha Trang',5),
			(N'Sản phẩm Z',3,N'TP HCM',5),
			(N'Tin học hoá',10,N'Hà Nội',4),
			(N'Cáp Quang',20,N'TP HCM',1),
			(N'Đào Tạo',30,N'Hà Nội',4);
	insert into phancong
(ma_nvien,MADAN,stt,thoigian)values
('009', 1, 1, 32),
('009',2,2,8),
('004',3,1,40),
('003',1,2,20),
('003',2,1,20),
('008',10,1,35),
('008',30,2,5),
('001',30,1,20),
('001',20,1,30),
('006',20,1,30),
('005',10,2,10),
('005',20,1,10),
('007',30,2,30),
('007',10,2,10);

insert into congviec
(mada,stt,ten_cong_viec)values
(1,1,N'Thiết kế sản phảm X'),
(1,2,N'Thử nghiệm sản phẩm X'),
(2,1,N'Sản xuất sản phầm Y'),
(2,2,N'Quảng cáo sản phầm Y'),
(3,1,N'Khuyến mãi sản phẩm Z'),
(10,1,N'TIn học hóa phòng nhân sự'),
(10,2,N'Tin học hóa phòng kinh doanh'),
(20,1,N'Lắp đặt váp quang'),
(30,1,N'Đào tạo nhân viên Mảketing'),
(30,2,N'Đào tạo chuyên viên thiết kế');

insert into thannhan
(MA_NVIEN,tentn,phai,ngsinh,quanhe)values
('005',N'Trinh',N'Nữ','1976/04/05',N'Con gái'),
('005',N'Khang',N'Nam','1973/10/25',N'Con trai'),
('005',N'Phương',N'Nữ','1948/5/03',N'Vợ chồng'),
('001',N'Minh',N'Nam','1932/02/29',N'Vợ chồng'),
('009',N'Tiến',N'Nam','1978/01/01',N'Con trai'),
('009',N'Châu',N'Nữ','1978/12/30',N'Con gái'),
('009',N'Phương',N'Nữ','1957/05/05',N'Vợ chồng');
INSERT INTO DIADIEM_PHG (MAPHG,DIADIEM) VALUES
(1,N'TP HCM'),
(4,N'Hà Nội'),
(5,N'Tàu'),
(5,N'Nha Trang'),
(5,N'TP HCM');


