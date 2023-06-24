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
                  <a class="nav-link active" data-bs-toggle="tab" href="#video_edit">VIDEO EDIT</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" data-bs-toggle="tab" href="#video_list">VIDEO LIST</a>
                </li>

              </ul>
            
              <!-- Tab panes -->
              <div class="tab-content">
                <div id="video_edit" class="container tab-pane active"><br>
                    <div>
                        <div class="row border-1">
                            <div class="col-sm-5">
                                <div>
                                    <img src="images/mono_waitngforyou.jpg" width="100%" height="100%" name="images_video_edit" alt="">
                                </div>
                            </div>
                            <div class="col-sm-7">
                                <label for="">YOUTUBE ID?</label> <br>
                                <input type="text" name="youtube_id" id=""> <br>
                                <label for="">VIDEO TITLE?</label> <br>
                                <input type="text" name="video_title" id=""> <br>
                                <label for="">YVIEW COUNT?</label> <br>
                                <input type="text" name="view_count" id=""> <br>
                                <input type="checkbox" name="active_video_edit" id=""><label for="">ACTIVE</label>
                                <input type="checkbox" name="inactive_video_edit" id=""><label for="">INACTIVE</label>
                            </div>
                        </div>
                        <label for="">DESCRIPTION</label> <br>
                        <textarea name="" id="" cols="50" rows="3"></textarea>
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
                <div id="video_list" class="container tab-pane fade"><br>
                    <div>
                        <table class="table table-bordered">
                            <tr>
                                <td>Youtube Id</td>
                                <td>Video Title</td>
                                <td>View count</td>
                                <td>Status</td>
                                <td>Edit</td>

                            </tr>
                            <tr>
                                <td>Ytet_bRiRCU</td>
                                <td>LÃ¢u ghÃª má»i gáº·p</td>
                                <td>105</td>
                                <td>Active</td>
                                <td><a href="#">Edit</a></td>

                            </tr>
                        </table>
                    </div>
                    <hr>
                    <div>
                        <div style="float: left;">85 Videos</div>
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