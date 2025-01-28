package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_AddingEducationalStages extends APECOTestBase{
	public AllActionsDefinition_AddingEducationalStages(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}

	private final ScenarioContext scenarioContext;

	@Then("The Applicant Applies for a New Adding Educational Stages Request")
	public void the_applicant_applies_for_a_new_adding_educational_stages_request() throws InterruptedException, AWTException, IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickAddingEducationalStagesLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		addingEducationalStagesActions.enterSchoolData("15155", "Applicant Relationship of School Building");
		addingEducationalStagesActions.addingThefourthEducationalStages("Stage 3", "100","10", "Grade 9", "100", "200", "300");
		addingEducationalStagesActions.addingEducationalStagesAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf");
		addingEducationalStagesActions.payRequestfees();		
		String addingEducationalStagesNumber =addingEducationalStagesActions.confirmRequest();
		scenarioContext.setData("addingEducationalStagesNumber", addingEducationalStagesNumber);
	//	Thread.sleep(1000);  
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
	}
	
	@Then("The Engineer Approves and Completes The Initial Files for The Adding Educational Stages Request")
	public void the_engineer_approves_and_completes_the_initial_files_for_the_adding_educational_stages_request() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
	   adminAddingEducationalStagesActions.engineerCompleteinitsInitialFiles();
	}

	@Then("The Engineer Aprroves The Adding Educational Stages Request")
	public void the_engineer_aprroves_the_adding_educational_stages_request() throws InterruptedException, IOException {
		   //Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		    adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		  //Thread.sleep(1000);
		    commonFunctions.implicitWait(10);
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminAddingEducationalStagesActions.adminApproves();
		//adminAddingEducationalStagesActions.engineerCompleteinitsInitialFiles();
	}

	@Then("The Applicant Confirms the Site is Ready for The Adding Educational Stages Request")
	public void the_applicant_confirms_the_site_is_ready_for_the_adding_educational_stages_request() throws InterruptedException, IOException {
		  //Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		 	//Thread.sleep(1000);
		 commonFunctions.implicitWait(10);
		 	adminLoginPageActions.selectEngLang();	  
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
			userRequestsPageActions.searchForaRequestbyNumber(addingEducationalStagesNumber);
			userRequestsPageActions.clickDetailsButton();
			addingEducationalStagesActions.siteIsReady();
		 	userWorkspacePageActions.logout();
		 	Thread.sleep(1000);
		 	
	}

	@Then("The Engineer Approves The Initial Visit for The Adding Educational Stages Request")
	public void the_engineer_approves_the_initial_visit_for_the_adding_educational_stages_request() throws InterruptedException, IOException {
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		   adminAddingEducationalStagesActions.adminApproves();
	}

	@Then("The Employee Aprroves The Adding Educational Stages Request")
	public void the_employee_aprroves_the_adding_educational_stages_request() throws IOException, InterruptedException {
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
		adminAgentQueueActions.adminSearchforaRequest(addingEducationalStagesNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		 adminAddingEducationalStagesActions.adminApproves();
	}

	@Then("Applicant Pays The Adding Educational Stages l Request fees")
	public void applicant_pays_the_adding_educational_stages_l_request_fees() throws InterruptedException, IOException {
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		 	//Thread.sleep(1000);
		 commonFunctions.implicitWait(10);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String addingEducationalStagesNumber = (String) scenarioContext.getData("addingEducationalStagesNumber");
			userRequestsPageActions.searchForaRequestbyNumber(addingEducationalStagesNumber);
			userRequestsPageActions.clickDetailsButton();
			reducingEducationalStagesActions.postPayRequestfees();
			userWorkspacePageActions.logout();
	}
	
}
