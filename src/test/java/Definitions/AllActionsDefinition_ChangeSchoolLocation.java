	package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ChangeSchoolLocation extends APECOTestBase {
	
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ChangeSchoolLocation(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}
	
	
	@Then("The Applicant Apply For Change School Location Request")
	public void the_applicant_apply_for_change_school_location_request() throws IOException, InterruptedException, AWTException {

	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickChangeSchoolLocationLink();		
//		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//		userSchoolsListActions.selectSchool(licensedSchoolName);		
		userSchoolsListActions.selectSchool("New Education School 64590");	
		   changeSchoolLocationActions.enterSchoolDetails	("New building", "Moahamed Essam", "شارع جابر المبارك", "Boys",  "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تغيير موقع مدرسة", "الموقع / رقم قطعة الأرض باللغة العربية - طلب تغيير موقع مدرسة",  "800","900", "400", "90", "First","Owner");
		   changeSchoolLocationActions.uploadAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
			changeSchoolLocationActions.submitChangeSchoolLocationRequest();			
			String changeSchoolLocationRequestNumber = changeSchoolLocationActions.getRequestNumber();
			scenarioContext.setData("changeSchoolLocationRequestNumber",changeSchoolLocationRequestNumber );
			  System.out.println(changeSchoolLocationRequestNumber);
			assertTrue(changeSchoolLocationRequestNumber.length() > 0);
			commonFunctions.implicitWait(20);
			userWorkspacePageActions.logout();			
	}
	
	@Then("The Engineer Approves the Change School Location Request Engineering Plan")
	public void the_engineer_approves_the_change_school_location_request_engineering_plan() throws IOException, InterruptedException {
		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
		 adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
		  adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolLocationRequestNumber);
		  adminChangeSchoolLocationActions.engineerRatsTheStudyPlanforTheModificationorAdditiontoSchoolBuildingRequest();
		  
		  adminAgentQueueActions.checkRequestStatus(changeSchoolLocationRequestNumber, "Open - Complete The Field Technical Approval File");
		  
//			 adminAgentQueueActions.adminOpenAgentQueueScreen();
//			 commonFunctions.implicitWait(20);
//			  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(changeSchoolLocationRequestNumber));
//			 commonFunctions.implicitWait(10);
//		      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//		       System.out.println("Request Status: " + requestStatus);
//		     assertEquals(requestStatus,"Open - Complete The Field Technical Approval File");
		       adminAgentQueueActions.adminLogout();
	}

	@Then("The Engineer Completes the Change School Location Request Field Technical Approval File")
	public void the_engineer_completes_the_change_school_location_request_field_technical_approval_file() throws InterruptedException, IOException {
		//adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
		   adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
		   adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolLocationRequestNumber);
		   adminChangeSchoolLocationActions.engineerCompletetheInitialTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية – طلب تغيير موقع مدرسة","الموقع / رقم قطعة الأرض باللغة العربية طلب تغيير موقع مدرسة ");
		   adminAgentQueueActions.checkRequestStatus(changeSchoolLocationRequestNumber, "Open - Site Is Ready For Field Inspection");
		   
//			 adminAgentQueueActions.adminOpenAgentQueueScreen();
//			 commonFunctions.implicitWait(20);
//			  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(changeSchoolLocationRequestNumber));
//			 commonFunctions.implicitWait(10);
//		      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	
//		      System.out.println("Request Status: " + requestStatus);
//		    assertEquals(requestStatus,"Open - Site Is Ready For Field Inspection");
		       adminAgentQueueActions.adminLogout();
		   
	}

	@Then("The Applicant Approves the Change School Location Request Site is Ready")
	public void the_applicant_approves_the_change_school_location_request_site_is_ready() throws InterruptedException, IOException {
		 //adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		 driver.get(properties.getProperty("url"));
		 	Thread.sleep(1000);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
			 userRequestsPageActions.searchForaRequestbyNumber(changeSchoolLocationRequestNumber);
			 //Thread.sleep(1000);
			 commonFunctions.implicitWait(10);
			userRequestsPageActions.clickDetailsButton(changeSchoolLocationRequestNumber);
			changeSchoolLocationActions.siteIsReady();
		 	userWorkspacePageActions.logout();
	}

	@Then("The Engineer Completes the Change School Location Request Field Visit")
	public void the_engineer_completes_the_change_school_location_request_field_visit() throws IOException, InterruptedException {
		 //adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		driver.get(properties.getProperty("AdminPortalUrl"));
			adminLoginPageActions.selectEngLang();
			adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
			String  changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
			   adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
			   
			   String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
		        System.out.println("Request Status: " + requestStatus);
		   //  assertEquals(requestStatus,"Open - Make The Initial Visit And Complete Final Approval Files");
			   
			   
			   adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolLocationRequestNumber);			   
			   adminChangeSchoolLocationActions.engineerCompletetheInitialTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية – طلب تغيير موقع مدرسة","الموقع / رقم قطعة الأرض باللغة العربية طلب تغيير موقع مدرسة ");
			   
			   adminAgentQueueActions.checkRequestStatus(changeSchoolLocationRequestNumber, "Open - APECO Employee Review");
			   
//			   adminAgentQueueActions.adminOpenAgentQueueScreen();
//				 commonFunctions.implicitWait(20);
//				    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(changeSchoolLocationRequestNumber));
//				 commonFunctions.implicitWait(10);
//			        requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//			        System.out.println("Request Status: " + requestStatus);
//			      assertEquals(requestStatus,"Open - APECO Employee Review");
			        adminAgentQueueActions.adminLogout();
	}

	@Then("The Employee Approves the Change School Location Request")
	public void the_employee_approves_the_change_school_location_request() throws InterruptedException, IOException {
		driver.get(properties.getProperty("AdminPortalUrl"));
		 commonFunctions.implicitWait(10);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen(changeSchoolLocationRequestNumber);
		adminChangeSchoolLocationActions.employeeApprovestheChangeSchoolLocatiolRequest();
		   adminAgentQueueActions.checkRequestStatus(changeSchoolLocationRequestNumber, "Open - Payment Step");
		
//		 adminAgentQueueActions.adminOpenAgentQueueScreen();
//		 commonFunctions.implicitWait(20);
//		  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(changeSchoolLocationRequestNumber));
//		 commonFunctions.implicitWait(10);
//	      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	       System.out.println("Request Status: " + requestStatus);
//	     assertEquals(requestStatus,"Open - Payment Step");
	       adminAgentQueueActions.adminLogout();
		
	}

	@Then("The Applicant Pays The Change School Location Request fees")
	public void the_applicant_pays_the_change_school_location_request_fees() throws InterruptedException, IOException {
		// adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		driver.get(properties.getProperty("url"));
		 	Thread.sleep(1000);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
			 userRequestsPageActions.searchForaRequestbyNumber(changeSchoolLocationRequestNumber);
			userRequestsPageActions.clickDetailsButton(changeSchoolLocationRequestNumber);
			changeSchoolLocationActions.payRequestfees();

			userWorkspacePageActions.clickonSideMenuRequestslink();
			userRequestsPageActions.searchForaRequestbyNumber(changeSchoolLocationRequestNumber);
			userRequestsPageActions.getRequestStatus("Closed - Accepted");
			userRequestsPageActions.clickDetailsButton(changeSchoolLocationRequestNumber);
				
			//userWorkspacePageActions.logout();
	}
	
	
}
