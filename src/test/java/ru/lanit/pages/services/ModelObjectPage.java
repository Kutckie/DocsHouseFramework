package ru.lanit.pages.services;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ru.lanit.testbase.BaseClass.driver;


public class ModelObjectPage {
    
    @FindBy(css = "div .text-field__description input")
    public WebElement modelObjectDescriptionField;
    
    @FindBy(xpath = "/html/body/div/div[4]/div/div[1]/div")
    public WebElement addAttributeButton;
    
    @FindBy(css = ".menuable__content__active > .v-list > .v-list-item")
    public WebElement getAddAttributeDropDown;
    
    
    @FindBy(css = "div .select__type")
    public WebElement dataTypeDropDown;
    
//    @FindBy(css = "//div[contains(text(), \"Текстовое поле\")]")
    @FindBy(xpath = "//div[contains(text(), \"Текстовое поле\")]")
    public WebElement dataTypeDropDown_text;
    
    @FindBy(xpath = "/html/body/div/div[5]/div/div/div[2]/form/div[1]/div[1]/div/div/div[1]/div/input")
    public WebElement modalNameField;
    
    @FindBy(xpath = "//label[contains(text(), \"Код атрибута\")]//following-sibling::input")
    public WebElement modalCodeField;
    
    @FindBy(xpath = "//label[contains(text(), \"Порядок\")]//following-sibling::input")
    public WebElement modalOrderField;
    
    //div/label[contains(text(), "Описание")]//following-sibling::input
    @FindBy(xpath = "//div[contains(@class, 'text-field__description v-input--dense')]//child::input")
    public WebElement modalDescriptionField;
    
    //span[contains(text(), "Сохранить")]
    @FindBy(xpath = "//span[contains(text(), \"Сохранить\")]")
    public WebElement modalSaveButton;
    
    @FindBy(xpath = "//label[contains(text(), \"Значение по умолчанию\")]//following-sibling::input")
    public WebElement modalDefaultValue;
    
    public ModelObjectPage() {
        PageFactory.initElements(driver, this);
    }
}

