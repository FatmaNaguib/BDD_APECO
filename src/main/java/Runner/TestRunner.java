package Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




//@ExtendedCucumberOptions(
//		
//		jsonReport = "target/cucumber.json",
//        retryCount = 3,
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        overviewReport = true,
//        //coverageReport = true,
//        jsonUsageReport = "target/cucumber-usage.json",
//        usageReport = true,
//        toPDF = true,
//     //   excludeCoverageTags = {"@flaky" },
//       // includeCoverageTags = {"@target/failedrerun.txt" },
//        outputFolder = "target"
//
//		)

@CucumberOptions(
		features="./src/main/resources/Features/ReducingEducationalStages2.feature",
		glue = {"Definitions","Hooks"},
		tags = "@UserLogin",
		monochrome = true,
		 plugin = {"json:target/cucumber.json",
				 "json:target/json/file.json",
				 "rerun:target/failedrerun.txt"
				 }
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)



@Listeners(TestNGListener.class)
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
//    @Test(retryAnalyzer = RetryAnalyzer.class) // Use retryAnalyzer here
//    public void runCucumber() {
//        // This method is intentionally left empty
//        // The Cucumber tests will be executed based on the configuration
//    }
	
	
//	   public static int retries = 0;
//	    public SampleTestRetry() {
//	    }
//	    @RetryAcceptance
//	    public static boolean retryCheck(Throwable e) {
//	        // Does not allow re-run if error message contains "Configuration failed" phrase
//	        return !e.getMessage().contains("Configuration failed");
//	    }
}
