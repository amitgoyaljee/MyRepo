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
  "name": "I login with username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.PicoLoginSteps.i_login_with_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add \"Sauce Labs Backpack\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PicoAddToCartSteps._add(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "remove item from cart",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.PicoRemoveCartSteps.remove()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify item removed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.PicoRemoveCartSteps.i_VerifyRemoved()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});