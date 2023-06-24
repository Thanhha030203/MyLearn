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
<form action="/PS20520_NGUYENTHANHHA_LAB3/upload/file" method="post" enctype="multipart/form-data">
    <h3>Upload</h3>
    <label>Hình ảnh</label>
    <input type="file" name="photo_file">
    <br>
    <label>Tài liệu</label>
    <input type="file" name="doc_file">

    <hr>
    <button>Upload</button>
</form>
</body>
</html>