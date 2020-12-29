package it.academy.module2;

import java.sql.*;
import java.util.regex.Pattern;

public class ArgsParamsCkecker {


    public ArgsParamsCkecker() {
    }



    public int findMaxPkValue(Statement statement) {
        int result = 0;
        try {
            ResultSet rs = statement.executeQuery("select max(`num`) from `listexpenses`.`expenses`");

            while (rs.next()) {
                result = rs.getInt(1);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    public boolean isCliParamsCorrect(String[] args, Statement stmt) {

        if (args == null || args.length != 4 || stmt == null) {

            System.out.println("\n!!!>>> EMPTY CLI PARAMETERs  & statement = " + stmt.toString() + "\n");
                    } else if (Pattern.matches("\\d+", args[0]) && Pattern.matches("\\d+", args[2])
                            && Pattern.matches("\\d+", args[3])) {

                        int firstArg = Integer.parseInt(args[0]);
                        // if new PK is gt there is in DB
                        boolean isFirstArgCorrect = (firstArg > 0 && firstArg > findMaxPkValue(stmt));

                        String secondArg = args[1];
                        // if second param in correct Date form
                        boolean isSecondArgCorrect = Pattern.matches("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$" +
                                "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$" +
                                "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$", secondArg);

                        // Third and forth is correct number format and gt 0
                        float thirdArg = Float.parseFloat(args[2]);
                        boolean isThirdArgCorrect = thirdArg > 0;
                        int forthArg = Integer.parseInt(args[3]);
                        boolean isForthArgCorrect = forthArg > 0;

                        if (!isFirstArgCorrect || !isSecondArgCorrect || !isThirdArgCorrect || !isForthArgCorrect)
                            System.out.println("\n>>> INCORRECT  input parameter in CLI  primary key = " + args[0] + ", Date = "
                                    + args[1] + ", ReceiverNumber = " + args[2] + ", Money amount = " + args[3] + "\n");


                        return (isFirstArgCorrect && isSecondArgCorrect && isThirdArgCorrect && isForthArgCorrect);

        } else {
            System.out.println("\n!!!>>> INCORRECT  input parameter in CLI  primary key = " + args[0] + ", Date = "
                    + args[1] + ", Money amount = " + args[2] + ", ReceiverNumber = " + args[3] + "\n");
            return false;
        }
        System.out.println("\n>>> INCORRECT  input parameter in CLI  primary key = " + args[0] + ", Date = "
                + args[1] + ", ReceiverNumber = " + args[2] + ", Money amount = " + args[3] + "\n");
        return false;
    }


}


