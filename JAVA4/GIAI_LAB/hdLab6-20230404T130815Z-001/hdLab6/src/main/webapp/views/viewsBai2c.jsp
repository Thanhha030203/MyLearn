<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Title</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<style>
input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
	-webkit-appearance: none;
	margin: 0;
}

input[type=number] {
	-moz-appearance: textfield;
}
</style>
</head>

<body>
	<div class="container">
		<div class="container-fluid row mt-5">
			<div class="col-4">
				<form action="Bai2c" method="post" class="form-inline">
					<div class="form-group">
						<input type="text" class="form-control" name="id" placeholder="Input Video ID" />
					</div>
					<div class="form-group">
						<button class="btn btn-outline-primary ml-2">Search</button>
					</div>
				</form>
			</div>
			<div class="col-8">
				<table class="table table-bordered">
					<thead class="thead-dark text-center">
						<tr>
							<th scope="col">Username</th>
							<th scope="col">Fullname</th>
							<th scope="col">Email</th>
							<th scope="col">Role</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lstUsers}">
							<tr>
								<th scope="row" class="text-center">${item.getId()}</th>
								<td>${item.getFullname()}</td>
								<td class="text-center text-primary">${item.getEmail()}</td>
								<td class="text-center text-danger">${item.getAdmin()}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"></script>
</body>

</html>