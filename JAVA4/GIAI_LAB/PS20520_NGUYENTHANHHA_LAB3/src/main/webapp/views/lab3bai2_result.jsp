<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
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
</head>
<body>
<div class="container">
    <form action="/PS20520_NGUYENTHANHHA_LAB3/Bai2Lab3">
        <h3>Thông tin đăng ký</h3>
        <ul>
            <li>Tên đăng nhập : <strong>${user.username}</strong></li>
            <li>Ngày sinh : <strong>${user.brith}</strong></li>
            <li>Mật khẩu : <strong>${user.password}</strong></li>
            <li>Giới tính : <strong>${user.gender}</strong></li>
            <li>Tình trạng hôn nhân : <strong>${user.married}</strong></li>
            <li>Quốc tịch : <strong>${user.nationality}</strong></li>
            <li>Sở thích : <strong>${user.favorites}</strong></li>
            <li>Ghi chú : <strong>${user.note}</strong></li>
        </ul>
    </form>
</div>

</body>
</html>