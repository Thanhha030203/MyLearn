--đăng nhập

CREATE TABLE register
( first_name varchar(250) NOT NULL,
  last_name varchar(250) NOT NULL,
  user_name varchar(250) NOT NULL,
  password varchar(250),
  email_id varchar(250) NOT NULL,
  mobile_number varchar(250) NOT NULL,
  dia_chi varchar(250) NOT NULL,
  cccd varchar(250) NOT NULL,
  gioi_tinh varchar(250) NOT NULL

);
CREATE TABLE Login (
	stk int,
	password VARCHAR(250)
	)
SELECT * FROM dbo.register
SELECT * FROM dbo.Login