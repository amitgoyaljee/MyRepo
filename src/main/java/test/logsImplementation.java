package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Log;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class logsImplementation {

    private static Logger log = LogManager.getLogger(logsImplementation.class);
// we have a log4j2.xml file under src/main/resources
    // we can create utils method by overriding
    //logs folder contains file all.log

    WebDriver driver;
    @Test
        public void loginTest() { //info erroe warn debug fatal
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

        try {
            assertEquals(401, 400);
            log.info("Login test passed for invalid credentials.");
        } catch (AssertionError e) {
            log.error("Login test failed! Expected 401 but got " + 401, e);
            throw e; // rethrow to mark the test as failed
        }
        log.warn("Login test completed warn");

        driver .close();

    }
    }

// 111111111111111<dependencies>
//    <!-- Core Log4j2 API -->
//222222222222222222
//    create log4j2.xml file  set location of log and format time+
// 333333333333
//  private static Logger log = LogManager.getLogger(Log.class);
//     log.warn("Login test completed warn");

//        ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < OFF



