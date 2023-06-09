package Servlets;

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

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    public void  doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        ArrayList<News> news = DBManager.getNews();
        ArrayList<NewsCategories> newsCategories = DBManager.getAllCategory();
        request.setAttribute("news_categories", newsCategories);
        request.setAttribute("news", news);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}