package servlets;

import DB.DBManager;
import DB.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-task")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("task_name");
        String description = request.getParameter("task_description");
        String deadline = request.getParameter("task_deadline");
        String done = request.getParameter("task_done");

        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        task.setDeadlineDate(deadline);
        task.setDone(done);

        DBManager.addTask(task);

        response.sendRedirect("/");
    }
}
