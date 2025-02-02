package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class test extends APECOTestBase{
	private final ScenarioContext scenarioContext;

	public test(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}
	
	@Given("The Admin Opens Agent screen")
	public void the_admin_opens_agent_screen() throws InterruptedException, IOException {
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
	    
	    
	    adminAgentQueueActions.adminOpenAgentQueueScreen();
	    adminAgentQueueActions.adminSearchforaRequest("3761");
	        String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
	        System.out.println("Request Status: " + requestStatus);
	    
	    
	}
}
