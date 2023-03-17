package ru.lanit.utils;

import java.time.Duration;

public class Constants {

    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";

    public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";

    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/configuration.properties";

    public static final int IMPLICIT_WAIT_TIME = 10;

    public static final int EXPLICIT_WAIT_TIME = 30;

    //public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshot/";

    public static final String STORAGE_URL = "https://docshouse-test.k8s.lan.lanit.ru/storages-service/storages";

    public static final String UPLOAD_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/123.pdf";
}
