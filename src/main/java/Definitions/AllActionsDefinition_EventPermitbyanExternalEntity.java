package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_EventPermitbyanExternalEntity extends APECOTestBase {

	private final ScenarioContext scenarioContext;
	public AllActionsDefinition_EventPermitbyanExternalEntity(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;

		AdminPagesInitialization();
		UserPagesInitialization();
	}
	@Then("The Applicant Applies for a New Event Permit by an External Entity Actions Request")
	public void the_applicant_applies_for_a_new_event_permit_by_an_external_entity_actions_request() throws IOException, InterruptedException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickEventPermitbyanExternalEntityServiceLink();
		
//		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//		userSchoolsListActions.selectSchool(licensedSchoolName);
		
		userSchoolsListActions.selectSchool("New Education School 64590");	
		eventPermitbyanExternalEntityActions.enterEventData("Lecture", "Implementation Mechanism Value", "Attendee Names", "Third Party Name", "Mohamed Mouner", "012255211", "2025-11-12 01:37 AM", "2025-11-15 01:37 AM");
		eventPermitbyanExternalEntityActions.enterEventAttachments("UploadFile.pdf","UploadFile.pdf");
		String eventPermitbyanExternalEntityRequestNumber = eventPermitbyanExternalEntityActions.submitEventPermitbyanExternalEntityRequest();

		scenarioContext.setData("eventPermitbyanExternalEntityRequestNumber", eventPermitbyanExternalEntityRequestNumber);
		assertTrue(eventPermitbyanExternalEntityRequestNumber.length() > 0);  
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
	}
	
	@Then("The Employee Approves The Event Permit by an External Entity Actions Request")
	public void the_employee_approves_the_event_permit_by_an_external_entity_actions_request() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");

		commonFunctions.implicitWait(10);
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String eventPermitbyanExternalEntityRequestNumber = (String) scenarioContext.getData("eventPermitbyanExternalEntityRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(eventPermitbyanExternalEntityRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(eventPermitbyanExternalEntityRequestNumber);
		adminEventPermitbyanExternalEntityActions.adminApprovesTheEventPermitbyanExternalEntity();
		 adminAgentQueueActions.checkRequestStatus(eventPermitbyanExternalEntityRequestNumber, "Closed - Accepted");
	}
}
