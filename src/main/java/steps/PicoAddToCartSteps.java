package steps;


import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PicoContext;


//    picoContext.setContext("itemName","Sauce Labs Backpack");
// set this for other class
public class PicoAddToCartSteps {
    private WebDriver driver;
    private PicoContext picoContext;

    public PicoAddToCartSteps(PicoContext picoContext) {
        this.picoContext=picoContext;
        this.driver = picoContext.getDriver();
    }

    @When("I add {string}")
    public void _add(String AddCart) {
        WebElement addtoCart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        picoContext.setContext("itemName","Sauce Labs Backpack");
        addtoCart.click();
    }


}
