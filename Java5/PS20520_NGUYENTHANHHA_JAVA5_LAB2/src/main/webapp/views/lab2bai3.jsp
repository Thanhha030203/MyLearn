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
	<div style="width: 50%; margin-top: 100px" class="container">
		<form action="/product/save" method="post" class="form-control">
		<input type="text" class="form-control my-2" name = "name" placeholder="Tên sản phẩm">
		<input type="text" class="form-control mb-2" name = "price" placeholder="Giá sản phẩm">
		<button class="btn btn-success">Save</button>
	</form>
	</div>

</body>
</html>