package it.academy.module2;

import java.sql.*;

public class AppTask5 {


    // !!!!!  DUE TO PARTLY MISUNDERSTANDING  our task
    //I took decision to use next CLI paramets like:
    //C:\java\jdk-11\bin\java.exe  -classpath C:\hw\Module2\Task4-5\target\classes;C:\Users\dmitry_an\.m2\repository\mysql\mysql-connector-java\8.0.22\mysql-connector-java-8.0.22.jar it.academy.module2.AppTask5 "20" "2020-12-18" "29000" "2"
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/listexpenses?serverTimezone=UTC";
        String login = "root";
        String pwd = "root";

        try {
            ArgsParamsCkecker paramsCkecker = new ArgsParamsCkecker();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, login, pwd);
            String template = "INSERT INTO `ListExpenses`.`expenses` (`num`, `paydate`, `value`, `receiver`) VALUES (?, ?, ?, ?)";
            PreparedStatement prStatement = conn.prepareStatement(template);

            if (paramsCkecker.isCliParamsCorrect(args, prStatement)) {
                prStatement.setString(1, args[0]);
                prStatement.setString(2, args[1]);
                prStatement.setString(3, args[2]);
                prStatement.setString(4, args[3]);
                prStatement.executeUpdate();
            }


            ResultSet rs = prStatement.executeQuery("SELECT `num`, `paydate`, `value`, `receiver` FROM  `listexpenses`.`expenses`");

            while (rs.next()) {
                System.out.println("Номер  платежа = " + rs.getInt(1) + ", Дата = " + rs.getString(2) + ", Сумма = " +
                        rs.getFloat(3) + ", Получатель = " + rs.getInt(4));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }


}
