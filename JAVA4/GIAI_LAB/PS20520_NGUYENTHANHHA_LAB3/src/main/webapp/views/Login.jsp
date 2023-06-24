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
    <form action="/PS20520_NGUYENTHANHHA_LAB3/cookie" method="post">
        <h3>Login</h3>
        <mark>${message}</mark>
        <br>
        <label class="form-label">Username</label>

        <input class="form-control" type="text" name="username" value="${username}"> <br>
        <label>Password</label>
        <input class="form-control" type="password" name="password" value="${password}"> <br>
        <input type="checkbox" name="remember"><label class="form-label">Remember</label>
        <hr>
        <button>Login</button>
    </form>
</div>
</body>
</html>