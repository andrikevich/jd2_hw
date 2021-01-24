package it.academy.module2.servlet;

import it.academy.module2.dao.DAO;
import it.academy.module2.dao.DaoImpl;
import it.academy.module2.entity.Expense;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseServletTask17 extends HttpServlet {
    private DAO dao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext context = getServletContext();

        String driverClass= context.getInitParameter("driverClass");
        String urlConnection= context.getInitParameter("urlConnection");
        String username= context.getInitParameter("username");
        String password= context.getInitParameter("password");

        dao = DaoImpl.getInstance(driverClass,urlConnection,username,password);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Expense> expenses = new ArrayList<>();
        expenses = dao.getExpenses();
        req.setAttribute("expenses",expenses);
        req.getRequestDispatcher("view/data-from-db-task17.jsp").forward(req,resp);


    }
}
