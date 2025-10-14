package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/feature"},
         glue = {"steps"},
        tags="@amit",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        dryRun = false,
        strict = true
)

public class TestRunner {

}