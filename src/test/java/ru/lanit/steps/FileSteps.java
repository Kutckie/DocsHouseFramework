package ru.lanit.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import ru.lanit.utils.CommonMethods;
import ru.lanit.utils.ConfigsReader;

import static ru.lanit.utils.Constants.UPLOAD_FILE_PATH;

public class FileSteps extends CommonMethods {
    @When("user uploads file")
    public void userUploadsFile(){
        unhide(driver, filePage.fileUpload);
        wait(1);
        attachFile(driver, filePage.fileUpload, UPLOAD_FILE_PATH);
        click(mainPage.saveButton);
    }

    @Given("user is on File Service Page")
    public void userIsOnFileServicePage() {
        driver.get(ConfigsReader.getProperty("FileServiceURL"));
    }
}
