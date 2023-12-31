USE [master]
GO
/****** Object:  Database [J5Shop]    Script Date: 2023-05-15 4:47:12 AM ******/
CREATE DATABASE [J5Shop]
go
USE [J5Shop]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 2023-05-15 4:47:13 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[Username] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
	[Fullname] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[Photo] [nvarchar](50) NOT NULL,
	[Activated] [bit] NOT NULL,
	[Admin] [bit] NOT NULL,
 CONSTRAINT [PK_Accounts] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 2023-05-15 4:47:13 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[Id] [char](4) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[is_delete] [bit] NOT NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 2023-05-15 4:47:13 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[order_id] [bigint] NULL,
	[product_id] [int] NULL,
	[Price] [float] NULL,
	[Quantity] [int] NULL,
 CONSTRAINT [PK_OrderDetails] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 2023-05-15 4:47:13 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](50) NOT NULL,
	[CreateDate] [date] NOT NULL,
	[Address] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 2023-05-15 4:47:13 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Image] [nvarchar](max) NULL,
	[Price] [float] NOT NULL,
	[create_date] [date] NOT NULL,
	[Quantity] [int] NOT NULL,
	[category_id] [char](4) NOT NULL,
	[is_delete] [bit] NOT NULL,
 CONSTRAINT [PK_Products] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV001', N'123', N'Võ Minh Vương', N'vuongvmps24279@fpt.edu.vn', N'vuong.jpg', 1, 1)
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV002', N'123', N'Trần Quang Nhật', N'nhattqps12345@fpt.edu.vn', N'nhat.jpg', 1, 1)
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV003', N'123', N'Vương Ngọc Thanh Loan', N'loanvntps54321@fpt.edu.vn', N'loan.jpg', 1, 0)
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV004', N'123', N'Trần Hà Nga', N'ngathps12312@fpt.edu.vn', N'nga.jpg', 1, 0)
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV005', N'123', N'Trần Mậu Phi', N'phitmps32112@fpt.edu.vn', N'phi.jpg', 1, 0)
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV006', N'123', N'Nguyễn Nhật Cao Thăng', N'thangnccps34567@fpt.edu.vn', N'thang.jpg', 1, 0)
INSERT [dbo].[Accounts] ([Username], [Password], [Fullname], [Email], [Photo], [Activated], [Admin]) VALUES (N'NV007', N'123', N'Phan Nguyễn Đăng Trường', N'truongpndps43223@fpt.edu.vn', N'truong.jpg', 1, 0)
GO
INSERT [dbo].[Categories] ([Id], [Name], [is_delete]) VALUES (N'ca01', N'Áo thun', 0)
INSERT [dbo].[Categories] ([Id], [Name], [is_delete]) VALUES (N'ca02', N'Áo khoác', 0)
INSERT [dbo].[Categories] ([Id], [Name], [is_delete]) VALUES (N'ca03', N'Quần short', 0)
INSERT [dbo].[Categories] ([Id], [Name], [is_delete]) VALUES (N'ca04', N'Quần dài', 0)
INSERT [dbo].[Categories] ([Id], [Name], [is_delete]) VALUES (N'ca05', N'Váy', 0)
INSERT [dbo].[Categories] ([Id], [Name], [is_delete]) VALUES (N'ca06', N'Giày', 0)
GO
SET IDENTITY_INSERT [dbo].[Products] ON 

INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (5, N'Áo thun tay lỡ nam nữ, áo phông rộng unisex Sani', N'aothun001_01.jpg,aothun001_02.jpg,aothun001_03.jpg,aothun001_04.jpg', 165000, CAST(N'2023-05-11' AS Date), 100, N'ca01', 0)
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (7, N'Áo thun tay lỡ HADES ALTERNATIVE TEE', N'aothun002_01.jpg,aothun002_02.jpg,aothun002_03.jpg,aothun002_04..jpg', 159000, CAST(N'2023-05-15' AS Date), 200, N'ca01', 0)
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (8, N'Áo Thun Ngắn Tay Cổ Tròn Họa Tiết Kẻ Sọc', N'aothun003_01.jpg,aothun003_02.jpg,aothun003_03.jpg,aothun003_04.jpg', 159000, CAST(N'2023-05-16' AS Date), 150, N'ca01', 0)
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (10, N'Áo phông unisex nam nữ CaMa', N'aothun004_01.jpg,aothun004_02.jpg,aothun004_03.jpg,aothun004_04.jpg', 132000, CAST(N'2023-05-15' AS Date), 500, N'ca01', 0)
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (11, N'Áo thun Imagine', N'aothun005_01.jpg,aothun005_02.jpg,aothun005_03.jpg,aothun005_04.jpg', 129000, CAST(N'2023-05-12' AS Date), 130, N'ca01', 0)
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (12, N'Áo Thun Nữ Cổ màu đặc Tròn', N'aothun006_01.jpg,aothun006_02.jpg,aothun006_03.jpg,aothun006_04.jpg', 133000, CAST(N'2023-05-13' AS Date), 120, N'ca01', 0)
INSERT [dbo].[Products] ([Id], [Name], [Image], [Price], [create_date], [Quantity], [category_id], [is_delete]) VALUES (13, N'Áo thun phông logo tay nam nữ PINK', N'aothun007_01.jpg,aothun007_02.jpg,aothun007_03.jpg,aothun007_04..jpg', 177000, CAST(N'2023-05-14' AS Date), 190, N'ca01', 0)
SET IDENTITY_INSERT [dbo].[Products] OFF
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Orders] FOREIGN KEY([order_id])
REFERENCES [dbo].[Orders] ([Id])
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Orders]
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Products] FOREIGN KEY([product_id])
REFERENCES [dbo].[Products] ([Id])
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Products]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Accounts] FOREIGN KEY([Username])
REFERENCES [dbo].[Accounts] ([Username])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Accounts]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK_Products_Categories] FOREIGN KEY([category_id])
REFERENCES [dbo].[Categories] ([Id])
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK_Products_Categories]
GO
USE [master]
GO
ALTER DATABASE [J5Shop] SET  READ_WRITE 
GO
