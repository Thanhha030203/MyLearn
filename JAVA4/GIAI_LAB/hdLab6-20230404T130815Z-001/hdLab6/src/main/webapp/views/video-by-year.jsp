<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Video</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="Bai4_VideoByYearController" method="post">
			<select class="form-select my-3" onchange="this.form.submit()" name="year">
				<option ${is2020 ? 'selected' : ''} value="2020">2020</option>
				<option ${is2021 ? 'selected' : ''} value="2021">2021</option>
				<option ${is2022 ? 'selected' : ''} value="2022">2022</option>
			</select>
		</form>
		<table class="table table-secondary">
			<thead>
				<tr class="text-center">
					<th scope="col" class="text-uppercase">ID</th>
					<th scope="col" class="text-uppercase">Favorite Count</th>
					<th scope="col" class="text-uppercase">Newest Date</th>
					<th scope="col" class="text-uppercase">Oldest Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${reports}" var="item">
					<tr>
						<td>${item.group}</td>
						<td>${item.likes}</td>
						<td>${item.newest}</td>
						<td>${item.oldest}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>