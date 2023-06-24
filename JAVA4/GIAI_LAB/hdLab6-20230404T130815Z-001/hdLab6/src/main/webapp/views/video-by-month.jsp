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
		<div class="pt-3">
			<div class="search-username d-flex justify-content-between align-items-center mb-3">
				<h2 class="text-uppercase">Videos</h2>
				<form action="Bai3_VideoByMonthController" method="post" role="form">
					<span class="me-3">Month: </span>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth1 ? 'checked' : ''} id="january" value="1" name="month">
						<label class="form-check-label" for="january">1</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth2 ? 'checked' : ''} id="february" value="2" name="month">
						<label class="form-check-label" for="february">2</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth3 ? 'checked' : ''} id="march" value="3" name="month">
						<label class="form-check-label" for="march">3</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth4 ? 'checked' : ''} id="april" value="4" name="month">
						<label class="form-check-label" for="april">4</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth5 ? 'checked' : ''} id="may" value="5" name="month">
						<label class="form-check-label" for="may">5</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth6 ? 'checked' : ''} id="june" value="6" name="month">
						<label class="form-check-label" for="june">6</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth7 ? 'checked' : ''} id="july" value="7" name="month">
						<label class="form-check-label" for="july">7</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth8 ? 'checked' : ''} id="august" value="8" name="month">
						<label class="form-check-label" for="august">8</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth9 ? 'checked' : ''} id="september" value="9" name="month">
						<label class="form-check-label" for="september">9</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth10 ? 'checked' : ''} id="october" value="10" name="month">
						<label class="form-check-label" for="october">10</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth11 ? 'checked' : ''} id="november" value="11" name="month">
						<label class="form-check-label" for="november">11</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth12 ? 'checked' : ''} id="december" value="12" name="month">
						<label class="form-check-label" for="december">12</label>
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