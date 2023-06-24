-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema lab3
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `lab3` ;

-- -----------------------------------------------------
-- Schema lab3
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lab3` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
USE `lab3` ;

-- -----------------------------------------------------
-- Table `nhanvien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `nhanvien` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `nhanvien` (
  `MaNV` INT NOT NULL,
  `MaVP` INT NOT NULL,
  `TenNV` VARCHAR(45) NOT NULL,
  `noi ở` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`MaNV`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `nhanthan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `nhanthan` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `nhanthan` (
  `MaNV` INT NOT NULL,
  `TenNT` VARCHAR(45) NOT NULL,
  `Ngaysinh` DATE NOT NULL,
  `Mối quan hệ` VARCHAR(45) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `vanphong`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `vanphong` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `vanphong` (
  `MaVP` INT NOT NULL,
  `Địa điểm` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`MaVP`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `table1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `table1` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `table1` (
  `id` INT NOT NULL,
  `Tên` VARCHAR(45) NULL,
  `Ngày sinh` VARCHAR(45) NULL,
  `Nghề nghiệp` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
