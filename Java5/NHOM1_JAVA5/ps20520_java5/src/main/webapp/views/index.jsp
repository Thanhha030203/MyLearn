<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>asm</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<form:form modelAttribute="UsersInfor" class="form-control my-5">
					<form:input path="id" class="form-control my-2"
						placeholder="UserID" />
					<form:input path="password" class="form-control my-2"
						placeholder="Password" />
					<form:input path="fullname" class="form-control my-2"
						placeholder="Fullname" />
					<form:input path="email" class="form-control my-2"
						placeholder="Email" />
					<br>
<label class="form-label">Role</label>
									<div class="form-control account-gender">
											<form:radiobuttons path="admin" items="${authss}" delimiter=" " /> <br>
									</div>
									<br>
					<form:button formaction="/admin/create" class="btn btn-success">Create</form:button>
					<form:button formaction="/admin/update" class="btn btn-primary">Update</form:button>
					<form:button formaction="/admin/delete" class="btn btn-danger">Delete</form:button>
					<form:button formaction="/admin/reset" class="btn btn-secondary">Reset</form:button>
				</form:form>
			</div>
			<div class="col-sm-6 my-5">
				<form action="/search/">
					<div class="input-group">
  <div class="form-outline">
    <input type="search" id="form1" class="form-control" name="search"  placeholder="Search"/>
   
  </div>
  <button formaction="/search" class="btn btn-primary">
   Search
  </button>
</div>
				</form>
			</div>
		</div>
		<div>
			<table class="table table-dark table-hover table-bordered">
				<thead>
					<tr>
						<th>UserID</th>
						<th>Password</th>
						<th>Fullname</th>
						<th>Email</th>
						<th>Role</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="u" items="${listUser}">
						<tr>
							<th>${u.id}</th>
							<th>${u.password}</th>
							<th>${u.fullname}</th>
							<th>${u.email}</th>
							<th><c:if test="${u.admin}">Admin</c:if> <c:if
									test="${u.admin == false}">User</c:if></th>
							<th><a href="/edit/${u.id}">Edit</a></th>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</body>
</html>