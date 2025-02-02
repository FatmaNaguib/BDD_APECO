package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_SchoolLicenseRenewal extends APECOTestBase {

		private final ScenarioContext scenarioContext;

	public AllActionsDefinition_SchoolLicenseRenewal(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}
	
	@Then("The Applicant Applies for a New School License Renewal Request")
	public void the_applicant_applies_for_a_new_school_license_renewal_request() throws IOException, InterruptedException, AWTException {

	
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		
		
		userServicesPageActions.clickschoolLicenseRenewalLink();
//		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//		userSchoolsListActions.selectSchool(licensedSchoolName);
		
		userSchoolsListActions.selectSchool("New Education School 23895");
		licenseRenewalActions.submitlicenseRenewalRequest("Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf");	
		String schoolLicenseRenewalRequestNumber = licenseRenewalActions.confirmRequestl();
		scenarioContext.setData("schoolLicenseRenewalRequestNumber",schoolLicenseRenewalRequestNumber);
		assertTrue(schoolLicenseRenewalRequestNumber.length() > 0);
		//Thread.sleep(1000);
	//	userWorkspacePageActions.logout();
		 
	}
	
	@Then("The Employee Approves The School License Renewal Request")
	public void the_employee_approves_the_school_license_renewal_request() throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String schoolLicenseRenewalRequestNumber = (String) scenarioContext.getData("schoolLicenseRenewalRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(schoolLicenseRenewalRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(schoolLicenseRenewalRequestNumber);
		adminSchoolRenewalRequestDetailsActions.employeeApprovesTheSchoolRenewalRequest();
		//Thread.sleep(1000);
		adminAgentQueueActions.checkRequestStatus(schoolLicenseRenewalRequestNumber, "Open - Payment Step");
		adminAgentQueueActions.adminLogout();
		
		
	}
	@Then("The Applicant Pays The School License Renewal Request Fees")
	public void the_applicant_pays_the_school_license_renewal_request_fees() throws InterruptedException, IOException {
	 	Thread.sleep(1000);
	 	driver.get(properties.getProperty("url"));
	 	commonFunctions.implicitWait(10);
		//userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String schoolLicenseRenewalRequestNumber = (String) scenarioContext.getData("schoolLicenseRenewalRequestNumber");
		userRequestsPageActions.searchForaRequestbyNumber(schoolLicenseRenewalRequestNumber);
		userRequestsPageActions.clickDetailsButton(schoolLicenseRenewalRequestNumber);
		licenseRenewalActions.postPayRequestfees();
		userWorkspacePageActions.clickonSideMenuRequestslink();
		userRequestsPageActions.searchForaRequestbyNumber(schoolLicenseRenewalRequestNumber);
		
		userRequestsPageActions.getRequestStatus("Closed - Accepted");
		userWorkspacePageActions.logout();
	}


}
