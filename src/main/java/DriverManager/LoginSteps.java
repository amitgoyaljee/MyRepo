package DriverManager;

import io.cucumber.java.en.Given;


public class LoginSteps {

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        DriverManager.getDriver().get("https://example.com/login");
    }
}
