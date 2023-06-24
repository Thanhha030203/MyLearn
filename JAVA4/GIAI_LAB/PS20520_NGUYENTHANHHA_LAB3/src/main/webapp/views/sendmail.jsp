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
    <form action="/PS20520_NGUYENTHANHHA_LAB3/sendmail" method="post" enctype="multipart/form-data">
        <h3>Send Mail</h3>
        <h5>${message}</h5>
        <label class="form -label">From :</label> <input class="form-control" type="email" name="from"> <br>
        <label class="form -label">To : </label> <input class="form-control" type="email" name="to"> <br>
        <label class="form -label">CC :</label> <input class="form-control" type="email" name="cc"> <br>
        <label class="form -label">Bcc :</label> <input class="form-control" type="email" name="bcc"> <br>
        <label class="form -label">Subject</label> <input class="form-control" type="text" name="subject"> <br>
        <label class="form -label">Body</label>

        <textarea rows="5" cols="20" name="body" class="form-control"></textarea> <br>
        <input type="file" name="file_mail">
        <hr>
        <button class="btn btn-primary float-end">Send</button>
    </form>
</div>
</body>
</html>