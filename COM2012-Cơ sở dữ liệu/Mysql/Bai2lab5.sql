use quanlybanhang;
-- PS20520-Nguyen Thanh Ha-lab5---
-- bai2lab5.a--
SELECT count(ma_KH) AS "Số lượng khách hàng" FROM KHACH_HANG;
-- bai2lab5.b--
SELECT MAX(DON_GIA) FROM SAN_PHAM ;
-- bai2lab5.c--
SELECT TEN_SP,COUNT(SO_LUONG) AS "Số lượng sản phẩm thấp nhất" FROM SAN_PHAM; 
-- bai2lab5.d--
select sum(SO_LUONG) as "Tổng tất cả số lượng sản phẩm " from SAN_PHAM;
-- bai2lab5.e--
SELECT count(ma_HD) AS "Số lượng hoá đơn" FROM HOA_DON WHERE TRANG_THAI ="Chưa thanh toán" and NGAY_MUAHANG between '2016-12-01' AND '2016-12-31';
-- bai2lab5.f--
SELECT Ma_HD, count(ma_SP) AS "Số loại sản phẩm" FROM hoa_don_chi_tiet group by MA_HD having count(Ma_SP) >=5;
-- bai2lab5.g--
SELECT Ma_HD, NGAY_MUAHANG,MA_KHACHHANG FROM hoa_don order by NGAY_MUAHANG DESC;
-- bai2lab5.h--