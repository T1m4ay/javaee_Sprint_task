<%@ page import="DB.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
</head>
    <body>
        <div class="container mt-3">
            <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #191361">
                <div class="container-fluid">
                    <a class="navbar-brand fw-bold" href="/home">TASK MANAGER</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon" ></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active fw-medium" aria-current="page" href="/home">Все задания</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div class="container">
            <%
                Task task = (Task) request.getAttribute("tasky");
                if(task!=null){


            %>
                <div class="row mt-4">
                    <div class="col-8 mx-auto">
                            <div class="row">
                                <div class="col-12">
                                    <lable>Наименование:</lable>
                                </div>
                            </div>
                            <div class="row mt-2">
                                <div class="col-12">
                                    <input type="text" class="form-control" readonly value="<%=task.getName()%>">
                                </div>
                            </div>
                            <div class="row mt-3">
                                <div class="col-12">
                                    <lable>Описание:</lable>
                                </div>
                            </div>
                            <div class="row mt-2">
                                <div class="col-12">
                                    <textarea class="form-control" aria-label="With textarea" readonly placeholder="<%=task.getDescription()%>"></textarea>
                                </div>
                            </div>
                            <div class="row mt-3">
                                <div class="col-12">
                                    <lable>Крайний срок:</lable>
                                </div>
                            </div>
                            <div class="row mt-2">
                                <div class="col-12">
                                    <input type="date" class="form-control" readonly value="<%=task.getDeadlineDate()%>" >
                                </div>
                            </div>
                            <div class="row mt-3">
                                <div class="col-12">
                                    <lable>Выполнено:</lable>
                                </div>
                            </div>
                            <div class="row mt-2">
                                <div class="col-12">
                                    <input type="text" class="form-control" readonly value="<%=task.getDone()%>" >
                                </div>
                            </div>
                        <form action="/delete-task" method="post">
                            <div class="d-grid gap-2 d-md-flex justify-content-md-start mt-4">
                                <a class="btn btn-primary" href="/">Сохранить</a>
                                <button class="btn btn-primary me-md-2 bg-danger" >Удалить</button>

                            </div>
                            <input type="hidden" name="id" value="<%=task.getId()%>">
                        </form>
                    </div>
                </div>
            <% }else{ %>
            <h3 class="text-center">
                BOOK NOT FOUND
            </h3>
            <% }%>
        </div>
    </body>
</html>
