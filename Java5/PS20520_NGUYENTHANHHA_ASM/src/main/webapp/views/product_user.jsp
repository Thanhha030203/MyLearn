<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<title>Document</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="../css/index.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
	integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm"
	crossorigin="anonymous" />
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
</head>

<body style="background-color: rgb(240, 243, 244);">


	<div>
		<header class="container-fluid  mb-3 pos"
			style="background-color: white; z-index: 999;">

			<div class="row pt-3 ">
				<div class="col-sm-5 text-end">
					<h5
						style="text-decoration: underline; font-weight: bold; color: #222222; font-size: 20px;">
						Sản phẩm</h5>
				</div>
				<div class="col-sm-7 text-start">
					<h5 style="color: #222222; font-weight: 500; font-size: 17px;">Nhà
						sản xuất</h5>
				</div>
			</div>
			<div class="row ">
				<div class="col-sm-3 pt-0 mt-3 text-center">
					<a href="../asm/Home" style="line-height: 40px;"><img
						src="../images/linlin-low-resolution-logo-color-on-transparent-background.png"
						class="ms-4" height="55%" width="60%" alt=""></a>
				</div>
				<div class="col-sm-7 mt-3">
					<div class="input-group flex-nowrap rounded-pill">
						<input type="text" class="form-control "
							style="border: 2px solid #2F87E9; border-top-left-radius: 20px; border-bottom-left-radius: 20px;"
							placeholder="Tìm kiếm tại đây" ng-model="SearchText"
							aria-label="Username" aria-describedby="addon-wrapping">
						<!-- <label for="">{{SearchText}}</label> -->
						<a href="#">
							<button class=""
								style="background-color: #2F87E9; width: 150px; height: 40px; border: none; color: #fff; border-top-right-radius: 20px; border-bottom-right-radius: 20px;"
								type="button">
								<img src="../icons/icon/seach1.png" alt=""> Tìm kiếm
							</button>
						</a>
					</div>
				</div>
				<div class="col-sm-2 mt-2 mb-4">
					<div class="d-flex flex-nowrap me-2"
						style="font-size: 14px; line-height: 50px;">
						<div class="flex-fill text-center text-decoration-none">
							<a href="#"
								style="text-decoration: none; color: #000; padding-right: 10px;">MY FAVORITES</a>
						</div>
						<div class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" role="button"
								data-bs-toggle="dropdown">MY ACCOUNT</a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="#">Registration</a></li>
								<li><a class="dropdown-item" href="sign-out">Logoff</a></li>
								<li><a class="dropdown-item" href="#">Change Password</a></li>
								<li><a class="dropdown-item" href="#">Edit Profile</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>

		</header>
	</div>
<form action="">
	<div class="container" style="margin-top: 20px;">
		<div class="row">
			<div class="col-md-9 ">
				<div>
					<div class="card pt-2" data-bs-toggle="card">
						<div class="card pt-2  border-0" data-bs-toggle="card">
							<div class="text-center">
								<img alt="" style="width: 90%; height: 500px"
									src="../images/${productVideo.POSTER}">
							</div>
							<hr>
							<div class="card-body">
								<div>
									<a href=""
										style="font-size: 13px; color: #333; text-decoration: none; font-style: italic;">
										<h5>${productVideo.TITILE}</h5>
									</a>
								</div>
								<hr>
								<div>
									<button type="button" class="btn " data-bs-toggle="collapse"
										data-bs-target="#demo">Description</button>
									<div id="demo" class="collapse">
										${productVideo.DESCRIPTION}</div>
								</div>
							</div>
						</div>
						<div class="card-body">
							<div class="float-end">
								<button class="btn btn-success" formaction="">
								<a href="../asm/likeVideo?IdOfVideolike=${productVideo.ID}">Like</a>
								</button>
								<button class="btn "
									style="background-color: #ff6a00; color: white;" formaction=""><a href="../asm/shareVideo?IdOfVideo=${productVideo.ID}">Share</a></button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 my-1">
				<c:forEach var="videolist" items='${VideoListInProduct}'>
					<div class="mt-2">
						<div class="card" data-bs-toggle="card">
							<div class="card-body">
								<div class="row">
									<div class="col-sm-5 con">
										<a href="#"> <img src="../images/${videolist.POSTER}"
											width="95%" height="100px" alt=""></a>
										<div class="More_product_user">
											<div class="text_a">
												<a href="product?videoId=${videolist.ID}"><img src="../icons/play.png" alt=""></a>
											</div>
										</div>
									</div>
									<div class="col-sm-7 pt-3">
										<a href="product?videoId=${videolist.ID}">
											<h6>${videolist.TITILE}</h6>
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>

				
				
				
				</div>

			</div>
		</div></form>

</body>

</html>