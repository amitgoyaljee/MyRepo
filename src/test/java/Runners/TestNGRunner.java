package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/feature"},
        glue = {"steps"},
        tags="@par",
        plugin = {
                "pretty",
                "json:target/cucumber-report.json",
                "html:target/cucumber-html-report",
                "rerun:target/rerun.txt"    // rerun plugin to capture failed scenarios
        }
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

    // Enable parallel execution of scenarios
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    // Through 1POM.xml- Properties- dataProvider count
    // 2 -runner--behalf of Tag upto 10 TCs run parallely
    //3 Suite- dataProvider=thread-count=2
}
