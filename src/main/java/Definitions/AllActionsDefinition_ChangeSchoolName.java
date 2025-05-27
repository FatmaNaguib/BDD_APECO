package Definitions;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesActions.UserSchoolsListActions;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ChangeSchoolName extends APECOTestBase {

	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ChangeSchoolName(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}



@Then("The Applicant Applies for a New Change School Name Request")
public void the_applicant_applies_for_a_new_change_school_name_request() throws IOException, InterruptedException, AWTException {
//	
	driver.get(properties.getProperty("url"));
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	userWorkspacePageActions.clickonSideMenu_Services_link();
	userServicesPageActions.startChangeSchoolNameRequest();
//	String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//	userSchoolsListActions.selectSchool(licensedSchoolName);
	userSchoolsListActions.selectSchool("New Education School 20565");	
	String[] schoolNames = UserSchoolsListActions.schoolName();
	String schoolNameAr = schoolNames[0];
	String schoolNameEng = schoolNames[1];
	changeSchoolNameActions.submitChangeSchoolNameRequest(schoolNameEng,schoolNameAr, "Intoduction Document.pdf","Intoduction Document.pdf");
	changeSchoolNameActions.payRequestfees();
	String changeSchoolNameRequestNumber =	changeSchoolNameActions.confirmRequest();
	scenarioContext.setData("changeSchoolNameRequestNumber", changeSchoolNameRequestNumber);
	assertTrue(changeSchoolNameRequestNumber.length() > 0);
	commonFunctions.implicitWait(10);
	userWorkspacePageActions.logout();

}

@Then("The Employee Aprroves The Change School Name Request")
public void the_employee_aprroves_the_change_school_name_request() throws IOException, InterruptedException {
	
	driver.get(properties.getProperty("AdminPortalUrl"));
	 commonFunctions.implicitWait(10);
	adminLoginPageActions.selectEngLang();	 
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String changeSchoolNameRequestNumber = (String) scenarioContext.getData("changeSchoolNameRequestNumber");
	
	adminAgentQueueActions.adminSearchforaRequest(changeSchoolNameRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolNameRequestNumber);
	 adminChangeSchoolNameActions.employeelApproval("Approve By Employee");
	 
	 adminAgentQueueActions.checkRequestStatus(changeSchoolNameRequestNumber, "Closed - Accepted");

//	        adminAgentQueueActions.adminLogout();

}


}
