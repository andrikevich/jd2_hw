package it.academy.hw.task10.utilities;

import java.util.regex.Pattern;

public class InputDataChecker {
    public final String  CHECKED_OK = "SUCCESS";
    public String nameChecker (String name){
        String regex = "^[a-zA-Z|а-яА-Я]{2,}[\\w|\\s|\\-|_]*";
        if(name.trim().length() == 0)
            return "Empty name field, please fullfil it";
        else if (!Pattern.matches("[\\D+]]",name))
                 return "There is a number symbol in a name. Please check correctness";
        return  CHECKED_OK;
    }

    public String emailChecker (String email){
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        if(!Pattern.matches(regex,email))
            return "Incorrect email was inputted";
            else
        return CHECKED_OK;
    }
//^(\+375|80)(29|25|44|33)(\d{3})(\d{2})(\d{2})$

    public String phoneChecker (String phone){
        String regex = "^\\+375 (17|29|33|44|25) [0-9]{7}$";
        if(!Pattern.matches(regex,phone))
            return "Incorrect phone number was inputted";
        else
            return CHECKED_OK;
    }
}
