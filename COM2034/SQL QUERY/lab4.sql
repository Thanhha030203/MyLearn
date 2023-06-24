use QLDA;


--bai1lab4
--“TangLuong” nếu lương hiện tại của nhân viên nhở hơn trung bình lương trong phòng mà nhân viên đó đang làm việc.
--KhongTangLuong “ nếu lương hiện tại của nhân viên lớn hơn trung bình lương trong phòng mà nhân viên đó đang làm việc.
BEGIN
	DECLARE  @BANG TABLE (PHG INT , LUONGTB FLOAT ) ;
		INSERT INTO @BANG SELECT PHG, AVG(LUONG) FROM NHANVIEN GROUP BY PHG;
		SELECT TENNV, LUONG , 'TANG/KHONG TANG' = IIF (B.LUONG > A.LUONGTB  , 'KHÔNG TANG LƯƠNG' ,' TANG LUONG') 
		FROM NHANVIEN B INNER JOIN @BANG A ON B.PHG = A.PHG;
		END;

--Nếu lương nhân viên nhỏ hơn trung bình lương mà nhân viên đó đang làm việc thì xếp loại “nhanvien”, ngược lại xếp loại “truongphong
		BEGIN
			DECLARE  @BANG1 TABLE (PHG INT , LUONGTB FLOAT ) ;
			INSERT INTO @BANG1 SELECT PHG, AVG(LUONG) FROM NHANVIEN GROUP BY PHG;
			SELECT TENNV, LUONG , 'CHUC VU' = IIF (B.LUONG > A.LUONGTB  , 'Truong phong' ,'Nhan vien') 
			FROM NHANVIEN B INNER JOIN @BANG1 A ON B.PHG = A.PHG;
		END;
		--CÁCH 1
		SELECT IIF( PHAI LIKE '%Nam%' , 'Mr.', 'Ms.')+TENNV , PHAI FROM NHANVIEN;
		--CÁCH 2
		SELECT TENNV = CASE PHAI
		WHEN N'Nam' THEN 'Mr.'+TENNV
		WHEN N'Nữ' THEN 'Ms.'+TENNV
		END,PHAI FROM NHANVIEN;


--		Viết chương trình tính thuế mà nhân viên phải đóng theo công thức:
--o 0<luong<25000 thì đóng 10% tiền lương
--o 25000<luong<30000 thì đóng 12% tiền lương
--o 30000<luong<40000 thì đóng 15% tiền lương
--o 40000<luong<50000 thì đóng 20% tiền lương
--o Luong>50000 đóng 25% tiền lương
		SELECT TENNV , LUONG , THUE = CASE
		WHEN LUONG BETWEEN 0 AND 25000 THEN LUONG*0.1
		WHEN LUONG BETWEEN 25000 AND 30000 THEN LUONG*0.12
		WHEN LUONG BETWEEN 30000 AND 40000 THEN LUONG*0.15 
		WHEN LUONG BETWEEN 40000 AND 50000 THEN LUONG*0.2
		ELSE LUONG*0.25 END FROM NHANVIEN;



--bai2lab4
--- Cho biết thông tin nhân viên (HONV, TENLOT, TENNV) có MaNV là số chẵn.
		DECLARE @num1 INT ;
		SET @num1 = 1;
		 WHILE(SELECT MAX(MANV)  FROM NHANVIEN ) >@num1
					 begin
							  IF @num1%2=0
							  begin
							  SELECT TENNV, MANV FROM NHANVIEN WHERE CAST(MANV AS INT ) = @num1
							  end
							  SET @num1 = @num1 + 1;
					  end;

---Cho biết thông tin nhân viên (HONV, TENLOT, TENNV) có MaNV là số chẵn nhưng không tính nhân viên có MaNV là 4.
		DECLARE @num INT ;
		SET @num = 1;
		WHILE(SELECT MAX(MANV)  FROM NHANVIEN ) >@num
				BEGIN
						  IF @num%2=0
									  BEGIN
												 IF @num = 004
															BEGIN
																		SET @num = @num + 1;
																		CONTINUE	 
															 END
												SELECT TENNV, MANV FROM NHANVIEN WHERE CAST(MANV AS INT ) = @num
									END
								 SET @num = @num + 1;
				  END;


--bai3lab4
--Thực hiện chèn thêm một dòng dữ liệu vào bảng PhongBan theo 2 bước 
--o Nhận thông báo “ thêm dư lieu thành cong” từ khối Try
--o Chèn sai kiểu dữ liệu cột MaPHG để nhận thông báo lỗi “Them dư lieu that bai” 
--từ khối Catch

--chèn dũe liệu thành công
	 BEGIN
			BEGIN TRY
					INSERT INTO PHONGBAN (TENPHG,MAPHG,TRPHG,NG_NHANCHUC) VALUES
					(N'Thiết kế',10,N'004','1970-07-13');
					PRINT 'chen du lieu thanh cong';
			END TRY
			BEGIN CATCH 
					print 'Chen du lieu that bai';
			END CATCH
	 END;

	 --chèn dữ liệu thất bại
	BEGIN TRY
		INSERT INTO PHONGBAN (TENPHG,MAPHG,TRPHG,NG_NHANCHUC) VALUES
		(N'Hành chính',10,007,'1970-07-13');
		print 'chen du lieu thanh cong';
	END TRY
	BEGIN CATCH
			PRINT 'Chen du lieu that bai';
	END CATCH

--➢ Viết chương trình khai báo biến @chia, thực hiện phép chia @chia cho số 0 và dùng RAISERROR để thông báo lỗi.	
	---sử dụng raiserror
	BEGIN TRY 
				DECLARE @chia int = 10;
				SET @chia = @chia/0;
	END TRY
BEGIN CATCH
				 DECLARE @ErrorMessage NVARCHAR(4000);
				DECLARE @ErrorSeverity INT;
				DECLARE @ErrorState INT;

    
				SET   @ErrorMessage = ERROR_MESSAGE()
			   SET    @ErrorSeverity = ERROR_SEVERITY()
				 SET   @ErrorState = ERROR_STATE();
				RAISERROR (@ErrorMessage, -- Message text.
						   @ErrorSeverity, -- Severity.
						   @ErrorState -- State.
						   );
	END CATCH



--bai4lab4	

--Yêu cầu sử dụng giao dịch kết hợp với try catch để chặn lỗi thực hiện 2 yêu cầu sau:
--	Viết chương trình thêm một nhân viên mới. Nếu thêm nhân viên thành công thì thêm 1 thân nhân cho nhân viên vừa tạo.
----Ở đây chèn thành công nhân viên và thân nhan vào bảng
	DECLARE @manv varchar(9) = '011';
	BEGIN TRANSACTION  giaodich 
			BEGIN TRY
								INSERT INTO NHANVIEN(HONV,TENLOT,TENNV,MANV,NGSINH,DCHI,PHAI,LUONG,MA_NQL,PHG)
								VALUES (N'Phan',N'Hoàng',N'Lâm',@manv,'1974-01-01' , N'123 Nguyễn Trãi, TPHCM',N'Nam',35000 ,N'001',5)
								SAVE TRANSACTION a
							BEGIN TRY
										   INSERT INTO THANNHAN(MA_NVIEN,TENTN,PHAI,NGSINH,QUANHE)
										   VALUES (@manv,N'Hải','Nam','1073-06-14','Anh em');
										  PRINT 'chen thanh cong';
							END TRY
							BEGIN CATCH 
							PRINT 'loi chen than nhan'
							ROLLBACK TRANSACTION giaodich
							END CATCH
							
			END TRY
			BEGIN CATCH
					print ' loi chen nhan vien'
			END CATCH
			SELECT * FROM NHANVIEN 
WHERE MANV = @MANV
SELECT * FROM THANNHAN
		
		
		--Ở đây chèn thất bại nhân viên và thân nhân vào bảng;
	DECLARE @manv1 varchar(9) = '012';
	BEGIN TRANSACTION  giaodich 
			BEGIN TRY
								INSERT INTO NHANVIEN(HONV,TENLOT,TENNV,MANV,NGSINH,DCHI,PHAI,LUONG,MA_NQL,PHG)
								VALUES (N'Phan',N'Hoàng',N'Lâm',@manv1,'1974-01-01' , N'123 Nguyễn Trãi, TPHCM',N'Nam',35000 ,N'001',5)
								SAVE TRANSACTION a
							BEGIN TRY
										   INSERT INTO THANNHAN(MA_NVIEN,TENTN,PHAI,NGSINH,QUANHE)
										   VALUES ('013',N'Hải','Nam','1073-06-14','Anh em');
										 PRINT 'chen thanh cong';
										  
							END TRY
							BEGIN CATCH 
							PRINT 'loi chen than nhan'
							ROLLBACK TRANSACTION giaodich
							END CATCH			
			END TRY
			BEGIN CATCH
					print ' loi chen nhan vien'
			END CATCH	
			SELECT * FROM NHANVIEN 
WHERE MANV = @MANV1
SELECT * FROM THANNHAN


begin transaction
commit transaction


--IF (@BIEN = 0)
--begin
-- BEGIN TRY
--   INSERT INTO THANNHAN(MA_NVIEN,TENTN,PHAI,NGSINH,QUANHE)
--   VALUES ('013','Hải','Nam','1073-06-14','Anh em');
--   print ' than nhan thanh cong';
--   END TRY
--   BEGIN CATCH 
--   print'loi chen than nhan'
--	ROLLBACK transaction b
--	end catch
--	end;
--	else
--	begin
--	print 'loi chen nhanvien'
--	end;
--	commit transaction giaodich


--lm thêm tại lớp....
	--declare @bang2 TABLE (SL INT, phg int) ;
	----INSERT INTO @BANG2 SELECT COUNT(N.MANV), phg FROM NHANVIEN N INNER JOIN PHONGBAN B ON N.PHG = B.MAPHG GROUP BY PHG;
	----select maphg tenphg ,slnv = case
	----when sl < 3 then N'Thiếu nhân viên'
	----when sl < 5  then N'Đủ nhân viên'
	----else N'Đông nhân viên'
	----end
	----from @bang2 a INNER JOIN PHONGBAN B ON a.PHG = B.MAPHG GROUP BY tenphg,sl;