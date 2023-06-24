/****** Script for SelectTopNRows command from SSMS  ******/

  USE QLDA


 --- BAI1LAB3
	--Với mỗi đề án, liệt kê tên đề án và tổng số giờ làm việc một tuần của tất cả các nhân viên tham dự đề án đó. 
--  o Xuất định dạng “tổng số giờ làm việc” kiểu decimal với 2 số thập phân.
  SELECT TENDA , CONVERT(DECIMAL(5,2),SUM(THOIGIAN),1) AS 'Tổng số giờ làm việc' FROM PHANCONG INNER JOIN DEAN ON PHANCONG.MADAN = DEAN.MADA GROUP BY TENDA;
 --  0 định dạng “tổng số giờ làm việc” kiểu varchar
   SELECT TENDA , CAST(SUM(THOIGIAN) AS VARCHAR) AS 'Tổng số giờ làm việc'  FROM PHANCONG INNER JOIN DEAN ON PHANCONG.MADAN = DEAN.MADA GROUP BY TENDA;

  -- Với mỗi phòng ban, liệt kê tên phòng ban và lương trung bình của những nhân viên làm việc cho phòng ban đó. 
  --o Xuất định dạng “luong trung bình” kiểu decimal với 2 số thập phân, sử dụng dấu phẩy để phân biệt phần nguyên và phần thập phân. 
    SELECT TENPHG , REPLACE(CONVERT(DECIMAL(10,2),AVG(N.LUONG),1),'.',',') as 'Lương trung bình' FROM NHANVIEN N INNER JOIN PHONGBAN P ON N.PHG = P.MAPHG GROUP BY P.TENPHG;
	  --o Xuất định dạng “luong trung bình” kiểu varchar. Sử dụng dấu phẩy tách cứ mỗi 3 chữ số trong chuỗi ra, gợi ý dùng thêm các hàm Left, Replace
   SELECT TENPHG , FORMAT(CONVERT(DECIMAL(10,2),AVG(N.LUONG),1),'N','vi-VN') as 'Lương trung bình' FROM NHANVIEN N INNER JOIN PHONGBAN P ON N.PHG = P.MAPHG GROUP BY P.TENPHG; 



   --BAI2LAB3
   --Với mỗi đề án, liệt kê tên đề án và tổng số giờ làm việc một tuần của tất cả các nhân viên tham dự đề án đó. 
   --o Xuất định dạng “tổng số giờ làm việc” với hàm CEILING
    SELECT TENDA , CEILING(SUM(THOIGIAN)) AS 'Tổng số giờ làm việc' FROM PHANCONG INNER JOIN DEAN ON PHANCONG.MADAN = DEAN.MADA GROUP BY TENDA;
	--o Xuất định dạng “tổng số giờ làm việc” với hàm FLOOR
   SELECT TENDA , FLOOR(SUM(THOIGIAN)) AS 'Tổng số giờ làm việc' FROM PHANCONG INNER JOIN DEAN ON PHANCONG.MADAN = DEAN.MADA GROUP BY TENDA;
	---o Xuất định dạng “tổng số giờ làm việc” làm tròn tới 2 chữ số thập phân
	 SELECT TENDA , ROUND(SUM(THOIGIAN),2) AS 'Tổng số giờ làm việc' FROM PHANCONG INNER JOIN DEAN ON PHANCONG.MADAN = DEAN.MADA GROUP BY TENDA;

	--Cho biết họ tên nhân viên (HONV, TENLOT, TENNV) có mức lương trên mức lương trung bình (làm tròn đến 2 số thập phân) của phòng "Nghiên cứu"
	SELECT HONV, TENLOT, TENNV FROM NHANVIEN INNER JOIN PHONGBAN ON NHANVIEN.PHG = PHONGBAN.MAPHG AND LUONG > ( SELECT AVG(LUONG) FROM NHANVIEN INNER JOIN PHONGBAN ON NHANVIEN.PHG = PHONGBAN.MAPHG AND TENPHG LIKE N'%Nghiên cứu%'  );



			--BAI3LAB3
			--Danh sách những nhân viên (HONV, TENLOT, TENNV, DCHI) có trên 2 thân nhân, thỏa các yêu cầu 
			--o Dữ liệu cột HONV được viết in hoa toàn bộ 
			--o Dữ liệu cột TENLOT được viết chữ thường toàn bộ
			--o Dữ liệu chột TENNV có ký tự thứ 2 được viết in hoa, các ký tự còn lại viết thường( ví dụ: kHanh)
			--o Dữ liệu cột DCHI chỉ hiển thị phần tên đường, không hiển thị các thông tin khác như số nhà hay thành phố
			SELECT  MANV, CONCAT(UPPER(HONV) ,' ', LOWER(TENLOT),' ', STUFF(LOWER(TENNV),2,1, UPPER(substring(TENNV,2,1))))AS 'HO VA TEN', 
			SUBSTRING(DCHI, CHARINDEX(' ',DCHI), CHARINDEX(',',DCHI) - CHARINDEX(' ',DCHI)) AS 'DIA CHI' FROM NHANVIEN  WHERE MANV IN (SELECT MANV FROM  NHANVIEN INNER JOIN THANNHAN ON NHANVIEN.MANV = THANNHAN.MA_NVIEN GROUP BY MANV  HAVING COUNT(THANNHAN.MA_NVIEN) > 2);

			--Cho biết tên phòng ban và họ tên trưởng phòng của phòng ban có đông nhân viên nhất, hiển thị thêm một cột thay thế tên trưởng phòng bằng tên “Fpoly”
			SELECT  MANV,TENNV, SL , REPLACE(TENNV,TENNV,'Fpoly') FROM 
		(SELECT  COUNT(PHG) AS SL , PHG FROM NHANVIEN GROUP BY PHG ORDER BY COUNT(PHG)  DESC OFFSET 0 ROWS FETCH FIRST 1 ROWS ONLY) A
		INNER JOIN (SELECT TENNV , MANV ,TRPHG,MAPHG FROM NHANVIEN INNER JOIN PHONGBAN ON NHANVIEN.MANV = PHONGBAN.TRPHG) B ON A.PHG = B.MAPHG;



		---BAI4LAB3
  --Cho biết các nhân viên có năm sinh trong khoảng 1960 đến 1965
  SELECT * FROM NHANVIEN WHERE YEAR(NGSINH) BETWEEN 1960 AND 1967;
  --Cho biết tuổi của các nhân viên tính đến thời điểm hiện tại.
    SELECT MANV, CONCAT(HONV, ' ',TENLOT,' ', TENNV) AS 'HO VA TEN', year(GETDATE())-YEAR(NGSINH) AS 'TUỔI'  FROM NHANVIEN;
	--Dựa vào dữ liệu NGSINH, cho biết nhân viên sinh vào thứ mấy.
	SELECT  COUNT (MA_NQL) , MANV, TENNV FROM NHANVIEN WHERE  MANV IN ( SELECT TRPHG FROM PHONGBAN)  ;
	--Dựa vào dữ liệu NGSINH, cho biết nhân viên sinh vào thứ mấy.
	SELECT MANV, TENNV , NGSINH, DATENAME(weekday, NGSINH ) AS ' THỨ'  FROM NHANVIEN; 
		SELECT TENNV,MANV, COUNT (MA_NQL) FROM NHANVIEN INNER JOIN PHONGBAN ON NHANVIEN.MANV = PHONGBAN.TRPHG  group by TENNV,MANV ;
		SELECT * FROM NHANVIEN;

---Cho biết số lượng nhân viên, tên trưởng phòng, ngày nhận chức trưởng phòng và ngày nhận chức trưởng phòng hiển thi theo định dạng dd-mm-yy (ví dụ 25-04-2019)
		SELECT  MANV,TENNV, SL , NGAY_NHAN_CHUC FROM 
		(SELECT COUNT(PHG) AS SL , PHG FROM NHANVIEN GROUP BY PHG) A
		INNER JOIN (SELECT TENNV , MANV,TRPHG,MAPHG, CONVERT(VARCHAR ,NG_NHANCHUC,105)AS NGAY_NHAN_CHUC FROM NHANVIEN INNER JOIN PHONGBAN ON NHANVIEN.MANV = PHONGBAN.TRPHG) B ON A.PHG = B.MAPHG;
