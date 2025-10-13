package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources"}
        ,glue={"src/test/java"},
        tags="@amit",
        dryRun = false,
        strict = true
)

public class Runner{

}

//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Cucumber TestNG Suite">
//    <test name="Run Cucumber Feature">
//        <classes>
//            <class name="Runner"/>
//        </classes>
//    </test>
//</suite>