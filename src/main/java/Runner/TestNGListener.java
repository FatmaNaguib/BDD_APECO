package Runner;

import org.testng.IExecutionListener;
import org.testng.TestNG;

import java.io.File;


public class TestNGListener implements IExecutionListener {
	 private static int executionCount = 0;
	
	 @Override
	    public void onExecutionFinish() {
		 
		 if (executionCount >= 3) {
	            return;  // Exit early if the method has already been executed twice
	        }
	        // After all tests are finished, check for failed tests
		 //target/surefire-reports/Suite/testng-failed.xml
	        File failedFile = new File("target/surefire-reports/Suite/testng-failed.xml");
	        if (failedFile.exists() && failedFile.length() > 0) {
	            // If there are failed tests, re-run them
	            System.out.println("***************Rerunning failed tests...***********************");

	            TestNG testNG = new TestNG();
	            java.util.List<String> suites = java.util.List.of(failedFile.getAbsolutePath());
	            testNG.setTestSuites(suites);
	            testNG.run();
	            executionCount++;
	        }
	    }
	 @Override
	    public void onExecutionStart() {
	       
	    }
}
