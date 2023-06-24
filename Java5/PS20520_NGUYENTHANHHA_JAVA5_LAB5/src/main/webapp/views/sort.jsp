
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
        integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous" />
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
</head>
<body>
		<div class="container text-center my-5">
		<h4 class="text-primary">DANH SÁCH SẢN PHẨM</h4>
	</div>
	<div class="container" style="border: 1px solid #ddd;">
		<form action="/pro/sort">
			<select  name="field" class="form-select my-3 float-start" style="width: 100px">
			<option value="name">Tên sản phẩm</option>
				<option value="price">Giá</option>
				<option value="createDate">Ngày sản xuất</option>
				<option value="quantity">Số lượng</option>
			</select>
			<select  name="sorts" class="form-select float-start my-3" style="width: 200px">
				<option value="ASC">Tăng dần</option>
				<option value="DESC">Giảm dần</option>
			</select>
			<button class="btn btn-success float-start my-3">Lọc</button>
		</form>
		<div class="row my-5" style="clear: both;">
			<div class="col-sm-12">
				<table class="table table-hover table-bordered">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Price</th>
							<th scope="col">CreateDate</th>
							<th scope="col">Quantity</th>
						</tr>
					</thead>
							  <tbody>
		    <c:forEach items="${page.content}" var="p">
		    	<tr>
			      <th scope="row">${p.id}</th>
			      <td>${p.name}</td>
			      <td>${p.price}</td>
			      <td>${p.createDate}</td>
			      <td>${p.quantity}</td>
			    </tr>
		    </c:forEach>
		  </tbody>
				</table>
			</div>
			<nav aria-label="Page navigation example">
	  <ul class="pagination justify-content-center">
	  	<c:if test="${page.number == 0}">
	  		<li class="page-item disabled">
		      <a href="/pro/page?p=0" class="page-link"><i class="bi bi-chevron-double-left"></i></a>
		    </li>
		    <li class="page-item disabled">
		      <a href="/pro/sort?p=${page.number-1}" class="page-link" href="#"><i class="bi bi-chevron-left"></i></a>
		    </li>
	  	</c:if>
	  	<c:if test="${page.number != 0}">
	  		<li class="page-item">
		      <a href="/pro/page?p=0" class="page-link"><i class="bi bi-chevron-double-left"></i></a>
		    </li>
		    <li class="page-item">
		      <a href="/pro/page?p=${page.number-1}" class="page-link" href="#"><i class="bi bi-chevron-left"></i></a>
		    </li>
	  	</c:if>
	  	<c:if test="${page.number == page.totalPages-1}">
	  		<li class="page-item disabled">
		      <a href="/pro/page?p=${page.number+1}" class="page-link" href="#"><i class="bi bi-chevron-right"></i></a>
		    </li>
		    <li class="page-item disabled">
		      <a href="/pro/page?p=${page.totalPages-1}" class="page-link" href="#"><i class="bi bi-chevron-double-right"></i></a>
		    </li>
	  	</c:if>
	  	<c:if test="${page.number != page.totalPages-1}">
	  		<li class="page-item">
		      <a href="/pro/page?p=${page.number+1}" class="page-link" href="#"><i class="bi bi-chevron-right"></i></a>
		    </li>
		    <li class="page-item">
		      <a href="/pro/page?p=${page.totalPages-1}" class="page-link" href="#"><i class="bi bi-chevron-double-right"></i></a>
		    </li>
	  	</c:if>
	  </ul>
	</nav>
		</div>
	</div>
</body>
</html>