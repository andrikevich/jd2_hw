package it.academy.module2.dao;

import it.academy.module2.entity.Expense;
import it.academy.module2.entity.Receiver;
import it.academy.module2.exception.ConnectionEstablishException;

import java.sql.*;
import java.util.ArrayList;

public class DaoImpl implements DAO {
    String driverClass;
    String urlConnection;
    String username;
    String password;



    private static volatile DaoImpl instance;


    // Fields will be fill in init() method of Servlet
    private DaoImpl(String driverClass, String urlConnection, String username, String password) {
        this.driverClass = driverClass;
        this.urlConnection = urlConnection;
        this.username = username;
        this.password = password;
    }

    private DaoImpl (){}

    public static DaoImpl getInstance(String driverClass, String urlConnection, String username, String password){
         if (instance == null){
             synchronized (DaoImpl.class){
                 if (instance == null){}
                 instance = new DaoImpl(driverClass, urlConnection, username, password);
             }
        }
         return instance;
    }

    @Override
    public Receiver getReceiver(int num) {
        Receiver receiver = new Receiver();
        try (Statement statement = getConnection().createStatement();
             ResultSet  resultSet = statement.executeQuery("SELECT * FROM  `listexpenses`.`receivers` WHERE 'num'=" + num)) {
            resultSet.next();
            receiver.setNum(resultSet.getInt("num"));
            receiver.setName(resultSet.getString("name"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return receiver;
    }

    @Override
    public ArrayList<Receiver> getReceivers() {
        ArrayList<Receiver> result = new ArrayList<>();
        try (Statement statement = getConnection().createStatement();
             ResultSet  resultSet = statement.executeQuery("SELECT * FROM  `listexpenses`.`receivers` ")) {
            while(resultSet.next()){
                Receiver receiver = new Receiver();
                receiver.setNum(resultSet.getInt("num"));
                receiver.setName(resultSet.getString("name"));
                result.add(receiver);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    @Override
    public Expense getExpense(int num) {
        Expense expense = new Expense();
        try (Statement statement = getConnection().createStatement();
             ResultSet  resultSet = statement.executeQuery("SELECT * FROM  `listexpenses`.`expenses` WHERE 'num'=" + num)) {
            resultSet.next();
            expense.setNum(resultSet.getInt("num"));
            expense.setPaydate(resultSet.getString("paydate"));
            expense.setValue(resultSet.getFloat("value"));
            expense.setReceiverNum(resultSet.getInt("receiver"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return expense;
    }

    @Override
    public ArrayList<Expense> getExpenses() {
        ArrayList<Expense> expenses = new ArrayList<>();
        try (Statement statement = getConnection().createStatement();
             ResultSet  resultSet = statement.executeQuery("SELECT * FROM  `listexpenses`.`expenses` ")) {
            while(resultSet.next()){
                Expense expense = new Expense();
                expense.setNum(resultSet.getInt("num"));
                expense.setPaydate(resultSet.getString("paydate"));
                expense.setValue(resultSet.getFloat("value"));
                expense.setReceiverNum(resultSet.getInt("receiver"));
                expenses.add(expense);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return expenses;
    }

    @Override
    public int addReceiver(Receiver receiver) {
        int insertedNum = 0;
        try (Statement statement = getConnection().createStatement()) {
             insertedNum = statement.executeUpdate("INSERT INTO `ListExpenses`.`receivers` (`num`, `name`) VALUES (" + receiver.getNum() + "," + receiver.getName()+ ")");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return insertedNum;
    }

    @Override
    public int addExpense(Expense expense) {
        int insertedNum = 0;
        try (Statement statement = getConnection().createStatement()) {
            insertedNum = statement.executeUpdate(
                    "INSERT INTO `ListExpenses`.`expenses` (`num`, `paydate`, `value`, `receiver`) " +
                            "VALUES (" + expense.getNum() + "," + expense.getPaydate() + "," + expense.getValue() + "," + expense.getReceiverNum()+ ")");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return insertedNum;
    }



    private Connection getConnection() {

        try {
            Class.forName(driverClass);
            Connection connection = DriverManager.getConnection(urlConnection,username,password);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new ConnectionEstablishException(">>> Can't connect to DataBase with url: " + urlConnection + " username: "+ username + " password: "+ password);
        }
    }

}
