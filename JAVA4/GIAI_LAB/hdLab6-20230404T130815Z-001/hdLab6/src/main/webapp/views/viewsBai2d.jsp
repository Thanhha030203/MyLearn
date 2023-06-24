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
				<form action="Bai2d" method="post" class="form-inline" role="form">
					<div class="form-check-inline">
						<label class="form-check-label">
							<input type="radio" ${isChecked?'checked="checked"':''} onClick="this.form.submit()" class="form-check-input" name="isFavorite" value="true">
							Favorited
						</label>
					</div>
					<div class="form-check-inline">
						<label class="form-check-label">
							<input type="radio" ${isChecked?'':'checked="checked"'} onClick="this.form.submit()" class="form-check-input" name="isFavorite" value="false">
							Not Favorited
						</label>
					</div>
				</form>
			</div>
			<div class="col-8">
				<table class="table table-bordered">
					<thead class="thead-dark text-center">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Title</th>
							<th scope="col">Views</th>
							<th scope="col">Active ?</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lstVideos}">
							<tr>
								<th scope="row" class="text-center">${item.getId()}</th>
								<td>${item.getTitle()}</td>
								<td class="text-center text-primary">${item.getViews()}</td>
								<td class="text-center text-danger">${item.getActive()}</td>
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