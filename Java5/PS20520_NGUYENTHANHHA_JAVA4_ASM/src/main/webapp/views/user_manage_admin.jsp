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
    <div class="container">
        <div>
            <ul class="nav nav-tabs" role="tablist">
                <li class="nav-item">
                  <a class="nav-link active" data-bs-toggle="tab" href="#user_edit">USER EDIT</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" data-bs-toggle="tab" href="#user_list">USER LIST</a>
                </li>

              </ul>
            
              <!-- Tab panes -->
              <div class="tab-content">
                <div id="user_edit" class="container tab-pane active"><br>
                    <div>
                       <div>
                        <div class="row">
                            <div class="col-sm-6">
                                <label for="">USERNAME?</label> <br>
                                <input type="text" name="username_edit_profile" id="">
                            </div>
                            <div class="col-sm-6">
                                <label for="">PASSWORD?</label> <br>
                                <input type="text" name="password_edit_profile" id="">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <label for="">FULLNAME?</label> <br>
                                <input type="text" name="fullname_edit_profile" id="">
                            </div>
                            <div class="col-sm-6">
                                <label for="">EMAIL ADDRESS?</label> <br>
                                <input type="text" name="email_address" id="">
                            </div>
                        </div>
                       </div>
                    
                        <hr>
                       <div>
                           <div class="d-flex justify-content-end">
                            <button>Create</button>
                            <button>Update</button>
                            <button>Delete</button>
                            <button>Reset</button>
                           </div>
                       </div>
                    </div>
                </div>
                <div id="user_list" class="container tab-pane fade"><br>
                    <div>
                        <table class="table table-bordered">
                            <tr>
                                <td>Username</td>
                                <td>Password</td>
                                <td>Fullname</td>
                                <td>Email</td>
                                <td>Role</td>
                                <td>Edit</td>

                            </tr>
                            <tr>
                                <td>TenNV</td>
                                <td>123456</td>
                                <td>Nguyá»n VÄn TÃ¨o</td>
                                <td>tennv@gmail.com</td>
                                <td>Admin</td>
                                <td><a href="#">Edit</a></td>

                            </tr>
                        </table>
                    </div>
                    <hr>
                    <div>
                        
                        <div style="float:right">
                        <button><img src="icons/last.svg" alt=""></button>
                        <button><img src="icons/previous.svg" alt=""></button>
                        <button><img src="icons/next.svg" alt=""></button>
                        <button><img src="icons/frist.svg" alt=""></button>
                        </div>
                    </div>
                </div>
               
              </div>
            </div>
        </div>
    </div>
</body>

</html>