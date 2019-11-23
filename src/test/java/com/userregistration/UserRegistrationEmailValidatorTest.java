package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationEmailValidatorTest {
    private String email;
    private UserRegistration userRegistration;
    private boolean finalResult;

    public UserRegistrationEmailValidatorTest(String email, boolean finalResult) {
        this.email = email;
        this.finalResult = finalResult;
    }

    @Before
    public void initialize(){
        this.userRegistration = new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> emailData(){
       return  Arrays.asList ( new Object[][]{
                { "abc@yahoo.com" ,true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc.100@1.com",true},
                {"abc.abc@gmail.co.in",true},
                {"abc100@gmail.com",true},
                {"abc.100@abc.com.au",true},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@g.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@a.com.21a",false},
                {"abc@g.cim.au.au",false}

    });
    }
    @Test
    public void testEmail() {
        boolean result = userRegistration.validateEmail(this.email);
        Assert.assertEquals(this.finalResult,result);
    }
}
