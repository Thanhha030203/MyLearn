CREATE DATABASE J5Shop
go
use J5Shop
go
create table Categories (
id nvarchar(4) primary key,
name nvarchar(50) not null
)
create table Orders (
id bigint identity primary key,
Username nvarchar(50) ,
CreateDate datetime,
address nvarchar(100) not null,
)
create table Accounts (
username nvarchar(50) primary key,
password nvarchar(50) not null,
fullname nvarchar(50) ,
email nvarchar(50) ,
photo nvarchar(50) ,
activated  bit,
admin bit
)

create table Products (
id int identity primary key,
name nvarchar(50) ,
image nvarchar(50),
price float,
CreateDate date,
available bit,
CategoryId char(4)
)
create table OrderDetail (
id bigint identity primary key,
OrderId bigint,
ProductId int,
price float,
quantity int
)

Alter table Products
add constraint FK_Product_Orders foreign key(CategotyId) references Categories(id)

Alter table OrderDetails
add constraint FK_ORDERDETAIL_ORDERS foreign key(OrderId) references Orders(id),
constraint FK_ORDERDETAIL_PRODUCT foreign key (ProductId) references Product(id)

Alter table Orders
add constraint FK_Product_Orders foreign key(id) references Account(username)

insert into Categories values
('C001',N'Điện tử'),
('C002',N'Sách'),
('C003',N'Trang sức'),
('C004',N'Phụ kiện điện tử'),
('C005',N'Thời trang'),
('C006',N'Máy móc'),
('C007',N'Mỹ phẩm')

insert into Products values
(N'Máy tính bảng',null,11324332.2,'2018-12-02',1,'C001'),
(N'Máy tính xách tay Asus',null,42334332.2,'2018-12-02',1,'C001'),
(N'Macbook',null,22124332.2,'2018-12-02',1,'C001'),
(N'Tai nghe apple',null,213232.2,'2018-12-02',1,'C004'),
(N'Tai nghe bluetooth',null,124332.2,'2018-12-05',1,'C004'),
(N'Sạc dự phòng',null,624332.2,'2018-12-02',1,'C004'),
(N'cáp sạc Iphone',null,234332.2,'2018-12-03',1,'C004'),
(N'Tâm lý tôi phạm',null,124332.2,'2018-12-03',1,'C002'),
(N'Đắc nhân tâm',null,343432.2,'2018-12-03',1,'C002'),
(N'Truyện cười nhân gian',null,234332.2,'2018-12-03',0,'C002'),
(N'Dây chuyền bạc nữ',null,234332.2,'2018-12-03',0,'C003'),
(N'Đồng hồ Casio',null,234332.2,'2018-12-03',0,'C003'),
(N'Vòng tay bạc nữ',null,234332.2,'2018-12-03',1,'C003')
insert into Accounts values
(N'hant','1234',N'Nguyễn Thanh Hà','hant@gmail.com',null,1,1),
(N'anv','avannguyen',N'Nguyễn Văn A','anv@gmail.com',null,1,0),
(N'nla','nguyenanhle',N'Lê Anh Nguyên','nla@gmail.com',null,1,0),
(N'dhtt','dunghong',N'Trần Thị Hồng Dung','dung@gmail.com',null,1,0),
(N'bnv','bvannguyen',N'Nguyễn Văn B','nvb@gmail.com',null,1,0),
(N'plt','phuonglinh',N'Trần Linh Phương','phuong@gmail.com',null,0,1),
(N'nht','nhungthi',N'Hồ Thị Nhung','htnhung@gmail.com',null,1,1)
insert into Orders values
(N'hant',N'2020-04-12',N'Quang Trung, phường8, Gò Vấp, TP.Hồ Chí Minh'),
(N'anv',N'2020-05-01',N'Lê Văng Khương, phường16,  Gò Vấp, TP.Hồ Chí Minh'),
(N'nla',N'2020-05-08',N'Tô Kí, Trung Mỹ Tây, Quận 12, TP.Hồ Chí Minh'),
(N'dhtt',N'2020-05-08',N'HoocMon, TP.Hồ Chí Minh'),
(N'bnv',N'2020-05-20',N'Tân Chánh Hiệp, TP.Hồ Chí Minh'),
(N'plt',N'2020-07-16',N'Quận 1,TP.Hồ Chí Minh'),
(N'nht',N'2020-08-12',N'Trường Chinh, Đông Hưng Thuận, Quận 12, TP.Hồ Chí Minh'),
(N'hant',N'2021-04-24',N'Quang Trung, phường8, Gò Vấp, TP.Hồ Chí Minh')

insert into OrderDetail values
(N'',null,11324332.2,'2018-12-02',1,'C001'),

