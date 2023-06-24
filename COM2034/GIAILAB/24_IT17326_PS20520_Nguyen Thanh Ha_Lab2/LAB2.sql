﻿USE QLDA
---Bai2.lab2-1--
DECLARE @NV INT ;
SELECT @NV = MAX(LUONG) FROM NHANVIEN;
SELECT @NV AS N'LUONG';


---Bai2.lab2-2--

---CACH1
BEGIN
DECLARE @AVG_LUONG INT ;
SELECT @AVG_LUONG = AVG(nhanvien.LUONG) FROM NHANVIEN INNER JOIN PHONGBAN ON
NHANVIEN.PHG = PHONGBAN.MAPHG AND PHONGBAN.TENPHG = N'Nghiên cứu';
SELECT @AVG_LUONG AS 'LUONG';
 DECLARE @NV_KQ TABLE(HONV NVARCHAR(10), TENLOT NVARCHAR(10), TENNV NVARCHAR(10), LUONG INT);
INSERT INTO @NV_KQ SELECT HONV, TENLOT, TENNV,LUONG FROM NHANVIEN WHERE LUONG > @AVG_LUONG;
SELECT HONV, TENLOT, TENNV,LUONG FROM @NV_KQ;
END;

--CACH2
DECLARE @NV_KQ1 TABLE(HONV NVARCHAR(10), TENLOT NVARCHAR(10), TENNV NVARCHAR(10), LUONG INT);
INSERT INTO @NV_KQ1 SELECT HONV, TENLOT, TENNV,LUONG FROM 
NHANVIEN INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = NHANVIEN.PHG  AND  NHANVIEN.LUONG >= (SELECT AVG(LUONG) FROM NHANVIEN INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = NHANVIEN.PHG AND PHONGBAN.TENPHG = N'Nghiên cứu');
SELECT HONV, TENLOT, TENNV,LUONG FROM @NV_KQ1;

---CACH3---
SELECT HONV, TENLOT, TENNV,LUONG FROM  
NHANVIEN INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = NHANVIEN.PHG  AND  NHANVIEN.LUONG >= ALL (SELECT AVG(LUONG) FROM NHANVIEN INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = NHANVIEN.PHG AND PHONGBAN.TENPHG = N'Nghiên cứu');


---Bai2.lab2-3--
DECLARE  @PB TABLE (MAPHG INT, SL INT,  AVG_LUONG INT)
INSERT INTO @PB
SELECT MAPHG, COUNT(NHANVIEN.PHG) AS 'SOLUONG', AVG(NHANVIEN.Luong) AS 'TRUNGBINH' FROM PHONGBAN INNER JOIN NHANVIEN
ON NHANVIEN.PHG = PHONGBAN.MAPHG GROUP BY MAPHG HAVING AVG(NHANVIEN.LUONG) > 30000;
SELECT * FROM @PB;

---Bai2.lab2-4--
BEGIN
DECLARE @DA TABLE(MAPHG INT, SL INT)
INSERT INTO @DA
SELECT PHONG, COUNT(MaDA) FROM DEAN
INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = DEAN.PHONG
GROUP BY PHONG;
SELECT MAPHG , SL FROM @DA;
END;