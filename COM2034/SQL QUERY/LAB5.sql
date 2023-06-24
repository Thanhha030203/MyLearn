USE QLDA;
CREATE PROCEDURE XUATTEN  @ten nvarchar(25)
as
BEGIN 
PRINT  N'Xin chào' +cAST(@ten AS NVARCHAR)
END
DROP PROC XUATTEN;

CREATE PROCEDURE  sp_Tong @so1 int, @so2 int 
AS
BEGIN
DECLARE @TONG int ;
set @TONG= @so1 + @so2;
PRINT @TONG
END
declare @sum int 
 EXEC sp_Tong  12 ,14;

 create procedure Lap @n int 
 as
 begin 
 declare @num int =1;
 DECLARE @TONG INT =0;
			while(@num < @n)
					begin 
							IF(@num %2 =0)
									begin 
											SET @TONG = @TONG + @num;
									end
							set @num = @num +1;
					end
					PRINT  @TONG
			end

	exec Lap 10;


	CREATE PROCEDURE XUATMA @MANV NVARCHAR(9)
	AS 
	BEGIN 
	SELECT * FROM NHANVIEN WHERE MANV = @MANV;
	END 

	EXEC XUATMA '005';

	
	CREATE PROCEDURE SOLUONGNHANVIEN  @MADA INT , @DDIEM NVARCHAR(15)
	AS 
	BEGIN 
	SELECT COUNT(MADA) as  N'Số lượng nhân viên tham gia' FROM PHANCONG PC INNER JOIN DEAN D ON PC.MADAN = D.MADA GROUP BY MADA, DDIEM_DA having MADA = @MADA AND D.DDIEM_DA = @DDIEM ;
	END
	EXEC SOLUONGNHANVIEN 2, N'Nha Trang';



	SELECT * FROM NHANVIEN;
	SELECT * FROM PHONGBAN;
	SELECT * FROM DEAN;
	SELECT * FROM PHANCONG;

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

	 --BAI3
	 CREATE PROCEDURE   THEMPHONG @MAPHG INT , @TENPHG NVARCHAR(15) , @TRPHG NVARCHAR(9) , @NG_NHANCHUC DATE
	 as
	 begin 
	 if EXISTS ( SELECT * FROM PHONGBAN WHERE MAPHG = @MAPHG)
	 BEGIN 
	 PRINT N'Đã tồn tại mã phong ' 
	 RETURN
	 end
	 ELSE
	 INSERT INTO PHONGBAN(TENPHG,MAPHG,TRPHG,NG_NHANCHUC)
	 VALUES 
	 (@TENPHG,@MAPHG,@TRPHG,@NG_NHANCHUC) END;
	 DROP PROCEDURE THEMPHONG
	 EXEC THEMPHONG  6, 'CNTT','007','2022-05-31'



	 ---
---
CREATE PROCEDURE CAPNHAT @TENPHG NVARCHAR(9)
AS
BEGIN
        UPDATE PHONGBAN
		SET TENPHG = @TENPHG WHERE TENPHG = 'CNTT';
			
	END
EXEC CAPNHAT 'IT'