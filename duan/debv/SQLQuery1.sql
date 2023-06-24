CREATE DATABASE DuAnMau
go
use DuAnMau
go
CREATE TABLE sanpham (
masp varchar(4) Primary key,
tensp nvarchar(50) not null,
dongia float not null,
loaisp nvarchar(20) not null
)
 insert into sanpham values 
 ('sp01',N'Banh Kinh Do',2000,N'Bánh Kẹo'),
  ('sp02',N'Banh Dừa',1200,N'Bánh Kẹo'),
   ('sp03',N'Bia Tiger',14000,N'Rượu Bia'),
    ('sp04',N'Bia Sài gòn',18000,N'Rượu Bia'),
	 ('sp05',N'Rượu Bàu đá',700,N'Rượu Bia')
	 go
	 select * from sanpham
	 drop proc SL
	 go
	  create proc SL
	  as
	  begin
	   select loaisp,count(loaisp) as sl from sanpham group by loaisp
	  end

	  EXEC SL

	