package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/feature"},
         glue = {"steps"},
        tags="@amit",
        plugin = {
                "pretty",
                "json:target/cucumber-report.json",
                "html:target/cucumber-html-report",
                "rerun:target/rerun.txt"    // rerun plugin to capture failed scenarios
        },
        dryRun = false,
        strict = true
)

public class TestRunner {

}

// Create a separate runner for rerun

//Create a new runner class that uses the rerun.txt file to rerun only failed scenarios:



