<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>

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
		<div class="row">
			<c:forEach var="item" items="${list}">
			
				<div class="col-sm-4 my-2">
					<div class="card" data-bs-toggle="card">
						<div class="card-header">
							<h5>Tên sản phẩm : ${item.name}</h5>
						</div>
						<div class="card-body">
							<div>
								<a href="prod"><img alt="" style="width: 100%; height: 200px"
									src="images/${item.image}"></a>
							</div>
							<div>
								<ul>
									<li>Giá gốc : ${item.price}</li>
									<li>Giá mới : <c:set var="newprice"
											value="${item.price *(1-item.discount)}"></c:set> <fmt:formatNumber
											value="${newprice}"></fmt:formatNumber>
									</li>
									
									<li>Mức giá : <c:choose>
											<c:when test="${newprice <10}">Giá thấp</c:when>
											<c:when test="${newprice > 100}">Giá cao</c:when>
											<c:otherwise>Bình thường</c:otherwise>
										</c:choose>
									</li>
								</ul>
							</div>
						</div>
						<div class="card-footer">
							<h5>Tên sản phẩm ${item.date}</h5>
						</div>
					</div>
					</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>