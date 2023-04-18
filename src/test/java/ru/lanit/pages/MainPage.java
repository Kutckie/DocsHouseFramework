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
    
    @FindBy(xpath = "/html/body/div/div[1]/main/div/div/dh-documents-service/div/div/div/div/div/div[1]/div[2]/div[1]/div[3]/div[2]/button") //request class  //span[contains(text(), "Сохранить")]/..
    public WebElement searchSAVEButton;
    
    @FindBy(css = "div .dh-workspace-area-actions__add button")
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
    
    @FindBy(css = "div .v-dialog--active") //modal popup window
    public WebElement searchModalWindow;
    
    @FindBy(xpath = "//input[@placeholder='Введите название поискового запроса']") //modal popup field within "create search template" function
    public WebElement searchModalField;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[4]/div/div/div[3]/div[3]/button") //modal popup "save" button within "create search template" function
    public WebElement searchModalSAVEButton;
    
    @FindBy(xpath = "//span[contains(text(), \"Отмена\")]/..")
    public WebElement searchModalDECLINEButton;
    
    @FindBy(xpath = "/html/body/div/div[4]/div/div/div[2]/div/div")
    public WebElement searchPlaceholder;
    
    @FindBy(css = "div .v-expansion-panel-header")
    public WebElement expansionPanel;
    
    @FindBy(css = "div .attrset-card__add-prop button")
    public WebElement expansionPanelAddButton;
    
    
    
    /**
     * Field elements
     */
    @FindBy(css = "div .v-data-footer__pagination")
    public WebElement paginationNumber;
    
    @FindBy(xpath = "//label[contains(text(), \"Название объекта\")]//input")
    public WebElement searchNameField;
    
    @FindBy(xpath = "//label[contains(text(), \"Наименование\")]//input") //search field for Model Object service
    public WebElement searchNameFieldMO;

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
