use quanlybanhang;
-- PS20520_Nguyen Thanh Ha_lab6----
-- bai1lab6.a---
SELECT hd.Ma_HD,hd.MA_KHACHHANG,hd.TRANG_THAI, hdct.Ma_SP,hdct.SO_LUONG, hd.NGAY_MUAHANG FROM HOA_DON hd INNER JOIN HOA_DON_CHI_TIET hdct ON hd.Ma_HD = hdct.MA_HD;     
-- bai1lab6.b---
SELECT hd.Ma_HD,hd.MA_KHACHHANG,hd.TRANG_THAI, hdct.Ma_SP,hdct.SO_LUONG, hd.NGAY_MUAHANG 
FROM HOA_DON hd INNER JOIN HOA_DON_CHI_TIET hdct ON hd.Ma_HD = hdct.MA_HD AND hd.MA_KHACHHANG ="KH001"; 
-- bai1lab6.c---
SELECT hd.Ma_HD,hd.NGAY_MUAHANG,sp.TEN_SP, sp.DON_GIA, hdct.SO_LUONG,sp.DON_GIA*hdct.SO_LUONG as "Thành tiền"  
FROM SAN_PHAM sp INNER JOIN HOA_DON_CHI_TIET hdct ON sp.ma_SP = hdct.Ma_SP INNER JOIN HOA_DON hd on hdct.MA_HD = hd.Ma_HD ; 
-- bai1lab6.d---
SELECT CONCAT(KH.HO_VA_TENLOT,'',KH.TEN)as "Họ và tên", KH.EMAIL, KH.DIEN_THOAI, HD.MA_HD, HD.TRANG_THAI, HDCT.SO_LUONG*SP.DON_GIA AS "Thành tiền" 
FROM KHACH_HANG KH INNER JOIN HOA_DON HD ON KH.ma_KH = HD.MA_KHACHHANG INNER JOIN HOA_DON_CHI_TIET HDCT 
ON HD.Ma_HD = HDCT.MA_HD AND HD.TRANG_THAI = "Chưa thanh toán" inner JOIN SAN_PHAM SP ON HDCT.Ma_SP = SP.ma_SP;
-- bai1lab6.e---
SELECT HD.MA_HD, HD.NGAY_MUAHANG,  HDCT.SO_LUONG*SP.DON_GIA AS "Tổng tiền" 
FROM HOA_DON HD INNER JOIN HOA_DON_CHI_TIET HDCT ON HD.Ma_HD = HDCT.MA_HD 
INNER JOIN SAN_PHAM SP ON HDCT.Ma_SP = SP.ma_SP 
AND HDCT.SO_LUONG*SP.DON_GIA >=500000 order by HDCT.SO_LUONG*SP.DON_GIA DESC;