package ru.lanit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.lanit.testbase.BaseClass;

public class MainPage {

    /**
     * Buttons and misc elements
     */

    @FindBy(className = "dh-workspace-area-actions__add")
    public WebElement addNewButton;

    @FindBy(css = "div .dh-workspace-area-actions__save button")
    public  WebElement saveButton;

    @FindBy(css = "div .dh-workspace-area-actions__delete button")
    public WebElement deleteButton;

    @FindBy(className = "settings-account__avatar")
    public WebElement userAvatar;
    
    @FindBy(css = ".app-snackbar__content__text") //pop-up in right-bottom corner
    public WebElement message;
    
    @FindBy(css = "body .dz-hidden-input")
    public WebElement fileUpload;
    
    
    
    /**
     * Field elements
     */

    @FindBy(css = "div .text-field__name input")
    public WebElement nameField;

    @FindBy(css = "div .textarea__description textarea")
    public WebElement descriptionField;

    @FindBy(css = "div .text-field__code input")
    public WebElement codeField;

    public MainPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
