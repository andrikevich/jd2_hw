package it.academy.hw.task10.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/doProcessingForm")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name  = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        //todo: Realize field checker if have spare time
        PrintWriter writer = resp.getWriter();
        if (name.trim().length() == 0 || (phone.trim().length() == 0 && email.trim().length() == 0)){
            writer.println("You didn't fill all required fields !!!");
        }else {
            writer.println("Hello,  you've inserted name: " + name + ", phone number: " + phone + " and email: " + email + ".");
        }
    }
}
