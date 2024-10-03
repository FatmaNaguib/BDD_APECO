package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features="D:\\My Projects\\BDD_APECO\\src\\test\\resources\\Features",
		glue = {"StepDefinitions","Hooks"},
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
