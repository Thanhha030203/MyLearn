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
<div class="container" style="width: 60%">
    <form action="/PS20520_NGUYENTHANHHA_LAB5_JAVA/account/sendmail">
        <h3>Send Mail</h3>
        <label class="form -label">Your To :</label> <input class="form-control" type="email" name="to"> <br>

        <label class="form -label">UserName :</label> <input class="form-control" type="text" name="u"> <br>
        <hr>
        <button class="btn btn-primary float-end">Send</button>
    </form>
</div>
</body>
</html>
>