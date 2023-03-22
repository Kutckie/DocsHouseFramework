package ru.lanit.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.junit.Assert;
import ru.lanit.utils.CommonMethods;
import ru.lanit.utils.ConfigsReader;

public class StorageSteps extends CommonMethods {
    
    private int generated_number = randomGen(100001);
    
    @Given("пользователь находится на основной странице сервиса Хранилищ")
    public void userIsOnStorageCreationForm() {
        driver.get(ConfigsReader.getProperty("StorageCreationURL"));
        wait(2);
    }
    
    @And("user can see Storage Creation form")
    public void userCanSeeStorageCreationForm() {
        Assert.assertTrue(mainPage.descriptionField.isDisplayed());
    }
    
    @When("пользователь заполняет все обязательные поля")
    public void userFillsAllRequiredFields() {
        sendText(mainPage.nameField, "SeleniumTestStorage_№" + generated_number);
        sendText(mainPage.codeField, (randomGen(1000000)));
        sendText(mainPage.descriptionField, "SeleniumTest");
        sendText(storagePage.storageVolume, "10000");
        sendText(storagePage.storageThreshold, "5");
        sendText(storagePage.storageConnectionSettings, "mongodb://172.19.91.151:27017/test-storage");
    }
    
    @And("I validate that all required fields are filled")
    public void iValidateThatAllRequiredFieldsAreFilled() {
        Assert.assertTrue(mainPage.saveButton.isEnabled());
    }
    
    @And("пользователь редактирует поле")
    public void userEditsStorageFields() {
        sendText(mainPage.descriptionField, "_Edited");
        sendText(storagePage.storageThreshold, randomGen(100));
    }
    
    @When("user clicks Storage checkbox")
    public void userClicksStorageCheckbox() {
        getJSObject().executeScript("arguments[0].click();", storagePage.storageCheckbox);
    }
    
    @Given("user is on Storage Main Form")
    public void userIsOnStorageMainForm() {
        driver.get(ConfigsReader.getProperty("StorageServiceURL"));
    }
    
    @And("user clicks DELETE button")
    public void userClicksDELETEButton() {
        click(mainPage.deleteButton);
    }
    
    @And("user confirms Storage deletion")
    public void userConfirmsStorageDeletion() {
        click(mainPage.modalDeleteButton);
        //getJSObject().executeScript("arguments[0].click();", storagePage.modalDeleteButton); //$('Удалить').trigger('click')
        wait(3);
    }
    
    @Given("user is on Policy Creation Form")
    public void userIsOnPolicyCreationForm() {
        driver.get(ConfigsReader.getProperty("PoliciesCreationURL"));
    }
    
    @When("user clicks DEDUPLICATION checkbox")
    public void userClicksDEDUPLICATIONCheckbox() {
        getJSObject().executeScript("arguments[0].click();", storagePage.deduplicationButton);
    }
    
    @When("user fills all required fields on Policy Creation Form")
    public void userFillsAllRequiredFieldsOnPolicyCreationForm() {
        sendText(mainPage.nameField, "SeleniumTestPolicy" + generated_number);
        sendText(mainPage.codeField, (randomGen(1000000)));
        sendText(storagePage.policyRetentionPeriod, 5);
    }
    
    @When("user clicks ADD new policy button")
    public void userClicksADDNewPolicyButton() {
        click(storagePage.policyAddButton);
    }
    
    @And("clicks checkbox")
    public void clicksCheckbox() {
        getJSObject().executeScript("arguments[0].click();", storagePage.policyCheckbox);
    }
}
