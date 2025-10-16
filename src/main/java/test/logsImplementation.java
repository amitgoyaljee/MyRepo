package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Log;

import java.util.concurrent.TimeUnit;

public class logsImplementation {

    private static Logger log = LogManager.getLogger(Log.class);
// we have a log4j2.xml file under src/main/resources
    // we can create utils method by overriding
    //logs folder contains file all.log

    WebDriver driver;
    @Test
        public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
            log.info("Starting login test");
            //or we can pick from our Log class
           Log.info("Starting login test info");
            driver.get("https://example.com/login");
            log.debug(" Navigated to login page debug");
            // Your test code
            log.error("Login test completed error");

        log.warn("Login test completed warn");

        driver .close();

    }
    }


