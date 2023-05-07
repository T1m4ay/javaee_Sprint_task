package Servlets;

import DB.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        HttpSession session = request.getSession();
        Users currentUser = (Users)request.getSession().getAttribute("currentUser");
        if(currentUser!=null) {
            request.getRequestDispatcher("/profile_page.jsp").forward(request, response);
        }else{
            response.sendRedirect("/login");
        }
    }
}
