package ru.lanit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.lanit.testbase.BaseClass;

public class MainPage {

    /**
     * Buttons and misc elements
     */
    
    @FindBy(css = "div .dh-workspace-area-actions__search button")
    public WebElement searchButton;
    
    @FindBy(xpath = "//span[contains(text(), \"Сохранить\")]/..")
    public WebElement searchSAVEButton;
    
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
    
    @FindBy(css = "#app > div.v-dialog__content.v-dialog__content--active > div > div > div.v-card__actions > div:nth-child(3) > button")
    public WebElement modalDeleteButton;
    
    
    
    /**
     * Field elements
     */
    @FindBy(xpath = "//label[contains(text(), \"Название объекта\")]//input")
    public WebElement searchNameField;

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
