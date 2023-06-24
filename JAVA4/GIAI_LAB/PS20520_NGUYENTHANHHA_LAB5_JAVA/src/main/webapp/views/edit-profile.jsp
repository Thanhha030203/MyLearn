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
	<div class="container" style="width: 40%">
		<div>
			<c:choose>
				<c:when test="${empty sessionScope.user}">
Welcome you
</c:when>
				<c:otherwise>
Welcome ${sessionScope.user.fullname}
<a href="/fpoly/account/sign-out">Đăng xuất</a>
					<c:if test="${sessionScope.user.admin}">
						<a href="/fpoly/admin/home/index">Quản trị</a>
					</c:if>
				</c:otherwise>
			</c:choose>

			<form action="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/edit-profile"
				method="post">
				<h4>Edit Profile</h4>
				<nav class="navbar navbar-expand-sm bg-light navbar-light">
					<div class="container-fluid">
						<ul class="navbar-nav">
							<li class="nav-item">
								<button class="btn"
									formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/delete">Delete</button>
							</li>
							<li class="nav-item">
								<button class="btn"
									formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/update">Update</button>
							</li>
						</ul>
					</div>
				</nav>
				<hr>
				<label class="form-label">UserName</label> <input disabled
					value="${user.id}" type="text" placeholder="UserName?"
					name="id_edit" class="form-control"> <br> <label
					class="form-label">Password</label> <input disabled
					value="${user.password}" type="password" placeholder="Password?"
					name="password_edit" class="form-control"> <br> <label
					class="form-label">FullName</label> <input value="${user.fullname}"
					type="text" placeholder="Fullname?" name="edit_name"
					class="form-control"> <br> <label class="form-label">Email
					Address</label> <input value="${user.email}" type="email"
					placeholder="Eamil?" name="Email_edit" class="form-control">
				<br>


				<hr>
				<h5>${Message_edit}</h5>

			</form>
		</div>
	</div>
</body>
</html>