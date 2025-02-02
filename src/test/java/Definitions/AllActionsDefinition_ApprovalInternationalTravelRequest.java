package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ApprovalInternationalTravelRequest extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ApprovalInternationalTravelRequest(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}

@Then("The Applicant Applies for a New International Travel Request")
public void the_applicant_applies_for_a_new_international_travel_request() throws AWTException, InterruptedException, IOException {
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	userWorkspacePageActions.clickonSideMenu_Services_link();
	userServicesPageActions.clickInternationalTravelServiceLink();
//	String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//	userSchoolsListActions.selectSchool(licensedSchoolName);			
	userSchoolsListActions.selectSchool("New Education School 64590");
	String internationalTravelRequestNumber = approvalforInternationalTravelActions.submitInternationalTravelRequest("Egypt",  "Pre-Kindergarten", "2025-11-20", "2025-11-22", "Goal of The Trip", "Emad Ali", "01005065998", "employee_01@hotmail.com", "Daily Trip Program","Academic Plan.pdf");
	scenarioContext.setData("internationalTravelRequestNumber",internationalTravelRequestNumber );
	assertTrue(internationalTravelRequestNumber.length() > 0);
	//Thread.sleep(1000);
	commonFunctions.implicitWait(10);
	userWorkspacePageActions.logout();
}

@Then("The Employee Approves The International Travel Request")
public void the_employee_approves_the_international_travel_request() throws InterruptedException, IOException {
	Thread.sleep(1000);
	//commonFunctions.implicitWait(10);
	driver.get(properties.getProperty("AdminPortalUrl"));	
	adminLoginPageActions.selectEngLang();	  
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String internationalTravelRequestNumber = (String) scenarioContext.getData("internationalTravelRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(internationalTravelRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(internationalTravelRequestNumber);
	 
	adminInternationalTravelActions.employeeApprovesInternationalTravelRequest();
	adminAgentQueueActions.checkRequestStatus(internationalTravelRequestNumber, "Closed - Accepted");

//	 adminAgentQueueActions.adminOpenAgentQueueScreen();
//	 commonFunctions.implicitWait(20);
//	  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(internationalTravelRequestNumber));
//	 commonFunctions.implicitWait(10);
//      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//       System.out.println("Request Status: " + requestStatus);
//     assertEquals(requestStatus,"Closed - Accepted");
     //  adminAgentQueueActions.adminLogout();
}
}
