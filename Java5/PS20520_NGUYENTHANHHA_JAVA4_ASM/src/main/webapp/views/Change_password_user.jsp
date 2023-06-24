<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
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
<body>
    <!-- a -->
    <div class="container" style="width: 50%;">
       <form action="">
        <div>
            <div class="card">
                <div class="card-header">
                    <h4>CHANGE PASSOWRD</h4>
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-sm-6">
                            <label for="">USERNAME?</label> <br>
                            <input type="text" name="username_change_password" id="">
                        </div>
                        <div class="col-sm-6">
                            <label for="">CURRENT PASSWORD?</label> <br>
                            <input type="text" name="current_password" id="">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <label for="">NEW PASSWORD?</label> <br>
                            <input type="text" name="new_password" id="">
                        </div>
                        <div class="col-sm-6">
                            <label for="">CONFIRM NEW PASSWORD?</label> <br>
                            <input type="text" name="confirm_new_password" id="">
                        </div>
                    </div>
                </div>
                <div class="card-footer">
                    <button>Change</button>
                </div>
            </div>
        </div>
       </form>
    </div>
</body>
</html>