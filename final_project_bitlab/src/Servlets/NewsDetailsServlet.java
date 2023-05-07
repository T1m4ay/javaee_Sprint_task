package Servlets;

import DB.Comments;
import DB.DBManager;
import DB.News;
import DB.NewsCategories;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/news-details")
public class NewsDetailsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        News news = DBManager.getNewsById(id);
        ArrayList<NewsCategories> newsCategories = DBManager.getAllCategory();
        request.setAttribute("news", news);
        request.setAttribute("news_categories", newsCategories);
        if (news != null) {
            ArrayList<Comments> comments = DBManager.getComments(news.getId());
            request.setAttribute("comments", comments);
        }
        request.getRequestDispatcher("/news_detail.jsp").forward(request, response);
    }
}
