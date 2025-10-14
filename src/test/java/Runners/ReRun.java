package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",   // note the '@' symbol - runs failed scenarios listed in this file
        glue = {"steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-rerun-report.html",
                "json:target/cucumber-rerun.json"
        },
        monochrome = true
)
public class ReRun {
}