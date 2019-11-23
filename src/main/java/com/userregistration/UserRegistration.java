package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //FirstName
    public boolean validFirstName(String firstName) {
        String pattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern firstNamePattern = Pattern.compile(pattern);
        Matcher match = firstNamePattern.matcher(firstName);
        if (match.matches())
            return true;
        return false;
    }
    //LastName
    public boolean validLastName(String lastName) {
        String pattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern lastNamePattern = Pattern.compile(pattern);
        Matcher match = lastNamePattern.matcher(lastName);
        if (match.matches())
            return true;
        return false;
    }
    //mobileNum
    public boolean validateMobile(String mobile) {
        String pattern="^[0-9]{2,2}[ ][7,8,9]{1,1}[0-9]{9}$";
        Pattern mobilePattern = Pattern.compile(pattern);
        Matcher matcher = mobilePattern.matcher(mobile);
        if (matcher.matches())
            return true;
        return false;
    }




}
