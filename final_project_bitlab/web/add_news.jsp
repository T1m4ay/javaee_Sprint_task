<%@ page import="DB.NewsCategories" %>
<%@ page import="DB.News" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
    <%@include file="info.jsp"%>
</head>
<body>
    <%@include file="header.jsp"%>
    <div class="container-sm mt-3 shadow " style="border-radius: 3px; width: 100%; padding: 0; width: 940px">
        <div class="fs-5 p-3" style="background-color: #f7f7f7">
            Add News
        </div>
        <div class="fs-6 p-4">
            <form action="/add_news" method="post">
                <div class="row">
                    <div class="col-12">
                        <label>Select Category : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <div class="form-floating">
                            <select class="form-select" name="news_category_name">
                                <%
                                    ArrayList<NewsCategories> news_categories = (ArrayList<NewsCategories>) request.getAttribute("news_categories");
                                    if(news_categories!=null){
                                        for(NewsCategories news_cat : news_categories){
                                %>
                                <option><%=news_cat.getName()%></option>
                                <%
                                        }
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>Title : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="title" class="form-control" name="title" required placeholder="Insert Title">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>Content : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <textarea type="content" class="form-control" name="content" required placeholder="..."></textarea>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <button class="btn btn-success">Save</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
