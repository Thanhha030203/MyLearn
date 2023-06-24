<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
        <meta charset="utf-8" />
        <title>Validation & Interceptor</title>
        <base href="${pageContext.servletContext.contextPath}/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                crossorigin="anonymous">
        <style>
                .main{
                        border-radius: 10px;
                        background: rgb(201, 223, 169);
                        margin: 200px 0 0 40%;
                        width: 20%;
                        height: 250px;
                        padding: 10px 20px 0 20px;
                }
                input{
                        width: 100%;
                }
                button{
                        width: 70px;
                        background: black;
                        margin: 20px 0 0 calc(50% - 35px);
                        border-radius: 3px;
                        color: white;
                }
                button:hover{
                        width: 80px;
                        background: white;
                        margin: 20px 0 0 calc(50% - 40px);
                        border-radius: 3px;
                        color: black;
                }
        </style>
</head>

<body>
        <div class="container-fluid main">
                <h2 class="text-center">LOGIN</h2>
                ${message}
                <form action="user/login" method="post">
                        <div>
                                <label class="mb-2">Username</label><br>
                                <input name="id" />
                        </div>

                        <div>
                                <label class="mb-2">Password</label><br>
                                <input name="password" />
                        </div>

                        <div>
                                <button>Login</button>
                        </div>
                </form>
        </div>
        
</body>

</html>