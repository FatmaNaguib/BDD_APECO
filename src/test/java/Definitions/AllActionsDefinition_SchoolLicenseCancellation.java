package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_SchoolLicenseCancellation extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_SchoolLicenseCancellation(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
	}

	@Then("The Applicant Applies for a New School License Cancellation Request")
	public void the_applicant_applies_for_a_new_school_license_cancellation_request() throws IOException, InterruptedException, AWTException {
		adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickSchoolLicenseCancelationServiceLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		cancleSchoolLicenseActions.resoneofSchoolCancellation("Financial reasons","We Don't Have Mony");
		cancleSchoolLicenseActions.attachSchoolCancellationAttachments("UploadFile.pdf","UploadFile.pdf");
		 String SchoolLicenseCancellationRequestNumber =   cancleSchoolLicenseActions.submitCancelSchoolLicenseRequest();
			scenarioContext.setData("SchoolLicenseCancellationRequestNumber", SchoolLicenseCancellationRequestNumber);
			Thread.sleep(1000);
			userWorkspacePageActions.logout();
		//	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
			 //adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	}

	@Then("The Employee Approves The School License Cancellation request")
	public void the_employee_approves_the_school_license_cancellation_request() throws InterruptedException, IOException {
			 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		 adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String  SchoolLicenseCancellationRequestNumber = (String) scenarioContext.getData("SchoolLicenseCancellationRequestNumber");
		   adminAgentQueueActions.adminSearchforaRequest(SchoolLicenseCancellationRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminSchoolLicenseCancellationRequestsActions.employeelApproval();
	}
	
	@Then("The Department Manager Approves The School License Cancellation Request")
	public void the_department_manager_approves_the_school_license_cancellation_request() throws IOException, InterruptedException {
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		 adminLoginPageActions.adminLogin(properties.getProperty("departmentManagerUsername"), properties.getProperty("departmentManagerPassword"));
		String  SchoolLicenseCancellationRequestNumber = (String) scenarioContext.getData("SchoolLicenseCancellationRequestNumber");
		   adminAgentQueueActions.adminSearchforaRequest(SchoolLicenseCancellationRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminSchoolLicenseCancellationRequestsActions.departmentManagerApproval();
	}
}
