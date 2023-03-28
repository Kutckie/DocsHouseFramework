package ru.lanit.steps.utilSteps;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import org.junit.Assert;
import ru.lanit.utils.Assertions;
import ru.lanit.utils.CommonMethods;

import static ru.lanit.utils.Constants.UPLOAD_FILE_PATH;

public class CommonSteps extends CommonMethods {
    
    @Когда("система выдаёт сообщение {string}")
    public void iValidateThatMessageIsDisplayed(String expectedMsg) {
        Assertions.isCorrectMessage(expectedMsg);
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
    
    @И("пользователь нажимает кнопку \"УДАЛИТЬ\"")
    public void userClicksDELETEButton(){
        click(mainPage.deleteButton);
        click(mainPage.modalDeleteButton);
    }
    
    @И("пользователь сохраняет созданный шаблон поиска")
    public void пользовательСохраняетСозданныйШаблонПоиска() {
        click(mainPage.searchSAVEButton);
        waitForClickability(mainPage.searchModalWindow);
        waitForVisibility(mainPage.searchModalWindow);
        sendText(mainPage.searchModalField, "SeleniumTemplate");
        click(mainPage.searchModalSAVEButton);
    }
    
    @И("жди {int}")
    public void жди(int waittime) {
        wait(waittime);
    }
}
