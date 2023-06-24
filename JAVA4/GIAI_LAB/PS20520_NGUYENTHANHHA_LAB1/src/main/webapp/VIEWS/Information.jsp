<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="View.css">
</head>
<body>
	<div
		style="height: 250px; width: 500px; border: 2px solid black; background-color: light; margin: 10px auto">
		<h3 style=" 	margin: 20px 20%;">THÔNG TIN HÌNH CHỮ NHẬT</h3>
		<form action="/PS20520_NGUYENTHANHHA_LAB1/form/as" method="POST"
			style="margin: 10px 50px; width: 80%;">
			<label style="font-weight: 500; font-size: 18px">Chiều rộng :
			</label> <input
				style="margin: 10px 0px;height: 25px; width: 200px; border: 1px solid black; border-radius: 5px"
				type="text" name="width_first"> <br> <label
				style="font-weight: 500; font-size: 18px">Chiều dài : </label> <input
				style="	height: 25px;width: 200px;border : 1px solid black;margin: 10px 0px;
	border-radius: 5px"
				type="text" name="height_first"> <br>
			<button
				style="width: 100px; height: 30px; font-size: 18px; font-weight: 500; background-color: lightgreen; border: 1px solid lightgray; margin: 10px 30%; border-radius: 5px">Tính</button>
		</form>
	</div>
</body>
</html>