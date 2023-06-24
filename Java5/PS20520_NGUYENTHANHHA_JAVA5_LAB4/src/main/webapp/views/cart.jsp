<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<body>
	<div class="container text-center my-5">
		<h4 class="text-primary">DANH SÁCH SẢN PHẨM</h4>
	</div>
	<div class="container" style="border: 1px solid #ddd;">
		<div class="row my-5">
			<div class="col-sm-5">
				<table class="table table-hover table-bordered">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${items}" var="item">
							<tr>
								<th scope="row">${item.id}</th>
								<td>${item.name}</td>
								<td>${item.price}</td>
								<td class="w-25"><a href="/cart/add/${item.id}">
										<button class="btn btn-success">Thêm</button>
								</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
			<div class="col-sm-7">
				<div class=" me-auto ms-auto mt-3">
					<table class="table table-hover table-bordered">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Name</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col">Amount</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${cart}" var="c">
								<tr>
									<th scope="row">${c.id}</th>
									<td>${c.name}</td>
									<td>${c.price}</td>
									<td class="w-25"><input class="w-50" id="${c.id}input"
										value="${c.qty}" onchange="updateQty('${c.id}')" type="number"
										min="1" /></td>
									<td>${c.qty * c.price}</td>
									<td><a href="/cart/remove/${c.id}" class="text-danger"><button
												class="btn btn-danger">Xoá</button></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<a href="/"><button type="button" class=" btn btn-primary">Home</button></a>
					<a href="/cart/clear"><button type="button"
							class="float-end btn btn-danger">Clear</button></a>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		function updateQty(id) {
			location.href = "/cart/update?id=" + id + "&qty="
					+ document.getElementById(id + "input").value;
		}
	</script>
</body>
</html>