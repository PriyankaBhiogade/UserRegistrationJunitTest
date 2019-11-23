package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validFirstName(String firstName) {
        String pattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern firstNamePattern = Pattern.compile(pattern);
        Matcher match = firstNamePattern.matcher(firstName);
        if (match.matches())
            return true;
        return false;
    }

}
