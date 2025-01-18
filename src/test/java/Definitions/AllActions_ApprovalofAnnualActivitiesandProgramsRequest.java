package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesLocators.AnnualActivitiesandProgramsLocators;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActions_ApprovalofAnnualActivitiesandProgramsRequest extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	
	public AllActions_ApprovalofAnnualActivitiesandProgramsRequest( ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
	}


@Then("The Applicant Apply For Approval of Annual Activities and Programs Request")
public void the_applicant_apply_for_approval_of_annual_activities_and_programs_request() throws IOException, InterruptedException, AWTException {
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	userWorkspacePageActions.clickonSideMenu_Services_link();
	 userServicesPageActions.clickAnnualActivitiesandProgramsLink();
	
//	String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//	userSchoolsListActions.selectSchool(licensedSchoolName);
	userSchoolsListActions.selectSchool("New Education School 10410");
	annualActivitiesandProgramsActions.enterRequestData("Omar Khaled", "01022002200", "omar@hotmail.com");

	 annualActivitiesandProgramsActions.payRequestfees();
	 
		String anuannualActivitiesandProgramsmberRequestNumber = changeSchoolLocationActions.getRequestNumber();
		scenarioContext.setData("anuannualActivitiesandProgramsmberRequestNumber",anuannualActivitiesandProgramsmberRequestNumber );
		Thread.sleep(1000);
		userWorkspacePageActions.logout();
		adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		
}

	
}
