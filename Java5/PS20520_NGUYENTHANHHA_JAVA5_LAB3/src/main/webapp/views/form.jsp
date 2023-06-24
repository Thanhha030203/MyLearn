<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container mt-4 mw-75">
		<form:form action="save" modelAttribute="sv" class="form-control" enctype="multipart/form-data">
			<label for="" class="form-label">Nhập họ và tên</label>
			<form:input class="form-control" path="name" />
			<form:errors path="name" class="text-danger" /> <br>
			<label for="" class="form-label">Nhập email</label>
			<form:input class="form-control" path="email" />
			<form:errors path="email" class="text-danger" /> <br>
			<label for="" class="form-label">Nhập điểm</label>
			<form:input class="form-control" path="marks" /> 
			<form:errors path="marks" class="text-danger" /> <br> 
			<label for="" class="form-label">Chọn giới tính : </label> <br>
			<form:radiobuttons path="gender" items="${genders}" delimiter=" " /> <br>

			<form:errors path="gender" class="text-danger" /> <br> 
			<label for="" class="form-label">Chọn sở thích</label> <br>
			<form:checkboxes path="hobbies" items="${hobbies}" delimiter=" " /> <br>
			<form:errors path="hobbies" class="text-danger" /> <br>
<br>
<label for="" class="form-label">Chọn ngành </label>
			<form:select path="faculty" class="form-control">
				<form:options items="${faculties}"  itemsLabel="name"/>
			</form:select> <br>
			<form:errors path="faculty" class="text-danger" /> <br> 
			<br>
			<label for="">Tải ảnh</label> <br>
			<input type="file" name="image" class="form-control"> <br>
			<button class="btn btn-primary">Save</button>
			 <br>
			 	<img alt="" src="/${dd}" width="200px" height="200px" />
			${message}
		</form:form>
	
	</div>
</body>
</html>