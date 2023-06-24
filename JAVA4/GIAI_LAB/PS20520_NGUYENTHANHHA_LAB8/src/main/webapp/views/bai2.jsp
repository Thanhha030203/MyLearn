<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
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

</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark" style="z-index: 999">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">ONLINE ENTERTAINMENT</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">My favorite</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../lab8/sign-in">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../lab8/change-password">Fotgot-password</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../lab8/edit-profile">profile</a>
                    </li>

                </ul>
            </div>
        </div>
    </nav>

    <div>

        <div>
            <jsp:include page="${view}"/>
        </div>

    </div>
</div>
</body>
</html>