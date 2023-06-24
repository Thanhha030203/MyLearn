-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: qlxuatkho_ps20125
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
-- Table structure for table `ctphieuxuat`
--

DROP TABLE IF EXISTS `ctphieuxuat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ctphieuxuat` (
  `SOPHIEU` char(5) NOT NULL,
  `MAHH` char(4) NOT NULL,
  `SOLUONG` int NOT NULL,
  `GHICHU` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SOPHIEU`,`MAHH`),
  KEY `MAHH` (`MAHH`),
  CONSTRAINT `ctphieuxuat_ibfk_1` FOREIGN KEY (`SOPHIEU`) REFERENCES `phieuxuat` (`SOPHIEU`),
  CONSTRAINT `ctphieuxuat_ibfk_2` FOREIGN KEY (`MAHH`) REFERENCES `hanghoa` (`MAHH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctphieuxuat`
--

LOCK TABLES `ctphieuxuat` WRITE;
/*!40000 ALTER TABLE `ctphieuxuat` DISABLE KEYS */;
INSERT INTO `ctphieuxuat` VALUES ('PX021','AO02',20,NULL),('PX021','DA01',20,'Đủ size'),('PX025','AK01',10,'Nhiều màu'),('PX025','DP01',100,'Áo + Váy'),('PX025','SM01',30,''),('PX031','BO01',30,NULL),('PX032','DP01',200,'Áo + Váy'),('PX032','DP02',200,NULL),('PX033','AK01',12,'Màu Xanh, Hồng, Tím'),('PX033','AO01',20,'Size 16-20'),('PX033','AO02',10,NULL),('PX033','BO01',50,NULL);
/*!40000 ALTER TABLE `ctphieuxuat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuahang`
--

DROP TABLE IF EXISTS `cuahang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuahang` (
  `MACH` char(4) NOT NULL,
  `TENCH` varchar(120) NOT NULL,
  `DIACHI` varchar(50) NOT NULL,
  `SODT` varchar(15) NOT NULL,
  `EMAIL` varchar(20) DEFAULT NULL,
  `NGUOIDD` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`MACH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuahang`
--

LOCK TABLES `cuahang` WRITE;
/*!40000 ALTER TABLE `cuahang` DISABLE KEYS */;
INSERT INTO `cuahang` VALUES ('CH01','Vân Thanh Fashion – Chi nhánh Quận 5','123 Nguyễn Trãi, Quận 5, Tp.HCM','0909099099','thanhtt@gmail.com','Trần Tuấn Thành'),('CH02','Vân Thanh Fashion – TTTM AERON TÂN PHÚ','30 Bờ Bao Tân Thắng, Quận Tân Phú, Tp.HCM','0909099099','areontp@gmail.com','Nguyễn Thành Công'),('CH03','Vân Thanh Fashion – Chi nhánh Quận 3','123 Nguyễn Trãi, Quận 5, Tp.HCM','0862887733','huongnk@gmail.com','Nguyễn Kim Hương'),('CH04','Vân Thanh Fashion – Chi nhánh Vũng Tàu','123 Nguyễn Trãi, Quận 5, Tp.HCM','0909099099','thanhdt@gmail.com','Đỗ Thị Thanh'),('CH05','Vân Thanh Fashion – Chi nhánh Hà Nội','123 Nguyễn Trãi, Quận 5, Tp.HCM','0909099099',NULL,'Trần Quốc Hậu');
/*!40000 ALTER TABLE `cuahang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hanghoa`
--

DROP TABLE IF EXISTS `hanghoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hanghoa` (
  `MAHH` char(4) NOT NULL,
  `TENHH` varchar(30) NOT NULL,
  `DONVT` varchar(15) NOT NULL,
  `DONGIA` double NOT NULL,
  `LOAI` char(4) NOT NULL,
  PRIMARY KEY (`MAHH`),
  KEY `LOAI` (`LOAI`),
  CONSTRAINT `hanghoa_ibfk_1` FOREIGN KEY (`LOAI`) REFERENCES `loaihang` (`MALOAI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hanghoa`
--

LOCK TABLES `hanghoa` WRITE;
/*!40000 ALTER TABLE `hanghoa` DISABLE KEYS */;
INSERT INTO `hanghoa` VALUES ('AK01','Áo khoát KaKi nữ hàn Quốc','Cái',285000,'TTNU'),('AK02','Áo khoát nữ dáng dài','cái',675000,'TTNU'),('AO01','Áo thun bé trai ngắn tay','Cái',85000,'TTTE'),('AO02','Áo khoát lửng trẻ em cao cấp','Cái',320000,'TTTE'),('BO01','Bộ thun trẻ em','Bộ',280000,'TTTE'),('DA01','Đầm caro công sở','Cái',252000,'TTNU'),('DP01','Đồng phục học sinh','Bộ',180000,'DPHS'),('DP02','Đồng phục học sinh THCS','Bộ',220000,'DPHS'),('SM01','Áo sơ mi nam','Cái',315000,'TTNA'),('SM02','Sơ mi ngắn tay cổ trụ','Cái',285000,'TTNA');
/*!40000 ALTER TABLE `hanghoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaihang`
--

DROP TABLE IF EXISTS `loaihang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaihang` (
  `MALOAI` char(4) NOT NULL,
  `TENLOAI` varchar(100) NOT NULL,
  PRIMARY KEY (`MALOAI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaihang`
--

LOCK TABLES `loaihang` WRITE;
/*!40000 ALTER TABLE `loaihang` DISABLE KEYS */;
INSERT INTO `loaihang` VALUES ('DPHS','Đồng phục học sinh'),('PKTT','Phụ kiện thời trang'),('TTNA','Thời trang Nam công sở'),('TTNU','Thời trang Nữ công sở'),('TTTE','Thời trang Trẻ em'),('TTTN','Thời trang trung niên');
/*!40000 ALTER TABLE `loaihang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieuxuat`
--

DROP TABLE IF EXISTS `phieuxuat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieuxuat` (
  `SOPHIEU` char(5) NOT NULL,
  `NGAYLAP` date NOT NULL,
  `NGAYXUAT` date DEFAULT NULL,
  `MACH` char(4) NOT NULL,
  PRIMARY KEY (`SOPHIEU`),
  KEY `MACH` (`MACH`),
  CONSTRAINT `phieuxuat_ibfk_1` FOREIGN KEY (`MACH`) REFERENCES `cuahang` (`MACH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieuxuat`
--

LOCK TABLES `phieuxuat` WRITE;
/*!40000 ALTER TABLE `phieuxuat` DISABLE KEYS */;
INSERT INTO `phieuxuat` VALUES ('PX011','2021-07-06','2021-07-12','CH01'),('PX012','2021-07-12','2021-07-20','CH02'),('PX013','2021-08-04','2021-08-20','CH05'),('PX021','2021-08-09','2021-08-20','CH01'),('PX022','2021-08-22','2021-09-20','CH01'),('PX023','2021-09-06','2021-09-20','CH02'),('PX024','2021-09-13','2021-09-20','CH05'),('PX025','2021-09-16','2021-09-25','CH01'),('PX031','2021-10-15',NULL,'CH01'),('PX032','2021-01-15',NULL,'CH02'),('PX033','2021-12-15',NULL,'CH01');
/*!40000 ALTER TABLE `phieuxuat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-13 13:43:28
