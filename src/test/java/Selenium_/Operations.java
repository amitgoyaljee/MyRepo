package Selenium_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Operations {


    WebDriver driver;

    @BeforeTest
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

    }

    @Test
    public void selectBook() {
        String url = ("https://www.spicejet.com");
        driver.get(url);
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

    }


    @Test
    public void chkBox() {
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio1.click();
        System.out.println("Radio Button Option 1 Selected");
        radio2.click();
        System.out.println("Radio Button Option 2 Selected");
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        option1.click();
        if (option1.isSelected()) {
            System.out.println("Checkbox is Toggled On");
        } else {
            System.out.println("Checkbox is Toggled Off");
        }
        driver.get("https://demo.guru99.com/test/facebook.html");
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
        for (int i = 0; i < 2; i++) {
            chkFBPersist.click();
            System.out.println("Facebook Persists Checkbox Status is -  " + chkFBPersist.isSelected());
        }
    }

    @Test
    public void drpDownSelect() {
        String baseURL = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseURL);
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");
        drpCountry.selectByIndex(1);
        drpCountry.selectByValue("ANGOLA");

        //Selecting Items in a Multiple SELECT elements
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
    }

    @Test
    public void drpDownWithoutSelect() {
        driver.get("https://www.bstackdemo.com/");
        driver.findElement(By.xpath("//select")).click();
        List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
        String option = "Highest to lowest";
        // Iterate the list using for loop
        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).getText().contains(option)) {
                allOptions.get(i).click();
                System.out.println("clicked");
                break;

            }
        }
    }

    @Test
    public void actionOp() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));
////html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr
        Actions builder = new Actions(driver);
        builder.moveToElement(link_Home).build().perform();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
    }


    @Test
    public void alerOp() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(2000);
        // Accepting alert
        alert.accept();
    }

    @Test
    public void WindowHandle_Demo() {
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        List<String> ls=new ArrayList<>(s1);
        System.out.println("Total window list---- "+ls.size());
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }

    @AfterTest
    public void closeBrowese() {
        driver.close();
    }
}

