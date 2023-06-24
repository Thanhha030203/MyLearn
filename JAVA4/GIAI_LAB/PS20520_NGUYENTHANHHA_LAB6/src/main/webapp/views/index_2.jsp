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
			<form action="">
				<h4>FIND THE LIST FAVORITE VIDEO BY USERNAME</h4>
				<input class="form-control" type="text" value="${user}"
					name="username" placeholder="UserName?">
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/usersname"
					formmethod="post">Search</button>
				<hr>
				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="list" items="${favorite}">

						<tr>
							<td>${list.ID}</td>
							<td>${list.TITILE}</td>
							<td>${list.VIEWS}</td>
							<td>${list.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>
				<hr>
				<h4>FIND THE LIST FAVORITE VIDEO BY KEYWORD</h4>
				<input class="form-control" value="${key}" type="text"
					name="keyword" placeholder="Keyword?">
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/keysword"
					formmethod="post">Search</button>
				<hr>
				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="v" items="${v}">

						<tr>
							<td>${v.ID}</td>
							<td>${v.TITILE}</td>
							<td>${v.VIEWS}</td>
							<td>${v.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>
				<hr>
				<h4>FIND THE LIST FAVORITE VIDEO BY Date</h4>
				<input class="mx-3" value="${from}" type="text"
					name="from_date" placeholder="From Date?">
						<input  value="${to}" type="text"
					name="to_date" placeholder="To Date ?">
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/likedate"
					formmethod="post">Search</button>
				<hr>
				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="ft" items="${ft}">

						<tr>
							<td>${ft.ID}</td>
							<td>${ft.TITILE}</td>
							<td>${ft.VIEWS}</td>
							<td>${ft.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>
				<hr>
								<h4>FIND THE LIST FAVORITE VIDEO BY Month</h4>
<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" ${isMonth1 ? 'checked' : ''} id="january" value="1" name="month">
						<label class="form-check-label" for="january">1</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" ${isMonth2 ? 'checked' : ''} id="february" value="2" name="month">
						<label class="form-check-label" for="february">2</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth3 ? 'checked' : ''} id="march" value="3" name="month">
						<label class="form-check-label" for="march">3</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" ${isMonth4 ? 'checked' : ''} id="april" value="4" name="month">
						<label class="form-check-label" for="april">4</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth5 ? 'checked' : ''} id="may" value="5" name="month">
						<label class="form-check-label" for="may">5</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth6 ? 'checked' : ''} id="june" value="6" name="month">
						<label class="form-check-label" for="june">6</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" ${isMonth7 ? 'checked' : ''} id="july" value="7" name="month">
						<label class="form-check-label" for="july">7</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth8 ? 'checked' : ''} id="august" value="8" name="month">
						<label class="form-check-label" for="august">8</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth9 ? 'checked' : ''} id="september" value="9" name="month">
						<label class="form-check-label" for="september">9</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth10 ? 'checked' : ''} id="october" value="10" name="month">
						<label class="form-check-label" for="october">10</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth11 ? 'checked' : ''} id="november" value="11" name="month">
						<label class="form-check-label" for="november">11</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox"  ${isMonth12 ? 'checked' : ''} id="december" value="12" name="month">
						<label class="form-check-label" for="december">12</label>
					</div>
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/month"
					formmethod="post">Search</button>
				<hr>
				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="m" items="${m}">

						<tr>
							<td>${m.ID}</td>
							<td>${m.TITILE}</td>
							<td>${m.VIEWS}</td>
							<td>${m.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>
				<hr>
			</form>
		</div>
	</div>
</body>
</html>