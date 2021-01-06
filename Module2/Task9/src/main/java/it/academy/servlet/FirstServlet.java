package it.academy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID =1L;
    int countOfVisiting = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        countOfVisiting++;
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body><h1>There is first servlet</h1>");
        out.println("This site has been visited " + countOfVisiting + " times.");
        out.println("</body></html>");
        File file = new File("c:\\hw\\Module2\\Task9\\src\\main\\resourses\\coutOfVisiting.txt");
        FileWriter writer = new FileWriter
                (file,false);
        writer.write("This site has been visited " + countOfVisiting + " times!");
        writer.flush();
        writer.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
