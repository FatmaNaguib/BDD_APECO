package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failedrerun.txt",
		glue = {"Definitions", "StepDefinitions", "Hooks"},
		tags = "@UserLogin",
		monochrome = true,
		plugin = {
			"json:target/cucumber.json",
			"json:target/json/file.json",
			"rerun:target/failedrerun.txt"
		}
		)

public class FailedRun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
