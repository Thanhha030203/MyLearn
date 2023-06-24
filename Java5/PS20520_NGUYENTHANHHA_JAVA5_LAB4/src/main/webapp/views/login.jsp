<%@ page language="java" contentType="text/html; charset=utf=8"
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
	<div class="container w-50 mt-5">
		<form action="/account/login" class="form-control" method="post" enctype="multipart/form-data">
		<input name="username" value="${username}" class="form-control"   placeholder="username"> <br>
		<input name="password"value="${password}" class="form-control"   placeholder="password"> <br>
		<input type="file"   name="file">
		<br>
		<input type="checkbox"   name="remember" value="true"> <label>Remember me</label>
		<br>
		<button class="btn btn-success">Login</button>
		<button class="btn btn-primary" formaction="/">Home</button>
	</form>
	<img src="/file/${anhupload}" width="200" height="200" style="margin-left: 200px; margin-top: 50px"></img>
	</div>
</body>
</html>