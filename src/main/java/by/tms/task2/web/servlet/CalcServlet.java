package by.tms.task2.web.servlet;

import by.tms.task2.entity.Operation;
import by.tms.task2.entity.User;
import by.tms.task2.service.CalculationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc", name = "CalcServlet")
public class CalcServlet extends HttpServlet {

    private final CalculationService calcService = new CalculationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String operand = req.getParameter("operand");

        User user = (User) req.getSession().getAttribute("user");
        Double result = calcService.calc(num1, num2, operand, user);
        req.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }
}