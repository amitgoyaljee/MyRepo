package selenide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class selenide_ {
    WebDriver driver;
    @Test
    public void userCanLoginByUsername() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("https://demo.guru99.com/V4/");
        open("google.com");
        //$(By.name("username")).setValue("johny");
       // $("#submit").click();
       // $(".success-message").shouldHave(text("Hello, Johny!"));
    }
}
