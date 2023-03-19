package ru.lanit.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

    private static Properties prop;
    
    /*
      Configuration file name - configuration.properties
     */
    
    
    /**
     * This method will read the properties file
     *
     * @param String filePath
     */
    public static void readProperties(String filePath) {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method will return the value for a specific key
     *
     * @param String key
     * @return String value
     */
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
    
    /**
     * This method will return stand url based on stand name
     *
     * @param String key
     * @return String value
     */
    public static String getStandURL(String standName) {
        String url;
        if (standName.equals("демо")) {
            url = prop.getProperty("DemoStandURL");
        } else { // "тест" stand
            url = prop.getProperty("TestStandURL");
        }
        return url;
    }

}