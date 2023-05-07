package Servlets;

import DB.DBManager;
import DB.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    public void  doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        request.getRequestDispatcher("/register_page.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String rePassword = req.getParameter("re_password");
        String fullName = req.getParameter("full_name");

        Users user = DBManager.getUser(email);

        if(user==null){
            if(password.equals(rePassword)){

                Users createUser = new Users();
                createUser.setEmail(email);
                createUser.setPassword(password);
                createUser.setFullName(fullName);
                createUser.setRoleId(2);

                DBManager.addUser(createUser);
                resp.sendRedirect("/register?success");

            }else{
                resp.sendRedirect("/register?passworderror");
            }

        }else{
            resp.sendRedirect("/register?emailerror");
        }
    }
}
