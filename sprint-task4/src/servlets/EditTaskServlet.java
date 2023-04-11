package servlets;

import DB.DBManager;
import DB.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/edit")
public class EditTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("task_id"));
        Task task = DBManager.getTask(id);

        request.setAttribute("tasky", task);
        request.getRequestDispatcher("/edittask.jsp").forward(request, response);
    }
}
