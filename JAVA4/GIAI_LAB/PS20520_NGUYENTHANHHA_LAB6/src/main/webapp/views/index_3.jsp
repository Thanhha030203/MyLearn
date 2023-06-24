<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
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
	<div class="container" style="width: 60%">
		<div>
			<form action="/PS20520_NGUYENTHANHHA_LAB6/search/random">
				
				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="list" items="${l}">
	
						<tr>
							<td>${list.ID}</td>
							<td>${list.TITILE}</td>
							<td>${list.VIEWS}</td>
							<td>${list.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>
				 <hr>
				 <h4>Find Video By Year</h4>
				 
				  <select name="year" value="${year}">
				  	<c:forEach items="${years}"  var="years">
				  		<option> <c:out value="${years}"></c:out></option>
				  	</c:forEach>
				  </select>
				  <button formaction="/PS20520_NGUYENTHANHHA_LAB6/search/year" class="btn btn-success" formmethod="post">search</button>
				  <hr>
		<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="r" items="${rs}">
	
						<tr>
							<td>${r.group}</td>
							<td>${r.like}</td>
							<td>${r.newest}</td>
							<td>${r.olsest}</td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>

</html>