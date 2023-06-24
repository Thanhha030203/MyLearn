CREATE DATABASE LINLIN_PROJECT

GO
USE LINLIN_PROJECT
 GO
  CREATE TABLE FAVORITE(
  ID INT IDENTITY PRIMARY KEY NOT NULL,
  USER_ID VARCHAR(10) NOT NULL,
  VIDEO_ID VARCHAR(10) NOT NULL,
  LIKEDATE DATE NOT NULL
  )
  CREATE TABLE VIDEO (
  ID VARCHAR(10) PRIMARY KEY NOT NULL,
  TITILE NVARCHAR(100) NOT NULL,
  POSTER NVARCHAR(200) ,
  VIEWS INT ,
  DESCRIPTION NVARCHAR(1000) ,
  ACTIVE BIT NOT NULL

  )
   
    CREATE TABLE USER_(
	ID VARCHAR(10 ) PRIMARY KEY NOT NULL,
	PASSWORD VARCHAR(30) NOT NULL,
	EMAIL VARCHAR(50) NOT NULL,
	FULLNAME NVARCHAR(30) NOT NULL,
	USER_IMG varchar(200) ,
	ADMIN BIT NOT NULL
	
	)

	CREATE TABLE SHARE (
	ID INT   identity PRIMARY KEY,
	USER_ID VARCHAR(10),
	VIDEO_ID  VARCHAR(10) ,
	EMAILS VARCHAR(50) ,
	SHAREDATE DATE NOT NULL
	)
	ALTER TABLE FAVORITE
ADD CONSTRAINT FK_VIDEO_FAVORITE FOREIGN KEY (VIDEO_ID) REFERENCES VIDEO(ID) ,
 CONSTRAINT FK_USER_FAVORITE FOREIGN KEY (USER_ID) REFERENCES USER_(ID) 


	ALTER TABLE SHARE
ADD CONSTRAINT FK_VIDEO_SHARE FOREIGN KEY (VIDEO_ID) REFERENCES VIDEO(ID) ,
 CONSTRAINT FK_USER_SHARE FOREIGN KEY (USER_ID) REFERENCES USER_(ID)
 
 INSERT INTO USER_ VALUES
 ('admin1','admin1','hant@gmail.com','Nguyễn Thanh Hà',null,1),
  ('admin2','admin2','hant@gmail.com','Lê Hàn Trương',null,1),
   ('admin3','admin3','hant@gmail.com','Nguyễn Văn An',null,1),
      ('user1','user1','hant@gmail.com','Nguyễn Văn An',null,0),
      ('user2','user2','hant@gmail.com','Nguyễn Văn An',null,0),
      ('user3','user3','hant@gmail.com','Nguyễn Văn An',null,0),
      ('user4','user4','hant@gmail.com','Nguyễn Văn An',null,0)

    
 INSERT INTO VIDEO VALUES
 ('video1',N'Avatar Movies chính thức ra mắt cuối 2022','Avatar.jpeg',1555,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',1),
 ('video2',N'Suzume','film-suzume-notojimari-2022_169.jpeg',154455,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',1),
  ('video3',N'One Piece_ FILM RED','one.jpg',155325,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',0),
   ('video4',N'Mavel ra mắt','mavel.jfif',155325,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',1),
    ('video5',N'Bố già- Trấn Thành','maxresdefault.jpg',155125,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',0),
    ('video6',N'Jusukai sen','jusukaise.jfif',155875,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',1),
    ('video7',N'Hai kịch 9x','Avatar.jpeg',14355125,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',0),
   ('video8',N'Phim cuối tuần tháng 3','Avatar.jpeg',158755,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',1),
   ('video9',N'Tiểu phẩm hài Hoài Linh','Avatar.jpeg',152455,N'Avatar phá đảo thế giới ra mắt vào cuối năm 2022',1)

              
 INSERT INTO FAVORITE VALUES
  ('user1','video2','2020/01/19'),
   ('user2','video2','2020/04/03'),
      ('user2','video4','2020/12/03'),
      ('user2','video7','2020/11/03'),
      ('user2','video1','2020/08/02'),
      ('user3','video5','2020/01/03'),
      ('user4','video5','2020/06/21'),
      ('user1','video6','2020/07/12'),
      ('user4','video3','2020/04/03')
 INSERT INTO SHARE VALUES
 ('user1','video1','hantps@gmail.com','2020/01/23'),
  ('user1','video2','hantps@gmail.com','2020/01/19'),
   ('user2','video2','hantps@gmail.com','2020/04/03'),
      ('user2','video4','hantps@gmail.com','2020/12/03'),
      ('user2','video7','hantps@gmail.com','2020/11/03'),
      ('user2','video1','hantps@gmail.com','2020/08/02'),
      ('user3','video5','hantps@gmail.com','2020/01/03'),
      ('user4','video5','hantps@gmail.com','2020/06/21'),
      ('user1','video6','hantps@gmail.com','2020/07/12'),
      ('user4','video3','hantps@gmail.com','2020/04/03')




	  CREATE TRIGGER TR_DELETE_USER ON USER_ INSTEAD OF DELETE
	  AS
	   BEGIN
			DELETE FROM FAVORITE WHERE USER_ID IN (SELECT ID FROM deleted) 
			DELETE FROM SHARE WHERE USER_ID IN (SELECT ID FROM deleted) 
	   END

	   	  CREATE TRIGGER TR_DELETE_VIDEO ON VIDEO INSTEAD OF DELETE
	  AS
	   BEGIN
			DELETE FROM FAVORITE WHERE VIDEO_ID IN (SELECT ID FROM deleted) 
			DELETE FROM SHARE WHERE VIDEO_ID IN (SELECT ID FROM deleted) 
	   END