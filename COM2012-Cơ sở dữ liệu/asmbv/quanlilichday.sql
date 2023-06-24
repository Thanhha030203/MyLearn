-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlylichday
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
  `HOTEN` varchar(45) NOT NULL,
  `DTGV` int NOT NULL,
  `MAKHOA` varchar(45) NOT NULL,
  PRIMARY KEY (`MAGV`),
  KEY `FK_MAKHOA_idx` (`MAKHOA`),
  CONSTRAINT `FK_MAKHOA` FOREIGN KEY (`MAKHOA`) REFERENCES `khoa` (`MAKHOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giaovien`
--

LOCK TABLES `giaovien` WRITE;
/*!40000 ALTER TABLE `giaovien` DISABLE KEYS */;
INSERT INTO `giaovien` VALUES ('GV001','Nguyễn Văn A',912345678,'CNTT'),('GV002','Nguyễn Văn B',987654321,'CNTT'),('GV003','Nguyễn Văn C',921345678,'KT'),('GV004','Nguyễn Văn D',897654321,'KT'),('GV005','Nguyễn Thị A',123456789,'DL'),('GV006','Nguyễn Thị B',213456789,'DL'),('GV007','Nguyễn Thị C',978364823,'MKT'),('GV008','Nguyễn Văn F',739274954,'QL'),('GV009','Nguyễn Văn E',759375958,'QL'),('GV010','Nguyễn Thị D',479275849,'SP');
/*!40000 ALTER TABLE `giaovien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoa`
--

DROP TABLE IF EXISTS `khoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khoa` (
  `MAKHOA` varchar(45) NOT NULL,
  `TENKHOA` varchar(45) NOT NULL,
  `DTKHOA` int NOT NULL,
  PRIMARY KEY (`MAKHOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoa`
--

LOCK TABLES `khoa` WRITE;
/*!40000 ALTER TABLE `khoa` DISABLE KEYS */;
INSERT INTO `khoa` VALUES ('CNTT','Công nghệ thông tin',987654321),('DL','Du lịch',132456787),('KT','Kĩ thuật',664322696),('MKT','Makerting',978654321),('QL','Quản lý',568555487),('SP','Sư phạm',897964324);
/*!40000 ALTER TABLE `khoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lichday`
--

DROP TABLE IF EXISTS `lichday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lichday` (
  `MAGIAOVIEN` varchar(7) NOT NULL,
  `MAMH` varchar(45) NOT NULL,
  `PHONG` varchar(5) NOT NULL,
  `MALOP` varchar(10) NOT NULL,
  `NGAYDAY` date NOT NULL,
  `TUTIET` int NOT NULL,
  `DENTIET` int NOT NULL,
  `BAIDAY` varchar(45) NOT NULL,
  `LYTHUYET` int NOT NULL,
  `GHICHU` varchar(45) DEFAULT NULL,
  `STT` int NOT NULL,
  PRIMARY KEY (`STT`),
  KEY `MAGV_idx` (`MAGIAOVIEN`),
  KEY `MAMH_idx` (`MAMH`),
  KEY `MALOP_idx` (`MALOP`),
  KEY `PHONG_idx` (`PHONG`),
  CONSTRAINT `MAGIAOVIEN` FOREIGN KEY (`MAGIAOVIEN`) REFERENCES `giaovien` (`MAGV`),
  CONSTRAINT `MALOP` FOREIGN KEY (`MALOP`) REFERENCES `lop` (`MALOP`),
  CONSTRAINT `MAMH` FOREIGN KEY (`MAMH`) REFERENCES `monhoc` (`MAMH`),
  CONSTRAINT `PHONG` FOREIGN KEY (`PHONG`) REFERENCES `phonghoc` (`PHONG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lichday`
--

LOCK TABLES `lichday` WRITE;
/*!40000 ALTER TABLE `lichday` DISABLE KEYS */;
INSERT INTO `lichday` VALUES ('GV001','MN1101','PH0R2','L2010','2002-09-23',1,6,'Hướng đối tượng',1,'Giảng viên demo tại lớp',1),('GV002','MN1103','PH0R1','L2001','2002-09-23',1,6,'Truy vấn dữ liệu',1,NULL,2),('GV005','MN1104','PH0R7','L2009','2002-09-23',7,12,'Văn hoá vùng Tây Nguyên',1,'Ôn tập',3),('GV010','MN1107','PH0R6','L2006','2002-09-24',13,16,'Phát âm ',2,NULL,4),('GV002','MN1103','PH0R2','L2010','2002-09-24',7,6,'Truy vấn con',1,'Dự án quản lý nhà đất',5),('GV001','MN1102','PH0R1','L2002','2002-09-23',13,16,'Xây dựng trang web với HTML',2,NULL,6),('GV007','MN1108','PH0R3','L2004','2002-09-25',13,16,'Kĩ năng giao tiếp',2,NULL,7),('GV004','MN1110','PH0R4','L2007','2002-09-25',1,6,'Lắp ráp cơ khí mạch',2,'Khu xưởng B thực hàng trực tiếp',8),('GV007','MN1108','PH0R7','L2004','2002-09-26',13,16,'Kỹ năng sale',1,NULL,9),('GV010','MN1106','PH0R6','L2006','2002-09-26',7,12,'Không gian ba chiều',2,'Thực hành tại lớp',10);
/*!40000 ALTER TABLE `lichday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lop`
--

DROP TABLE IF EXISTS `lop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop` (
  `MALOP` varchar(10) NOT NULL,
  `TENLOP` varchar(45) NOT NULL,
  `SISO` int NOT NULL,
  `MAKH` varchar(45) NOT NULL,
  PRIMARY KEY (`MALOP`),
  KEY `FK_MAKH_idx` (`MAKH`),
  CONSTRAINT `FK_MAKH` FOREIGN KEY (`MAKH`) REFERENCES `khoa` (`MAKHOA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop`
--

LOCK TABLES `lop` WRITE;
/*!40000 ALTER TABLE `lop` DISABLE KEYS */;
INSERT INTO `lop` VALUES ('L2001','LCNTT1',35,'CNTT'),('L2002','LCNTT2',38,'CNTT'),('L2003','LDL',36,'DL'),('L2004','LMKT',40,'MKT'),('L2005','LQL',45,'QL'),('L2006','LSP',39,'SP'),('L2007','LKT',46,'KT'),('L2008','LKT1',43,'KT'),('L2009','LDL1',37,'DL'),('L2010','LCNTT3',39,'CNTT');
/*!40000 ALTER TABLE `lop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoc` (
  `MAMH` varchar(45) NOT NULL,
  `TENMH` varchar(45) NOT NULL,
  `MAGV` varchar(7) NOT NULL,
  `MA_LOP` varchar(10) NOT NULL,
  PRIMARY KEY (`MAMH`),
  KEY `MAGV_idx` (`MAGV`),
  KEY `MA_LOP_idx` (`MA_LOP`),
  CONSTRAINT `FK_MAGV` FOREIGN KEY (`MAGV`) REFERENCES `giaovien` (`MAGV`),
  CONSTRAINT `MA_LOP` FOREIGN KEY (`MA_LOP`) REFERENCES `lop` (`MALOP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc`
--

LOCK TABLES `monhoc` WRITE;
/*!40000 ALTER TABLE `monhoc` DISABLE KEYS */;
INSERT INTO `monhoc` VALUES ('MN1101','Ứng dụng phần mềm','GV001','L2001'),('MN1102','Lập trình web','GV001','L2002'),('MN1103','Cơ sở dữ liệu','GV002','L2003'),('MN1104','Du lịch và văn hoá','GV005','L2008'),('MN1105','Động cơ kĩ thuật','GV004','L2007'),('MN1106','Sư phạm toán','GV010','L2006'),('MN1107','Sư phạm anh văn','GV010','L2005'),('MN1108','Sale và marketing','GV007','L2010'),('MN1109','Thiết kế đồ hoạ','GV001','L2002'),('MN1110','Kĩ thuật cơ khí','GV004','L2007');
/*!40000 ALTER TABLE `monhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phonghoc`
--

DROP TABLE IF EXISTS `phonghoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phonghoc` (
  `PHONG` varchar(5) NOT NULL,
  `CHUCNANG` varchar(45) NOT NULL,
  PRIMARY KEY (`PHONG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phonghoc`
--

LOCK TABLES `phonghoc` WRITE;
/*!40000 ALTER TABLE `phonghoc` DISABLE KEYS */;
INSERT INTO `phonghoc` VALUES ('PH0R1','Phòng lý thuyết 1'),('PH0R2','Phòng thực hành máy'),('PH0R3','Phòng nghe nhìn'),('PH0R4','Xưởng thực tập cơ khí'),('PH0R5','Phòng đào tạo'),('PH0R6','Phòng chiếu'),('PH0R7','Phòng lý thuyết 2');
/*!40000 ALTER TABLE `phonghoc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-21 22:49:25
