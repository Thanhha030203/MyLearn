﻿CREATE  DATABASE QUANLY_NGANHANG;
GO
USE QUANLY_NGANHANG;
GO
CREATE TABLE LOGIN(
	ACCOUNT_NUMBER INT,
	PASSWORD INT
)
select * from LOGIN;
CREATE TABLE Register(
	FIRST_NAME VARCHAR(250) NOT NULL,
	LAST_NAME VARCHAR(250) NOT NULL,
	USER_NAME VARCHAR(250) NOT NULL,
	PASSWORD varchar(250) NULL,
	GMAIL varchar(250) NOT NULL,
	PHONE varchar(250) NOT NULL,
	ADDRESS_USER varchar (250) NOT NULL,
	IDENTITY_CARD_OR_CITIZEN_IDENTIFICATION VARCHAR (250) NOT NULL,
	SEX varchar(250) NOT NULL,
	BRITH nvarchar(50)
)
select * from Register;
drop table Register;
DROP TABLE STAFFER
--FORM Nhân Viên
CREATE TABLE STAFFER(
USER_NAME VARCHAR(20)  PRIMARY KEY,
FIRST_NAME NVARCHAR(10) NOT NULL,
LAST_NAME NVARCHAR (20) NOT NULL,
SEX NVARCHAR(100) NOT NULL,
BRITH DATE NOT NULL,
IDENTITY_CARD_OR_CITIZEN_IDENTIFICATION INT NOT NULL,
DATE_RANGE DATE NOT NULL,
ISSUED_BY NVARCHAR(30) NOT NULL,
ADDRESS_USER NVARCHAR(100) NOT NULL,
PHONE INT NOT NULL,
GMAIL NVARCHAR(50)  NOT NULL,
STAFFER_IMAGE VARCHAR(100) NOT NULL,

)
--Form người dùng
CREATE TABLE USERS(
USER_NAME VARCHAR(20) NOT NULL PRIMARY KEY,
FIRST_NAME NVARCHAR(10) NOT NULL,
LAST_NAME NVARCHAR (20) NOT NULL,
SEX NVARCHAR(100) NOT NULL,
BRITH DATE NOT NULL,
IDENTITY_CARD_OR_CITIZEN_IDENTIFICATION INT NOT NULL,
DATE_RANGE DATE NOT NULL,
ISSUED_BY NVARCHAR(30) NOT NULL,
ADDRESS_USER NVARCHAR(100) NOT NULL,
PHONE INT NOT NULL,
GMAIL NVARCHAR(50) ,
WALLET_BALANCE MONEY NOT NULL
)
select * from USERS;
DROP TABLE TYPE_USER
-- Loại người dùng
CREATE TABLE TYPE_USER(
CODE VARCHAR(10) PRIMARY KEY,
USER_NAME VARCHAR(20) NOT NULL,
PASSWORD NVARCHAR(30) NOT NULL,
ROLE NVARCHAR (20) NOT NULL,
--CONSTRAINT STAFFER_TYPE_USER FOREIGN KEY (USER_NAME) REFERENCES STAFFER(USER_NAME)
CONSTRAINT USERS_TYPE_USER FOREIGN KEY (USER_NAME) REFERENCES
USERS(USER_NAME)
)
DROP TABLE ACCOUNT
-- Tài khoản
CREATE TABLE  ACCOUNT(
USER_NAME VARCHAR(20) NOT NULL,
BANK_NAME NVARCHAR(20) NOT NULL,
ACCOUNT_NUMBER INT PRIMARY KEY,
PASSWORD_ACCOUNT VARCHAR(20) NOT NULL,
CARD_NUMBER INT NOT NULL, 
DATE_RANGE DATE NOT NULL,
EXPIRY DATE NOT NULL,
PHONE INT NOT NULL,
ACCOUNT_BALANCE MONEY NOT NULL,
STAFFER_CODE_ALLOCATION VARCHAR(10) ,
CONSTRAINT USER_ACCOUNT FOREIGN KEY (USER_NAME) REFERENCES USERS(USER_NAME)
)
--Chuyển khoản
CREATE TABLE TRANSFERS(
TRADING_CODE VARCHAR(10) PRIMARY KEY,
USER_NAME VARCHAR(20),
ACCOUNT_NUMBER_ONE INT ,
WALLET VARCHAR(20),
TRANSFER_AMOUNT MONEY NOT NULL,
ACCOUNT_NUMBER_TWO INT ,
DAY_TRADING DATETIME  NOT NULL,
CONTENT NVARCHAR(100) NOT NULL,
TRANSACTION_STATUS NVARCHAR(20) NOT NULL,
WALLET_BALANCE_AFTER MONEY NOT NULL,
SUPPORT_STAFF_CODE VARCHAR(20),
CONSTRAINT TRANSFERS_ACCOUNT FOREIGN KEY (ACCOUNT_NUMBER_ONE ) REFERENCES ACCOUNT(ACCOUNT_NUMBER),
CONSTRAINT TRANSFERS1_ACCOUNT FOREIGN KEY (ACCOUNT_NUMBER_TWO ) REFERENCES ACCOUNT(ACCOUNT_NUMBER),
CONSTRAINT TRANSFERS_USER FOREIGN KEY (USER_NAME ) REFERENCES USERS(USER_NAME)
 )
--Rút tiền
 CREATE TABLE WITHDRAW_MOENY(
 TRADING_CODE VARCHAR(10) PRIMARY KEY,
 USER_NAME VARCHAR(20),
WALLET VARCHAR(20)NOT NULL,
NAME_BANK NVARCHAR(20) NOT NULL,
ACCOUNT_NUMBER INT NOT NULL,
WITHDRAW_AMOUNT MONEY NOT NULL,
DAY_TRADING DATETIME  NOT NULL,
CONTENT NVARCHAR(100) NOT NULL,
TRANSACTION_STATUS NVARCHAR(20) NOT NULL,
WALLET_BALANCE_AFTER MONEY NOT NULL,
SUPPORT_STAFF_CODE VARCHAR(20),
CONSTRAINT WITH_ACCOUNT FOREIGN KEY (ACCOUNT_NUMBER) REFERENCES ACCOUNT(ACCOUNT_NUMBER),
CONSTRAINT WITH_USER FOREIGN KEY (USER_NAME ) REFERENCES USERS(USER_NAME)
)
--Nạp tiền	
CREATE TABLE RECHARGE(
 TRADING_CODE VARCHAR(10) PRIMARY KEY,
 USER_NAME VARCHAR(20) ,
 NAME_BANK NVARCHAR(20) NOT NULL,
ACCOUNT_NUMBER INT NOT NULL,
WALLET VARCHAR(20)NOT NULL,
WITHDRAW_AMOUNT MONEY NOT NULL,
DAY_TRADING DATETIME  NOT NULL,
CONTENT NVARCHAR(100) NOT NULL,
TRANSACTION_STATUS NVARCHAR(20) NOT NULL,
WALLET_BALANCE_AFTER MONEY NOT NULL,
SUPPORT_STAFF_CODE VARCHAR(20),
CONSTRAINT RECHARGE_ACCOUNT FOREIGN KEY (ACCOUNT_NUMBER) REFERENCES ACCOUNT(ACCOUNT_NUMBER),
CONSTRAINT RECHARGE_USER FOREIGN KEY (USER_NAME ) REFERENCES USERS(USER_NAME)
)
INSERT INTO USERS VALUES 

('KH03R1',N'Nguyễn',N'Thanh Hà',1,'2003-02-13',23456,'2017-10-01',N'Tây Sơn, Bình Định',N'Bình Định',0763274642,'ha@gmail.com',7833.23);
INSERT INTO TYPE_USER VALUES 
('8476','KH02R1','1233','USER'),
('8475','KH01R1','1234','USER');
select * from USERS
select * from TYPE_USER
SELECT * FROM dbo.ACCOUNT
SELECT * FROM dbo.LOGIN
SELECT * FROM dbo.Register
go;
CREATE TRIGGER DELE_USER ON USERS INSTEAD OF DELETE 
AS
BEGIN
			DELETE FROM ACCOUNT WHERE USER_NAME IN (SELECT USER_NAME FROM deleted)	
			DELETE FROM TRANSFERS WHERE USER_NAME IN (SELECT USER_NAME FROM deleted)
			DELETE FROM WITHDRAW_MOENY WHERE USER_NAME IN (SELECT USER_NAME FROM deleted)
			DELETE FROM RECHARGE WHERE USER_NAME IN (SELECT USER_NAME FROM deleted)
			DELETE FROM TYPE_USER WHERE USER_NAME IN (SELECT USER_NAME FROM deleted)	
			DELETE FROM USERS WHERE USER_NAME IN (SELECT USER_NAME FROM deleted)
END



