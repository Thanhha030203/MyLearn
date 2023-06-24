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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<div class="container">
			<div class="pt-3">
				<div class="search-username d-flex justify-content-between mb-3">
					<h2 class="text-uppercase">Videos</h2>
					<form class="d-inline-flex" action="Bai3_VideoByUserIDController" method="post">
						<input class="form-control me-2" type="search" placeholder="Username" name="username" value="${usernameValue}">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
				<div class="d-flex justify-content-end align-items-center">
					<c:if test="${not empty user.id and not empty user.email}">
						<span>Username: ${user.id} | Email: ${user.email}</span>
					</c:if>
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