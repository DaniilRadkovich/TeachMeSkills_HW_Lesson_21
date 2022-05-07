package by.tms.task2.web.servlet;

import by.tms.task2.entity.User;
import by.tms.task2.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/authorization.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = userService.findUserByLogin(login);
        if (user.getPassword().equals(password)) {
            req.getSession().setAttribute("user", user);
            getServletContext().getRequestDispatcher("/successfulAuthorization.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/unsuccessfulAuthorization.jsp").forward(req, resp);
            resp.getWriter().println("Wrong Password!");
        }
    }
}
