<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-81">
<title>Insert title here</title>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<table class="table table-secondary table-bordered">
			<thead class="text-center">
				<tr>
					<th scope="col" class="text-uppercase">ID</th>
					<th scope="col" class="text-uppercase">Title</th>
					<th scope="col" class="text-uppercase">Views</th>
					<th scope="col" class="text-uppercase">Active</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${videos}" var="video">
					<tr>
						<td>${video.getId()}</td>
						<td>${video.getTitle()}</td>
						<td>${video.getViews()}</td>
						<td>${video.getActive() ? 'Yes' : 'No'}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>