package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ReducingEducationalStages extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ReducingEducationalStages(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}
	@Then("The Applicant Apply For Reducing Educational Stages Request")
	public void the_applicant_apply_for_reducing_educational_stages_request() throws InterruptedException, IOException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		
		userServicesPageActions.clickReducingEducationalStagesLink();
//		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//		userSchoolsListActions.selectSchool(licensedSchoolName);
		userSchoolsListActions.selectSchool("New Education School 23895");
		reducingEducationalStagesActions.selectEducationalStages();
		reducingEducationalStagesActions.reducingEducationalStagesAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
		reducingEducationalStagesActions.submitRequest();
		String reducingEducationalStagesRequestNumber = reducingEducationalStagesActions.getRequestNumber();
		scenarioContext.setData("reducingEducationalStagesRequestNumber",reducingEducationalStagesRequestNumber );
		assertTrue(reducingEducationalStagesRequestNumber.length() > 0);
		userWorkspacePageActions.logout();

	}
	
	@Then("The Engineer Approves the Reducing Educational Stages Engineering Plan")
	public void the_engineer_approves_the_reducing_educational_stages_engineering_plan() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  reducingEducationalStagesRequestNumber = (String) scenarioContext.getData("reducingEducationalStagesRequestNumber");
		 adminAgentQueueActions.adminSearchforaRequest(reducingEducationalStagesRequestNumber);
		   adminAgentQueueActions.adminOpenRequestDetailsScreen(reducingEducationalStagesRequestNumber);
		   adminReducingEducationalStagesActions.engineereRatsTheEngineeringPlanforTheModificationorAdditiontoSchoolBuildingRequest();
			 adminAgentQueueActions.checkRequestStatus(reducingEducationalStagesRequestNumber, "Open - Make The Initial Visit And Complete Approval Files");
			 adminAgentQueueActions.adminLogout();
		   driver.get(properties.getProperty("AdminPortalUrl"));
	}

	@Then("The Engineer Completes the Reducing Educational Stages Request Field Technical Approval File")
	public void the_engineer_completes_the_reducing_educational_stages_request_field_technical_approval_file() throws InterruptedException, IOException {
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  reducingEducationalStagesRequestNumber = (String) scenarioContext.getData("reducingEducationalStagesRequestNumber");
		   adminAgentQueueActions.adminSearchforaRequest(reducingEducationalStagesRequestNumber);
		   adminAgentQueueActions.adminOpenRequestDetailsScreen(reducingEducationalStagesRequestNumber);
		   adminReducingEducationalStagesActions. employeeCompletetheInitialApproval(); 
			 adminAgentQueueActions.checkRequestStatus(reducingEducationalStagesRequestNumber, "Open - APECO Employee Review");
			 adminAgentQueueActions.adminLogout();
	}

	@Then("The Employee Approves the Reducing Educational Stages Request")
	public void the_employee_approves_the_reducing_educational_stages_request() throws InterruptedException, IOException {
		 
		driver.get(properties.getProperty("AdminPortalUrl"));
		 commonFunctions.implicitWait(10);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String reducingEducationalStagesRequestNumber = (String) scenarioContext.getData("reducingEducationalStagesRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(reducingEducationalStagesRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen(reducingEducationalStagesRequestNumber);
			 adminReducingEducationalStagesActions.employeeApprovestheReducingEducationalStagesRequest();
			 adminAgentQueueActions.checkRequestStatus(reducingEducationalStagesRequestNumber, "Open - Payment Step");
			 adminAgentQueueActions.adminLogout();
	}

	@Then("The Applicant Pays The Reducing Educational Stages Request fees")
	public void the_applicant_pays_the_reducing_educational_stages_request_fees() throws InterruptedException, IOException {
		 //adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		driver.get(properties.getProperty("url"));
		 	//Thread.sleep(1000);
		 commonFunctions.implicitWait(10);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String reducingEducationalStagesRequestNumber = (String) scenarioContext.getData("reducingEducationalStagesRequestNumber");
			 userRequestsPageActions.searchForaRequestbyNumber(reducingEducationalStagesRequestNumber);
			userRequestsPageActions.clickDetailsButton(reducingEducationalStagesRequestNumber);
			reducingEducationalStagesActions.postPayRequestfees();
			//userWorkspacePageActions.logout();
	}

	
}
