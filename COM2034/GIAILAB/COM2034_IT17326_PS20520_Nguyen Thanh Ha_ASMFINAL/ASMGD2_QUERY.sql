USE QLNHATRO_PS20520THANHHA
GO

--Y3: CÁC YÊU CẦU VỀ CHỨC NĂNG
-- 1.
--Tạo ba Stored Procedure (SP) với các tham số đầu vào phù hợp. 
--o SP thứ nhất thực hiện chèn dữ liệu vào bảng NGUOIDUNG
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
EXEC insert_nguoidung N'N01LH004',N'NT0101',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 
--thêm thất bại do không tồn tại mã nhà trọ
EXEC insert_nguoidung N'N01LH010',N'NT0201',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 
--thêm thành công
EXEC insert_nguoidung N'N04LH010',N'NT0104',N'Thanh Hà',N'Nữ',0359456876,N'Bà Hom, Phường 13',N'Quận 6',N'ha@gmail.com' 
select * from nguoidung

--o SP thứ hai thực hiện chèn dữ liệu vào bảng NHATRO 
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


--o SP thứ ba thực hiện chèn dữ liệu vào bảng DANHGIA 
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

 --2.
 --a. Viết một SP với các tham số đầu vào phù hợp. SP thực hiện tìm kiếm thông tin các phòng trọ thỏa mãn điều kiện tìm kiếm theo: Quận, phạm vi diện tích, phạm vi ngày đăng tin, khoảng giá tiền, loại hình nhà trọ. 
 DROP PROC IF EXISTS search_nhatro;
GO
CREATE PROC search_nhatro @QUAN NVARCHAR(20), @DIENTICHMIN NUMERIC, @DIENTICHMAX NUMERIC,@NGAYDANGTU DATE,@NGAYDANGDEN DATE,@GIANHATU MONEY, @GIANHADEN MONEY,@LOAINHA NVARCHAR(50)
AS
	BEGIN
			SELECT  N'Cho thuê phòng tại : ' + DIACHINHA +' '+ N.QUAN as N'Địa chỉ trọ' ,CAST(DIENTICH AS VARCHAR) +' m2' as N'Diện tích', FORMAT(GIANHA,'N','vi-VN')as N'Giá nhà' ,MOTA,CONVERT(VARCHAR,NGAYDANG,105) as N'Ngày đăng' ,( SELECT IIF(GIOITINH LIKE '%Nam%' , 'A.', 'C.')+TENND) as N'Tên người liên hệ' ,DIENTHOAI ,DIACHI FROM NHATRO N INNER JOIN NGUOIDUNG D ON N.MA_NGLH = D.MA_NGD AND  DIENTICH BETWEEN @DIENTICHMIN AND @DIENTICHMAX AND NGAYDANG BETWEEN @NGAYDANGTU AND @NGAYDANGDEN AND GIANHA BETWEEN @GIANHATU AND @GIANHADEN AND N.QUAN LIKE @QUAN INNER JOIN LOAINHA L ON L.MALOAI = N.MALOAI AND L.TENLOAI LIKE @LOAINHA ;
	END

EXEC search_nhatro N'Quận 6', 20, 30, '2022-01-01','2022-07-01',2000000,3500000,N'Phòng trọ khép kín'
EXEC search_nhatro N'Quận 10', 20, 30, '2022-01-01','2022-07-01',2000000,3500000,N'Phòng trọ khép kín'


--b. Viết một hàm có các tham số đầu vào tương ứng với tất cả các cột của bảng NGUOIDUNG. Hàm này trả về mã người dùng (giá trị của cột khóa chính của bảng NGUOIDUNG) thỏa mãn các giá trị được truyền vào tham số. 
DROP FUNCTION IF EXISTS search_nguoidung_function
go
CREATE FUNCTION  search_nguoidung_function 
(@MA_NGD NVARCHAR( 20), @MANT NVARCHAR(10), @TENND NVARCHAR(30), @GIOITINH NVARCHAR(10), @DIENTHOAI INT, @DIACHI NVARCHAR(50), @QUAN NVARCHAR(20), @EMAIL NVARCHAR(50))
RETURNS NVARCHAR(20)
AS
BEGIN
declare @ma nvarchar(20);
		IF (@MA_NGD in (SELECT MA_NGD FROM NGUOIDUNG)) AND (@MANT in (SELECT MANT FROM NGUOIDUNG)) AND (@TENND in (SELECT TENND FROM NGUOIDUNG)) AND (@GIOITINH in (SELECT GIOITINH FROM NGUOIDUNG)) AND (@DIENTHOAI in (SELECT DIENTHOAI FROM NGUOIDUNG))AND (@DIACHI in (SELECT DIACHI FROM NGUOIDUNG)) AND
		(@QUAN in (SELECT QUAN FROM NGUOIDUNG)) AND (@EMAIL in (SELECT EMAIL FROM NGUOIDUNG)) 
		BEGIN
		set @ma = @MA_NGD
			
		END
		RETURN @ma
END

select dbo.search_nguoidung_function( 'N01LH004',N'NT0101',N'Minh Thi',N'Nữ',979330927,N'Đường số 54A, phường Tân Tạo',N'Quận Bình Tân',N'thi123@gmail.com' )


--c. Viết hàm có tham số đầu vào là mã nhà trọ (cột khóa chính của bảng NHATRO). Hàm này trả về tổng số LIKE và DISLIKE của nhà trọ này.
DROP FUNCTION IF EXISTS danhgia_nhatro_function
GO
CREATE FUNCTION danhgia_nhatro_function (@SL NVARCHAR(10))
RETURNS @TONG TABLE(LIKES INT, DISLIKE INT ) 
AS
BEGIN
	INSERT INTO @TONG VALUES   ((SELECT COUNT(TRANGTHAI) FROM DANHGIA WHERE MANTR = @SL GROUP BY MANTR, TRANGTHAI HAVING TRANGTHAI = 'LIKE') ,(SELECT COUNT(TRANGTHAI) FROM DANHGIA WHERE MANTR = @SL GROUP BY MANTR, TRANGTHAI HAVING TRANGTHAI = 'DISLIKE'));
		RETURN ;
END
select * FROM   dbo.danhgia_nhatro_function('NT0103') 

--d. Tạo một View lưu thông tin của TOP 10 nhà trọ có số người dùng LIKE nhiều nhất
DROP VIEW IF EXISTS view_top10_thongtin ;
go
CREATE VIEW view_top10_thongtin 
AS
SELECT top 10  DIENTICH, GIANHA, MOTA, NGAYDANG,TENND, DIACHI, DIENTHOAI, EMAIL FROM NHATRO  N INNER JOIN NGUOIDUNG D ON N.MA_NGLH = D.MA_NGD inner join 
(SELECT N.MANT , COUNT(TRANGTHAI) SL FROM NHATRO  N inner join DANHGIA G ON N.MANT = G.MANTR GROUP
BY N.MANT,TRANGTHAI HAVING TRANGTHAI ='LIKE') A ON N.MANT = A.MANT ORDER BY SL DESC;
select *from view_top10_thongtin;

--e. Viết một Stored Procedure nhận tham số đầu vào là mã nhà trọ (cột khóa chính của bảng NHATRO). SP này trả về tập kết quả gồm các thông tin sau: 
--- Mã nhà trọ 
--- Tên người đánh giá 
--- Trạng thái LIKE hay DISLIKE 
--- Nội dung đánh giá
DROP PROC IF EXISTS search_nhatro_proc 
go
CREATE PROC search_nhatro_proc @MANT NVARCHAR(10)
AS
BEGIN
		IF @MANT IN (SELECT MANT FROM NHATRO)
				BEGIN
						SELECT G.MANTR , TENND, TRANGTHAI, ND FROM NGUOIDUNG D INNER JOIN DANHGIA  G ON  D.MA_NGD = g.MA_NGD WHERE G.MANTR = @MANT;
				END
		ELSE
		PRINT N'Không tồn tại mã nhà trọ'
END
EXEC search_nhatro_proc 'NT0102'

--3.
--1. Viết một SP nhận một tham số đầu vào kiểu int là số lượng DISLIKE. SP này thực hiện thao tác xóa thông tin của các nhà trọ và thông tin đánh giá của chúng, nếu tổng số lượng DISLIKE tương ứng với nhà trọ này lớn hơn giá trị tham số được truyền vào. 
--Yêu cầu: Sử dụng giao dịch trong thân SP, để đảm bảo tính toàn vẹn dữ liệu khi một thao tác 
--xóa thực hiện không thành công. 

DROP PROC IF EXISTS DELETE_NHATRO_PROC_DISLIKE
GO
CREATE PROC DELETE_NHATRO_PROC_DISLIKE @SLDISLIKE INT
AS
	BEGIN TRY
			DECLARE @VIEW_LIKE_DISLIKE TABLE (MANT NVARCHAR(10));
			INSERT INTO @VIEW_LIKE_DISLIKE SELECT N.MANT   FROM NHATRO N INNER JOIN (SELECT MANT , COUNT(TRANGTHAI) AS SL FROM NHATRO N INNER JOIN DANHGIA G ON N.MANT = G.MANTR GROUP BY MANT, TRANGTHAI HAVING  TRANGTHAI = 'DISLIKE') A ON N.MANT =A.MANT AND SL >= @SLDISLIKE
			BEGIN TRAN 
			DELETE FROM DANHGIA WHERE MANTR in(select MANT from @VIEW_LIKE_DISLIKE)
			UPDATE  NGUOIDUNG SET MANT = 'NT0101' WHERE MANT in(select MANT from @VIEW_LIKE_DISLIKE)		
			delete from NHATRO where MANT in(select MANT from @VIEW_LIKE_DISLIKE)
			PRINT 'Xoá thành công'
			commit tran 
	END TRY
	BEGIN CATCH
			ROLLBACK TRAN
			PRINT N'THẤT bại'
	END CATCH

exec DELETE_NHATRO_PROC_DISLIKE 2

--2. Viết một SP nhận hai tham số đầu vào là khoảng thời gian đăng tin. SP này thực hiện thao tác xóa thông tin những nhà trọ được đăng trong khoảng thời gian được truyền vào qua các tham số. 
--Lưu ý: SP cũng phải thực hiện xóa thông tin đánh giá của các nhà trọ này. 
--Yêu cầu: Sử dụng giao dịch trong thân SP, để đảm bảo tính toàn vẹn dữ liệu khi một thao tác
	DROP PROC IF EXISTS DELETE_NHATRO_PROC_DATE ;
		GO
		CREATE PROC DELETE_NHATRO_PROC_DATE @NGAYDANGTU DATE , @NGAYDANGDEN DATE 
AS
BEGIN TRY
		DECLARE @VIEW_DELETE_DATE TABLE (MANT NVARCHAR(10));
		INSERT INTO @VIEW_DELETE_DATE SELECT MANT FROM NHATRO WHERE NGAYDANG BETWEEN @NGAYDANGTU AND @NGAYDANGDEN
		BEGIN TRAN 
		DELETE FROM DANHGIA WHERE MANTR in(select MANT from @VIEW_DELETE_DATE)
		UPDATE  NGUOIDUNG SET MANT = 'NT0101' WHERE MANT in(select MANT from @VIEW_DELETE_DATE)		
		delete from NHATRO where MANT in(select MANT from @VIEW_DELETE_DATE)
		PRINT N'Xoá thành công'
		commit tran 
	END TRY
		BEGIN CATCH
	ROLLBACK TRAN
	 PRINT N'Xoá thất bại'
	END CATCH
	
EXEC DELETE_NHATRO_PROC_DATE  '2022-05-05','2022-06-22'

--4.
--1. Tạo Trigger ràng buộc khi thêm, sửa thông tin nhà trọ phải thỏa mãn các điều kiện sau: 
--• Diện tích phòng >=8 (m2) 
--• Giá phòng >=0 
---create
DROP TRIGGER IF EXISTS insert_nhatro_trigger;
GO
CREATE TRIGGER insert_nhatro_trigger ON NHATRO FOR INSERT
AS
BEGIN
		IF(SELECT DIENTICH FROM inserted ) <8 
			BEGIN
					PRINT N'Diện tích từ 8m2';
					ROLLBACK 
			END
			ELSE
			PRINT N'Thêm thành công'
END
INSERT INTO NHATRO SELECT 'NT0112',NULL,'LN003',4,2000000,N'355 Tô Kí',N'Quận 12',N'Sạch đẹp','2022-08-06','N10LJ005'


--update 
DROP TRIGGER IF EXISTS update_nhatro_trigger;
GO
CREATE TRIGGER update_nhatro_trigger ON NHATRO FOR UPDATE	
AS
BEGIN
		IF(SELECT DIENTICH FROM inserted ) <8 or (select GIANHA FROM inserted) <0
			BEGIN
					PRINT N'Diện tích từ 8m2 vag giá nhà phải lớn hơn 0';
					ROLLBACK 
			END
			ELSE
			PRINT N'Update thành công'
END

UPDATE NHATRO SET GIANHA = -1 WHERE MANT = 'NT0102'


--2. Tạo Trigger để khi xóa thông tin người dùng 
--• Nếu có các đánh giá của người dùng đó thì xóa cả đánh giá 
--• Nếu có thông tin liên hệ của người dùng đó trong nhà trọ thì sửa thông tin liên hệ 

DROP TRIGGER IF EXISTS delete_nguoidung_trigger;
go
CREATE TRIGGER  delete_nguoidung_trigger ON NGUOIDUNG  INSTEAD OF DELETE
	AS 
	BEGIN
				DELETE FROM DANHGIA WHERE MA_NGD IN ( SELECT MA_NGD FROM deleted);
				UPDATE NHATRO SET MA_NGLH = 'N04LH001' WHERE MA_NGLH IN ( SELECT MA_NGD FROM deleted);
				DELETE FROM NGUOIDUNG WHERE MA_NGD IN ( SELECT MA_NGD FROM deleted);
				PRINT N'Xoá thành công'
	END
	DELETE FROM NGUOIDUNG WHERE MA_NGD = 'N09LH001'
	
	