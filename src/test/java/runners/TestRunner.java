package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import utilities.ExtentManager;

@CucumberOptions(
        features =
                "src/test/resources/features",

        glue = {
                "stepdefinitions",
                "hooks"
        },

        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        }
)

public class TestRunner
        extends AbstractTestNGCucumberTests {

        @AfterClass
        public static void tearDown() {

                ExtentManager.getReport().flush();
        }
}