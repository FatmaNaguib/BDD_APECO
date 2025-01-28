package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_PublishingAnnouncementsforPrivateSchoolsRequest extends APECOTestBase {

	
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_PublishingAnnouncementsforPrivateSchoolsRequest(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		
		AdminPagesInitialization();
		UserPagesInitialization();
	}

	@Then("The Applicant Applies for a New Publishing Announcements for Private Schools Request")
	public void the_applicant_applies_for_a_new_publishing_announcements_for_private_schools_request() throws AWTException, InterruptedException, IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickPublishingAnnouncementsServiceLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);	
	//	userSchoolsListActions.selectSchool("New Education School 27938");	
		String publishingAnnouncementsRequestNumber = publishingAnnouncementsPageActions.submitPublishingAnnouncementsRequest("Social media", "Omar.jpeg");
		scenarioContext.setData("publishingAnnouncementsRequestNumber",publishingAnnouncementsRequestNumber );
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
	}

	@Then("The Employee Approves The Publishing Announcements for Private Schools Request")
	public void the_employee_approves_the_publishing_announcements_for_private_schools_request() throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		
		driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");	
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String publishingAnnouncementsRequestNumber = (String) scenarioContext.getData("publishingAnnouncementsRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(publishingAnnouncementsRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminApprovalofAnnualActivitiesandProgramsActions.employeeApprovesTheApprovalofAnnualActivitiesandProgramsRequest();
	}
}
