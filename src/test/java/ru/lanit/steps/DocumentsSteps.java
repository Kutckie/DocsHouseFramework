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

public class DocumentsSteps extends CommonMethods {
    
    @Дано("пользователь находится на основной странице сервиса Документы")
    public void пользовательНаходитсяНаОсновнойСтраницеСервисаДокументы() {
        driver.get(ConfigsReader.getProperty("DocumentsServiceURL"));
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
        wait(5);
        //td[contains(text(), "Selenium")]
    }
}
