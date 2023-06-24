<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="css/index2.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
	integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm"
	crossorigin="anonymous" />
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
</head>
<body>
	<div class="container">
		<h3 class="text-primary mt-4 text-center">User Management</h3>
		
		<div class="contain">
			<%@ include file="form_user.jsp"%>
		</div>


		<hr>
		<hr>
	<div>
		<table class="table table-bordered">
			<thead> 
				<td>Username</td>
				<td>Password</td>
				<td>Remember4</td>
				<td>Action</td>
			</thead>
			<c:forEach var="i" items="${list}">
				<tr>
			<td><c:out value="${i.username}"></c:out></td>
				<td><c:out value="${i.password}"></c:out></td>
				<td><c:out value="${i.remember}"></c:out></td>
				<td><a href="delete?dels='${i.username}'">Delete</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>



	</div>
</body>
</html>