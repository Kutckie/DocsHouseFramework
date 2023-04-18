package ru.lanit.steps;


import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ru.lanit.utils.CommonMethods;


public class ModelObjectSteps extends CommonMethods {
    
    private final String modelObjectEndpoint = "/datamodel-service/PropertySet";
    
    private int generated_number = randomGen(100001);
    
    @Дано("пользователь находится на основной странице сервиса Модели данных")
    public void пользовательНаходитсяНаОсновнойСтраницеСервисаМоделиДанных() {
        navigateTo(modelObjectEndpoint);
    }
    
    @Когда("пользователь создаёт новый набор аттрибутов")
    public void пользовательСоздаётНовыйНаборАттрибутов() {
        jsClick(mainPage.addNewButton);
    }
    
    @И("пользователь заполняет все обязательные поля в форме создания модели данных")
    public void пользовательЗаполняетВсеОбязательныеПоляВФормеСозданияМоделиДанных() {
        sendText(mainPage.nameField, "SeleniumTest_#" + generated_number);
        sendText(mainPage.codeField, (randomGen(1000000)));
        sendText(modelObjectPage.modelObjectDescriptionField, "SeleniumTest");
    }
    
    @Когда("пользователь редактирует набор атрибутов")
    public void пользовательРедактируетНаборАтрибутов() {
        navigateTo(modelObjectEndpoint);
        doubleClick(documentsPage.seleniumElements);
        waitForClickability(mainPage.nameField);
        sendText(mainPage.nameField, "_Edited");
        sendText(modelObjectPage.modelObjectDescriptionField, "_Edited");
    }
    
    @Когда("пользователь создаёт новый атрибут")
    public void пользовательСоздаётНовыйАтрибут() {
        navigateTo(modelObjectEndpoint);
        doubleClick(documentsPage.seleniumElements);
        click(mainPage.expansionPanel);
        click(mainPage.expansionPanelAddButton);
//        click((WebElement) getJSObject().executeScript("return document.querySelector('.menuable__content__active > .v-list > .v-list-item')"));
        click(modelObjectPage.getAddAttributeDropDown);
    }
    
    @И("пользователь заполняет все обязательные поля нового атрибута")
    public void пользовательЗаполняетВсеОбязательныеПоляНовогоАтрибута() {
        click(modelObjectPage.dataTypeDropDown);
        click(modelObjectPage.dataTypeDropDown_text);
        sendText(modelObjectPage.modalNameField, "SeleniumAttribute_#" + generated_number);
        sendText(modelObjectPage.modalCodeField, (randomGen(1000000)));
        sendText(modelObjectPage.modalOrderField, "1");
        sendText(modelObjectPage.modalDescriptionField, "SeleniumDesc");
        sendText(modelObjectPage.modalDefaultValue, "1");
        click(modelObjectPage.modalSaveButton);
    }
    
    @Когда("пользователь редактирует атрибут")
    public void пользовательРедактируетАтрибут() {
        navigateTo(modelObjectEndpoint);
        doubleClick(documentsPage.seleniumElements);
        click(modelObjectPage.dataTypeDropDown);
        click(documentsPage.seleniumElements);
        sendText(mainPage.nameField, "_Edited");
        click(modelObjectPage.modalSaveButton);
    }
}
