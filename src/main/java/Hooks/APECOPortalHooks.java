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
	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed() && driver != null) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
		} catch (Exception e) {
			System.err.println("Failed to capture screenshot: " + e.getMessage());
		} finally {
			if (driver != null) {
				try {
					driver.quit();
				} catch (Exception e) {
					System.err.println("Failed to close driver: " + e.getMessage());
				}
			}
		}
	}
}
