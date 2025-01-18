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
	super();

	}
	
	
	@Before(value = "@UserLogin")		
	public void userSetup() throws IOException {
		PageFactory.initElements(driver,this);
		initialization(properties.getProperty("url"));
		UserPagesInitialization();	
	}
	
	@Before(value = "@AdminLogin")		
	public void adminsetup() throws IOException {
		PageFactory.initElements(driver,this);

		initialization(properties.getProperty("AdminPortalUrl"));
		AdminPagesInitialization();
		
	}

	
//@After ()
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			 scenario.attach(screenshot, "image/png", scenario.getName()); 
//		}
//		 if (driver != null) {
//			// driver.close();
//	            driver.quit();
//	        }
//}
}
