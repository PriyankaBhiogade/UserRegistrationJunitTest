package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration_Test {
    UserRegistration userRegistration = new UserRegistration();
    //Test cases for First Name
    //valid test
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validFirstName("Priyanka");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenMatch_ReturnTrue() {
        boolean result = userRegistration.validFirstName("Pri");
        Assert.assertTrue(result);
    }
    //Invalid test
    @Test
    public void givenFirstName_WhenUpperLetterMissing_ReturnFalse() {
        boolean result = userRegistration.validFirstName("priyanka");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenLengthLessThanThree_ReturnFalse() {
        boolean result = userRegistration.validFirstName("pr");
          Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenEmpty_ReturnFalse() {
        boolean result = userRegistration.validFirstName("");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenSpecialChar_ReturnFalse() {
        boolean result = userRegistration.validFirstName("Priyanka@@");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenUpperLetter_ReturnFalse() {
        boolean result = userRegistration.validFirstName("prIy");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenNum_ReturnFalse() {
        boolean result = userRegistration.validFirstName("Priyanka123");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenMoreThanOneUpper_ReturnFalse() {
        boolean result = userRegistration.validFirstName("PriYanka");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenAllLetterUpper_ReturnFalse() {
        boolean result = userRegistration.validFirstName("PRIYANKA");
        Assert.assertFalse(result);
    }
    //Test cases For LastName
    //valid test
    @Test
    public void givenLastName_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validLastName("Bhiogade");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenMatch_ReturnTrue() {
        boolean result = userRegistration.validLastName("Bhi");
        Assert.assertTrue(result);
    }
    //invalid test
    @Test
    public void givenLastName_WhenUpperLetterMissing_ReturnFalse() {
        boolean result = userRegistration.validLastName("bhiogade");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenLengthLessThanThree_ReturnFalse() {
        boolean result = userRegistration.validLastName("Bh");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenUpperLetter_ReturnFalse() {
        boolean result = userRegistration.validLastName("BhiIogade");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenNum_ReturnFalse() {
        boolean result = userRegistration.validLastName("Bhiogade123");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenMoreThanOneUpper_ReturnFalse() {
        boolean result = userRegistration.validLastName("BhioGade");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenAllLetterUpper_ReturnFalse() {
        boolean result = userRegistration.validLastName("BHIOGADE");
        Assert.assertFalse(result);
    }
    //test case for mobile num
    //valid
    @Test
    public void givenMobile_WhenProper_ReturnTrue() {
        boolean result = userRegistration.validateMobile("91 7458963254");
        Assert.assertTrue(result);
    }
    //invalid test
    @Test
    public void givenMobile_WhenNotGivenSpace_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobile("918149288245");
        Assert.assertFalse(result);
    }


}
