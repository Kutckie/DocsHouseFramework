package ru.lanit.pages.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ru.lanit.testbase.BaseClass.driver;

public class FilePage {
    @FindBy(css = "body .dz-hidden-input")
    public WebElement fileUpload;

    public FilePage() {
        PageFactory.initElements(driver, this);
    }
}
