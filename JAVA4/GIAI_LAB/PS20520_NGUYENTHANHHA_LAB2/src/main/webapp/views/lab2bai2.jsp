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
    <form action="/PS20520_NGUYENTHANHHA_LAB2/Bai2Lab2" method="post" class="form_control">
        <h3>Đăng Ký</h3>
        <br>
        <label class="form-label">Tên đăng nhập : </label>
        <input type="text" name="username" class="form-control" placeholder="tên ? "> <br>
        <label class="form-label">Mật khẩu : </label>
        <input type="password" name="password" class="form-control" placeholder="mật khẩu ? "> <br>
        <label>Giới tính : </label>
        <input type="radio" name="gender" value="Nam"> <label>Nam</label>
        <input type="radio" name="gender" value="Nữ"> <label>Nữ</label>
        <br>
        <input type="checkbox" name="married" value="ĐÃ kết hôn"> <label>Tình trạng hôn nhân</label> <br>
        <label class="form-label">Quốc tịch</label>
        <select name="nationality" class="form-control">
            <option>United States</option>
            <option>Viet Nam</option>
            <option>China</option>
            <option>Canada</option>
            <option>India</option>
        </select>
        <br>
        <label>Ghi chú</label>
        <textarea rows="5" cols="20" class="form-control" name="note"></textarea>
        <br>
        <hr>
        <button>Đăng ký</button>
    </form>
</div>

</body>
</html>