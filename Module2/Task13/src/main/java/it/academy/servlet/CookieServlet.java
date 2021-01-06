package it.academy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID =1L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int countOfVisiting = 1;
        String cookieName = "countOfVisit";
        Cookie newCookie = new Cookie(cookieName,countOfVisiting+"");
        newCookie.setMaxAge(24*60*60);
        Cookie[] cookies = request.getCookies();
        int resultOfCheckingCookies= -1;
        if (cookies == null  ) {
            response.addCookie(newCookie);
            }else if ((resultOfCheckingCookies = isCookiesContains(cookies,cookieName))<0){
                         response.addCookie(newCookie);
                     }else {
                                countOfVisiting= Integer.parseInt(cookies[resultOfCheckingCookies].getValue());
                                newCookie.setValue(++countOfVisiting + "");
                                response.addCookie(newCookie);
                             }
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

    private int isCookiesContains (Cookie [] cookies, String cockieName){
        int result = -1;
        for (int i = 0; i< cookies.length; i++){
           result = cookies[i].getName().equals(cockieName) ? i : -1;

        }
        return result;
    }
}
