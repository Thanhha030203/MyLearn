<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<form action="/PS20520_NGUYENTHANHHA_LAB2/lab2/bai1" method="POST">
    <h3>Tam Giác</h3>
    <input type="text" name="canh_a" placeholder="cạnh a ? "> <br>
    <input type="text" name="canh_b" placeholder="cạnh b ?"> <br>
    <input type="text" name="canh_c" placeholder="cạnh c ?"> <br>
    <hr>
    <button>Tính diện tích</button>
    <button>Tính chu vi</button>
</form>

<h3>${result}</h3>
</body>
</html>