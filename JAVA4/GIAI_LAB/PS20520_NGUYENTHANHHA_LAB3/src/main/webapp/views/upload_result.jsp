<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8
">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>
<h4>Hình : ${img.name}</h4>
<img alt="" src="/PS20520_NGUYENTHANHHA_LAB3/files/${img.name}">

<h4>Document : ${doc.name}</h4>
<img alt="" src="/PS20520_NGUYENTHANHHA_LAB3/files/${doc.name}">
</body>
</html>