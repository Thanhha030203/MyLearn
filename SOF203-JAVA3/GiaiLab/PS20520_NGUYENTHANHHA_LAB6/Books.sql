CREATE DATABASE Library
go
use Library
GO
drop table if exists Books
go
CREATE TABLE Books (	
ID INT IDENTITY PRIMARY KEY ,
Title nvarchar(50),
price FLOAT
)
go
INSERT INTO Books VALUES 
(N'Lập trình C',100),
(N'Lập trình Java',200),
(N'Lập trình C#',150);
go 
select * from Books