package by.tms.task1.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcul")
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        double res = 0;

        switch (operation) {
            case "div":
                res = num1 / num2;
                break;
            case "add":
                res = num1 + num2;
                break;
            case "diff":
                res = num1 - num2;
                break;
            case "mult":
                res = num1 * num2;
                break;
            default:
                res = 0;
                break;
        }
        response.getWriter().println(res);
    }
}
