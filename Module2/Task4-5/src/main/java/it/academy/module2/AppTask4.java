package it.academy.module2;

import java.sql.*;

public class AppTask4 {


    // !!!!!  DUE TO PARTLY MISUNDERSTANDING  our task
    //I took decision to use next CLI paramets like:
    //C:\java\jdk-11\bin\java.exe  -classpath C:\hw\Module2\Task4-5\target\classes;C:\Users\dmitry_an\.m2\repository\mysql\mysql-connector-java\8.0.22\mysql-connector-java-8.0.22.jar it.academy.module2.AppTask4 "19" "2020-12-18" "29000" "2"

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/listexpenses?serverTimezone=UTC";
        String login = "root";
        String pwd = "root";

        try {
            ArgsParamsCkecker paramsCkecker = new ArgsParamsCkecker();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, login, pwd);
            Statement statement = conn.createStatement();
            StringBuilder sbQuery = new StringBuilder()
                    .append("INSERT INTO `ListExpenses`.`expenses` (`num`, `paydate`, `value`, `receiver`) VALUES (");
            if (paramsCkecker.isCliParamsCorrect(args, statement)) {
                sbQuery.append(args[0]).append(",'")
                        .append(args[1]).append("',")
                        .append(args[2]).append(",")
                        .append(args[3]).append(")");
                statement.executeUpdate(sbQuery.toString());
            }


            ResultSet rs = statement.executeQuery("SELECT `num`, `paydate`, `value`, `receiver` FROM  `listexpenses`.`expenses`");

            while (rs.next()) {
                System.out.println("Номер  платежа = " + rs.getInt(1) + ", Дата = " + rs.getString(2) + ", Сумма = " +
                        rs.getFloat(3) + ", Получатель = " + rs.getInt(4));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }


}
