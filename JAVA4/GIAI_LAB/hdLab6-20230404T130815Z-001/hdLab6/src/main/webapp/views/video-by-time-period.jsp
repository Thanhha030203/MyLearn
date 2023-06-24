<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Videos</title>
<link rel="stylesheet" href="style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>

<body>
	<div class="container">
		<div class=" pt-3">
			<div class="search-username d-flex justify-content-between mb-3">
				<h2 class="text-uppercase">Videos</h2>
				<form class="d-inline-flex" action="Bai3_VideoByTimePeriodController" method="post">
					<div class="input-group">
						<span class="input-group-text">From</span>
						<input type="date" name="fromDate" class="form-control" value="${fromDateValue}" required="required">
						<span class="input-group-text">To</span>
						<input type="date" name="toDate" class="form-control" value="${toDateValue}" required="required">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</div>
				</form>
			</div>
			<table class="table table-secondary">
				<thead>
					<tr class="text-center">
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
	</div>
</body>

</html>