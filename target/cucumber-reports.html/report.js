$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/feature/my.feature");
formatter.feature({
  "name": "my first featue",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amit"
    }
  ]
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs22.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.match({
  "location": "steps.MyStepdefs22.userNavigateToLogInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Credentials to LogIn",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "steps.MyStepdefs22.userEntersCredentialsToLogIn(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs22.messageDisplayedLoginSuccessfully()"
});
formatter.result({
  "status": "passed"
});
});