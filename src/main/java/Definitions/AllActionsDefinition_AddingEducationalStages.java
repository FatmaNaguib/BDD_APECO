package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_AddingEducationalStages extends APECOTestBase{
	
	private final ScenarioContext scenarioContext;
	public AllActionsDefinition_AddingEducationalStages(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}



	@Then("The Applicant Applies for a New Adding Educational Stages Request")
	public void the_applicant_applies_for_a_new_adding_educational_stages_request() throws InterruptedException, AWTException, IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickAddingEducationalStagesLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);	
		//userSchoolsListActions.selectSchool("New Education School 64590");
		addingEducationalStagesActions.enterSchoolData("15155", "Applicant Relationship of School Building");
		addingEducationalStagesActions.addingThefourthEducationalStages("Stage 3", "100","10", "Grade 9", "100", "200", "300");
		addingEducationalStagesActions.addingEducationalStagesAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf");
		addingEducationalStagesActions.payRequestfees();		
		String addingEducationalStagesNumber =addingEducationalStagesActions.confirmRequest();
		scenarioContext.setData("addingEducationalStagesNumber", addingEducationalStagesNumber);
		assertTrue(addingEducationalStagesNumber.length() > 0);
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
	}
	
	@Then("The Engineer Approves and Completes The Initial Files for The Adding Educational Stages Request")
	public void the_engineer_approves_and_completes_the_initial_files_for_the_adding_educational_stages_request() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(addingEducationalStagesNumber);
	   adminAddingEducationalStagesActions.engineerCompleteinitsInitialFiles();
	   
		 adminAgentQueueActions.checkRequestStatus(addingEducationalStagesNumber, "Open - Complete The Initial Technical Approval File");

//	   adminAgentQueueActions.adminOpenAgentQueueScreen();
//		 commonFunctions.implicitWait(20);
//		    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(addingEducationalStagesNumber));
//		 commonFunctions.implicitWait(10);
//		 
//	        String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	    
//	        System.out.println("Request Status: " + requestStatus);
//	         assertEquals(requestStatus,"Open - Complete The Initial Technical Approval File");
		 adminAgentQueueActions.adminLogout();
	}

	@Then("The Engineer Aprroves The Adding Educational Stages Request")
	public void the_engineer_aprroves_the_adding_educational_stages_request() throws InterruptedException, IOException {
		
		commonFunctions.implicitWait(10);

		driver.get(properties.getProperty("AdminPortalUrl"));
		    commonFunctions.implicitWait(10);
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(addingEducationalStagesNumber);
		adminAddingEducationalStagesActions.adminApproves();
		 adminAgentQueueActions.checkRequestStatus(addingEducationalStagesNumber, "Open - Site Is Ready For Inspection");

		
//		 adminAgentQueueActions.adminOpenAgentQueueScreen();
//		 commonFunctions.implicitWait(20);
//		    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(addingEducationalStagesNumber));
//		 commonFunctions.implicitWait(10);
//	        String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	      
//	        System.out.println("Request Status: " + requestStatus);
//	        assertEquals(requestStatus,"Open - Site Is Ready For Inspection");
	        adminAgentQueueActions.adminLogout();
	}

	@Then("The Applicant Confirms the Site is Ready for The Adding Educational Stages Request")
	public void the_applicant_confirms_the_site_is_ready_for_the_adding_educational_stages_request() throws InterruptedException, IOException {

		commonFunctions.implicitWait(10);
		driver.get(properties.getProperty("url"));
		 commonFunctions.implicitWait(10);
		 	adminLoginPageActions.selectEngLang();	  
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
			userRequestsPageActions.searchForaRequestbyNumber(addingEducationalStagesNumber);
			userRequestsPageActions.clickDetailsButton(addingEducationalStagesNumber);
			addingEducationalStagesActions.siteIsReady();
		 	userWorkspacePageActions.logout();
		 	
	}

	@Then("The Engineer Approves The Initial Visit for The Adding Educational Stages Request")
	public void the_engineer_approves_the_initial_visit_for_the_adding_educational_stages_request() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		
		String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
	        System.out.println("Request Status: " + requestStatus);
	      assertEquals(requestStatus,"Open - Make The Initial Visit And Complete Final Approval Files");
	      
		adminAgentQueueActions.adminOpenRequestDetailsScreen(addingEducationalStagesNumber);
		   adminAddingEducationalStagesActions.adminApproves();
		   
		   adminAgentQueueActions.checkRequestStatus(addingEducationalStagesNumber, "Open - APECO Employee Review");
//		   adminAgentQueueActions.adminOpenAgentQueueScreen();
//			 commonFunctions.implicitWait(20);
//			    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(addingEducationalStagesNumber));
//			 commonFunctions.implicitWait(10);
//		        requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//		        System.out.println("Request Status: " + requestStatus);
//		      assertEquals(requestStatus,"Open - APECO Employee Review");
		        adminAgentQueueActions.adminLogout();
	}

	@Then("The Employee Aprroves The Adding Educational Stages Request")
	public void the_employee_aprroves_the_adding_educational_stages_request() throws IOException, InterruptedException {
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(addingEducationalStagesNumber);
		 adminAddingEducationalStagesActions.adminApproves();
		 adminAgentQueueActions.checkRequestStatus(addingEducationalStagesNumber, "Open - Payment Step");
		 
//		 adminAgentQueueActions.adminOpenAgentQueueScreen();
//		 commonFunctions.implicitWait(20);
//		  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(addingEducationalStagesNumber));
//		 commonFunctions.implicitWait(10);
//	      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	       System.out.println("Request Status: " + requestStatus);
//	     assertEquals(requestStatus,"Open - Payment Step");
	       adminAgentQueueActions.adminLogout();

	}

	@Then("Applicant Pays The Adding Educational Stages l Request fees")
	public void applicant_pays_the_adding_educational_stages_l_request_fees() throws InterruptedException, IOException {

			commonFunctions.implicitWait(10);
			driver.get(properties.getProperty("url"));
			commonFunctions.implicitWait(10);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
			userRequestsPageActions.searchForaRequestbyNumber(addingEducationalStagesNumber);
			userRequestsPageActions.clickDetailsButton(addingEducationalStagesNumber);
			reducingEducationalStagesActions.postPayRequestfees();
			
			userWorkspacePageActions.clickonSideMenuRequestslink();
			userRequestsPageActions.searchForaRequestbyNumber(addingEducationalStagesNumber);
			userRequestsPageActions.getRequestStatus("Closed - Accepted");
			userRequestsPageActions.clickDetailsButton(addingEducationalStagesNumber);
			//addingEducationalStagesActions.CheckDocumentsCreation();
		//	userWorkspacePageActions.logout();
	}
	
}
