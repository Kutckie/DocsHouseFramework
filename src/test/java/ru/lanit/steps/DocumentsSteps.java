package ru.lanit.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

import ru.lanit.utils.CommonMethods;
import ru.lanit.utils.ConfigsReader;

import static ru.lanit.utils.Constants.DEMO_URL;

public class DocumentsSteps extends CommonMethods {
    
    @Дано("пользователь находится на основной странице сервиса Документы")
    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
        driver.get((ConfigsReader.getProperty("DemoStandURL")) + "documents-service/");
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
        driver.get(ConfigsReader.getProperty("DocumentsServiceURL"));
        doubleClick(documentsPage.seleniumElements);
        //td[contains(text(), "Selenium")]
    }
    
    @И("пользователь может наблюдать созданный документ в списке документов")
    public void пользовательМожетНаблюдатьСозданныйДокументВСпискеДокументов() {
        driver.get((ConfigsReader.getProperty("DemoStandURL")) + "documents-service/");
        elementExists(documentsPage.seleniumElements);
    }
}
