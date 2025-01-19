package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features="./src/test/resources/Features/AllActions_FinalApproval.feature",
		glue = {"Definitions","Hooks"},
		tags = "@UserLogin",
		monochrome = true,
		 plugin = {"json:target/cucumber.json",
				 "json:target/json/file.json"}
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
