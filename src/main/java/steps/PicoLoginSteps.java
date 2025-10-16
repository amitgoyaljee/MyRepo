package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PicoContext;


public class PicoLoginSteps {

    WebDriver driver;

    private PicoContext picoContext;

    // PicoContainer injects WebDriver and LoginPage
    public PicoLoginSteps(PicoContext picoContext) {
        this.picoContext=picoContext;
        this.driver = picoContext.getDriver();
    }

    @Given("I open the SauceDemo login page")
    public void i_open_the_sauce_demo_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_credentials(String username, String password) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
//        driver=new ChromeDriver();
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

    }

}
