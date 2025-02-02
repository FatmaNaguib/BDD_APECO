package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_SchoolLicenseCancellation extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_SchoolLicenseCancellation(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}

	@Then("The Applicant Applies for a New School License Cancellation Request")
	public void the_applicant_applies_for_a_new_school_license_cancellation_request() throws IOException, InterruptedException, AWTException {
		//adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickSchoolLicenseCancelationServiceLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		cancleSchoolLicenseActions.resoneofSchoolCancellation("Financial reasons","We Don't Have Mony");
		cancleSchoolLicenseActions.attachSchoolCancellationAttachments("UploadFile.pdf","UploadFile.pdf");
		 String SchoolLicenseCancellationRequestNumber =   cancleSchoolLicenseActions.submitCancelSchoolLicenseRequest();
			scenarioContext.setData("SchoolLicenseCancellationRequestNumber", SchoolLicenseCancellationRequestNumber);
			commonFunctions.implicitWait(10);
			assertTrue(SchoolLicenseCancellationRequestNumber.length() > 0);
			commonFunctions.implicitWait(10);
			userWorkspacePageActions.logout();
	}

	@Then("The Employee Approves The School License Cancellation request")
	public void the_employee_approves_the_school_license_cancellation_request() throws InterruptedException, IOException {
		Thread.sleep(1000);
			 driver.get(properties.getProperty("AdminPortalUrl"));
			 commonFunctions.implicitWait(10);
			 adminLoginPageActions.selectEngLang();
		 adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String  SchoolLicenseCancellationRequestNumber = (String) scenarioContext.getData("SchoolLicenseCancellationRequestNumber");
		   adminAgentQueueActions.adminSearchforaRequest(SchoolLicenseCancellationRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen(SchoolLicenseCancellationRequestNumber);
		adminSchoolLicenseCancellationRequestsActions.employeelApproval();
		 adminAgentQueueActions.checkRequestStatus(SchoolLicenseCancellationRequestNumber, "Open - Administration Manager Review");
		 adminAgentQueueActions.adminLogout();
	}
	
	@Then("The Department Manager Approves The School License Cancellation Request")
	public void the_department_manager_approves_the_school_license_cancellation_request() throws IOException, InterruptedException {
		commonFunctions.implicitWait(10);
		driver.get(properties.getProperty("AdminPortalUrl"));
		 commonFunctions.implicitWait(10);
		 adminLoginPageActions.selectEngLang();
		 adminLoginPageActions.adminLogin(properties.getProperty("departmentManagerUsername"), properties.getProperty("departmentManagerPassword"));
		String  SchoolLicenseCancellationRequestNumber = (String) scenarioContext.getData("SchoolLicenseCancellationRequestNumber");
	   adminAgentQueueActions.adminSearchforaRequest(SchoolLicenseCancellationRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(SchoolLicenseCancellationRequestNumber);
		adminSchoolLicenseCancellationRequestsActions.departmentManagerApproval();
		 adminAgentQueueActions.checkRequestStatus(SchoolLicenseCancellationRequestNumber, "Closed - Accepted");
	}
}
