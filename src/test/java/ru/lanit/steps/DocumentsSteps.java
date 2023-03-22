package ru.lanit.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

import ru.lanit.utils.CommonMethods;


public class DocumentsSteps extends CommonMethods {
    
    private final String documentsEndpoint = "/documents-service/auto_postman_test";
    
//    @Дано("пользователь находится на основной странице сервиса Документы")
//    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
//        driver.navigate().to((ConfigsReader.getProperty("DemoStandURL")) + "documents-service/");
//    }
    
    @Дано("пользователь находится на основной странице сервиса Документы")
    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
        navigateTo(documentsEndpoint);
    }
    
    @Когда("пользователь создаёт новый документ")
    public void пользовательСоздаётНовыйДокумент() {
        click(mainPage.addNewButton);
    }
    
    @И("пользователь заполняет необходимые атрибуты")
    public void пользовательЗаполняетНеобходимыеАтрибуты() {
        sendText(documentsPage.documentsNameField, "SeleniumDocument");
    }
    
    @Дано("пользователь находится на странице уже созданного документа")
    public void пользовательНаходитсяНаСтраницеУжеСозданногоДокумента() {
        navigateTo(documentsEndpoint);
        doubleClick(documentsPage.seleniumElements);
        //td[contains(text(), "Selenium")]
    }
    
    @И("пользователь может наблюдать созданный документ в списке документов")
    public void пользовательМожетНаблюдатьСозданныйДокументВСпискеДокументов() {
        navigateTo(documentsEndpoint);
        isElementExists(documentsPage.seleniumElements);
    }
    
    @Когда("пользователь редактирует документ")
    public void пользовательРедактируетДокумент() {
        sendText(documentsPage.documentsNameField, "_Edited " + randomGen(999));
    }
    
    
    @Когда("пользователь нажимает на чекбокс элемента")
    public void пользовательНажимаетНаЧекбоксЭлемента() {
        getJSObject().executeScript("arguments[0].click();", documentsPage.checkbox);
    }
    
    @Когда("пользователь использует функцию поиска")
    public void пользовательИспользуетФункциюПоиска() {
        click(mainPage.searchButton);
        sendText(mainPage.searchNameField, "Selenium");
    }
}
