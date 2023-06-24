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
</head>
<body>
<div class ="container" style="width: 40%; margin-top: 10%">
		<form action="/PS20520_NGUYENTHANHHA_ASM/asm/forgot-password" method="post">
		<h3>Enter Code</h3>
		<label class = "form -label">Code :</label> <input class="form-control" type="text" name="accpet"> <br>
	
		<hr>
		<button class="btn btn-primary float-end">Next</button>
	</form>
		<div style="margin:20px 20px 20px 10px; color:red; font-weight: 600" class="text-center">
				<div>${mess}</div>
			</div>
</div>
</body>
</html>>