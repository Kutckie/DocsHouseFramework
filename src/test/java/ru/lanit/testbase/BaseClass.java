package ru.lanit.testbase;

import java.io.ObjectInputFilter;
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
//    public String environment = ConfigsReader.getProperty("config_environment");
    
    /**
     * This method will create a driver
     */
    public static void setUp() {
        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        
        switch (ConfigsReader.getProperty("browser").toLowerCase()) { //driver setup
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
        driver.get(ConfigsReader.getProperty("DemoStandURL"));
        
//        switch (environment) {
//            case "test":
//                environment = ConfigsReader.getProperty("TestStandURL");
//                driver.get(environment);
//                break;
//            case "demo":
//                environment = ConfigsReader.getProperty("DemoStandURL");
//                driver.get(environment);
//                break;
//            default:
//                throw new RuntimeException("wrong env");
//        }

        // we initialize all the page elements of the classes in package ru.lanit.pages
        PageInitializer.initialize();
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