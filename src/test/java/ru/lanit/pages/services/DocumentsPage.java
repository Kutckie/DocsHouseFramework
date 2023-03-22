package ru.lanit.pages.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static ru.lanit.testbase.BaseClass.driver;

public class DocumentsPage {
    
    @FindBy(xpath = "//td[contains(text(), \"SeleniumDocument\")]") //used to search element containers with "Selenium" text
    public WebElement seleniumElements;
    
    @FindBy(xpath = "//label[contains(text(), \"Название объекта\")]/../input")
    public WebElement documentsNameField;
    
    @FindBy(xpath = "//label[contains(text(), \"Создал\")]/../input")
    public WebElement documentsOwnerField;
    
    @FindBy(xpath = "//label[contains(text(), \"Дата и время создания\")]/../input")
    public WebElement dateOfCreation;
    
    @FindBy(xpath = "//label[contains(text(), \"Дата и время изменения\")]/../input")
    public WebElement dateOfEditing;
    
    @FindBy(xpath = "//td[contains(text(), \"Selenium\")]//..//div//div//div")
    public WebElement checkbox;
    
    
    public DocumentsPage() {
        PageFactory.initElements(driver, this);
    }
}
