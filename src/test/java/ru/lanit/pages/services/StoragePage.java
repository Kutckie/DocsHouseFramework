package ru.lanit.pages.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ru.lanit.testbase.BaseClass.driver;

public class StoragePage {

    /**
     * Storage Creation Layer
     */

    @FindBy(css = "div .text-field__max-elements-size input")
    public WebElement storageVolume;

    @FindBy(css = "div .text-field__free-threshold input")
    public WebElement storageThreshold;

    @FindBy(css = "div .text-field__uri input")
    public WebElement storageConnectionSettings;

    @FindBy(xpath = "//td[contains(text(), \"Selenium\")]") //used to search element containers with "Selenium" text
    public WebElement seleniumElements;

    @FindBy(xpath ="//div[contains(text(), \"Selenium\")]/..//input[@type=\"checkbox\"]")
    public WebElement storageCheckbox;

    @FindBy(xpath = "/html/body/div/div[1]/main/div/div/dh-storages-service/div/div/div/div/div/div/div[2]/div[1]/form/div[4]/div[1]/div/div/div[1]/div/input") //div .switch__deduplication input
    public WebElement deduplicationButton;

    @FindBy(css = "div .text-field__retention-period input")
    public WebElement policyRetentionPeriod;

    @FindBy(css = "div .policy-linked-storages__add-storage button")
    public WebElement policyAddButton;

    @FindBy(xpath = "/html/body/div/div[4]/div/div/div[2]/div[2]/div[1]/table/tbody/tr[11]/td[1]/div/div/i")
    public WebElement policyCheckbox;



    public StoragePage() {
        PageFactory.initElements(driver, this);
    }
}
