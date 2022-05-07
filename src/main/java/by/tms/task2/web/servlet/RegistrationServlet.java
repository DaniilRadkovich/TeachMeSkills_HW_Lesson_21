package by.tms.task2.web.servlet;

import by.tms.task2.entity.User;
import by.tms.task2.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = new User(name, password, login);
        boolean isAdded = userService.add(user);

        if (isAdded) {
            getServletContext().getRequestDispatcher("/successfulRegistration.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/unsuccessfulRegistration.jsp").forward(req, resp);
        }
    }
}
