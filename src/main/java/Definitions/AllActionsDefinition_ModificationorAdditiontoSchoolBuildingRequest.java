package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ModificationorAdditiontoSchoolBuildingRequest  extends APECOTestBase {

	private final ScenarioContext scenarioContext;
	public AllActionsDefinition_ModificationorAdditiontoSchoolBuildingRequest(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}
	@Then("The Applicant Applies for a New Modification or Addition  a Private School Building request")
	public void the_applicant_applies_for_a_new_modification_or_addition_a_private_school_building_request() throws InterruptedException, AWTException, IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();	
		userServicesPageActions.clickModificationorAdditiontoSchoolBuildingLink();	
//		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//		userSchoolsListActions.selectSchool(licensedSchoolName);		
		userSchoolsListActions.selectSchool("New Education School 64590");
		modificationorAdditiontoSchoolBuildingActions.enterSchoolDetails	("Modification of existing building", "Moahamed Essam", "شارع جابر المبارك", "Boys",  "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تغيير موقع مدرسة", "الموقع / رقم قطعة الأرض باللغة العربية - طلب تغيير موقع مدرسة",  "800","900", "400", "90", "First Class","Owner");
		modificationorAdditiontoSchoolBuildingActions.uploadAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
		   modificationorAdditiontoSchoolBuildingActions.submitModificationorAdditiontoSchoolBuildingRequest();  
			String ModificationorAdditiontoSchoolBuildingRequest = modificationorAdditiontoSchoolBuildingActions.confirmRequest();
			scenarioContext.setData("ModificationorAdditiontoSchoolBuildingRequest", ModificationorAdditiontoSchoolBuildingRequest);
			assertTrue(ModificationorAdditiontoSchoolBuildingRequest.length() > 0);
			commonFunctions.implicitWait(10);
			userWorkspacePageActions.logout();
			
	}


@Then("The Engineer Reviews the Engineering Plan for The Modification or Addition a Private School Building Request")
public void the_engineer_reviews_the_engineering_plan_for_the_modification_or_addition_a_private_school_building_request() throws InterruptedException, IOException {
	Thread.sleep(1000);
	
	driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  ModificationorAdditiontoSchoolBuildingRequest = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
		   adminAgentQueueActions.adminSearchforaRequest(ModificationorAdditiontoSchoolBuildingRequest);
		   adminAgentQueueActions.adminOpenRequestDetailsScreen(ModificationorAdditiontoSchoolBuildingRequest);
		adminModificationorAdditiontoSchoolBuildingActions.engineerRatsTheStudyPlanforTheModificationorAdditiontoSchoolBuildingRequest();
		 adminAgentQueueActions.checkRequestStatus(ModificationorAdditiontoSchoolBuildingRequest, "Open - Complete The Initial Technical Approval File");
		
		adminAgentQueueActions.adminLogout();

}


@Then("The Engineer Completes the Initial Technical Approval File for The Modification or Addition a Private School Building Request")
public void the_engineer_completes_the_initial_technical_approval_file_for_the_modification_or_addition_a_private_school_building_request() throws InterruptedException, IOException {
Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  ModificationorAdditiontoSchoolBuildingRequest = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
		   adminAgentQueueActions.adminSearchforaRequest(ModificationorAdditiontoSchoolBuildingRequest);
		   adminAgentQueueActions.adminOpenRequestDetailsScreen(ModificationorAdditiontoSchoolBuildingRequest);
		adminModificationorAdditiontoSchoolBuildingActions.engineerCompletetheInitialTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تعديل أو اضافة على مبنى لمدرسة خاصة","الموقع / رقم قطعة الأرض باللغة العربية - طلب تعديل أو اضافة على مبنى لمدرسة خاصة");
		adminAgentQueueActions.checkRequestStatus(ModificationorAdditiontoSchoolBuildingRequest, "Open - Site Is Ready For Initial Inspection");
		adminAgentQueueActions.adminLogout();
}

@Then("The Applicant Confirms the Site is Ready")
public void the_applicant_confirms_the_site_is_ready() throws InterruptedException, IOException {
	 Thread.sleep(1000);
	driver.get(properties.getProperty("url"));
	 
	 commonFunctions.implicitWait(10);
	 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String ModificationorAdditiontoSchoolBuildingRequest = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
		 userRequestsPageActions.searchForaRequestbyNumber(ModificationorAdditiontoSchoolBuildingRequest);
		userRequestsPageActions.clickDetailsButton(ModificationorAdditiontoSchoolBuildingRequest);
	 	modificationorAdditiontoSchoolBuildingActions.siteIsReady();
	 			
	 	userWorkspacePageActions.logout();
}

@Then("The Engineer Approves the Initial Visit")
public void the_engineer_approves_the_initial_visit() throws InterruptedException, IOException {
	driver.get(properties.getProperty("AdminPortalUrl"));
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  ModificationorAdditiontoSchoolBuildingRequest = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
		   adminAgentQueueActions.adminSearchforaRequest(ModificationorAdditiontoSchoolBuildingRequest);
		   

			String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
		        System.out.println("Request Status: " + requestStatus);
		      assertEquals(requestStatus,"Open - Initial Visit");
		   
		   adminAgentQueueActions.adminOpenRequestDetailsScreen(ModificationorAdditiontoSchoolBuildingRequest);
		adminModificationorAdditiontoSchoolBuildingActions.engineerCompletetheInitialVisit("الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تعديل أو اضافة على مبنى لمدرسة خاصة","الموقع / رقم قطعة الأرض باللغة العربية - طلب تعديل أو اضافة على مبنى لمدرسة خاصة");
		 adminAgentQueueActions.checkRequestStatus(ModificationorAdditiontoSchoolBuildingRequest, "Open - Payment Step");
		 adminAgentQueueActions.adminLogout();
}

@Then("The Applicant Pays the Modification or Addition a Private School Building Request fees")
public void the_applicant_pays_the_modification_or_addition_a_private_school_building_request_fees() throws InterruptedException, IOException {
	 	Thread.sleep(1000);
	driver.get(properties.getProperty("url"));
		commonFunctions.implicitWait(10);
	 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String ModificationorAdditiontoSchoolBuildingRequest = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
		 userRequestsPageActions.searchForaRequestbyNumber(ModificationorAdditiontoSchoolBuildingRequest);
		userRequestsPageActions.clickDetailsButton(ModificationorAdditiontoSchoolBuildingRequest);
	 	modificationorAdditiontoSchoolBuildingActions.payRequestfees();
	 	
		userWorkspacePageActions.clickonSideMenuRequestslink();
		userRequestsPageActions.searchForaRequestbyNumber(ModificationorAdditiontoSchoolBuildingRequest);
		userRequestsPageActions.getRequestStatus("Closed - Accepted");
		userRequestsPageActions.clickDetailsButton(ModificationorAdditiontoSchoolBuildingRequest);
	 	
	 //	userWorkspacePageActions.logout();
	 	
}

}
