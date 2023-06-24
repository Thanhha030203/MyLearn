-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlibanhang
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
-- Table structure for table `hoa_don`
--

DROP TABLE IF EXISTS `hoa_don`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoa_don` (
  `Ma_HD` int NOT NULL,
  `NGAY_MUAHANG` date NOT NULL,
  `MA_KHACHHANG` varchar(5) NOT NULL,
  `TRANG_THAI` varchar(30) NOT NULL,
  PRIMARY KEY (`Ma_HD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoa_don`
--

LOCK TABLES `hoa_don` WRITE;
/*!40000 ALTER TABLE `hoa_don` DISABLE KEYS */;
INSERT INTO `hoa_don` VALUES (120954,'2016-03-23','KH001','Đã thanh toán'),(120955,'2016-04-02','KH002','Đã thanh toán'),(120956,'2016-07-12','KH001','Chưa thanh toán'),(120957,'2016-12-04','KH004','Chưa thanh toán');
/*!40000 ALTER TABLE `hoa_don` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoa_don_chi_tiet`
--

DROP TABLE IF EXISTS `hoa_don_chi_tiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoa_don_chi_tiet` (
  `MA_HD` int NOT NULL,
  `Ma_SP` int NOT NULL,
  `SO_LUONG` int NOT NULL,
  `Ma_HDCT` int NOT NULL,
  PRIMARY KEY (`Ma_HDCT`),
  KEY `FK_HOADON` (`Ma_SP`),
  CONSTRAINT `FK_HOADON` FOREIGN KEY (`Ma_SP`) REFERENCES `san_pham` (`ma_SP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoa_don_chi_tiet`
--

LOCK TABLES `hoa_don_chi_tiet` WRITE;
/*!40000 ALTER TABLE `hoa_don_chi_tiet` DISABLE KEYS */;
INSERT INTO `hoa_don_chi_tiet` VALUES (120954,3,40,1),(120954,1,20,2),(120955,2,100,3),(120956,4,6,4),(120956,2,60,5),(120956,1,10,6),(120957,2,50,7);
/*!40000 ALTER TABLE `hoa_don_chi_tiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khach_hang` (
  `ma_KH` varchar(5) NOT NULL,
  `HO_VA_TENLOT` varchar(50) NOT NULL,
  `TEN` varchar(50) NOT NULL,
  `DIA_CHI` varchar(255) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `DIEN_THOAI` varchar(13) NOT NULL,
  PRIMARY KEY (`ma_KH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach_hang`
--

LOCK TABLES `khach_hang` WRITE;
/*!40000 ALTER TABLE `khach_hang` DISABLE KEYS */;
INSERT INTO `khach_hang` VALUES ('KH001','Nguyễn Thị ','Nga','15 Quang Trung TP Đà Nẵng','ngant@gmail.com','0912345670'),('KH002','Trần Công ','Thành','234 Lê Lợi Quange Nam','thanhtc@gmail.com','0109423443'),('KH003','Lê Hoàng ','Nam','23 Trần Phú TP Huế','namlt@yahoo.com','06109423443'),('KH004','Vũ Ngọc ','Hiền','37 Nguyễn Thị Thập TP Đà Nẵng','hienvn@gmail.com','0894545435');
/*!40000 ALTER TABLE `khach_hang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `san_pham`
--

DROP TABLE IF EXISTS `san_pham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `san_pham` (
  `ma_SP` int NOT NULL,
  `MO_TA` varchar(255) NOT NULL,
  `SO_LUONG` int DEFAULT NULL,
  `DON_GIA` decimal(10,0) DEFAULT NULL,
  `TEN_SP` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ma_SP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `san_pham`
--

LOCK TABLES `san_pham` WRITE;
/*!40000 ALTER TABLE `san_pham` DISABLE KEYS */;
INSERT INTO `san_pham` VALUES (1,'Samsung Galaxy J7 Pro là một chiếc smartphone phù hợp với những người yêu thích một sản phẩm pin tốt, thích hệ điều hành mới cùng những tính năng đi kèm độc quyền',800,6600000,'Samsung Galaxy J7 Pro'),(2,'iPhone 6 là một trong những smartphone được yêu thích nhất. Lắng nghe nhu cầu về thiết kế, khả năng lưu trữ và giá cả, iPhone 6 32GB được chính thức phân phối chính hãng tại Việt Nam hứa hẹn sẽ là một sản phẩm rất \'Hot\'',500,8900000,' iPhone 6 32GB'),(3,'Dell Inspiron 3467 i3 7100U/4GB/1TB/Win10/(M20NR21)',600,11290000,'Laptop Dell Inspiron 3467'),(4,'Pin sạc dự phòng Polymer 5.000 mAh eSaver JP85',600,200000,'Pin sạc dự phòng'),(5,'Nokia 3100 phù hợp với SINH VIÊN',100,700000,'Nokia 3100');
/*!40000 ALTER TABLE `san_pham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-12 20:46:19
