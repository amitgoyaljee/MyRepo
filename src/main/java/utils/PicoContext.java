package utils;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class PicoContext {

    Map<String,String> stepData;
    private WebDriver driver;

  public  PicoContext(){
        stepData=new HashMap<>(); // logic of pico costructor
    }

    public String getContext(String key) {
        return stepData.get(key);
    }

    public void setContext(String key, String value) {
        stepData.put(key,value);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

