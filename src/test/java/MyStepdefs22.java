import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefs22 {
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
