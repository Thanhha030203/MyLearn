

-- Chương trình tính diện tích, chu vi hình chữ nhật khi biết chiều dài và chiều 
--rộng.
--P = 2 * (a + b)
--S = a * b

declare @a int, @b int, @P int, @S int
set @a = 20
set @b = 5
set @P = 2 * (@a + @b)
set @S = @a * @b

select @P as 'Chu vi', @S as 'Dien tich'