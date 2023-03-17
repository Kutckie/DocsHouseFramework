package ru.lanit.steps.utilSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.ru.Когда;
import org.junit.Assert;

import static ru.lanit.testbase.PageInitializer.mainPage;

public class CommonSteps {
    
    @Когда("система выдаёт сообщение {string}")
    public void iValidateThatMessageIsDisplayed(String expectedMsg) {
        String actualMsg = mainPage.message.getText();
        Assert.assertEquals("Actual message is different.", expectedMsg, actualMsg);
    }
}
