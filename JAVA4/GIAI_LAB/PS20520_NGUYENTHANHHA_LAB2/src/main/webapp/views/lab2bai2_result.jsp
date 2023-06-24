<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/PS20520_NGUYENTHANHHA_LAB2/Bai2Lab2">
        <h3>Thông tin đăng ký</h3>
        <ul>
            <li>Tên đăng nhập : <strong>${param.username}</strong></li>
            <li>Mật khẩu : <strong>${param.password}</strong></li>
            <li>Giới tính : <strong>${param.gender}</strong></li>
            <li>Tình trạng hôn nhân : <strong>${param.married}</strong></li>
            <li>Quốc tịch : <strong>${param.nationality}</strong></li>

            <li>Ghi chú : <strong>${param.note}</strong></li>
        </ul>
    </form>
</div>

</body>
</html>