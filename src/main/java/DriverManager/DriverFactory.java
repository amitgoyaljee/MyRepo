package DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private WebDriver driver;

//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        // Set the driver in ThreadLocal via DriverManager
//        DriverManager.setDriver(driver);
//    }
//
//    @After
//    public void tearDown() {
//        WebDriver driver = DriverManager.getDriver();
//        if (driver != null) {
//            driver.quit();         // Properly quit the driver
//            DriverManager.unload(); // Remove from ThreadLocal to prevent memory leaks
//        }
//    }
}
