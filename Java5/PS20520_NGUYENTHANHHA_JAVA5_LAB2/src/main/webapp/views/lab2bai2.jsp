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
	<div class="container mw-50">
		<div>
				<form action="/tinhtong" method="post" class="form-cotrol">
		<label class="form-label">Nhập số a</label> <input class="form-control" name="a" placeholder="Số a"> <br>
		<label class="form-label">Nhập số b</label> <input class="form-control" name="b" placeholder="Số b">
		<button formaction="/tinhtong/+" class="btn btn-success">+</button>
		<button formaction="/tinhtong/-" class="btn btn-primary">-</button>
		<button formaction="/tinhtong/x" class="btn btn-warning">x</button>
		<button formaction="/tinhtong/chia" class="btn btn-danger">/</button>
	</form>
		</div>
	</div>
</body>
</html>