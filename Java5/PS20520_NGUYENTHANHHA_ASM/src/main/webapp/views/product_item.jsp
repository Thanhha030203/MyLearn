<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
        integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous" />
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
</head>
<body style="background-color:rgb(240, 243, 244);">
    <div>
        <header class="container-fluid bg-white pos"
            style="background-color: white; z-index: 999; border-bottom: 1px solid rgba(0, 0, 0, 0.175);">

            <div class="row pt-3 ">
                <div class="col-sm-5 text-end">
                    <h5 style="text-decoration: underline; font-weight: bold;    color: #222222;    font-size: 20px;">
                        Sản phẩm</h5>
                </div>
                <div class="col-sm-7 text-start">
                    <h5 style="  color: #222222;font-weight: 500;    font-size: 17px;">Nhà sản xuất</h5>
                </div>
            </div>
            <div class="row ">
                <div class="col-sm-3 pt-0 mt-3 text-center">
                    <a href="#" style="line-height: 40px;"><img
                            src="../images/linlin-low-resolution-logo-color-on-transparent-background.png" class="ms-4"
                            height="55%" width="60%" alt=""></a>
                </div>
                <div class="col-sm-7 mt-3">
                    <div class="input-group flex-nowrap rounded-pill">
                        <input type="text" class="form-control "
                            style="border: 2px solid #2F87E9;border-top-left-radius:20px;border-bottom-left-radius:20px;"
                            placeholder="Tìm kiếm tại đây" ng-model="SearchText" aria-label="Username"
                            aria-describedby="addon-wrapping">
                        <!-- <label for="">{{SearchText}}</label> -->
                        <a href="#">
                            <button class=""
                                style="background-color: #2F87E9;width: 150px; height: 40px; border: none; color: #fff;border-top-right-radius:20px;border-bottom-right-radius:20px; "
                                type="button">
                                <img src="icons/icon/seach1.png" alt="">
                                Tìm kiếm
                            </button>
                        </a>
                    </div>
                </div>
                <div class="col-sm-2 mt-2 mb-4">
                    <div class="d-flex flex-nowrap me-2" style="font-size:14px; line-height: 50px;">
                        <div class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
                                ADMIN TOOL</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="../admin/Home">Home</a></li>
                                <li><a class="dropdown-item" href="../admin/user">User</a></li>
                                <li><a class="dropdown-item" href="../admin/video">Video</a></li>
                                <li><a class="dropdown-item" href="#">Report</a></li>
                              
                            </ul>
                        </div>
                        <div class="nav-item dropdown ms-3">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">MY
                                ACCOUNT</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">login</a></li>
                                <li><a class="dropdown-item" href="#">Fogot Password</a></li>
                                <li><a class="dropdown-item" href="#">Registration</a></li>
                                <li><a class="dropdown-item" href="#">Logoff</a></li>
                                <li><a class="dropdown-item" href="#">Change Password</a></li>
                                <li><a class="dropdown-item" href="#">Edit Profile</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>

        </header>
    </div>
    <nav class="container-fluid navbar navbar-expand-lg navbar-light bg-white" style="height: 40px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse " id="mynavbar">
            <ul class="navbar-nav" style="margin-left: 20px; margin-top: -10px;">
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Mới nhất</a>
                </li>

                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Yêu thích
                        nhất</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phim chiếu rạp</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phim lẻ</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phim bộ</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phổ biến</a>
                </li>
                <li class="nav-item dropdown nav-tabs">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#"
                        class="nav-link dropdown-toggle " data-bs-toggle="dropdown"> Quốc gia</a>
                </li>
                <li class="nav-item dropdown nav-tabs">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#"
                        class="nav-link dropdown-toggle " data-bs-toggle="dropdown"> Thể loại</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Trợ giúp</a>
                </li>
            </ul>
        </div>
        <ul class="navbar-nav">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#" class="nav-link"
                        data-bs-toggle="tab">Tải ứng dựng</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#ngonngu"
                        class="nav-link dropdown-toggle" data-bs-toggle="tab">Tiếng Việt-USD</a>
                </li>


            </ul>

        </ul>

    </nav>
<div class="container" style="width: 60%">

		  <form action="">
               	 <div id="video_edit" class="container tab-pane active"><br>
                    <div>
                        <div class="row border-1">
                            <div class="col-sm-5">
                                <div>
                                    <img src="../images/${videoitem.POSTER}"  width="90%" height="300px" name="images_video_edit" alt="">
                                </div>
                            </div>
                            <div class="col-sm-7">
                                <label for="" class="form-label">YOUTUBE ID?</label> <br>
                                <input type="text" class="form-control" name="youtube_id" id="" value="${videoitem.ID}"> <br>
                                <label for="" class="form-label">VIDEO TITLE?</label> <br>
                                <input type="text"  class="form-control" name="video_title" id="" value="${videoitem.TITILE}"> <br>
                                <label for=""  class="form-label">VIEW COUNT?</label> <br>
                                <input type="text"   class="form-control" name="view_count" id="" value="${videoitem.VIEWS}"> <br>
                               
                            </div>
                        </div>
                        <label for=""  class="form-label">DESCRIPTION</label> <br>
                        <textarea name="description" id="" cols="50" rows="3">${videoitem.DESCRIPTION}</textarea>
                        <hr>
                       <div>
                           <div class="d-flex justify-content-end">

                            <button formaction="../admin/product_item" formmethod="post">Delete</button>
                           </div>
                       </div>
                    </div>
                </div>
               </form>
</div>
</body>
</html>