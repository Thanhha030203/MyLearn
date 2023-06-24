CREATE DATABASE USER_LAB4_JAVA4
GO
USE USER_LAB4_JAVA4
 go
 CREATE TABLE INFO_USER(
		username nvarchar(25) not null primary key,
		password  varchar(20) not null,
		remember varchar(5) 
 )
 go
  insert into INFO_USER values('Nguyễn Văn A','a123','true'),
  ('Nguyễn Văn B','nvb','true'),
  ('Nguyễn Văn C','nvc','false'),
  ('Nguyễn Văn D','a123','false')