<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-81">
    <title>Insert title here</title>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
            crossorigin="anonymous">
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet"
          href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
          integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm"
          crossorigin="anonymous"/>
    <script
            src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    <script
            src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
</head>
<body>
<div class="container">
    <div style="width: 50%; margin: 10px auto; border: 1px solid #666">
        <form style="margin: 20px 30px">
            <h3 class="text-center">Sign-in</h3>
            <hr>
            <label class="form-label">UserName</label>
            <input class="form-control" type="text" placeholder="UserName?" name="user_sign-in"> <br>
            <label class="form-label">Password</label>
            <input class="form-control" type="password" placeholder="Password?" name="password_sign-in">
            <hr>
            <button formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/sign-in" formmethod="post" class="btn">
                Sign-in
            </button>
            <span class="vr"></span>
            <button formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/sign-up" class="btn">No account</button>
            <button formaction="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/forgot-password" class="btn">Forgot password
            </button>
        </form>
        <hr>
        <div style="margin:20px 20px 20px 10px; color:red; font-weight: 600" class="text-center">
            <div>${message_sign_in}</div>
        </div>
    </div>
</div>
</body>
</html>