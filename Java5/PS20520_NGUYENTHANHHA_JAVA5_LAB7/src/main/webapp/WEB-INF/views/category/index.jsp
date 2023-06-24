<%@ page pageEncoding="utf-8" %>

	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="utf-8">
		<title>Category Management</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
		<link rel="stylesheet" href="../../css/product.css">
		<style>
			body {
				position: relative;
				background-image: url('https://media.zicxa.com/6923290');
				background-size: cover;
				background-repeat: no-repeat;
				background-attachment: fixed;
			}

			a {
				text-decoration: none;
			}

			input {
				border: none;
				border-bottom: 1px solid #999;
				border-radius: none;
				background: none;
				color: white;
			}

			button {
				border: none;
				background: none;
			}

			.titles, .titles a, .titles1 {
				color: rgb(186, 217, 255);
				font-weight: 600;
			}
			.titles1{
				float: right;
				margin-right: 10px;
			}
			.titles1:hover{
				float: right;
				margin-right: 10px;
				color: azure;
			}
			table {
				border: #b6b6b6 !important;
			}
			td a{
				color: rgb(223, 124, 124);
				font-weight: 600;
			}
		</style>
	</head>

	<body>
		<div class="container-fluid mt-5 w-50">
			<h3 class="text-light text-center pb-4">CATEGORY MANAGEMENT</h3>
			<jsp:include page="_form.jsp" />
			
		</div>

	</body>

	</html>