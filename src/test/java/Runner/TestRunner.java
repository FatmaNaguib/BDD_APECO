package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features="./src/test/resources/InprogressFeatures/",
		glue = {"Definitions","Hooks"},
		tags = "@UserLogin",
		monochrome = true,
		 plugin = {"json:target/cucumber.json",
				 "json:target/json/file.json"}
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)




public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
