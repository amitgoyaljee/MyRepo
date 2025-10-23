package steps;

import DriverManager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


public class MyStepdefs22 {
    WebDriver driver;
    @Given("User is raising a delivery request for automobile spare parts")
    public void userIsRaisingADeliveryRequestForAutomobileSpareParts() {
    }

    @When("User enters the {string}, a <{string}> is set as a system default")
    public void userEntersTheAIsSetAsASystemDefault(String arg0, String arg1) {
    }


    @Then("User submits delivery request")
    public void userSubmitsDeliveryRequest() {
    }

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
        driver=new ChromeDriver();
       // ChromeOptions opt= new ChromeOptions();
      //  opt.addArguments("--headless"); // Run in headless mode
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("User Navigate to LogIn Page")
    public void userNavigateToLogInPage() {
        driver.findElement(By.id("abc"));
    }

    @And("User enters Credentials to LogIn")
    public void userEntersCredentialsToLogIn(DataTable dt) {
       List<List<String>> data = dt.cells();
       System.out.println(data.get(0).get(0));//testuser_1
        System.out.println("amit");
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully(Scenario scenario) {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        if (driver != null && scenario.isFailed()) {
            // Take screenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Create a unique filename
            String screenshotName = "screenshot_" + UUID.randomUUID() + ".png";

            // Path to save screenshot
            String destinationPath = "screenshots/" + screenshotName;

            try {
                FileUtils.copyFile(srcFile, new File(destinationPath));
                System.out.println("Screenshot saved: " + destinationPath);
            } catch (IOException e) {
                System.err.println("Failed to save screenshot: " + e.getMessage());
            }
        }
        driver.close();
    }
}




