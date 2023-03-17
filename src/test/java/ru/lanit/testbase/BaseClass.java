package ru.lanit.testbase;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.lanit.utils.ConfigsReader;
import ru.lanit.utils.Constants;

public class BaseClass {

    public static WebDriver driver;

    /**
     * This method will create a driver and return it
     *
     * @return WebDriver driver
     */
    public static WebDriver setUp() {
        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperty("browser").toLowerCase()) {
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.setAcceptInsecureCerts(true);
                options.addArguments("--lang=ru");
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                //System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Browser is not supported!");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
        driver.manage().window().maximize();
        driver.get(ConfigsReader.getProperty("URL"));

        // we initialize all the page elements of the classes in package ru.lanit.pages
        PageInitializer.initialize();

        return driver;
    }

    /**
     * This method will quit the browser
     */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}