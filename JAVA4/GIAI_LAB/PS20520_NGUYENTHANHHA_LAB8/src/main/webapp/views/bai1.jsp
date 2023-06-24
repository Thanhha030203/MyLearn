<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>

    <!-- 	<base href="${pageContext.servletContext.contextPath}/">  -->
    <meta charset="utf-8"/>
    <title>Tổ chức giao diện</title>
    <link href="../css/layout.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <header>
        <h1>FPT POLYTECHNIC</h1>
    </header>
    <nav>
        <!--  -->
        <c:url var="home" value="/home"/>
        <a href="${home}/index">Trang chủ</a> |
        <a href="${home}/about">Giới thiệu</a> |
        <a href="${home}/contact">Liên hệ</a> |


        <!--
			   <fmt:setLocale value="${sessionScope.lang}" scope="request" />
			   <fmt:setBundle basename="global" scope="request"/>
               <c:url var="home" value="/home"/> 
               <a href="${home}/index"> <fmt:message key="menu.home"/></a> |
               <a href="${home}/about"> <fmt:message key="menu.about"/></a> |
               <a href="${home}/contact"> <fmt:message key="menu.contact"/> </a> |
               <a href="?lang=en">English</a> |
               <a href="?lang=vi">Tiếng Việt</a>     
             -->

    </nav>
    <article>
        <jsp:include page="${view}"/>
    </article>
    <aside>CONTROL PANEL</aside>
    <footer>&copy; 2021 by Poly. All rightf reserved</footer>
</div>
</body>
</html>
