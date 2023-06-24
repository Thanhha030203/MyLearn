create database de2;
use de2;
CREATE TABLE `monthi` (
  `MAMT` varchar(45) NOT NULL,
  `TENMT` varchar(45) NOT NULL,
  `BUOI` varchar(45) NOT NULL,
  `NGAYTHI` date NOT NULL,
  PRIMARY KEY (`MAMT`)
);
CREATE TABLE `thisinh` (
  `SOBD` int NOT NULL,
  `TENTS` varchar(45) NOT NULL,
  `NGAYSINH` date NOT NULL,
  `PHAI` varchar(45) NOT NULL,
  `CCNGHE` int NOT NULL,
  `MATRUONG` varchar(10) NOT NULL,
  `SOPT` int NOT NULL,
  PRIMARY KEY (`SOBD`));

-- );
CREATE TABLE `giaovien` (
  `MAGV` varchar(7) NOT NULL,
  `TENGV` varchar(45) NOT NULL,
  `CHUYENMON` varchar(45) NOT NULL,
  `CHUCDANH` varchar(45) NOT NULL,
  `MAHĐT` varchar(45) NOT NULL,
  `MATR` varchar(10) NOT NULL,
  PRIMARY KEY (`MAGV`));

-- );
CREATE TABLE `hoidong` (
  `MAHDT` varchar(7) NOT NULL,
  `TENHDT` varchar(45) NOT NULL,
  `TENCT` varchar(45) NOT NULL,
  `DIACHI` varchar(45) NOT NULL,
  `DTHDT` int NOT NULL,
  PRIMARY KEY (`MAHDT`)
) ;
CREATE TABLE `truong` (
  `MATR` varchar(10) NOT NULL,
  `TENTR` varchar(45) NOT NULL,
  `DCTR` varchar(45) NOT NULL,
  `LHDT` varchar(45) NOT NULL,
  PRIMARY KEY (`MATR`)
);
CREATE TABLE `phongthi` (
  `SOPT` int NOT NULL,
  `DCPT` varchar(45) NOT NULL,
  `MAHDT` varchar(7) NOT NULL,
  PRIMARY KEY (`SOPT`));

-- ) ;
CREATE TABLE `ketqua` (
  `STT` int NOT NULL,
  `SOBD` int NOT NULL,
  `MAMT` varchar(45) NOT NULL,
  `DIEMTHI` decimal(10,0) NOT NULL,
  PRIMARY KEY (`STT`));
    ALTER TABLE THISINH

 ADD CONSTRAINT `MATRUONG` FOREIGN KEY (`MATRUONG`) REFERENCES `truong` (`MATR`),
ADD  CONSTRAINT `SOPT` FOREIGN KEY (`SOPT`) REFERENCES `phongthi` (`SOPT`);
  ALTER TABLE GIAOVIEN
--   KEY `MAHĐT_idx` (`MAHĐT`),
--   KEY `MATR_idx` (`MATR`),
  ADD CONSTRAINT `MAHĐT` FOREIGN KEY (`MAHĐT`) REFERENCES `hoidong` (`MAHDT`),
 ADD  CONSTRAINT `MATR` FOREIGN KEY (`MATR`) REFERENCES `truong` (`MATR`);
   ALTER TABLE PHONGTHI 
--   KEY `MAHDT_idx` (`MAHDT`),
  ADD CONSTRAINT `MAHDT` FOREIGN KEY (`MAHDT`) REFERENCES `hoidong` (`MAHDT`);
  ALTER TABLE KETQUA 
  ADD CONSTRAINT `MAMT` FOREIGN KEY (`MAMT`) REFERENCES `monthi` (`MAMT`),
  ADD CONSTRAINT `SOBD` FOREIGN KEY (`SOBD`) REFERENCES `thisinh` (`SOBD`);
 
-- );