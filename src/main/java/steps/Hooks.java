package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PicoContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class Hooks {

    private final PicoContext context;
    public static WebDriver driver;

    public Hooks(PicoContext context) {
        this.context = context;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        context.setDriver(driver);
    }

    @After("@selenium")
    public void tearDown(Scenario scenario) {
//        System.out.println("aaaaaaaaaaaaaaaaaaa");
//        if (context.getDriver() != null && scenario.isFailed()) {
//            // Take screenshot
//            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//            // Create a unique filename
//            String screenshotName = "screenshot_" + UUID.randomUUID() + ".png";
//
//            // Path to save screenshot
//            String destinationPath = "screenshots/" + screenshotName;
//
//            try {
//                FileUtils.copyFile(srcFile, new File(destinationPath));
//                System.out.println("Screenshot saved: " + destinationPath);
//            } catch (IOException e) {
//                System.err.println("Failed to save screenshot: " + e.getMessage());
//            }
//        }
        context.getDriver().close();
       // context.quitDriver();

    }
}