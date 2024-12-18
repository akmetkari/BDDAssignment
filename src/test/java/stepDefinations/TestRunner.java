package stepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features", // Path to your feature files
        glue = "stepDefinations", // Path to your step definition files
        dryRun = false, // Set to true to get a list of undefined steps without executing
        monochrome = true, // Display console output in black and white for better readability
        plugin = {"pretty", "html:target/cucumber-reports/report.html", 
                  "json:target/cucumber-reports/report.json", 
                  "junit:target/cucumber-reports/report.xml"} 
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

