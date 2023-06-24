<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/index.css">
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
                        Sáº£n pháº©m</h5>
                </div>
                <div class="col-sm-7 text-start">
                    <h5 style="  color: #222222;font-weight: 500;    font-size: 17px;">NhÃ  sáº£n xuáº¥t</h5>
                </div>
            </div>
            <div class="row ">
                <div class="col-sm-3 pt-0 mt-3 text-center">
                    <a href="#" style="line-height: 40px;"><img
                            src="images/linlin-low-resolution-logo-black-on-transparent-background.png" class="ms-4"
                            height="55%" width="60%" alt=""></a>
                </div>
                <div class="col-sm-7 mt-3">
                    <div class="input-group flex-nowrap rounded-pill">
                        <input type="text" class="form-control "
                            style="border: 2px solid #2F87E9;border-top-left-radius:20px;border-bottom-left-radius:20px;"
                            placeholder="TÃ¬m kiáº¿m táº¡i ÄÃ¢y" ng-model="SearchText" aria-label="Username"
                            aria-describedby="addon-wrapping">
                        <!-- <label for="">{{SearchText}}</label> -->
                        <a href="#">
                            <button class=""
                                style="background-color: #2F87E9;width: 150px; height: 40px; border: none; color: #fff;border-top-right-radius:20px;border-bottom-right-radius:20px; "
                                type="button">
                                <img src="icons/icon/seach1.png" alt="">
                                TÃ¬m kiáº¿m
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
                                <li><a class="dropdown-item" href="#">Home</a></li>
                                <li><a class="dropdown-item" href="#">User</a></li>
                                <li><a class="dropdown-item" href="#">Video</a></li>
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
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Má»i nháº¥t</a>
                </li>

                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">YÃªu thÃ­ch
                        nháº¥t</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phim chiáº¿u ráº¡p</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phim láº»</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phim bá»</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Phá» biáº¿n</a>
                </li>
                <li class="nav-item dropdown nav-tabs">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#"
                        class="nav-link dropdown-toggle " data-bs-toggle="dropdown"> Quá»c gia</a>
                </li>
                <li class="nav-item dropdown nav-tabs">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#"
                        class="nav-link dropdown-toggle " data-bs-toggle="dropdown"> Thá» loáº¡i</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="" class="nav-link">Trá»£ giÃºp</a>
                </li>
            </ul>
        </div>
        <ul class="navbar-nav">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#" class="nav-link"
                        data-bs-toggle="tab">Táº£i á»©ng dá»±ng</a>
                </li>
                <li class="nav-item">
                    <a style="color: #333; font-size: 16px; font-weight: 400;" href="#ngonngu"
                        class="nav-link dropdown-toggle" data-bs-toggle="tab">Tiáº¿ng Viá»t-USD</a>
                </li>


            </ul>

        </ul>

    </nav>
<%@ include file="content.jsp" %>
		<%@ include file="footer.jsp" %>
   
</body>

</html>