
--Bai1: Sử dụng cơ sở dữ liệu QLDA. Với mỗi câu truy vấn cần thực hiện bằng 2 
--cách, dùng cast và convert.

--1.Với mỗi đề án, liệt kê tên đề án và tổng số giờ làm việc một tuần của tất cả các nhân viên 
--tham dự đề án đó.

SELECT DEAN.TENDEAN, sum(THOIGIAN) as 'Tong thoi gian lam viec' FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


SELECT DEAN.TENDEAN, cast( sum(THOIGIAN) as decimal(6,2)) as 'Tong thoi gian lam viec' FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


SELECT DEAN.TENDEAN, cast( sum(THOIGIAN) as varchar(10)) as 'Tong thoi gian lam viec' FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


SELECT DEAN.TENDEAN, convert( decimal(6,2), sum(THOIGIAN)) as 'Tong thoi gian lam viec' FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


SELECT DEAN.TENDEAN, convert( varchar(10), sum(THOIGIAN)) as 'Tong thoi gian lam viec' FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


--2.Với mỗi phòng ban, liệt kê tên phòng ban và lương trung bình của những nhân viên làm 
--việc cho phòng ban đó

select PHONGBAN.TENPHG, AVG(LUONG) AS 'LUONG TRUNG BINH' from PHONGBAN
JOIN NHANVIEN on NHANVIEN.PHG = PHONGBAN.MAPHG
GROUP BY TENPHG


select PHONGBAN.TENPHG, CAST(AVG(LUONG) AS decimal(10,2)) AS 'LUONG TRUNG BINH' from PHONGBAN
JOIN NHANVIEN on NHANVIEN.PHG = PHONGBAN.MAPHG
GROUP BY TENPHG


select PHONGBAN.TENPHG, CONVERT(decimal(10,2), AVG(LUONG)) AS 'LUONG TRUNG BINH' from PHONGBAN
JOIN NHANVIEN on NHANVIEN.PHG = PHONGBAN.MAPHG
GROUP BY TENPHG


SELECT PHONGBAN.TENPHG, CAST(AVG(LUONG) AS varchar(10)) AS 'LUONG TRUNG BINH',
LEFT(CAST(AVG(LUONG) AS varchar(10)), 3) +
REPLACE(CAST(AVG(LUONG) AS varchar(10)), LEFT(CAST(AVG(LUONG) AS varchar(10)), 3), ',')
FROM PHONGBAN
JOIN NHANVIEN ON NHANVIEN.PHG = PHONGBAN.MAPHG
GROUP BY TENPHG


---------------------------------------------------------------------------------------------------------------------------


--Bai2:Sử dụng các hàm toán học

--1.Với mỗi đề án, liệt kê tên đề án và tổng số giờ làm việc một tuần của tất cả các nhân viên 
--tham dự đề án đó.

SELECT DEAN.TENDEAN, cast( sum(THOIGIAN) as decimal(6,2)) as 'Tong thoi gian lam viec' ,
CEILING(cast( sum(THOIGIAN) as decimal(6,2))) AS 'Tong gio new'
FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


SELECT DEAN.TENDEAN, cast( sum(THOIGIAN) as decimal(6,2)) as 'Tong thoi gian lam viec' ,
FLOOR(cast( sum(THOIGIAN) as decimal(6,2))) AS 'Tong gio new'
FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN


SELECT DEAN.TENDEAN, cast( sum(THOIGIAN) as decimal(6,2)) as 'Tong thoi gian lam viec' ,
ROUND(cast( sum(THOIGIAN) as decimal(6,2)), 2) AS 'Tong gio new'
FROM dbo.DEAN
JOIN dbo.CONGVIEC ON CONGVIEC.MADA = DEAN.MADA
JOIN dbo.PHANCONG ON PHANCONG.MADA = CONGVIEC.MADA
GROUP BY TENDEAN

--2.Cho biết họ tên nhân viên (HONV, TENLOT, TENNV) có mức lương trên mức lương 
--trung bình (làm tròn đến 2 số thập phân) của phòng "Nghiên cứu"

--Cách 1:

select concat(HONV, ' ' , TENLOT , ' ' , TENNV) as HOVATEN, LUONG from NHANVIEN
where LUONG >= (select ROUND(AVG(LUONG), 2) from NHANVIEN
join PHONGBAN on PHONGBAN.MAPHG = NHANVIEN.PHG
where TENPHG = N'Nghiên cứu')


--Cách 2:
SELECT CONCAT( NHANVIEN.HONV , ' ' ,NHANVIEN.TENLOT ,' ' , NHANVIEN.TENNV) AS 'FULLNAME',
ROUND(NHANVIEN.LUONG,2)
FROM NHANVIEN
WHERE NHANVIEN.LUONG > (SELECT
ROUND(AVG(NHANVIEN.LUONG),2) AS LUONGTB
FROM NHANVIEN
INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = NHANVIEN.PHG
WHERE PHONGBAN.TENPHG LIKE N'%Nghiên cứu%'
GROUP BY PHONGBAN.TENPHG)


---------------------------------------------------------------------------------------------------------------------------

--Bài 3: Sử dụng các hàm xử lý chuỗi 

--1.Danh sách những nhân viên (HONV, TENLOT, TENNV, DCHI) có trên 2 thân nhân, 
--thỏa các yêu cầu


SELECT HONV, TENLOT, TENNV, DCHI, COUNT(MA_NVIEN) AS 'So than nhan' FROM NHANVIEN
join THANNHAN on THANNHAN.MA_NVIEN = NHANVIEN.MANV
GROUP BY HONV, TENLOT, TENNV, DCHI
HAVING COUNT(MA_NVIEN) >= 2


--Dữ liệu cột HONV được viết in hoa toàn bộ

SELECT UPPER(HONV) AS 'HONV', TENLOT, TENNV, DCHI, COUNT(MA_NVIEN) AS 'So than nhan' FROM NHANVIEN
join THANNHAN on THANNHAN.MA_NVIEN = NHANVIEN.MANV
GROUP BY HONV, TENLOT, TENNV, DCHI
HAVING COUNT(MA_NVIEN) >= 2


--Dữ liệu cột TENLOT được viết chữ thường toàn bộ

SELECT UPPER(HONV) AS 'HONV', LOWER(TENLOT) AS 'TENLOT', TENNV
,DCHI, COUNT(MA_NVIEN) AS 'So than nhan' FROM NHANVIEN
join THANNHAN on THANNHAN.MA_NVIEN = NHANVIEN.MANV
GROUP BY HONV, TENLOT, TENNV, DCHI
HAVING COUNT(MA_NVIEN) >= 2

--Dữ liệu chột TENNV có ký tự thứ 2 được viết in hoa, các ký tự còn lại viết 
--thường( ví dụ: kHanh)
	
SELECT UPPER(HONV) AS 'HONV', LOWER(TENLOT) AS 'TENLOT'
,LOWER(LEFT(TENNV, 1)) + UPPER(SUBSTRING(TENNV, 2 ,1)) + SUBSTRING(TENNV, 3,LEN(TENNV)-2) AS 'TENNV'
,DCHI, COUNT(MA_NVIEN) AS 'So than nhan' FROM NHANVIEN
join THANNHAN on THANNHAN.MA_NVIEN = NHANVIEN.MANV
GROUP BY HONV, TENLOT, TENNV, DCHI
HAVING COUNT(MA_NVIEN) >= 2

-- Dữ liệu cột DCHI chỉ hiển thị phần tên đường, không hiển thị các thông tin khác 
--như số nhà hay thành phố.

SELECT DCHI, LEFT(DCHI, CHARINDEX(' ', DCHI)) AS 'So nha',
SUBSTRING(DCHI, CHARINDEX(',', DCHI),LEN(DCHI)) AS 'Ten thanh pho',
SUBSTRING(DCHI, CHARINDEX(' ',DCHI), CHARINDEX(',',DCHI) - 3) AS 'Ten duong'
FROM NHANVIEN


--2. Cho biết tên phòng ban và họ tên trưởng phòng của phòng ban có đông nhân viên nhất, 
--hiển thị thêm một cột thay thế tên trưởng phòng bằng tên “Fpoly”


SELECT PHONGBAN.TENPHG, CONCAT( NHANVIEN.HONV , ' ' ,NHANVIEN.TENLOT ,' ' , NHANVIEN.TENNV) AS 'Truong phong ban',
CONCAT( NHANVIEN.HONV , ' ' ,NHANVIEN.TENLOT ,' ' , 'FPOLY') AS 'Ten moi'
FROM NHANVIEN
INNER JOIN PHONGBAN ON PHONGBAN.TRPHG = NHANVIEN.MANV
WHERE NHANVIEN.MANV IN (SELECT TOP 1 PHONGBAN.MAPHG  FROM NHANVIEN
INNER JOIN PHONGBAN ON PHONGBAN.MAPHG = NHANVIEN.PHG
GROUP BY PHONGBAN.MAPHG
ORDER BY COUNT( NHANVIEN.MANV) DESC);


---------------------------------------------------------------------------------------------------------------------------


--Bài 4:Sử dụng các hàm ngày tháng năm

--1. Cho biết các nhân viên có năm sinh trong khoảng 1960 đến 1965

SELECT * FROM NHANVIEN
WHERE YEAR(NHANVIEN.NGSINH) BETWEEN 1960 AND 1965;

--2. Cho biết tuổi của các nhân viên tính đến thời điểm hiện tại.

SELECT CONCAT( NHANVIEN.HONV , ' ' ,NHANVIEN.TENLOT ,' ' , NHANVIEN.TENNV) AS 'HOVATEN',
YEAR(GETDATE()) - YEAR(NGSINH) AS 'Tuoi'
FROM NHANVIEN

--3.Dựa vào dữ liệu NGSINH, cho biết nhân viên sinh vào thứ mấy.

SELECT CONCAT( NHANVIEN.HONV , ' ' ,NHANVIEN.TENLOT ,' ' , NHANVIEN.TENNV) AS 'HOVATEN',
DATENAME(WEEKDAY ,YEAR(GETDATE()) - YEAR(NGSINH)) AS 'Ngay sinh'
FROM NHANVIEN

--4.  Cho biết số lượng nhân viên, tên trưởng phòng, ngày nhận chức trưởng phòng và ngày 
--nhận chức trưởng phòng hiển thi theo định dạng dd-mm-yy (ví dụ 25-04-2019)

SELECT TENPHG, TRPHG, NG_NHANCHUC, COUNT(MANV) AS 'So luong nhan vien'
, CONVERT(varchar, NG_NHANCHUC, 105) AS 'Ngay nhan chuc' from NHANVIEN
join PHONGBAN on PHONGBAN.MAPHG = NHANVIEN.PHG
GROUP BY TENPHG, TRPHG, NG_NHANCHUC 