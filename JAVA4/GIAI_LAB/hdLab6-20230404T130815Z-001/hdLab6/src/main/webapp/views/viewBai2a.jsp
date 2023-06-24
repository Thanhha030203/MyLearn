<%@ page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<style>
input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
	-webkit-appearance: none;
	margin: 0;
}

input[type=number] {
	-moz-appearance: textfield;
}
</style>
</head>

<body>
	<div class="container">
		<div class="container-fluid row mt-5">
			<div class="col-4">
				<form action="Bai2a" method="post" class="form-inline">
					<div class="form-group">
						<input type="text" class="form-control" name="id"
							placeholder="Input ID" />
					</div>
					<div class="form-group">
						<button class="btn btn-outline-primary ml-2">Search</button>
					</div>
				</form>
				<div class="border border-primary mt-2 p-1">
					<h5>
						Fullname : <span class="text-primary">${user.fullname}</span>
					</h5>
					<h5>
						Email : <span class="text-danger">${user.email}</span>
					</h5>
				</div>
			</div>
			<div class="col-8">
				<table class="table table-bordered">
					<thead class="thead-dark text-center">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Title</th>
							<th scope="col">Views</th>
							<th scope="col">Active</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${favorite}">
							<tr>
								<th scope="row" class="text-center">${item.getVideo().getId()}</th>
								<td>${item.getVideo().getTitle()}</td>
								<td class="text-center text-primary">${item.getVideo().getViews()}</td>
								<td class="text-center text-danger">${item.getVideo().getActive()}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>