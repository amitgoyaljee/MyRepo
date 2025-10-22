package DriverManager;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
    }

    By username = By.id("username");

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
}

