package Selenium_;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class JSExecutor {
    WebDriver driver;
    @BeforeTest
    public void initializeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("https://demo.guru99.com/V4/");
    }

    @Test
    public void Login() throws IOException {

        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Launching the Site.
//        driver.get("https://demo.guru99.com/V4/");

        WebElement button =driver.findElement(By.name("btnLogin"));

        //Login to Guru99
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");

        //Perform Click on LOGIN button using JavascriptExecutor
        js.executeScript("arguments[0].click();", button);

        js.executeScript("arguments[0].scrollIntoView(true);", button);

        js.executeScript("arguments[0].value='Hello';", button);

        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot as file
        File source = ts.getScreenshotAs(OutputType.FILE);
        File src = ts.getScreenshotAs(OutputType.FILE);

        // Save the screenshot to your desired location
        File dest = new File("screenshot.png");
        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot saved successfully.");

        //To generate Alert window using JavascriptExecutor. Display the alert message
        js.executeScript("alert('Welcome to Guru99');");

    }
}
