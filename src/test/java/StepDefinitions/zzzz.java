package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;

public class zzzz extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	public zzzz(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
	}

	@Given("The Applicant Has School Valid Licenseeeeee")
	public void the_applicant_has_school_valid_license() throws IOException, InterruptedException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickeFinalApprovalServiceLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		System.out.println(licensedSchoolName);
		userSchoolsListActions.selectSchool(licensedSchoolName);
		finalApprovalActions.enterSchoolFees("100", "100", "100","200", "200", "200","300", "300", "300", "Dubai", "500", "500");
		 finalApprovalActions.enterCandidateData();
		 finalApprovalActions.enterManagerData("Mohamed Nader","Emirati","Male","School Manager","Single","1990-11-05","United Arab Emirates","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib99@hotmail.com","123456", "123456", "123456", "123456");
		 finalApprovalActions.enterQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","School","Manager","UploadFile.pdf");
		 finalApprovalActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
			finalApprovalActions.submitTheRequest();
			String  finalapprovalRequestNumber = finalApprovalActions.confirmRequest();
			scenarioContext.setData("finalapprovalRequestNumber", finalapprovalRequestNumber);
			Thread.sleep(1000);
			userWorkspacePageActions.logout();
			 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		
			 //
			 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");

				adminLoginPageActions.selectEngLang();
			adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
			//String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
		  //  adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen();
			adminFinalApprovalActions.reviewEmployeeRatsTheStudyPlanforTheFinalApprovalRequest();
			 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
//			adminAgentQueueActions.adminLogout();
			// adminLoginPageActions.adminLogin("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		
				adminLoginPageActions.selectEngLang();
				adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
			//	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
			    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
				adminAgentQueueActions.adminOpenRequestDetailsScreen();
				  adminFinalApprovalActions.reviewEmployeeScheduleMeetingForTheFinalApprovalRequest("Manager Meeting", "15-01-2026", "2:45 PM", "5:45 PM", "Online Meeting", "Manager's Online Meeting");
				  adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
				  Thread.sleep(1000);
				  //
					adminLoginPageActions.selectEngLang();
					adminLoginPageActions.adminLogin(properties.getProperty("adminSchoolManagerUsername"), properties.getProperty("adminSchoolManagerPassword"));
				//	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
				    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
					adminAgentQueueActions.adminOpenRequestDetailsScreen();
					adminFinalApprovalActions.adminAcceptsScheduledMeeting();
					  adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
					Thread.sleep(1000);
					//
					adminLoginPageActions.selectEngLang();
					adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
				//	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
				    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
					adminAgentQueueActions.adminOpenRequestDetailsScreen();
				  adminFinalApprovalActions.reviewEmployeeMeetsTheManager();
					 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
					  Thread.sleep(1000);
					  //
						adminLoginPageActions.selectEngLang();
						adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
					//	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
					    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
						adminAgentQueueActions.adminOpenRequestDetailsScreen();
					    adminFinalApprovalActions.engineerTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية - إصدار تصريح جديد", "الموقع / رقم قطعة الأرض باللغة العربية - إصدار تصريح جديد");
					    adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
						  Thread.sleep(1000);
			 //	adminLoginPageActions.selectEngLang();
							adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
						//	String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
						    adminAgentQueueActions.adminSearchforaRequest(finalapprovalRequestNumber);
							adminAgentQueueActions.adminOpenRequestDetailsScreen();
						 	adminFinalApprovalActions.employeelApproval();
						    adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
						 	Thread.sleep(1000);
							userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
							userWorkspacePageActions.clickonSideMenuRequestslink();
							String requestNo = (String) scenarioContext.getData("finalapprovalRequestNumber");
							 userRequestsPageActions.searchForaRequestbyNumber(requestNo);
							userRequestsPageActions.clickDetailsButton();
							finalApprovalActions.payRequestfees();
							userWorkspacePageActions.logout();
	}
}
