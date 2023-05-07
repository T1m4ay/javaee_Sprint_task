<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%@include file="info.jsp"%>
</head>
<body>
    <%@include file="header.jsp"%>
    <div class="container-sm mt-3 shadow " style="border-radius: 3px; width: 100%; padding: 0; width: 940px">
        <div class="fs-5 p-3" style="background-color: #f7f7f7">
            Login Page
        </div>
        <div class="fs-6 p-4">
            <form action="/login" method="post">
                <div class="input-group mb-3">
                    <span class="input-group-text" id="user_email">Email</span>
                    <input type="email" class="form-control"  required name="email" >
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="user_password">Password</span>
                    <input type="password" class="form-control"  required name="password" >
                </div>
                <button class="btn btn-success">Login</button>
            </form>
        </div>
    </div>
</body>
</html>
