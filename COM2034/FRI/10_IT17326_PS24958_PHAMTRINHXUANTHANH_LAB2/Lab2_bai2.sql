
-- Dựa trên csdl QLDA thực hiện truy vấn, các giá trị truyền vào và trả ra phải 
--dưới dạng sử dụng biến

--1. Cho biêt nhân viên có lương cao nhất

Declare @Max_Luong int 
set @Max_Luong = (select MAX(LUONG) from NHANVIEN)
select @Max_Luong as 'Luong nhieu nhat'

select MAX(LUONG) from NHANVIEN

--2. Cho biết họ tên nhân viên (HONV, TENLOT, TENNV) có mức lương 
--trên mức lương trung bình của phòng "Nghiên cứu”

Declare @LuongTB int
set @LuongTB = (
select AVG (Luong) from NHANVIEN
inner join  PHONGBAN 
on NHANVIEN.PHG = PHONGBAN.MAPHG
where PHONGBAN.TENPHG = N'Nghiên cứu')

select * from NHANVIEN where LUONG > @LuongTB

--3. Với các phòng ban có mức lương trung bình trên 30,000, liệt kê tên
--phòng ban và số lượng nhân viên của phòng ban đó.

Declare @tbCau3 table(TenPB nvarchar(20), soluong int, luongtb int)
insert into @tbCau3
select TENPHG, COUNT(Manv) as 'So luong', AVG(Luong) as 'LuongTB'
from NHANVIEN inner join PHONGBAN
on NHANVIEN.PHG = PHONGBAN.MAPHG
GROUP BY TENPHG
Having AVG(LUONG) > 31000

select * from @tbCau3
--4. Với mỗi phòng ban, cho biết tên phòng ban và số lượng đề án mà
--phòng ban đó chủ trì

Declare @tbCau4 table(TenPB nvarchar(20), soluong int)
insert into @tbCau4
select TENPHG, COUNT(MaDA) from DEAN
inner join PHONGBAN on PHONGBAN.MAPHG = DEAN.PHONG
group by phong, TENPHG
select * from @tbCau4