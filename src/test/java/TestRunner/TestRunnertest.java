package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/features",                // Path to .feature files
        glue = "Stepdefinitions",

        plugin = {
                "pretty",                                            // Clean readable output
                "html:target/cucumber-reports.html",                 // HTML report
                "json:target/cucumber.json"                          // JSON report
        },
        monochrome = true,                                       // Clean console output
        tags = "@SmokeTest"                                      // Optional: Run only tagged tests
)
public class TestRunnertest extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = false)                          // Set to true for parallel
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
