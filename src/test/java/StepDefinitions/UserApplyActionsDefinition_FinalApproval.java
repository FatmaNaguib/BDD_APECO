package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UserApplyActionsDefinition_FinalApproval extends APECOTestBase {

	private final ScenarioContext scenarioContext;
	public UserApplyActionsDefinition_FinalApproval(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;

	}


@Given("The Review Employee is logged in")
public void the_review_employee_is_logged_in() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));

}


@Then("The Employee Searches for the Final Approval Request")
public void the_employee_searches_for_the_final_approval_request() throws InterruptedException {
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();/*
	adminAgentQueueActions.adminLogout();
	Thread.sleep(1000);
	 adminLoginPageActions.adminLogin("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");*/
}


@Then("The Review Employee Rats the Study Plan for The Final Approval Request")
public void the_review_employee_Rats_the_study_plan_for_the_final_approval_request() throws  InterruptedException, IOException {
	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");

		adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
	adminFinalApprovalActions.reviewEmployeeRatsTheStudyPlanforTheFinalApprovalRequest();
	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
//	adminAgentQueueActions.adminLogout();
	// adminLoginPageActions.adminLogin("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
}

@Then("The Review Employee Schedules Meeting for The Final Approval Request Manager")
public void the_review_employee_schedules_meeting_for_the_final_approval_request_manager() throws InterruptedException, IOException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
	  adminFinalApprovalActions.reviewEmployeeScheduleMeetingForTheFinalApprovalRequest("Manager Meeting", "15-01-2026", "2:45 PM", "5:45 PM", "Online Meeting", "Manager's Online Meeting");
	  adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	  Thread.sleep(1000);
	//	adminAgentQueueActions.adminLogout();
	//	 adminLoginPageActions.adminLogin("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		 }

@Then("The Admin School Manager Approves The Scheduled Meeting")
public void the_admin_School_manager_approves_the_scheduled_meeting() throws InterruptedException, IOException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("adminSchoolManagerUsername"), properties.getProperty("adminSchoolManagerPassword"));
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
	adminFinalApprovalActions.adminAcceptsScheduledMeeting();
	  adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	Thread.sleep(1000);
	 //adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
 //adminAgentQueueActions.adminLogout();
 //adminLoginPageActions.adminLogin("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
}
@Then("The Review Employee Meets The School Manager")
public void the_review_employee_meets_the_school_manager() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
  adminFinalApprovalActions.reviewEmployeeMeetsTheManager();
	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	  Thread.sleep(1000);
}

@Then("The Engineer Aprroves The Final Approval Request")
public void the_engineer_aprroves_the_final_approval_request() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
    adminFinalApprovalActions.engineerTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية - إصدار تصريح جديد", "الموقع / رقم قطعة الأرض باللغة العربية - إصدار تصريح جديد");
    adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	  Thread.sleep(1000);
//	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
}
@Then("The Employee Aprroves The Final Approval Request")
public void the_employee_aprroves_the_final_approval_request() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen();
 	adminFinalApprovalActions.employeelApproval();
    adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
 	Thread.sleep(1000);
//	 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
}

}

