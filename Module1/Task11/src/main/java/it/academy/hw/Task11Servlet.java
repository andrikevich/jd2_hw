package it.academy.hw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet (name="task11",  urlPatterns = "/test")
public class Task11Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final PrintWriter writer = resp.getWriter();
        writer.println("Hello  from homework Task11 from class: " + this.getClass().getName());

        writer.println("-------------------");
        writer.println(new Date());

        
        writer.println("***********************");
        writer.println("changes from master");


    }
}
