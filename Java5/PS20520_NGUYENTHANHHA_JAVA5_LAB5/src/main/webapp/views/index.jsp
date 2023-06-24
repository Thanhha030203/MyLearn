<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
        integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous" />
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
</head>
<body>
		<div class="container text-center my-5">
		<h4 class="text-primary">DANH SÁCH SẢN PHẨM</h4>
	</div>
	<div class="container" style="border: 1px solid #ddd;">
		<div class="row my-5">
		<div class="col-sm-7">
				<div class=" me-auto ms-auto mt-3">
					<form:form action="form/index" modelAttribute="item">
						<label class="form-label">Nhập mã sản phẩm</label>
						<form:input class="form-control" path="id"/>
							<label class="form-label">Tên sản phẩm</label>
						<form:input class="form-control" path="name"/>
						<button class="btn btn-primary mt-3" formaction="/category/create" formmethod="post">Create</button>
						<button class="btn btn-danger mt-3" formaction="/category/update"  formmethod="post">update</button>
						<a href="/category/delete/${item.id}">Delete</a>
						<a href="/category/index">Rest</a>
					</form:form>
				</div>
			</div>
			<div class="col-sm-5">
				<table class="table table-hover table-bordered">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Action</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${items}" var="pro">
							<tr>
								<th scope="row">${pro.id}</th>
								<td>${pro.name}</td>
								<td class="w-25"><a href="/category/edit/${pro.id}">
										<button class="btn btn-success">Edit</button>
								</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
			
		</div>
	</div>
</body>
</html>