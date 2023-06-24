ALTER TABLE PHIEUKHAM
ADD CONSTRAINT FK_PHIEUKHAM		foreign key (mabs) REFERENCES BACSY (mabs) 

--2.1
insert into BACSY (mabs, tenbs,chuyenkhoa) values
('bs06',N'TS. Trần Duy Phong',N'Răng hàm mặt'),
('bs05',N'TS. Lê Anh Tú',N'Vật lí trị liệu')

--2.2
insert into BENHNHA(ho,ten,gioitinh,ngaysinh,diachi) values 
(N'Đỗ',N'Mỹ Linh',0,'2000-12-20',N'Đà Nẵng')

--2.3
UPDATE BENHNHA SET ho = N'Đỗ Mỹ' ,  ten = N'Linh', gioitinh = 'FALSE'
WHERE mabn = 3;
SELECT * FROM BENHNHA


2.4
  drop 
3.1


--4.1
drop function if exists tinhtong_function
go
create function tinhtong_function (@mabs varchar(50) )
returns int
as
begin
declare @tong int ;
set @tong = (Select count(mabs) from PHIEUKHAM where mabs = 'bs01' group by mabs );
return @tong
end

select dbo.tinhtong_function ('bs01') as 'tong benh nhan'

drop view if exists tinhtongchiphi_view
go
create view tinhtongchiphi_view 
AS
select PHIEUKHAM.mabn,ten, sum(chiphi) as N'Tổng' from BENHNHA inner join PHIEUKHAM  on BENHNHA.mabn = PHIEUKHAM.mabn GROUP BY PHIEUKHAM.mabn,	BENHNHA.ten 

select * from tinhtongchiphi_view


