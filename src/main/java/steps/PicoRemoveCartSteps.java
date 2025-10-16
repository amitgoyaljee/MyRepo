package steps;


import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PicoContext;


public class PicoRemoveCartSteps {

   WebDriver driver;
    PicoContext picoContext;
    public PicoRemoveCartSteps(PicoContext picoContext) {

        this.picoContext=picoContext;
        this.driver = picoContext.getDriver();
    }

    //  String item=picoContext.getContext("itemName");
    // get this data from-PicoAddToCartSteps- picoContext.setContext("itemName","Sauce Labs Backpack");
    @Then("verify item removed")
    public void i_VerifyRemoved() {
        String item=picoContext.getContext("itemName");
        WebElement removedItem=driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
    System.out.println("Item received from prevoius step-----"+item);
        System.out.println("removedItem------"+removedItem.getText());
    }

    @Then("remove item from cart")
    public void remove() {
        WebElement removeCart=driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));
        String item=picoContext.getContext("itemName");
        removeCart.click();


    }
}
