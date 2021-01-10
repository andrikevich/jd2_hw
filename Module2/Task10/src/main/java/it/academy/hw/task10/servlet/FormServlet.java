package it.academy.hw.task10.servlet;

import it.academy.hw.task10.utilities.InputDataChecker;

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
        InputDataChecker checker = new InputDataChecker();
        String nameChecked = checker.nameChecker(name);
        String phoneChecked =checker.phoneChecker(phone);
        String emailChecked = checker.emailChecker(email);

       
        PrintWriter writer = resp.getWriter();
        if (!nameChecked.equals(checker.CHECKED_OK)){
            writer.println(nameChecked);
        }else  if (!phoneChecked.equals(checker.CHECKED_OK)) {
                writer.println(phoneChecked);
        }else if (!emailChecked.equals(checker.CHECKED_OK)){
            writer.println(emailChecked);
        } else {
            writer.println("Hello,  you've inserted name: " + name + ", phone number: " + phone + " and email: " + email + ".");
        }
    }
}
