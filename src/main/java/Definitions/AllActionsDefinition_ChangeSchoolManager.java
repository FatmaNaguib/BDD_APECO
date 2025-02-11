package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ChangeSchoolManager extends APECOTestBase{

	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ChangeSchoolManager(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}

	@Given("The Applicant Has School Valid License")
	public void the_applicant_has_school_valid_license() throws IOException, InterruptedException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickeFinalApprovalServiceLink();
	String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
	userSchoolsListActions.selectSchool(licensedSchoolName);
		//userSchoolsListActions.selectSchool("New Education School 25817");
		finalApprovalActions.enterSchoolFees("100", "100", "100","200", "200", "200","300", "300", "300", "Dubai", "500", "500");
		 finalApprovalActions.enterCandidateData();
		 finalApprovalActions.enterManagerData("Mohamed Nader","Emirati","Male","School Manager","Single","1990-11-05","United Arab Emirates","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib99@hotmail.com","123456", "123456", "123456", "123456");
		 finalApprovalActions.enterQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","School","Manager","UploadFile.pdf");
		 finalApprovalActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
			finalApprovalActions.submitTheRequest();
			String  finalapprovalRequestNumber = finalApprovalActions.confirmRequest();
			scenarioContext.setData("finalapprovalRequestNumber", finalapprovalRequestNumber);
			assertTrue(finalapprovalRequestNumber.length() > 0);
			Thread.sleep(1000);
			userWorkspacePageActions.logout();
			Thread.sleep(1000);
			driver.get(properties.getProperty("AdminPortalUrl"));
				adminLoginPageActions.selectEngLang();
			adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
		    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen(finalapprovalRequestNumber);
			adminFinalApprovalActions.reviewEmployeeRatsTheStudyPlanforTheFinalApprovalRequest();		
			  adminAgentQueueActions.checkRequestStatus(finalapprovalRequestNumber, "Open - Meet The School Manager");
		        adminAgentQueueActions.adminLogout();
			driver.get(properties.getProperty("AdminPortalUrl"));
				adminLoginPageActions.selectEngLang();
				adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
			    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
				adminAgentQueueActions.adminOpenRequestDetailsScreen(finalapprovalRequestNumber);
				  adminFinalApprovalActions.reviewEmployeeScheduleMeetingForTheFinalApprovalRequest("Manager Meeting", "15-01-2026", "2:45 PM", "5:45 PM", "Online Meeting", "Manager's Online Meeting");
				  
				  adminAgentQueueActions.checkRequestStatus(finalapprovalRequestNumber, "Open - School Manager Meeting Request Sent");	        
				     adminAgentQueueActions.adminLogout();
				  driver.get(properties.getProperty("AdminPortalUrl"));
				  commonFunctions.implicitWait(10);
					adminLoginPageActions.selectEngLang();
					adminLoginPageActions.adminLogin(properties.getProperty("adminSchoolManagerUsername"), properties.getProperty("adminSchoolManagerPassword"));
					commonFunctions.implicitWait(10);
				    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
					adminAgentQueueActions.adminOpenRequestDetailsScreen(finalapprovalRequestNumber);
					adminFinalApprovalActions.adminAcceptsScheduledMeeting();
					commonFunctions.implicitWait(10);
				        adminAgentQueueActions.adminLogout();
				        driver.get(properties.getProperty("AdminPortalUrl"));
					  commonFunctions.implicitWait(10);
					adminLoginPageActions.selectEngLang();
					adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
				    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
					adminAgentQueueActions.adminOpenRequestDetailsScreen(finalapprovalRequestNumber);
				  adminFinalApprovalActions.reviewEmployeeMeetsTheManager();	  		  
				  adminAgentQueueActions.checkRequestStatus(finalapprovalRequestNumber, "Open - Make The Technical Visit");
				        adminAgentQueueActions.adminLogout();
				        driver.get(properties.getProperty("AdminPortalUrl"));
					 commonFunctions.implicitWait(10);
						adminLoginPageActions.selectEngLang();
						adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
					    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
						adminAgentQueueActions.adminOpenRequestDetailsScreen(finalapprovalRequestNumber);
					    adminFinalApprovalActions.engineerTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية - إصدار تصريح جديد", "الموقع / رقم قطعة الأرض باللغة العربية - إصدار تصريح جديد");
					        driver.get(properties.getProperty("AdminPortalUrl"));
					    commonFunctions.implicitWait(10);
							adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
						    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
							adminAgentQueueActions.adminOpenRequestDetailsScreen(finalapprovalRequestNumber);
						 	adminFinalApprovalActions.employeelApproval();
						     adminAgentQueueActions.adminLogout();
						    driver.get( properties.getProperty("url"));
						    commonFunctions.implicitWait(10);
							userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
							userWorkspacePageActions.clickonSideMenuRequestslink();
							String requestNo = (String) scenarioContext.getData("finalapprovalRequestNumber");
							 userRequestsPageActions.searchForaRequestbyNumber(requestNo);
							userRequestsPageActions.clickDetailsButton(requestNo);
							finalApprovalActions.payRequestfees();
							userWorkspacePageActions.clickonSideMenuRequestslink();
							userRequestsPageActions.searchForaRequestbyNumber(requestNo);
							userRequestsPageActions.getRequestStatus("Closed - Accepted");
							userRequestsPageActions.clickDetailsButton(requestNo);
							
							
							userWorkspacePageActions.logout();
	}
	@Then("The Applicant Applies for a new Change School Manager Request")
	public void the_applicant_applies_for_a_new_change_school_manager_request() throws IOException, InterruptedException, AWTException {
		driver.get(properties.getProperty("url"));
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickChangeSchoolManagerLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		//userSchoolsListActions.selectSchool("New Education School 23895");
		changeSchoolManagerActions.enterManagerData("Mohamed Nader","Emirati","Male","Teacher","Single","1990-11-05","UAE","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib22@hotmail.com","2025-11-05","2025-11-05","Dubai","2025-11-05",
				"Bachelor's Degree","Engineering","2020-11-05","Cairo university","UploadFile.pdf","School","Manager","2020-12-03","2024-12-03","United Arab Emirates","UploadFile.pdf");
		changeSchoolManagerActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
		changeSchoolManagerActions.submitRequest();
		String changeSchoolManagerRequestNumber = changeSchoolManagerActions.confirmRequest();
		scenarioContext.setData("changeSchoolManagerRequestNumber", changeSchoolManagerRequestNumber);
		assertTrue(changeSchoolManagerRequestNumber.length() > 0);
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
		driver.get(properties.getProperty("url"));
	}
	

@Then("The Review Employee Rats the Study Plan for The Change School Manager Request")
public void the_review_employee_rats_the_study_plan_for_the_change_school_manager_request() throws IOException, InterruptedException {
	driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String  changeSchoolManagerRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
   adminAgentQueueActions.adminSearchforaRequest(changeSchoolManagerRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolManagerRequestNumber);
	adminFinalApprovalActions.reviewEmployeeRatsTheStudyPlanforTheFinalApprovalRequest();
	   adminAgentQueueActions.checkRequestStatus(changeSchoolManagerRequestNumber, "Open - Meet The School Manager");    
      adminAgentQueueActions.adminLogout();

}

@Then("The Review Employee Schedules Meeting for The School Manager")
public void the_review_employee_schedules_meeting_for_the_school_manager() throws IOException, InterruptedException {
	driver.get(properties.getProperty("AdminPortalUrl"));
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String  changeSchoolManagerRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(changeSchoolManagerRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolManagerRequestNumber);
	  adminFinalApprovalActions.reviewEmployeeScheduleMeetingForTheFinalApprovalRequest("Manager Meeting", "15-01-2026", "2:45 PM", "5:45 PM", "Online Meeting", "Manager's Online Meeting");
	   adminAgentQueueActions.checkRequestStatus(changeSchoolManagerRequestNumber, "Open - School Manager Meeting Request Sent");
	   adminAgentQueueActions.adminLogout();
	  driver.get(properties.getProperty("AdminPortalUrl"));
	  commonFunctions.implicitWait(10);
}

@Then("The Admin School Manager Approves the Scheduled Meeting for The Change School Manager Request")
public void the_admin_school_manager_approves_the_scheduled_meeting_for_the_change_school_manager_request() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("adminSchoolManagerUsername"), properties.getProperty("adminSchoolManagerPassword"));
	String  changeSchoolManagerRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(changeSchoolManagerRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolManagerRequestNumber);
	adminFinalApprovalActions.adminAcceptsScheduledMeeting();
	commonFunctions.implicitWait(10);
     adminAgentQueueActions.adminLogout();
	driver.get(properties.getProperty("AdminPortalUrl"));
	 commonFunctions.implicitWait(10);
}

@Then("The Review Employee Meets the School Manager for The Change School Manager Request")
public void the_review_employee_meets_the_school_manager_for_the_change_school_manager_request() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String changeSchoolManagerRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(changeSchoolManagerRequestNumber);
    String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
    System.out.println("Request Status:2 " + requestStatus);
    assertEquals(requestStatus,"Open - School Manager Meeting In Progress");
	adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolManagerRequestNumber);
	adminFinalApprovalActions.reviewEmployeeMeetsTheManager();
	   adminAgentQueueActions.checkRequestStatus(changeSchoolManagerRequestNumber, "Open - Final Approval");
     adminAgentQueueActions.adminLogout();
	 driver.get(properties.getProperty("AdminPortalUrl"));
	 commonFunctions.implicitWait(10);
}

@Then("The Review Employee Approves His Final Approval for The Change School Manager Request")
public void the_Employee_approves_his__final_approvalfor_the_change_school_manager_request() throws InterruptedException, IOException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	String changeSchoolManagerRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(changeSchoolManagerRequestNumber);
	adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolManagerRequestNumber);
	adminChangeSchoolManagerActions.reviewEmployeelFinalApproval("Approve By Evaluation Employee");
	   adminAgentQueueActions.checkRequestStatus(changeSchoolManagerRequestNumber, "Open - Payment Step");     
        adminAgentQueueActions.adminLogout();
}


@Then("User Pays for The Change School Manager Request")
public void user_pays_for_the_change_school_manager_request() throws InterruptedException, IOException {
	driver.get(properties.getProperty("url"));
    commonFunctions.implicitWait(10);
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	userWorkspacePageActions.clickonSideMenuRequestslink();
	String changeSchoolManagerRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
	 userRequestsPageActions.searchForaRequestbyNumber(changeSchoolManagerRequestNumber);
	userRequestsPageActions.clickDetailsButton(changeSchoolManagerRequestNumber);
	changeSchoolManagerActions.payRequestfees();
	
	userWorkspacePageActions.clickonSideMenuRequestslink();
	userRequestsPageActions.searchForaRequestbyNumber(changeSchoolManagerRequestNumber);
	userRequestsPageActions.getRequestStatus("Closed - Accepted");
	userRequestsPageActions.clickDetailsButton(changeSchoolManagerRequestNumber);
	
	userWorkspacePageActions.logout();
}


}
