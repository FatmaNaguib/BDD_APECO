package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_SchoolLicenseRenewal extends APECOTestBase {

		private final ScenarioContext scenarioContext;

	public AllActionsDefinition_SchoolLicenseRenewal(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		
	}
	
	@Then("The Applicant Applies for a New School License Renewal Request")
	public void the_applicant_applies_for_a_new_school_license_renewal_request() throws IOException, InterruptedException, AWTException {

		adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		
		
		userServicesPageActions.clickschoolLicenseRenewalLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		
		licenseRenewalActions.submitlicenseRenewalRequest("Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf");
	
		String schoolLicenseRenewalRequestNumber = licenseRenewalActions.confirmRequestl();
		scenarioContext.setData("schoolLicenseRenewalRequestNumber",schoolLicenseRenewalRequestNumber );
		
		Thread.sleep(1000);
		userWorkspacePageActions.logout();
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");	
	}
	
	@Then("The Employee Approves The School License Renewal Request")
	public void the_employee_approves_the_school_license_renewal_request() throws InterruptedException, IOException {

		Thread.sleep(1000);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String schoolLicenseRenewalRequestNumber = (String) scenarioContext.getData("schoolLicenseRenewalRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(schoolLicenseRenewalRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminSchoolRenewalRequestDetailsActions.employeeApprovesTheSchoolRenewalRequest();
		Thread.sleep(1000);
		userWorkspacePageActions.logout();
		 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	//	adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	}
	@Then("The Applicant Pays The School License Renewal Request Fees")
	public void the_applicant_pays_the_school_license_renewal_request_fees() throws InterruptedException, IOException {
		Thread.sleep(1000);
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String schoolLicenseRenewalRequestNumber = (String) scenarioContext.getData("schoolLicenseRenewalRequestNumber");
		userRequestsPageActions.searchForaRequestbyNumber(schoolLicenseRenewalRequestNumber);
		userRequestsPageActions.clickDetailsButton();
		licenseRenewalActions.postPayRequestfees();
		userWorkspacePageActions.logout();
	}


}
