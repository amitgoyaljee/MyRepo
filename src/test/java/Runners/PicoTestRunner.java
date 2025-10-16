package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/feature"},
         glue = {"steps"},
        tags="@pico",
        plugin = {
                "pretty",
                "json:target/cucumber-report.json",
                "html:target/cucumber-html-report",
                "rerun:target/rerun.txt"    // rerun plugin to capture failed scenarios
        },
        dryRun = false,
        strict = true
)

public class PicoTestRunner {

}

// Create a separate runner for rerun

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "@target/rerun.txt",   // note the '@' symbol - runs failed scenarios listed in this file
//        glue = {"steps"},
//        plugin = {
//                "pretty",
//                "html:target/cucumber-rerun-report.html",
//                "json:target/cucumber-rerun.json"
//        },
//        monochrome = true
//)
//public class ReRun {
//}

//Create a new runner class that uses the rerun.txt file to rerun only failed scenarios:



//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Cucumber TestNG Suite">
//    <test name="Run Cucumber Feature">
//        <classes>
//            <class name="Runner"/>
//        </classes>
//    </test>
//</suite>
