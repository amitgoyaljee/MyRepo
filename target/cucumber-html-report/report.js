$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/feature/PicoContainer.feature");
formatter.feature({
  "name": "Login to SauceDemo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@pico"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the SauceDemo login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.PicoLoginSteps.i_open_the_sauce_demo_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fail login with username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PicoLoginSteps.f_login_with_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});