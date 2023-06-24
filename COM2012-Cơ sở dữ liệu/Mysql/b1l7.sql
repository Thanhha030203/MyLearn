USE quanlibanhang;
-- create table KHACHHANG_DANANG (
--   `ma_KH` varchar(5) NOT NULL,
--   `HO_VA_TENLOT` varchar(50) NOT NULL,
--   `TEN` varchar(50) NOT NULL,
--   `DIA_CHI` varchar(255) NOT NULL,
--   `EMAIL` varchar(50) NOT NULL,
--   `DIEN_THOAI` varchar(13) NOT NULL,
--   PRIMARY KEY (`ma_KH`)
--   );
INSERT INTO KHACHHANG_DANANG select* FROM KHACH_HANG WHERE DIA_CHI LIKE "%Đà Nẵng%";
