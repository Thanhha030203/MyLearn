<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Document</title>
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
		<form action="">
			<div>
				<ul class="nav nav-tabs" role="tablist">
					<li class="nav-item"><a class="nav-link active"
						data-bs-toggle="tab" href="#user_edit">USER EDIT</a></li>
					<li class="nav-item"><a class="nav-link" data-bs-toggle="tab"
						data-bs-target="#user_list" href="../admin/user_list">USER
							LIST</a></li>

				</ul>
				<!-- Tab panes -->
				<div class="tab-content">
					<div id="user_edit" class="container tab-pane active">
						<br>
						<div class="container" style="width: 40%">
							<div>
									<h4>Edit Profile</h4>
									<nav class="navbar navbar-expand-sm bg-light navbar-light">
										<div class="container-fluid">
											<ul class="navbar-nav">
												<li class="nav-item">
													<button class="btn"
														formaction="../admin/delete_user" formmethod="post">Delete</button>
												</li>
												<li class="nav-item">
													<button class="btn"
														formaction="../admin/user_edit" formmethod="post">Update</button>
												</li>
											</ul>
										</div>
									</nav>
									<hr>
									<label class="form-label">UserName</label> <input
										value="${useredit.ID}" type="text" placeholder="UserName?"
										name="username_edit_profile" class="form-control"> <br> <label
										class="form-label">Password</label> <input
										value="${useredit.PASSWORD}" type="password"
										placeholder="Password?" name="password_edit_profile"
										class="form-control"> <br> <label
										class="form-label">FullName</label> <input
										value="${useredit.FULLNAME}" type="text" placeholder="Fullname?"
										name="fullname_edit_profile" class="form-control"> <br> <label
										class="form-label">Email Address</label> <input
										 value="${useredit.EMAIL}" type="email" placeholder="Eamil?"
										name="email_address" class="form-control"> <br>
									<hr>
									<h5>${Message_edit}</h5>
							</div>
						</div>
					</div>
		
					<div id="user_list" class="container tab-pane fade">
						<br>
						<div>
							<table class="table table-bordered">
								<tr>
									<td>Username</td>
									<td>Password</td>
									<td>Fullname</td>
									<td>Email</td>
									<td>Role</td>
									<td>Edit</td>

								</tr>
								<c:forEach var="user" items="${listuser}">
									<tr>
										<td>${user.ID}</td>
										<td>${user.PASSWORD}</td>
										<td>${user.FULLNAME}</td>
										<td>${user.EMAIL}</td>
										<td>${user.ADMIN}</td>
										<td><a href="../admin/user_edit?id=${user.ID}">Edit</a></td>
									</tr>
								</c:forEach>
							</table>
						</div>
						<hr>
						<div>

							<div style="float: right">
								<button>
									<img src="../icons/last.svg" alt="">last
								</button>
								<button>
									<img src="../icons/previous.svg" alt="">prev
								</button>
								<button>
									<img src="../icons/next.svg" alt="">next
								</button>
								<button>
									<img src="../icons/frist.svg" alt="">last
								</button>
							</div>
						</div>
					</div>

				</div>
			</div>
		</form>
	</div>

</body>

</html>