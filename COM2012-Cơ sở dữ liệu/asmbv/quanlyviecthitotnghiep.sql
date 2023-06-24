-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlyviecthitotnghiep
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `giaovien`
--

DROP TABLE IF EXISTS `giaovien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giaovien` (
  `MAGV` varchar(7) NOT NULL,
  `TENGV` varchar(45) NOT NULL,
  `CHUYENMON` varchar(45) NOT NULL,
  `CHUCDANH` varchar(45) NOT NULL,
  `MAHĐT` varchar(45) NOT NULL,
  `MATR` varchar(10) NOT NULL,
  PRIMARY KEY (`MAGV`),
  KEY `MAHĐT_idx` (`MAHĐT`),
  KEY `MATR_idx` (`MATR`),
  CONSTRAINT `MAHĐT` FOREIGN KEY (`MAHĐT`) REFERENCES `hoidong` (`MAHDT`),
  CONSTRAINT `MATR` FOREIGN KEY (`MATR`) REFERENCES `truong` (`MATR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giaovien`
--

LOCK TABLES `giaovien` WRITE;
/*!40000 ALTER TABLE `giaovien` DISABLE KEYS */;
/*!40000 ALTER TABLE `giaovien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoidong`
--

DROP TABLE IF EXISTS `hoidong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoidong` (
  `MAHDT` varchar(7) NOT NULL,
  `TENHDT` varchar(45) NOT NULL,
  `TENCT` varchar(45) NOT NULL,
  `DIACHI` varchar(45) NOT NULL,
  `DTHDT` int NOT NULL,
  PRIMARY KEY (`MAHDT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoidong`
--

LOCK TABLES `hoidong` WRITE;
/*!40000 ALTER TABLE `hoidong` DISABLE KEYS */;
INSERT INTO `hoidong` VALUES ('HDT01','Hội đồng coi thi đợt 1','Nguyễn Đình Liên','Toà A Cục đào tạo ',936836582),('HDT02','Hội đồng coi thi đợt 2','Trần Nguyên Quán','Toà B Sở giáo dục đào tạo ',183849299),('HDT03','Hội đồng chuyên viên canh thi','Lê Thanh thuý','Văn Phòng đường Chế Lan Viên',927982848),('HDT04','Hôi đồng Giám sát','Phan Nguyễn Đình Nguyên','Văn phòng hội đồng Trường chuyên Lê Quý Đôn',974872932),('HDT05','Hội đồng đánh giá và hỗ trợ','Nguyễn Hữu Ánh','Trụ sở bộ giáo dục đào tào TP. Hồ Chí Minh',482729837);
/*!40000 ALTER TABLE `hoidong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ketqua`
--

DROP TABLE IF EXISTS `ketqua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ketqua` (
  `STT` int NOT NULL,
  `SOBD` int NOT NULL,
  `MAMT` varchar(45) NOT NULL,
  `DIEMTHI` decimal(10,0) NOT NULL,
  PRIMARY KEY (`STT`),
  KEY `SOBD_idx` (`SOBD`),
  KEY `MAMT_idx` (`MAMT`),
  CONSTRAINT `MAMT` FOREIGN KEY (`MAMT`) REFERENCES `monthi` (`MAMT`),
  CONSTRAINT `SOBD` FOREIGN KEY (`SOBD`) REFERENCES `thisinh` (`SOBD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ketqua`
--

LOCK TABLES `ketqua` WRITE;
/*!40000 ALTER TABLE `ketqua` DISABLE KEYS */;
INSERT INTO `ketqua` VALUES (1,101001,'V',8),(2,101001,'T',7),(3,101001,'TA',7),(4,101002,'V',8),(5,101002,'TA',7),(6,101003,'T',4),(7,101003,'TA',8),(8,101004,'V',4),(9,101006,'V',6),(10,101004,'TA',8),(11,101006,'T',9),(12,101007,'TA',6),(13,101007,'V',7),(14,101010,'T',8),(15,101010,'V',5);
/*!40000 ALTER TABLE `ketqua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthi`
--

DROP TABLE IF EXISTS `monthi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthi` (
  `MAMT` varchar(45) NOT NULL,
  `TENMT` varchar(45) NOT NULL,
  `BUOI` varchar(45) NOT NULL,
  `NGAYTHI` date NOT NULL,
  PRIMARY KEY (`MAMT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthi`
--

LOCK TABLES `monthi` WRITE;
/*!40000 ALTER TABLE `monthi` DISABLE KEYS */;
INSERT INTO `monthi` VALUES ('DL','Địa Lý','Sáng ','2010-05-21'),('GDCD','Giáo Dục Công Dân','Sáng','2010-05-21'),('HH','Hoá Học','Sáng','2010-05-21'),('LS','Lịch Sử','Sang','2010-05-21'),('SH','Sinh Học','Sáng','2010-05-21'),('T','Toán','Sang','2010-05-22'),('TA','Tiếng Anh','Chiều','2010-05-22'),('V','Ngữ Văn','Sáng','2010-05-20'),('VL','Vật Lý','Sáng','2010-05-21');
/*!40000 ALTER TABLE `monthi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongthi`
--

DROP TABLE IF EXISTS `phongthi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongthi` (
  `SOPT` int NOT NULL,
  `DCPT` varchar(45) NOT NULL,
  `MAHDT` varchar(7) NOT NULL,
  PRIMARY KEY (`SOPT`),
  KEY `MAHDT_idx` (`MAHDT`),
  CONSTRAINT `MAHDT` FOREIGN KEY (`MAHDT`) REFERENCES `hoidong` (`MAHDT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongthi`
--

LOCK TABLES `phongthi` WRITE;
/*!40000 ALTER TABLE `phongthi` DISABLE KEYS */;
INSERT INTO `phongthi` VALUES (1001,'Tầng 3 toà B trường THPT Nguyễn Công Trứ','HDT01'),(1002,'Tầng 1 toà D trường THPT Lê Quý Đôn','HDT05'),(1003,'Tầng 3 toà B trường THPT Nguyễn Kiệm','HDT02'),(1004,'Tầng 2 toà A trường THPT Quang Trung','HDT03'),(1005,'Tầng 4 toà C trường THPT Hùng Vương','HDT04'),(1006,'Tầng 3 toà A trường THPT Quang Trung','HDT03'),(1007,'Tầng 0 toà C trường THPT Nguyễn Huệ','HDT02'),(1008,'Tầng 1 toà A trường THPT Nguyễn Tất Thành','HDT01'),(1009,'Tầng 0 toà B trường THPT Lê Quý Đôn','HDT05'),(1010,'Tầng 2 toà D trường THPT Hoàng Hoa Thám','HDT03');
/*!40000 ALTER TABLE `phongthi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thisinh`
--

DROP TABLE IF EXISTS `thisinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thisinh` (
  `SOBD` int NOT NULL,
  `TENTS` varchar(45) NOT NULL,
  `NGAYSINH` date NOT NULL,
  `PHAI` varchar(45) NOT NULL,
  `CCNGHE` int NOT NULL,
  `MATRUONG` varchar(10) NOT NULL,
  `SOPT` int NOT NULL,
  PRIMARY KEY (`SOBD`),
  KEY `MATRUONG_idx` (`MATRUONG`),
  KEY `SOPT_idx` (`SOPT`),
  CONSTRAINT `MATRUONG` FOREIGN KEY (`MATRUONG`) REFERENCES `truong` (`MATR`),
  CONSTRAINT `SOPT` FOREIGN KEY (`SOPT`) REFERENCES `phongthi` (`SOPT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thisinh`
--

LOCK TABLES `thisinh` WRITE;
/*!40000 ALTER TABLE `thisinh` DISABLE KEYS */;
INSERT INTO `thisinh` VALUES (101001,'Phan Thị Kim Liên','1992-02-16','Nữ',1,'QT',1004),(101002,'Đỗ Trung Quân','1992-04-23','Nam',0,'NK',1003),(101003,'Lê Hồng Phong','1992-04-20','Nam',0,'NTT',1008),(101004,'Nguyễn Thị Ánh Vy','1992-07-18','Nữ',1,'QT',1006),(101005,'Trần Hữu Nguyên','1992-12-15','Nam',0,'NH',1007),(101006,'Lê Bảo Anh','1991-08-02','Nữ',1,'NCT',1001),(101007,'Dương Cẩm Uyên','1992-08-18','Nữ',1,'NCT',1001),(101008,'Quách Tuấn Kiệt','1992-01-19','Nam',1,'LQD',1002),(101009,'Nguyễn Trần Dương An','1992-10-28','Nam',0,'LQD',1009),(101010,'Phạm Nhật Minh','1992-06-14','Nam',1,'NCT',1001),(101011,'Nguyễn Thị Thuý Nga','1992-05-07','Nữ',1,'NTMK',1003);
/*!40000 ALTER TABLE `thisinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truong`
--

DROP TABLE IF EXISTS `truong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `truong` (
  `MATR` varchar(10) NOT NULL,
  `TENTR` varchar(45) NOT NULL,
  `DCTR` varchar(45) NOT NULL,
  `LHDT` varchar(45) NOT NULL,
  PRIMARY KEY (`MATR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truong`
--

LOCK TABLES `truong` WRITE;
/*!40000 ALTER TABLE `truong` DISABLE KEYS */;
INSERT INTO `truong` VALUES ('HHT','THPT Hoàng Hoa Tham','Gia Lai','Bán công'),('HV','THPT Hùng Vương','Huế','Công lập'),('LQD','THPT Lê Quý Đôn','Đăk Lăk','Chuyên'),('LVT','THPT Lê Văn Tám','Quãng Nam','Chuyên'),('NCT','THPT Nguyễn Công Trứ','Hà Nội','Công lập'),('NH','THPT Nguyễn Huệ','Đà Nẵng','Bán công'),('NK','THPT Nguyễn Kiệm','Hà Tĩnh','Dân lập'),('NTMK','THPT Nguyễn Thị Minh Khai','Tiền Giang','Bán công'),('NTT','THPT Nguyễn Tất Thành','Hồ Chí Minh','Dân Lập'),('QT','THPT Quang Trung','Bình Định','Công lập');
/*!40000 ALTER TABLE `truong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-19 22:58:30
