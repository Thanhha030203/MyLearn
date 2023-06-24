<%@ page  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h5>User Edition</h5>
	<form action="/PS20520_NGUYENTHANHHA_LAB4/bai2" method="post">
		<label class="form-label">Username</label> 
		<input class="form-control" type="text" placeholder="Username?" name="username"> <br>
		<label class="form-label">Username</label> 
		<input class="form-control" type="password" placeholder="Passowrd?" name="password"> <br>
		<input type="checkbox"name="remember" value="true"> <label class="form-label">Remember me</label>
		<br>
		<button class="btn btn-info">Create</button>
	</form>
</body>
</html>