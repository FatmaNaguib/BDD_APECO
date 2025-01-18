package Definitions;

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
	}



@Then("The Applicant Applies for a New Change School Name Request")
public void the_applicant_applies_for_a_new_change_school_name_request() throws IOException, InterruptedException, AWTException {
	adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	userWorkspacePageActions.clickonSideMenu_Services_link();
	userServicesPageActions.startChangeSchoolNameRequest();
	
	String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
	System.out.println(licensedSchoolName);
	userSchoolsListActions.selectSchool(licensedSchoolName);
	
	String[] schoolNames = UserSchoolsListActions.schoolName();
	String schoolNameAr = schoolNames[0];
	String schoolNameEng = schoolNames[1];
	changeSchoolNameActions.submitChangeSchoolNameRequest(schoolNameEng,schoolNameAr, "Intoduction Document.pdf","Intoduction Document.pdf");
	changeSchoolNameActions.payRequestfees();
	String changeSchoolNameRequestNumber =	changeSchoolNameActions.confirmRequest();
	scenarioContext.setData("changeSchoolNameRequestNumber", changeSchoolNameRequestNumber);
	Thread.sleep(1000);    
	userWorkspacePageActions.logout();

}

@Then("The Employee Aprroves The Change School Name Request")
public void the_employee_aprroves_the_change_school_name_request() throws IOException, InterruptedException {
	
	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	  Thread.sleep(1000);
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String changeSchoolNameRequestNumber = (String) scenarioContext.getData("changeSchoolNameRequestNumber");
	adminAgentQueueActions.adminSearchforaRequest(changeSchoolNameRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		 adminChangeSchoolNameActions.employeelApproval("Approve By Employee");
		 adminAgentQueueActions.adminLogout();
	    adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
}


}
