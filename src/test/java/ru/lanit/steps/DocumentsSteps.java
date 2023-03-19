package ru.lanit.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import ru.lanit.utils.CommonMethods;
import ru.lanit.utils.ConfigsReader;


import static ru.lanit.testbase.BaseClass.driver;
import static ru.lanit.utils.Constants.DEMO_URL;

public class DocumentsSteps extends CommonMethods {
    
    @Дано("пользователь находится на основной странице сервиса Документы")
    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
        String documents_url = DEMO_URL + "documents-service";
        driver.get(ConfigsReader.getProperty(documents_url));
    }
    
    @Когда("пользователь создаёт новый документ")
    public void пользовательСоздаётНовыйДокумент() {
        click(mainPage.addNewButton);
    }
    
    @И("пользователь заполняет необходимые атрибуты")
    public void пользовательЗаполняетНеобходимыеАтрибуты() {
        sendText(documentsPage.documentsNameField, "SeleniumDocument");
    }
    
    @Когда("пользователь назначает автором дроугого пользователя")
    public void пользовательНазначаетАвторомДроугогоПользователя() {
    }
    
    @Когда("Пользователь выбирает тип документа;")
    public void пользовательВыбираетТипДокумента() {
    }
    
    @Дано("пользователь находится на странице уже созданного документа")
    public void пользовательНаходитсяНаСтраницеУжеСозданногоДокумента() {
        driver.get(ConfigsReader.getProperty("DocumentsServiceURL"));
        doubleClick(documentsPage.seleniumElements);
        //td[contains(text(), "Selenium")]
    }
    
    @И("пользователь может наблюдать созданный документ в списке документов")
    public void пользовательМожетНаблюдатьСозданныйДокументВСпискеДокументов() {
        driver.get("https://docshouse.k8s.lan.lanit.ru/documents-service/auto_postman_test");
        elementExists(documentsPage.seleniumElements);
    }
}
