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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
 	<div  style="width: 30%; margin-top: 100px" class="container">
 			<form:form action="save" method="post"  modelAttribute="productSave" class="form-control">
 		<form:input class="form-control my-2" path="name"/> <br>
 			<form:input class="form-control mb-2" path="price"/>
 		<button class="btn btn-primary">Save</button>
 	</form:form>
 	<ul class="list-group my-2">
  <li class="list-group-item list-group-item-success">${product.name}</li>
  <li class="list-group-item list-group-item-success">${product.price}</li>
</ul>
 	<ul class="list-group my-2">
  <li class="list-group-item list-group-item-info">${pro2.name}</li>
  <li class="list-group-item list-group-item-info">${pro2.price}</li>
</ul>
 	<ul class="list-group my-2">
 	<c:forEach var="item" items="${pros}">
 	<li class="list-group-item list-group-item-warning">${item.name}</li>
  <li class="list-group-item list-group-item-warning">${item.price}</li>
</c:forEach>
 	</ul>
 	</div>
 	
</body>
</html>