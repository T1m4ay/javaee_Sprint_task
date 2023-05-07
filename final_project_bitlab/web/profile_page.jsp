<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Profile</title>
  <%@include file="info.jsp"%>
</head>
  <body>
    <%@include file="header.jsp"%>
    <div>
      <div class="container text-center" style="width: 980px">
        <p class="fs-2 fw-bold">Hello
          <%=currentUser.getFullName()%>
        </p>
        <p class="fs-5 fw-light">This is your profile page</p>
      </div>
    </div>
  </body>
</html>
