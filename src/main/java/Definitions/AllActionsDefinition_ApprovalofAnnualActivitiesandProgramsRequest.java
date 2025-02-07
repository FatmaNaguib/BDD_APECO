package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;


import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ApprovalofAnnualActivitiesandProgramsRequest extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ApprovalofAnnualActivitiesandProgramsRequest( ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}
	@Then("The Applicant Applies for a New Annual Activities and Programs Request")
	public void the_applicant_applies_for_a_new_annual_activities_and_programs_request() throws IOException, InterruptedException {
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	userWorkspacePageActions.clickonSideMenu_Services_link();
	 userServicesPageActions.clickAnnualActivitiesandProgramsLink();
	
	String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
	 userSchoolsListActions.selectSchool(licensedSchoolName);
//	 userSchoolsListActions.selectSchool("New Education School 64590");
	annualActivitiesandProgramsActions.enterRequestData("Omar Khaled", "01022002200", "omar@hotmail.com");

	 annualActivitiesandProgramsActions.payRequestfees();
	 
		String anuannualActivitiesandProgramsmberRequestNumber = annualActivitiesandProgramsActions.getRequestNumber();
		scenarioContext.setData("anuannualActivitiesandProgramsmberRequestNumber",anuannualActivitiesandProgramsmberRequestNumber );
		commonFunctions.implicitWait(10);
		assertTrue(anuannualActivitiesandProgramsmberRequestNumber.length() > 0);
		Thread.sleep(1000);
		userWorkspacePageActions.logout();
		
}

@Then("The Employee Approves The Annual Activities and Programs")
public void the_employee_approves_the_annual_activities_and_programs() throws IOException, InterruptedException, AWTException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	commonFunctions.implicitWait(10);
	adminLoginPageActions.selectEngLang();	  
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String anuannualActivitiesandProgramsmberRequestNumber = (String) scenarioContext.getData("anuannualActivitiesandProgramsmberRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(anuannualActivitiesandProgramsmberRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(anuannualActivitiesandProgramsmberRequestNumber);
	adminApprovalofAnnualActivitiesandProgramsActions.employeeApprovesTheApprovalofAnnualActivitiesandProgramsRequest();
	adminAgentQueueActions.checkRequestStatus(anuannualActivitiesandProgramsmberRequestNumber, "Closed - Accepted");

}


@Then("The Employee Rejests The Approval of Annual Activities and Programs Request")
public void the_employee_rejests_the_approval_of_annual_activities_and_programs_request() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	commonFunctions.implicitWait(10);
	adminLoginPageActions.selectEngLang();	  
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String anuannualActivitiesandProgramsmberRequestNumber = (String) scenarioContext.getData("anuannualActivitiesandProgramsmberRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(anuannualActivitiesandProgramsmberRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(anuannualActivitiesandProgramsmberRequestNumber);
	adminApprovalofAnnualActivitiesandProgramsActions.employeeRejectsTheApprovalofAnnualActivitiesandProgramsRequest();
	adminAgentQueueActions.checkRequestStatus(anuannualActivitiesandProgramsmberRequestNumber, "Closed - Rejected");
}

@Then("The Employee Returns The Approval of Annual Activities and Programs Request")
public void the_employee_returns_the_approval_of_annual_activities_and_programs_request() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	commonFunctions.implicitWait(10);
	adminLoginPageActions.selectEngLang();	  
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String anuannualActivitiesandProgramsmberRequestNumber = (String) scenarioContext.getData("anuannualActivitiesandProgramsmberRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(anuannualActivitiesandProgramsmberRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(anuannualActivitiesandProgramsmberRequestNumber);
	adminApprovalofAnnualActivitiesandProgramsActions.employeeReturnsTheApprovalofAnnualActivitiesandProgramsRequest();
	adminAgentQueueActions.checkRequestStatus(anuannualActivitiesandProgramsmberRequestNumber, "Open - Returned");
	 adminAgentQueueActions.adminLogout();
}

@Then("The Applicant Resubmits The Approval of Annual Activities and Programs Request")
public void the_applicant_resubmits_the_approval_of_annual_activities_and_programs_request() throws InterruptedException, IOException {
	 driver.get(properties.getProperty("url"));
	 	Thread.sleep(1000);
	 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String anuannualActivitiesandProgramsmberRequestNumber = (String) scenarioContext.getData("anuannualActivitiesandProgramsmberRequestNumber");
		 userRequestsPageActions.searchForaRequestbyNumber(anuannualActivitiesandProgramsmberRequestNumber);
		 commonFunctions.implicitWait(10);
		userRequestsPageActions.clickDetailsButton(anuannualActivitiesandProgramsmberRequestNumber);
		annualActivitiesandProgramsActions.enterReturnedRequestData("Nader Mohamed", "01022002200", "Nader@hotmail.com");
		annualActivitiesandProgramsActions.resubmitRequest();
		
//		userWorkspacePageActions.clickonSideMenuRequestslink();
//		userRequestsPageActions.searchForaRequestbyNumber(anuannualActivitiesandProgramsmberRequestNumber);
//		userRequestsPageActions.getRequestStatus("In-progress");
}

@Then("The Employee Approves The Annual Activities and Programs Request After Return")
public void the_employee_approves_the_annual_activities_and_programs_request_after_return() throws InterruptedException, IOException, AWTException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	commonFunctions.implicitWait(10);
	adminLoginPageActions.selectEngLang();	  
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String anuannualActivitiesandProgramsmberRequestNumber = (String) scenarioContext.getData("anuannualActivitiesandProgramsmberRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(anuannualActivitiesandProgramsmberRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(anuannualActivitiesandProgramsmberRequestNumber);
	adminApprovalofAnnualActivitiesandProgramsActions.employeeApprovesTheReturnedAnnualActivitiesandProgramsRequest();
	adminAgentQueueActions.checkRequestStatus(anuannualActivitiesandProgramsmberRequestNumber, "Closed - Accepted");
}

}
