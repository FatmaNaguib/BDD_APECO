package Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class APECOPortalHooks extends APECOTestBase {

	
	
	public APECOPortalHooks()   throws IOException {
		

	}
	
	
	@Before		
	public void setup() throws IOException {
		PageFactory.initElements(driver,this);
		initialization();
		PagesInitialization();
		
	}

	
@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(screenshot, "image/png", scenario.getName()); 
		}
		 if (driver != null) {
			// driver.close();
	            driver.quit();
	        }
	
}
}
