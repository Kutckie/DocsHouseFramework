package ru.lanit.steps.utilSteps;



import io.cucumber.java.en.When;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import org.junit.Assert;
import ru.lanit.utils.CommonMethods;

import static ru.lanit.utils.Constants.UPLOAD_FILE_PATH;

public class CommonSteps extends CommonMethods {
    
    @Когда("система выдаёт сообщение {string}")
    public void iValidateThatMessageIsDisplayed(String expectedMsg) {
        String actualMsg = mainPage.message.getText();
        Assert.assertEquals("Actual message is different.", expectedMsg, actualMsg);
    }
    
    @Когда("пользователь загружает файл")
    public void userUploadsFile(){
        unhide(driver, mainPage.fileUpload);
        attachFile(driver, mainPage.fileUpload, UPLOAD_FILE_PATH);
    }
    
    @И("пользователь нажимает кнопку \"ДОБАВИТЬ\"")
    public void userClicksAddStorageButton() {
        click(mainPage.addNewButton);
    }
    
    @И("пользователь нажимает кнопку \"СОХРАНИТЬ\"")
    public void userClicksSAVEButton() {
        click(mainPage.saveButton);
    }
}
