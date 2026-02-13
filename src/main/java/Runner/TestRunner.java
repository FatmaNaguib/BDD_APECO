package Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Test Runner for Cucumber BDD tests.
 * 
 * To override tags, use one of the following:
 * - System property: -Dcucumber.filter.tags=@YourTag
 * - cucumber.properties file: cucumber.filter.tags=@YourTag
 * - Maven: mvn test -Dcucumber.filter.tags=@YourTag
 */
@CucumberOptions(
		features = "./src/main/resources/Features",
		glue = {"Definitions", "StepDefinitions", "Hooks"},
		tags = "@UserLogin", // Can be overridden via -Dcucumber.filter.tags or cucumber.properties
		monochrome = true,
		plugin = {
			"json:target/cucumber.json",
			"json:target/json/file.json",
			"rerun:target/failedrerun.txt"
		}
		)



@Listeners(TestNGListener.class)
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
