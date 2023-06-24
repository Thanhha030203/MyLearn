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
	<div class="container">
		<div
			style="width: 40%; margin: 10px auto; border: 1px solid #666; border-radius: 10px">
			<form style="margin: 20px 30px">
				<h4 class="text-center">SIGN-UP ACCOUNT</h4>

				<hr>
				<label class="form-label">UserName</label> <input value="${id}"
					type="text" placeholder="UserName?" name="id" class="form-control">
				<br> <label class="form-label">Password</label> <input
					value="${pass}" type="password" placeholder="Password?"
					name="password" class="form-control"> <br> <label
					class="form-label">FullName</label> <input value="${fullname}"
					type="text" placeholder="Fullname?" name="fullname"
					class="form-control"> <br> <label class="form-label">Email
					Address</label> <input value="${mail}" type="email" placeholder="Eamil?"
					name="Email" class="form-control"> <br> <label
					class="form-label">Role</label> <br> <input type="radio"
					name="admin" value="true"
					<c:if test="${admin == true}">checked</c:if>> <label>Admin</label>
				<input type="radio" name="admin" value="false"
					<c:if test="${admin ==false}">checked</c:if>> <label>User</label>
				<br>
				<hr>
				<div>
					<div class="float-start">
						<button class="btn btn-white"
							formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/sign-in">Back</button>
					</div>
					<div class="float-end">
						<button class="btn btn-white"
							formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/sign-up"
							formmethod="post">Create account</button>
					</div>
				</div>

			</form>
			
			<div style="margin:50px 10px 10px 10px; color:green; font-weight: 600">
			<hr>
				<div><img src="${icon}"></div>
				<div>${Message}</div>
			</div>
		</div>
	</div>
</body>
</html>