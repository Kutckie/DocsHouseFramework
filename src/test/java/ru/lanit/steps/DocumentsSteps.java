package ru.lanit.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

import io.cucumber.java.ru.Тогда;
import ru.lanit.utils.Assertions;
import ru.lanit.utils.CommonMethods;


public class DocumentsSteps extends CommonMethods {
    
    private final String documentsEndpoint = "/documents-service/objects";
    private final String documentsCreationEndpoint = "/documents-service/objects/create/auto_postman_test/";
    
//    @Дано("пользователь находится на основной странице сервиса Документы")
//    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
//        driver.navigate().to((ConfigsReader.getProperty("DemoStandURL")) + "documents-service/");
//    }
    
    @Дано("пользователь находится на основной странице сервиса Документы")
    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
        navigateTo(documentsCreationEndpoint);
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
        waitForVisibility(mainPage.searchButton);
        click(mainPage.searchButton);
        sendText(mainPage.searchNameField, "Selenium");
    }
    
    @Тогда("пользователь может наблюдать элементы, соответствующие критериям поиска")
    public void пользовательМожетНаблюдатьЭлементыСоответствующиеКритериямПоиска() {
        //documentsPage.noDataFoundSearchMessage.isDisplayed();
        Assertions.isTextEquals();
    }
}
