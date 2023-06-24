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
	<div class="container">
		<div class="mt-5">
			<form action="/ctrl/ok" method="post" class="form-control">
		<button class="btn btn-primary">OK 1</button>
		<button class="btn btn-primary" formmethod="get">OK 2</button>
		<button class="btn btn-primary" formaction="/ctrl/ok?x">OK 2</button>
	</form>
		</div>
	<h2>Phương thực hiện tại là: ${result}</h2>
	</div>
</body>
</html>