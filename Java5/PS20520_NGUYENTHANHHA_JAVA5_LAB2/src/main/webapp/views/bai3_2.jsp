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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
<div style="width: 30%; margin-top: 100px" class="container">
	<form:form modelAttribute="pro" class="form-control">
	<label class="form-label">Tên sản phẩm : </label>
		<form:input path="name" class="form-control text-center"></form:input> <br>
		<label class="form-label">Giá sản phẩm : </label>
		<form:input path="price" class="form-control text-center"></form:input>
	</form:form>
	</div>
</body>
</html>