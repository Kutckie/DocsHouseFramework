package ru.lanit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ru.lanit.testbase.BaseClass;

public class LoginPage {

    @FindBy(css = "input[type='text']")
    public WebElement userName;

    @FindBy(css = "input[type='password']")
    public WebElement password;

    @FindBy(css="[type=\"submit\"]")
    public WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
