<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
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
		<header class="my-4">
			<div class="row">
				<div class="col-sm-10">
					<h3 style="color: green; padding-top: 20px">Online Shopping Mall</h3>
				</div>
				<div class="col-sm-2">
					<img width="90%" height="40px" alt="" src="images/linlin.png">
				</div>
			</div>
		</header>
		<nav>
			<%@include file="nav.jsp"%>
		</nav>
		<div class="bg-info">
		
			<article style="width: 75%; float: left">
				<div>
					<div class="row">
						<div class="col-sm-4">
							<jsp:include page="content.jsp">
								<jsp:param value="images/samsung_23_ultra.png" name="image" />
								<jsp:param value="Samsung 23 Ultra 2023" name="name" />
							</jsp:include>
						</div>
						<div class="col-sm-4">
							<jsp:include page="content.jsp">
								<jsp:param value="images/samsung_23_ultra.png" name="image" />
								<jsp:param value="Samsung 23 Ultra 2023" name="name" />
							</jsp:include>
						</div>
						<div class="col-sm-4">
							<jsp:include page="content.jsp">
								<jsp:param value="images/samsung_23_ultra.png" name="image" />
								<jsp:param value="Samsung 23 Ultra 2023" name="name" />
							</jsp:include>
						</div>
						<div class="col-sm-4">
							<jsp:include page="content.jsp">
								<jsp:param value="images/samsung_23_ultra.png" name="image" />
								<jsp:param value="Samsung 23 Ultra 2023" name="name" />
							</jsp:include>
						</div>
						<div class="col-sm-4">
							<jsp:include page="content.jsp">
								<jsp:param value="images/samsung_23_ultra.png" name="image" />
								<jsp:param value="Samsung 23 Ultra 2023" name="name" />
							</jsp:include>
						</div>
						<div class="col-sm-4">
							<jsp:include page="content.jsp">
								<jsp:param value="images/samsung_23_ultra.png" name="image" />
								<jsp:param value="Samsung 23 Ultra 2023" name="name" />
							</jsp:include>
						</div>
					</div>
				</div>
			</article>
			<aside style="width: 25%; float: left;">
				<%@ include file="aside.jsp"%>
				<%@ include file="aside2.jsp"%>
			</aside>
		</div>
		<div>
		<footer class="mt-4 text-center bg-secondary" style="clear: both; width: 100%; height: 50px; line-height: 50px">
			<p>FPT Polytechnic @2020. All rights reserved</p>
		</footer></div>
	</div>
</body>
</html>