<%@ page language="java" contentType="text/html; charset=UTF-8"
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
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/username"
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
							<td>${list.video.TITILE}</td>
							<td>${list.video.VIEWS}</td>
							<td>${list.video.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>
				<hr>
				<h4>FIND THE LIST FAVORITE VIDEO BY KEYWORD</h4>
				<input class="form-control" value="${key}" type="text"
					name="keyword" placeholder="Keyword?">
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/keyword"
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
				<h4>FIND THE LIST FAVORITE VIDEO BY VIDEO_ID</h4>
				<input class="form-control" type="text" value="${video_id}"
					name="video" placeholder="VideoID?">
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/videoID"
					formmethod="post">Search</button>
				<hr>
				<table class='table table-bordered'>
					<tr>
						<td>Username</td>
						<td>Fullname</td>
						<td>Email</td>
						<td>Role</td>
					</tr>
					<c:forEach var="u" items="${u}">

						<tr>
							<td>${u.ID}</td>
							<td>${u.FULLNAME}</td>
							<td>${u.EMAIL}</td>
							<td>${u.ADMIN}</td>
						</tr>
					</c:forEach>


				</table>
				<hr>
				<h4>FIND VIDEO HAVE/ HAVEN'T FAVORITE</h4>
				<input <c:if test="${fav==true}">checked</c:if> type="radio"
					name="favori" value="true"> <label>Favorite</label> <input
					<c:if test="${fav==false}">checked</c:if> type="radio"
					name="favori" value="false"> <label>Not Favorite</label>
				<button class="btn btn-primary mt-1"
					formaction="/PS20520_NGUYENTHANHHA_LAB6/search/favorite"
					formmethod="post">Search</button>
				<hr>

				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="list" items="${list}">

						<tr>
							<td>${list.ID}</td>
							<td>${list.TITILE}</td>
							<td>${list.VIEWS}</td>
							<td>${list.ACTIVE}</td>
						</tr>
					</c:forEach>


				</table>

				<hr>
				<h4>TOTAL COUNT LIKE A VIDEO</h4>
				<table class='table table-bordered'>
					<tr>
						<td>ID</td>
						<td>Titile</td>
						<td>Views</td>
						<td>Active</td>
					</tr>
					<c:forEach var="lists" items="${total}">

						<tr>
							<td>${lists.group}</td>
							<td>${lists.like}</td>
							<td>${lists.newest}</td>
							<td>${lists.olsest}</td>
						</tr>
					</c:forEach>


				</table>
			</form>
		</div>
	</div>
</body>
</html>