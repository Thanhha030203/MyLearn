USE QLNHATRO_PS20520THANHHA;
DROP PROC IF EXISTS insert_nguoidung;
GO
CREATE PROC insert_nguoidung @MA_NGD NVARCHAR( 20), @MANT NVARCHAR(10), @TENND NVARCHAR(30), @GIOITINH NVARCHAR(10), @DIENTHOAI INT, @DIACHI NVARCHAR(50), @QUAN NVARCHAR(20), @EMAIL NVARCHAR(50)
AS
BEGIN
	IF (@MANT  IS NULL) OR (@MA_NGD IS NULL) OR (@TENND IS NULL) OR (@DIACHI IS NULL)OR (@EMAIL IS NULL)
		BEGIN 
				PRINT N'Vui lòng nhập đủ dữ liệu ';
		END
	ELSE
		BEGIN
		IF @MA_NGD IN (SELECT MA_NGD FROM NGUOIDUNG) 
				BEGIN
						PRINT N'Đã tồn tại mã người dùng';
				END
		ELSE 
			BEGIN
					IF @MANT IN (SELECT MANT FROM NHATRO )
							BEGIN
									INSERT INTO NGUOIDUNG SELECT @MA_NGD, @MANT,@TENND,@GIOITINH,@DIENTHOAI,@DIACHI,@QUAN,@EMAIL;
									PRINT N'Thêm thành công';
							END
					ELSE
							BEGIN
									PRINT N'Không tồn tại mã nhà trọ này';
							END
			END
	END
END
--thêm thất bại vì thiếu mã người dùng
EXEC insert_nguoidung NULL,N'NT0101',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 
--thêm thất bại do đã tồn tại mã người dùng
EXEC insert_nguoidung N'N01LH001',N'NT0101',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 
--thêm thất bại do không tồn tại mã nhà trọ
EXEC insert_nguoidung N'N01LH010',N'NT0201',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 
--thêm thành công
EXEC insert_nguoidung N'N04LH010',N'NT0104',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 



DROP PROC IF EXISTS insert_nhatro;
go
CREATE PROC insert_nhatro @MANT NVARCHAR(10), @TENNT NVARCHAR(30), @MALOAI NVARCHAR(10), @DIENTICH NUMERIC(10,2), @GIANHA MONEY,  @DIACHINHA NVARCHAR(150), @QUAN NVARCHAR(20), @MOTA NVARCHAR(150), @NGAYDANG DATE, @MA_NGLH NVARCHAR( 20)
AS
 BEGIN 
 IF (@MANT  IS NULL) OR (@MALOAI IS NULL) OR (@GIANHA IS NULL) OR (@DIACHINHA IS NULL)OR (@MA_NGLH IS NULL)
	BEGIN 
			PRINT N'Vui lòng nhập đủ dữ liệu ';
	END
	ELSE
	BEGIN
	IF @MANT IN (SELECT MANT FROM NHATRO) 
			BEGIN
					PRINT N'Đã tồn tại mã nhà trọ';
			END
	ELSE 
			BEGIN
					IF @MALOAI IN (SELECT MALOAI FROM LOAINHA )
							BEGIN
										IF @MA_NGLH IN (SELECT MA_NGD FROM NGUOIDUNG )
												BEGIN 
															INSERT INTO NHATRO SELECT @MANT,@TENNT,@MALOAI,@DIENTICH,@GIANHA, @DIACHINHA, @QUAN, @MOTA, @NGAYDANG, @MA_NGLH;
															PRINT N'Thêm thành công';
												END
										ELSE 
												BEGIN
														PRINT N'Không tồn tại mã người liên hệ';
												END
							END
					ELSE
							BEGIN
									PRINT N'Không tồn tại mã loại nhà';
							END
			END
		END
END

--thêm thất bại vì thiếu mã loại nhà
EXEC  insert_nhatro 'NT0101',NULL,NULL, 20.5, 2700000,'A20 Tô Kí, Trung Mỹ Tây',N'Quận 12',N'Phòng sach sẽ, mới, có ban công, wifi free', '2022-06-07','N01LH004';

--thêm thất bại vì mã nhà trọ đã tồn tại
EXEC  insert_nhatro 'NT0101',NULL,'LN003', 20.5, 2700000,'A20 Tô Kí, Trung Mỹ Tây',N'Quận 12',N'Phòng sach sẽ, mới, có ban công, wifi free', '2022-06-07','N01LH004';

--thêm thất bại vì không tồn tại mã loại nhà
EXEC  insert_nhatro 'NT0111',NULL,'LN005', 20.5, 2700000,'A20 Tô Kí, Trung Mỹ Tây',N'Quận 12',N'Phòng sach sẽ, mới, có ban công, wifi free', '2022-06-07','N01LH004';

--thêm thất bại vì không tồn tại mã loại nhà
EXEC  insert_nhatro 'NT0111',NULL,'LN003', 20.5, 2700000,'A20 Tô Kí, Trung Mỹ Tây',N'Quận 12',N'Phòng sach sẽ, mới, có ban công, wifi free', '2022-06-07','N01LH020';

--thêm thành công
EXEC  insert_nhatro 'NT0111',NULL,'LN003', 20.5, 2700000,'A20 Tô Kí, Trung Mỹ Tây',N'Quận 12',N'Phòng sach sẽ, mới, có ban công, wifi free', '2022-06-07','N01LH004';
select * from LOAINHA
select * from NGUOIDUNG
select * from NHATRO
select * from DANHGIA

DROP PROC IF EXISTS insert_danhgia;
go
CREATE PROC insert_danhgia @STT INT ,@MA_NGD NVARCHAR( 20), @MANTR NVARCHAR(10), @TRANGTHAI NVARCHAR(10), @ND NVARCHAR(200)
AS
 BEGIN
	IF (@STT IS NULL) OR (@MA_NGD IS NULL) OR (@MANTR IS NULL) OR (@TRANGTHAI IS NULL)
	BEGIN 
			PRINT N'Vui lòng nhập đủ dữ liệu (nội dung có thể có hoặc không) ';
	END
	ELSE
		BEGIN
			IF @STT IN (SELECT STT FROM DANHGIA) 
				BEGIN
						PRINT N'Đã tồn tại người đánh giá tại vị trí này';
				END
			ELSE 
				BEGIN
						IF @MA_NGD IN (SELECT MA_NGD FROM NGUOIDUNG )
								BEGIN
											IF @MANTR IN (SELECT MANT FROM NHATRO )
													BEGIN 
																INSERT INTO DANHGIA SELECT @STT ,@MA_NGD , @MANTR , @TRANGTHAI , @ND 
																PRINT N'Thêm thành công';
													END
											ELSE 
													BEGIN
															PRINT N'Không tồn tại mã nhà trọ';
													END
								END
						ELSE
								BEGIN
										PRINT N'Không tồn tại mã người dùng';
								END
				END
		END
END


    --thêm thất bại vì thiếu mã người dùng và mã nhà trọ
 EXEC insert_danhgia 12,NULL,NULL,'LIKE',NULL;
 --thêm thất bại vì đã tồn tại stt
 EXEC insert_danhgia 10,'N01LH008','NT0102','LIKE',NULL

  --thêm thất bại vì không tồn tại mã người dùng
 EXEC insert_danhgia 11,'N01LH011','NT0102','LIKE',NULL

   --thêm thất bại vì không tồn tại mã nhà trọ
 EXEC insert_danhgia 11,'N01LH018','NT0112','LIKE',NULL

    --thêm thất bại vì không tồn tại mã nhà trọ
 EXEC insert_danhgia 11,'N01LH018','NT0105','LIKE',NULL