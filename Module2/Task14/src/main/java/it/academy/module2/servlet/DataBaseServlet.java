package it.academy.module2.servlet;

import it.academy.module2.dao.DAO;
import it.academy.module2.dao.DaoImpl;
import it.academy.module2.entity.Expense;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DataBaseServlet  extends HttpServlet {
    DAO dao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String driverClass= "com.mysql.cj.jdbc.Driver";
        String urlConnection= "jdbc:mysql://localhost:3306/listexpenses?serverTimezone=UTC";
        String username= "root";
        String password= "root";

        dao = DaoImpl.getInstance(driverClass,urlConnection,username,password);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Expense> expenses = new ArrayList<>();
        expenses = dao.getExpenses();
        PrintWriter writer = resp.getWriter();
        writer.println("Our expenses are: ");
        writer.println("---------------------------------------------------------");
        for (Expense tmpExpense : expenses){
            writer.println(tmpExpense);
            writer.println("---------------------------------------------------------");
            }


    }
}
