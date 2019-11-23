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

}
