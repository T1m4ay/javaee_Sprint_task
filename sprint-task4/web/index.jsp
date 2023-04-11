<%@ page import="java.util.ArrayList" %>
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
                <a class="navbar-brand fw-bold">TASK MANAGER</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active fw-medium" aria-current="page">Все задания</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div class="container mt-4">
        <a class="btn" style="background-color: #191361; color: white" href="/add-task-page">
            + Добавить задание
        </a>
    </div>
    <div class="container mt-3">
        <div class="row">
            <div class="col-12">
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <td class="fw-bold">
                            ID
                        </td>
                        <td class="fw-bold">
                            Наименование
                        </td>
                        <td class="fw-bold">
                            Крайний срок
                        </td>
                        <td class="fw-bold">
                            Выполнено
                        </td>
                        <td class="fw-bold">
                            Детали
                        </td>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        ArrayList<Task> tasky = (ArrayList<Task>) request.getAttribute("tasky");
                        if(tasky != null){
                            for (Task task : tasky){
                    %>
                    <tr>
                        <td>
                            <%=task.getId()%>
                        </td>
                        <td class="pe-2">
                            <%=task.getName()%>
                        </td>
                        <td>
                            <%=task.getDeadlineDate()%>
                        </td>
                        <td>
                            <%=task.getDone()%>
                        </td>
                        <td>
                            <a class="btn m-1" style="background-color: #191361; color: white" href="/edit?task_id=<%=task.getId()%>">Детали</a>
                        </td>
                    </tr>
                    <%
                            }
                        }
                    %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    </body>
</html>
