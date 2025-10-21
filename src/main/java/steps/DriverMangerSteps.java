package steps;

import DriverManager.DriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class DriverMangerSteps {

        WebDriver driver1;

        @Given("User is on Home Page1")
        public void userIsOnHomePage() {
            // Get the existing driver from DriverManager (initialized in @Before hook)

            // Use the driver as needed
         //   DriverManager.getDriver().get("https://www.google.com/");//e this URL to your app’s homepage
        }
}
