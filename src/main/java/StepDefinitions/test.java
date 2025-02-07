package StepDefinitions;



import java.io.IOException;



import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;



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
