<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container" style="width: 50%; margin-top: 100px">
		<div >
			<h2>Danh sách các sản phẩm</h2>
	<br>
	<div class="list-group">
  <a href="/sanpham/laptop-hp" class="list-group-item list-group-item-action">Laptop HP</a>
  <a href="/sanpham/laptop-dell" class="list-group-item list-group-item-action">Laptop DELL</a>
  <a href="/sanpham/iphone-12" class="list-group-item list-group-item-action">Iphone 12</a>
</div>
	<br>
	<h2>Sản phẩm bán đã chọn : ${sanpham}</h2>
		</div>	
	</div>
</body>
</html>