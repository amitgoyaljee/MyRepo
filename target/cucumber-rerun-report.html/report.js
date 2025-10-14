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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: net::ERR_NAME_NOT_RESOLVED\n  (Session info: chrome\u003d141.0.7390.77)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-N35E4CL\u0027, ip: \u0027192.168.1.33\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.8\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 141.0.7390.77, chrome: {chromedriverVersion: 141.0.7390.76 (d6fcfbb51aac..., userDataDir: C:\\Users\\amitg\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:62823}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 44ef8bda527838a56df0dd56ec4b0a44\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat steps.MyStepdefs22.userIsOnHomePage(MyStepdefs22.java:34)\r\n\tat ✽.User is on Home Page(file:///C:/Users/amitg/SeleniumProjects/Selenium_Project/src/test/feature/my.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.match({
  "location": "steps.MyStepdefs22.userNavigateToLogInPage()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs22.messageDisplayedLoginSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
});