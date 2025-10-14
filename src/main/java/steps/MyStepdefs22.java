package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class MyStepdefs22 {
    WebDriver driver;
    @Given("User is raising a delivery request for automobile spare parts")
    public void userIsRaisingADeliveryRequestForAutomobileSpareParts() {
    }

    @When("User enters the <{string}>, a <{string}> is set as a system default")
    public void userEntersTheAIsSetAsASystemDefault(String arg0, String arg1) {
    }


    @Then("User submits delivery request")
    public void userSubmitsDeliveryRequest() {
    }

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @When("User Navigate to LogIn Page")
    public void userNavigateToLogInPage() {
    }

    @And("User enters Credentials to LogIn")
    public void userEntersCredentialsToLogIn(DataTable dt) {
       List<List<String>> data = dt.cells();
       System.out.println(data.get(0).get(0));//testuser_1
        System.out.println("amit");
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
    }
}
