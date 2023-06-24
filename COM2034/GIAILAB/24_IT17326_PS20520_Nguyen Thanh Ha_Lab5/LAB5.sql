-- BÀI 1: 
--In ra dòng ‘Xin chào’ + @ten với @ten là tham số đầu vào là tên Tiếng Việt có dấu của 
--bạn. Gợi ý:
--o sử dụng UniKey để gõ Tiếng Việt ♦
--o chuỗi unicode phải bắt đầu bởi N (vd: N’Tiếng Việt’) ♦ 
--o dùng hàm cast (<biểuThức> as <kiểu>) để đổi thành kiểu <kiểu> của<biểuThức>.
DROP PROC IF EXISTS sp_ten
GO
CREATE PROC sp_ten @ten nvarchar(45)
AS
	BEGIN 
		PRINT N'Xin chào'+ @ten
	END
EXEC sp_ten N'THANH HÀ'
-- Nhập vào 2 số @s1,@s2. In ra câu ‘Tổng là : @tg’ với @tg=@s1+@s2.
GO
DROP PROC IF EXISTS sp_tong
GO
CREATE PROC sp_tong @so1 INT , @so2 INT
AS
	BEGIN
		DECLARE @tong INT
		SET @tong = @so1 + @so2
		PRINT N'Tổng  = ' +cast(@tong AS VARCHAR);
	END


-- gọi thực thi
EXEC sp_tong 2,3


-- Nhập vào số nguyên @n. In ra tổng các số chẵn từ 1 đến @n.
DROP PROC IF EXISTS sp_tongchan
GO
CREATE PROC sp_tongchan @n int
AS
	BEGIN 
	 DECLARE @tong INT, @i INT;
		SET @tong = 0
		SET @i = 1
		WHILE @i<@n
		BEGIN
			IF @i % 2 = 0
			BEGIN
				SET @tong = @tong + @i
			END
				SET @i = @i +1
		END
		PRINT N'Tổng các số chẵn: '+cast(@tong as varchar);
	END
EXEC sp_tongchan 11

-- Nhập vào 2 số. In ra ước chung lớn nhất của chúng theo gợi ý dưới đây:
--o b1. Không mất tính tổng quát giả sử a <= A 
--o b2. Nếu A chia hết cho a thì : (a,A) = a ngược lại : (a,A) = (A%a,a) hoặc (a,A) = 
--(a,A-a) 
--o b3. Lặp lại b1,b2 cho đến khi điều kiện trong b2 được thỏa
DROP PROC IF EXISTS sp_uscln
GO
CREATE PROC sp_uscln
@a INT , @b INT
AS
	BEGIN 
	DECLARE @temp INT
	IF @a >@b
	BEGIN
	SELECT @temp = @a, @a = @b, @b = @temp
	END

	WHILE @b %@a !=0
	BEGIN
	SELECT @temp = @a, @a = @b%@a, @b = @temp
	END
	PRINT N'uscln: '+cast(@a as varchar)
END
 EXEC sp_uscln 20, 9


 -- BÀI 2
-- Nhập vào @Manv, xuất thông tin các nhân viên theo @Manv.
USE QLDA;
DROP PROC IF EXISTS sp_manv
GO
CREATE PROC sp_manv @Manv nvarchar(9)
AS
	BEGIN 
		SELECT * FROM  NHANVIEN WHERE MANV = @Manv
	end

EXEC sp_manv '009'


-- Nhập vào @MaDa (mã đề án), cho biết số lượng nhân viên tham gia đề án đó
DROP PROC IF EXISTS sp_mada
GO
CREATE PROC sp_mada @MaDa int
AS
	BEGIN  
		SELECT MADA,count(*) as N'Số lượng nhân viên tham gia đề án' from DEAN 
		WHERE MADA = @MaDa
		GROUP BY MADA
	END
EXEC sp_mada 001

-- Nhập vào @MaDa và @Ddiem_DA (địa điểm đề án), cho biết số lượng nhân viên tham 
--gia đề án có mã đề án là @MaDa và địa điểm đề án là @Ddiem_DA
DROP PROC IF EXISTS sp_soluongnv
GO
CREATE PROC sp_soluongnv @MaDa int, @DDIEM_DA nvarchar(15)
AS
	BEGIN 
		SELECT DA.MADA, DA.DDIEM_DA, count(PC.MA_NVIEN) AS N'Số lượng nhân viên' FROM DEAN DA join PHANCONG PC
		ON  DA.MADA = PC.MADAN
		WHERE DA.MADA = @MaDa AND DA.DDIEM_DA = @DDIEM_DA
		GROUP BY DA.MADA, DA.DDIEM_DA
	END
EXEC sp_soluongnv 3,N'TP HCM'

-- Nhập vào @Trphg (mã trưởng phòng), xuất thông tin các nhân viên có trưởng phòng là 
--@Trphg và các nhân viên này không có thân nhân.
 DROP PROC IF EXISTS sp_trp
 GO
CREATE PROC sp_trp @Trphg nvarchar(9)
AS
	BEGIN 
	SELECT * FROM NHANVIEN N , PHONGBAN B WHERE N.PHG= B.MAPHG AND  TRPHG= @Trphg AND  MANV  NOT IN ( SELECT MA_NVIEN FROM THANNHAN INNER JOIN NHANVIEN  ON THANNHAN.MA_NVIEN = NHANVIEN.MANV );
	END
EXEC sp_trp '005'

-- Nhập vào @Manv và @Mapb, kiểm tra nhân viên có mã @Manv có thuộc phòng ban có 
--mã @Mapb hay không
DROP PROC IF EXISTS CHECKNV;
	GO
	CREATE PROCEDURE CHECKNV @MANV  NVARCHAR(9), @MAPB INT
	AS
	BEGIN
		  IF EXISTS( (SELECT * FROM NHANVIEN WHERE MANV = @MANV) ) 
					BEGIN 
							 IF EXISTS(SELECT * FROM PHONGBAN WHERE MAPHG = @MAPB)
									 BEGIN 
						 				IF EXISTS (SELECT @MANV FROM PHONGBAN where MAPHG = @MAPB)
												BEGIN 
														  PRINT N'Mã nhân viên này có tồn tại phòng ban'  +cast(@mapb as varchar)
												 END
										else 
															 begin 
															 PRINT N'Mã nhân viên này không tồn tại ở phòng ban' + cast(@mapb as varchar)
															 end
							 END 
							ELSE
									 BEGIN
													PRINT N'Không tồn tại mapb :  '+ cast(@MAPB AS NVARCHAR)
										END
					END
			ELSE 
					BEGIN
							 PRINT N'Không tồn tại manv : '+ cast(@MANV AS NVARCHAR)
					  end
	 END
	 	EXEC CHECKNV '010', 4 --CHECK KHÔNG TỒN TẠI MANV
		EXEC CHECKNV '001', 7 --CHECK KHÔNG TỒN TẠI MAPB
		EXEC CHECKNV '001', 4 --CHECK CÓ TỒN TẠI MANV



-- BÀI 3
-- Thêm phòng ban có tên CNTT vào csdl QLDA, các giá trị được thêm vào dưới dạng 
--tham số đầu vào, kiếm tra nếu trùng Maphg thì thông báo thêm thất bại.
GO
DROP PROC IF EXISTS usp_themCNTT
GO
CREATE PROC usp_themCNTT @mapb int, @trph varchar(9),@ngaync date
AS
	BEGIN 
		IF(SELECT count(MAPHG) FROM PHONGBAN WHERE MAPHG = @mapb) > 0
			PRINT N'Thêm thất bại vì trùng mã phòng'
		ELSE
			INSERT INTO PHONGBAN (MAPHG,TENPHG,TRPHG,NG_NHANCHUC)
					VALUES(@mapb, 'CNTT',@trph,@ngaync)
	END
EXEC usp_themCNTT 1,'001','2022-05-29' -- thêm thất bại
EXEC usp_themCNTT 113,'001','2022-05-29' -- thêm thành công

-- Cập nhật phòng ban có tên CNTT thành phòng IT.
DROP PROC IF EXISTS usp_capnhatCNTT
GO
CREATE PROC usp_capnhatCNTT
AS
	BEGIN 
		UPDATE PHONGBAN SET TENPHG = 'IT' WHERE TENPHG = 'CNTT'
		PRINT N'Cập nhật thành công'
	END
EXEC usp_capnhatCNTT

-- Thêm một nhân viên vào bảng NhanVien, tất cả giá trị đều truyền dưới dạng tham số đầu 
--vào với điều kiện:
--o nhân viên này trực thuộc phòng IT
--o Nhận @luong làm tham số đầu vào cho cột Luong, nếu @luong<25000 thì nhân viên 
--này do nhân viên có mã 009 quản lý, ngươc lại do nhân viên có mã 005 quản lý
--o Nếu là nhân viên nam thi nhân viên phải nằm trong độ tuổi 18-65, nếu là nhân viên 
--nữ thì độ tuổi phải từ 18-60

DROP PROC IF EXISTS usp_themNV
GO
CREATE PROC usp_themNV @manv nvarchar(9), @honv nvarchar(15), @tenlot nvarchar(15), @tennv nvarchar(15),
	@ngsinh date, @dchi nvarchar(30), @phai nvarchar(3), @luong float
AS
	BEGIN 
		DECLARE @manql nvarchar(9), @phg int, @tuoi int
		SET @manql = iif(@luong < 25000,'009','005')
		SET @phg = (select MAPHG from PHONGBAN where TENPHG = 'IT')
		SET  @tuoi = year(getdate()) - year(@ngsinh)
		IF @tuoi <18	
			PRINT N'Tuổi phải từ 18'
		ELSE IF @phai = 'Nam' and @tuoi > 65
			PRINT N'Tuổi lao động của nam không quá 65'
		ELSE If @phai = 'Nữ' and @tuoi >60
			PRINT N'Tuổi lao động của nữ không quá 60'
		else 
			BEGIN
				INSERT INTO NHANVIEN(MANV,HONV,TENLOT,TENNV,NGSINH,DCHI,PHAI,LUONG, MA_NQL,PHG)
				VALUES (@manv, @honv,@tenlot, @tennv,@ngsinh,@dchi,@phai,@luong,@manql,@phg)
					PRINT N'Thêm nhân viên thành công'
			END	
	END
EXEC usp_themNV N'088',N'Nguyễn',N'Ngọc',N'Huyền','2003-12-28',N'A20-Tô Ký, Trung Mỹ Tây Quận 12',N'Nữ',17000
EXEC usp_themNV  N'089',N'Nguyễn',N'Thị Cẩm',N'Vy','2003-05-01','123 Gò Vấp',N'Nữ',23000


--bai4
--Thêm một phân công công việc mới vào bảng phân công. tất cả giá trị đều truyền dưới dạng tham số đầu vào. Có kiểm tra rỗng và các ràng buộc khóa chính, khóa ngoại.
--	Cập nhật thời gian làm việc của các công việc đã phân công của dự án số 10 thêm 4 giờ ở những dòng dữ liệu chưa quá 30 giờ.
SELECT *  FROM PHANCONG
drop PROC IF EXISTS sp_PHANCONG ;
GO
CREATE PROC sp_PHANCONG @MA_NVIEN NVARCHAR(9), @MADA INT, @STT INT, @THOIGIAN float 
AS
BEGIN 
			IF (@MA_NVIEN = NULL OR @MADA = NULL OR @STT = NULL OR @THOIGIAN = NULL )
			begin
			PRINT N'Không đủ dữ liệu đưa vào';
			end
			ELSE
			IF EXISTS (SELECT MANV FROM NHANVIEN WHERE MANV = @MA_NVIEN)
					BEGIN
							IF EXISTS (SELECT MADA FROM DEAN WHERE MADA = @MADA)
									BEGIN 
												IF EXISTS (SELECT STT FROM PHANCONG WHERE STT = @STT)
														BEGIN 
																INSERT INTO PHANCONG (MA_NVIEN,MADAN,STT,THOIGIAN)
																VALUES (@MA_NVIEN,@MADA,@STT,@THOIGIAN);
														END
												ELSE 
															BEGIN 
																	PRINT N'Không tồn tại STT công việc';
															END
										END
								ELSE 
										BEGIN 
												PRINT N'Không tồn tại mã đề án';
										END
					END
			ELSE 
					BEGIN 
							PRINT N'Không tồn tại mã nhân viên';
					END
END
 EXEC sp_PHANCONG '020',1,1,25 ;--không tồn tại mã nhân viên
  EXEC sp_PHANCONG '005',4,1,25 ;--không tồn tại đề án
    EXEC sp_PHANCONG '005',1,4,25 ;--không tồn tại stt công việc
	  EXEC sp_PHANCONG '007',1,1,25 ;--thêm thành công
	  


GO 
DROP PROC IF EXISTS UP_TG;
GO
CREATE PROC UP_TG @MADA INT 
AS
BEGIN 
	UPDATE PHANCONG 
						SET THOIGIAN =THOIGIAN + 4
				WHERE  MADAN = @MADA and THOIGIAN <= 30 
			PRINT N'Cập nhật thành công' 
		END
SELECT * FROM PHANCONG
EXEC UP_TG 10;
SELECT * FROM PHANCONG