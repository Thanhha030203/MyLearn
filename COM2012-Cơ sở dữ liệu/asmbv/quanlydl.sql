-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlydulich
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
-- Table structure for table `chitiet`
--

DROP TABLE IF EXISTS `chitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitiet` (
  `MATOUR` varchar(45) NOT NULL,
  `MADDL` varchar(45) NOT NULL,
  `NGAY` int NOT NULL,
  `DEM` int NOT NULL,
  `STT` int NOT NULL,
  PRIMARY KEY (`STT`),
  KEY `MATOUR_idx` (`MATOUR`),
  KEY `MADDL_idx` (`MADDL`),
  CONSTRAINT `MADDL` FOREIGN KEY (`MADDL`) REFERENCES `diemdl` (`MADDL`),
  CONSTRAINT `MATOUR` FOREIGN KEY (`MATOUR`) REFERENCES `tour` (`MATOUR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitiet`
--

LOCK TABLES `chitiet` WRITE;
/*!40000 ALTER TABLE `chitiet` DISABLE KEYS */;
INSERT INTO `chitiet` VALUES ('T1003','DLD06',2,1,1),('T1002','DLD04',7,6,2),('T1010','DLD05',7,6,3),('T1006','DLD08',2,1,4),('T1007','DLD03',3,2,5),('T1006','DLD01',1,2,6),('T1006','DLD07',1,1,7);
/*!40000 ALTER TABLE `chitiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diemdl`
--

DROP TABLE IF EXISTS `diemdl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diemdl` (
  `MADDL` varchar(10) NOT NULL,
  `TENDDL` varchar(45) NOT NULL,
  `MATTP` int NOT NULL,
  `DACTRUNG` varchar(45) NOT NULL,
  PRIMARY KEY (`MADDL`),
  KEY `MATTP_idx` (`MATTP`),
  CONSTRAINT `MATTP` FOREIGN KEY (`MATTP`) REFERENCES `tinhtp` (`MATTP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diemdl`
--

LOCK TABLES `diemdl` WRITE;
/*!40000 ALTER TABLE `diemdl` DISABLE KEYS */;
INSERT INTO `diemdl` VALUES ('DLD01','Bến Nhà Rồng',69,'Di tích lịch sử'),('DLD02','Phố Cổ Hội An',45,'Phố cổ'),('DLD03','Bảo tàng Quang Trung',77,'Di tích lịch sử bảo tàng'),('DLD04','Vịnh Hạ Long',37,'Thắng cảnh'),('DLD05','Cung đình Huế',52,'Nhã nhạc cung đình Huế'),('DLD06','Lăng chủ tịch Hồ Chí Minh',28,'viếng lăng'),('DLD07','Đảo Phú Quốc',85,'Đảo xa bờ'),('DLD08','Biển Vũng Tàu',84,'Du lịch biển'),('DLD09','Nhà Thở Con Gà',66,'Kiến trúc lạ');
/*!40000 ALTER TABLE `diemdl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tinhtp`
--

DROP TABLE IF EXISTS `tinhtp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tinhtp` (
  `MATTP` int NOT NULL,
  `TENTTP` varchar(45) NOT NULL,
  `MIEN` varchar(45) NOT NULL,
  PRIMARY KEY (`MATTP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tinhtp`
--

LOCK TABLES `tinhtp` WRITE;
/*!40000 ALTER TABLE `tinhtp` DISABLE KEYS */;
INSERT INTO `tinhtp` VALUES (28,'Hà Nội','Bắc'),(37,'Quảng Ninh','Bắc'),(45,'Quãng Nam','Trung'),(52,'Huế','Trung'),(66,'Lâm Đồng','Trung'),(69,'Hồ Chí Minh','Nam'),(74,'Gia Lai','Trung'),(77,'Bình Định','Trung'),(84,'Bà Rịa - Vũng Tàu','Nam'),(85,'Kiên Giang','Nam'),(89,'Cà Mau','Nam');
/*!40000 ALTER TABLE `tinhtp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tour`
--

DROP TABLE IF EXISTS `tour`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour` (
  `MATOUR` varchar(45) NOT NULL,
  `TENTOUR` varchar(45) NOT NULL,
  `SONGAY` int NOT NULL,
  `SODEM` int NOT NULL,
  `PTDI` varchar(45) NOT NULL,
  `PTVE` varchar(45) NOT NULL,
  `GIALE` decimal(10,0) NOT NULL,
  `GIANHOM` decimal(10,0) NOT NULL,
  PRIMARY KEY (`MATOUR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tour`
--

LOCK TABLES `tour` WRITE;
/*!40000 ALTER TABLE `tour` DISABLE KEYS */;
INSERT INTO `tour` VALUES ('T1001','Hành trình lên Tây Nguyên',5,4,'Xe khách','Xe khách',550000,500000),('T1002','Tham quan  Vịnh Hạ Long',7,6,'Máy bay','Xe khách',1750000,1500000),('T1003','Thăm Lăng Bác Hồ',2,1,'Máy bay','Máy bay',3500000,3250000),('T1004','Khu du lịch sinh thái Sóc Sơn',4,4,'Xe máy','Xe máy',2400000,2230000),('T1005','Di tích lịch sử bến Nhà Rồng',2,1,'Taxi','Taxi',1500000,1350000),('T1006','Nét đẹp sông nước miền Tây',4,4,'Xe khách','Xe khách',870000,7750000),('T1007','Thắng cảnh Bình Định',3,2,'Máy bay','Xe máy',2500000,2350000),('T1008','Nét đẹp Hà Nội',10,9,'Máy bay','Máy bay',2580000,2500000),('T1009','Phố Cổ Hội An',3,3,'Xe khách','Xe khách',900000,850000),('T1010','Cố đô Huế',7,6,'Máy bay','Xe khách',1500000,1257000);
/*!40000 ALTER TABLE `tour` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-21 21:57:35
