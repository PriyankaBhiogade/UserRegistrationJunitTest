package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
    public class UserRegistrationPasswordTest {
        private String password;
        private UserRegistration userRegistration;
        private boolean finalResult;

    public UserRegistrationPasswordTest(String password,boolean finalResult) {
        this.password = password;
        this.finalResult = finalResult;
    }

    @Before
    public void initialize(){
        this.userRegistration = new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> passwordData(){
        return  Arrays.asList ( new Object[][]{
                {"Priyanka@123",true},
                {"priyanKa@123",true},
                {"@priyanKa123",true},
                {"Priy@123Naka",true},
                {"@123priyanKa",true},
                {"123priyanKa@",true},
                {"piyu",false},
                {"piyubhiogade1212",false},
                {"PRIYANKA!@#",false},
                {"Priyanka12",false},
                {"12352428765857",false},
                {"!@#$%^&*(*()",false},
        });
    }
    @Test
    public void givenPassword_WhenValidOrInvalid_ReturnTrueOrFalse() {
        boolean result = userRegistration.validatePassword(this.password);
        Assert.assertEquals(this.finalResult,result);
    }
}

