package Servlets;

import DB.Comments;
import DB.DBManager;
import DB.News;
import DB.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-comment")
public class AddCommentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Users user = (Users) request.getSession().getAttribute("currentUser");

        if (user != null) {

            String commentText = request.getParameter("comment");
            Long newsId = Long.parseLong(request.getParameter("news_id"));

            News news = DBManager.getNewsById(newsId);

            if (news != null) {

                Comments comment = new Comments();
                comment.setNews(news);
                comment.setUsers(user);
                comment.setComment(commentText);

                DBManager.addComment(comment);

                response.sendRedirect("/news-details?id="+newsId);

            }else{
                response.sendRedirect("/");
            }

        } else {
            response.sendRedirect("/login");
        }
    }
}
