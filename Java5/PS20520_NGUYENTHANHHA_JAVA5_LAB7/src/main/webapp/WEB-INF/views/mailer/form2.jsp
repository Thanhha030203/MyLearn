<%@ page pageEncoding="utf-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<base href="${pageContext.servletContext.contextPath}/">
		<meta charset="utf-8" />
		<title>Send email</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<style>
			.main {
				border-radius: 10px;
				background: rgb(201, 223, 169);
				margin: 200px 0 0 30%;
				width: 40%;
				height: 350px;
				padding: 10px 20px 0 20px;
			}
			input{
				width: 100%;
			}
			button {
				width: 70px;
				background: black;
				margin-left: calc(100% - 70px);
				border-radius: 3px;
				color: white;
			}
			.subject, .body{
				width: 96%;
				margin-left: 2%;
			}
			button:hover {
				width: 70px;
				background: white;
				margin-left: calc(100% - 70px);
				border-radius: 3px;
				color: black;
			}
			.forms, .to, .subject{
				border: none;
				border-bottom: 1px solid #000;
				background: none;
			}
		</style>
	</head>

	<body>
		<div class="container-fluid main">
			${message}
			<form action="mailer/send2.htm" method="post" enctype="multipart/form-data">
				<div class="row">
					<div class="col-6 mt-4">
						<input class="forms" name="from" placeholder="From">
					</div>
					<div class="col-6 mt-4">
						<input class="to" name="to" placeholder="To">
					</div>
					<input class="mt-4 subject" name="subject" placeholder="Subject">
					<textarea class="mt-4 body" name="body" placeholder="Body" rows="3" cols="50"></textarea>
					<input class="mt-4 image" type="file" name="attach">
				</div>
				<button class="mt-4">Send</button>
			</form>
		</div>
	</body>

	</html>