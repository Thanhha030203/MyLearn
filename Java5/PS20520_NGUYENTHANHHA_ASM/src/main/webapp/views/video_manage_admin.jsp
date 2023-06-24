<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
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
    <div class="container">
        <div>
            <ul class="nav nav-tabs" role="tablist">
                <li class="nav-item">
                  <a class="nav-link active" data-bs-toggle="tab" href="#video_edit">VIDEO EDIT</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" data-bs-toggle="tab" data-bs-target="#video_list" href="../admin/video_list">VIDEO LIST</a>
                </li>
              </ul>
            
              <!-- Tab panes -->
              <div class="tab-content">
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
                                <label for="">YOUTUBE ID?</label> <br>
                                <input type="text" name="youtube_id" id="" value="${videoitem.ID}"> <br>
                                <label for="">VIDEO TITLE?</label> <br>
                                <input type="text" name="video_title" id="" value="${videoitem.TITILE}"> <br>
                                <label for="">VIEW COUNT?</label> <br>
                                <input type="text" name="view_count" id="" value="${videoitem.VIEWS}"> <br>
                               
                            </div>
                        </div>
                        <label for="" >DESCRIPTION</label> <br>
                        <textarea name="description" id="" cols="50" rows="3">${videoitem.DESCRIPTION}</textarea>
                        <hr>
                       <div>
                           <div class="d-flex justify-content-end">
                            <button formaction="../admin/video_create" formmethod="post">Create</button>
                            <button formaction="../admin/video_update" formmethod="post">Update</button>
                            <button formaction="../admin/video_delete" formmethod="post">Delete</button>
                            <button formaction="../admin/video" formmethod="post">Reset</button>
                           </div>
                       </div>
                    </div>
                </div>
               </form>
                <div id="video_list" class="container tab-pane fade"><br>
                    <div>
                        <table class="table table-bordered">
                            <tr>
                                <td>Youtube Id</td>
                                <td>Video Title</td>
                                <td>View count</td>
                                <td>Status</td>
                                 <td>Poster</td>
                                <td>Edit</td>

                            </tr>
                           <c:forEach var="item" items="${listvideo}">
									<tr>
										<td>${item.ID}</td>
										<td>${item.TITILE}</td>
										<td>${item.VIEWS}</td>
										<td>${item.ACTIVE}</td>
										<td>${item.POSTER}</td>
										<td><a href="../admin/video_edit?id=${item.ID}">Edit</a></td>
									</tr>
								</c:forEach>
                        </table>
                    </div>
                    <hr>
                    <div>
                        <div style="float: left;">85 Videos</div>
                        <div style="float:right">
                        <button><img src="../icons/last.svg" alt=""></button>
                        <button><img src="../icons/previous.svg" alt=""></button>
                        <button><img src="../icons/next.svg" alt=""></button>
                        <button><img src="../icons/frist.svg" alt=""></button>
                        </div>
                    </div>
                </div>
               
              </div>
            </div>
        </div>
   
</body>

</html>