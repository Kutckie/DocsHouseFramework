package ru.lanit.utils;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import ru.lanit.testbase.PageInitializer;

public class Assertions extends PageInitializer {
    
    private static final String paginationFailCase = "0 - 0";
    
    public static void isCorrectMessage(String expectedMsg) {
        String actualMsg = mainPage.message.getText();
        Assert.assertEquals("Actual message is different.", expectedMsg, actualMsg);
    }
    
    public static void isTextEquals() { //pagination check, checks if pagination != 0-0. For cases where we want to assert that the number of elements after search are higher than 0
        String actualText = mainPage.paginationNumber.getText();
        Assert.assertNotEquals(paginationFailCase, actualText);
    }
}
