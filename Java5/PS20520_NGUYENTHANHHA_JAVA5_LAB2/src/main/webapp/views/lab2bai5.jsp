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
</head>
<body>
		<div style="width: 30%; margin-top: 100px" class="container">
			 <h2>${message}</h2>
  <h2>${param.message}</h2>
 	 <form action="" method="get">
 	 	 <button formaction="/a" class="btn btn-success">Home</button>
		<button formaction="/b" class="btn btn-primary">forward</button>
		<button formaction="/c" class="btn btn-warning">Redirect</button>
		<button formaction="/d" class="btn btn-danger">ResponseBody</button>
 	 </form>
		</div>
</body>
</html>