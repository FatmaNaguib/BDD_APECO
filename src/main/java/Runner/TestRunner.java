package Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		features = "./src/main/resources/Features/InitialApproval.feature",
		glue = {"Definitions", "StepDefinitions", "Hooks"},
		tags = "@UserLogin",
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
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
