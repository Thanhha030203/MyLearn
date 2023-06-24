
select *
from NhanVien, PhongBan
where NhanVien.MaPB = PhongBan.MaPB;
--------------------
Select NhanVien.MaNV, NhanVien.TenNV, NhanVien.MaPB , PhongBan.TenPB
from NhanVien, PhongBan
where NhanVien.MaPB = PhongBan.MaPB;
--------------
Select MaNV, TenNV, PB.MaPB, TenPB
from NhanVien NV, PhongBan PB
where NV.MaPB = PB.MaPB;
-------------
Select MaNV, TenNV, NV.MaPB, TenPB
from NhanVien as NV, PhongBan as PB
where NV.MaPB = PB.MaPB;
----------------------------
select * from DuAn, NhanVien, QuanLyDuAn
where DuAn.MaDA = QuanLyDuAn.MaDA and
	  NhanVien.MaNV = QuanLyDuAn.MaNV;

select TenDA, HoNV,TenNV, NgayThamGia, NgayKetThuc
from DuAn, NhanVien, QuanLyDuAn
where DuAn.MaDA = QuanLyDuAn.MaDA and
	  NhanVien.MaNV = QuanLyDuAn.MaNV;
	  
-----------------
select MaNV, HoNV, TenNV, TenPB 
from PhongBan PB inner join NhanVien NV on PB.MaPB = NV.MaPB;

select MaNV, HoNV, TenNV, TenPB 
from NhanVien as NV, PhongBan as PB
where NV.MaPB = PB.MaPB;
-----------
select TenDA, HoNV,TenNV, NgayThamGia, NgayKetThuc
from NhanVien NV inner join QuanLyDuAn QLDA on NV.MaNV = QLDA.MaNV
     inner join DuAn DA on DA.MaDA = QLDA.MaDA;
-------------------------------------
-- Sử dụng JOIN hoặc phép tích để hiển thị thông tin của 3 bảng gồm: 
-- họ và tên nhân viên, lương, tên phòng ban mà nhân viên thuộc về, 
-- tên dự án, ngày bắt đầu tham gia vào sự án và số giờ đã là
select  NhanVien.MaNV, HoNV,TenNV,Luong,TenPB, TenDA, NgayThamGia, SoGio
from DuAn, NhanVien, QuanLyDuAn, PhongBan
where DuAn.MaDA = QuanLyDuAn.MaDA and
	  NhanVien.MaNV = QuanLyDuAn.MaNV and
	  NhanVien.MaPB = PhongBan.MaPB;
------------------------------------------------
-- Viết câu truy vấn hiển thị các thông tin bao gồm họ, tên, lương của nhân viên, 
-- tên dự án với điều kiện nhân viên thuộc phòng ban có tên ‘Thiết kế’, 
-- tham gia vào các dự án có ngày  bắt đầu ‘1/1/2016
select  HoNV,TenNV,Luong, TenDA
from DuAn, NhanVien, QuanLyDuAn, PhongBan
where DuAn.MaDA = QuanLyDuAn.MaDA and
	  NhanVien.MaNV = QuanLyDuAn.MaNV and
	  NhanVien.MaPB = PhongBan.MaPB and
	  TenPB like '%Thiet ke%' and NgayBD = '2019-01-01';
      
------------------------
select MaNV, HoNV, TenNV, TenPB 
from PhongBan PB LEFT OUTER JOIN NhanVien NV ON PB.MaPB = NV.MaPB;
---------------------------------------------
select MaNV, HoNV, TenNV, TenPB 
from PhongBan PB RIGHT OUTER JOIN NhanVien NV ON PB.MaPB = NV.MaPB;
-------------------------------------------
select MaNV, HoNV, TenNV, TenPB 
from PhongBan PB FULL OUTER JOIN NhanVien NV ON PB.MaPB = NV.MaPB;

select MaNV, HoNV, TenNV, TenPB 
from PhongBan PB INNER JOIN NhanVien NV ON PB.MaPB = NV.MaPB
------------------------------------------
-- Viết câu truy vấn hiển thị các thông tin bao gồm họ, tên của nhân viên, 
-- và tên phòng ban mà nhân viên trực thuộc. Nếu nhân viên chưa được phân bổ 
-- vào phòng nào thì cột tên phòng để trống
select HoNV, TenNV, TenPB 
from NhanVien NV LEFT OUTER JOIN  PhongBan PB ON  NV.MaPB = PB.MaPB
------------------------------------------------
select * from NhanVien
where Luong > (Select AVG(Luong) from NhanVien)
----------
select * from NhanVien
where MaPB  in (select MaPB from PhongBan where TenPB like '%san xuat%')
-------------
select * from NhanVien
where Luong > ANY (Select Luong from NhanVien where MaPB like 'TK')
---------

select * from NhanVien
select * from PhongBan

select * from NhanVien
where EXISTS ( select * from PhongBan where
               NhanVien.MaPB = PhongBan.MaPB)
               
Select *
from NhanVien NV, PhongBan PB
where NV.MaPB = PB.MaPB

-------------------------
-- Viết câu truy vấn để hiển thị tổng số giờ đã làm trong các dự án của mỗi Nhân viên
select NV.MaNV, TenNV, SUM(SoGio) as 'Tong So gio'
from NhanVien NV, QuanLyDuAn QLDN 
where NV.MaNV = QLDN.MaNV
group by NV.MaNV, TenNV

select *
from QuanLyDuAn