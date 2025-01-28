package Definitions;

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

	// userSchoolsListActions.selectSchool("New Education School 86169");

	annualActivitiesandProgramsActions.enterRequestData("Omar Khaled", "01022002200", "omar@hotmail.com");

	 annualActivitiesandProgramsActions.payRequestfees();
	 
		String anuannualActivitiesandProgramsmberRequestNumber = annualActivitiesandProgramsActions.getRequestNumber();
		scenarioContext.setData("anuannualActivitiesandProgramsmberRequestNumber",anuannualActivitiesandProgramsmberRequestNumber );
		Thread.sleep(1000);
		userWorkspacePageActions.logout();
		
}

@Then("The Employee Approves The Annual Activities and Programs")
public void the_employee_approves_the_annual_activities_and_programs() throws IOException, InterruptedException, AWTException {
	Thread.sleep(1000);
	adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	//Thread.sleep(1000);
	commonFunctions.implicitWait(10);
	adminLoginPageActions.selectEngLang();	  
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String anuannualActivitiesandProgramsmberRequestNumber = (String) scenarioContext.getData("anuannualActivitiesandProgramsmberRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(anuannualActivitiesandProgramsmberRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
	adminApprovalofAnnualActivitiesandProgramsActions.employeeApprovesTheApprovalofAnnualActivitiesandProgramsRequest();
}
}
