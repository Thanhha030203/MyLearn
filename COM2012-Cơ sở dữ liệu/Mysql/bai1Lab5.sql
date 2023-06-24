use quanlybanhang;
-- PS20520-Nguyen Thanh Ha _ Lab5--
-- Vui lòng chậy từng cậu một--
-- bai1.a--
SELECT * FROM khach_hang;
-- bai1.b--
SELECT ma_KH,concat(HO_VA_TENLOT,' ',TEN) AS "Họ và Tên ",EMAIL,DIEN_THOAI FROM KHACH_HANG limit 10;
-- bai1.c--
SELECT Ma_SP,TEN_SP, SO_LUONG*DON_GIA AS "Tổng tiền tồn kho" FROM SAN_PHAM;
-- bai1.d--
SELECT ma_KH,concat(HO_VA_TENLOT,' ',TEN) AS "Họ và Tên ",DIA_CHI FROM KHACH_HANG WHERE TEN LIKE "H%";
-- bai1.e--
SELECT * from KHACH_HANG WHERE DIA_CHI = "Đà Nẵng";
-- bai1.f--
SELECT * FROM SAN_PHAM WHERE SO_LUONG between 100 AND 500;
-- bai1.g--
SELECT * from HOA_DON WHERE TRANG_THAI = "Chưa thanh toan" and NGAY_MUAHANG between "2016-01-01" and "2016-12-31";
-- bai1.h--
SELECT * FROM KHACH_HANG WHERE ma_KH IN ("KH001","KH003","KH006");
