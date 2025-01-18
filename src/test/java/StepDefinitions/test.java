package StepDefinitions;


import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;


public class test extends APECOTestBase{
	private final ScenarioContext scenarioContext;

	public test(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;

	}
/*
	@Then("The Change School Location")
	public void the_applicant() throws IOException, InterruptedException, AWTException {
	//	adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickChangeSchoolLocationLink();
		   userSchoolsListActions.selectSchool("New Education School 1368");
		   changeSchoolLocationActions.enterSchoolDetails	("New building", "Moahamed Essam", "شارع جابر المبارك", "Boys",  "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تغيير موقع مدرسة", "الموقع / رقم قطعة الأرض باللغة العربية - طلب تغيير موقع مدرسة",  "800","900", "400", "90", "First","Owner");
		   changeSchoolLocationActions.uploadAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
			changeSchoolLocationActions.submitChangeSchoolLocationRequest();			
			String changeSchoolLocationRequestNumber = changeSchoolLocationActions.getRequestNumber();
			scenarioContext.setData("changeSchoolLocationRequestNumber",changeSchoolLocationRequestNumber );
			Thread.sleep(1000);
			userWorkspacePageActions.logout();
			 //adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");	
	}
	
	@Then("The Engineer Approves the Change School Location Request Engineering Plan")
	public void the_engineer_approves_the_change_school_location_request_engineering_plan() throws IOException, InterruptedException {
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
			adminLoginPageActions.selectEngLang();
			adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
			String  changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
			   adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
			   adminAgentQueueActions.adminOpenRequestDetailsScreen();
			   
			   adminChangeSchoolLocationActions.engineerRatsTheStudyPlanforTheModificationorAdditiontoSchoolBuildingRequest();
				adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
			   
	}

	@Then("The Engineer Completes the Change School Location Request Field Technical Approval File")
	public void the_engineer_completes_the_change_school_location_request_field_technical_approval_file() throws InterruptedException, IOException {
	
		adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		String  changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolLocationRequestNumber");
		   adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
		   adminAgentQueueActions.adminOpenRequestDetailsScreen();
		   adminChangeSchoolLocationActions.engineerCompletetheInitialTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية – طلب تغيير موقع مدرسة","الموقع / رقم قطعة الأرض باللغة العربية طلب تغيير موقع مدرسة ");
		
	}

	@Then("The Applicant Approves the Change School Location Request Site is Ready")
	public void the_applicant_approves_the_change_school_location_request_site_is_ready() throws InterruptedException, IOException {
		 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		 	Thread.sleep(1000);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String changeSchoolLocationRequestNumber = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
			 userRequestsPageActions.searchForaRequestbyNumber(changeSchoolLocationRequestNumber);
			userRequestsPageActions.clickDetailsButton();
			
			
			changeSchoolLocationActions.siteIsReady();
		 	userWorkspacePageActions.logout();
	}

	@Then("The Engineer Completes the Change School Location Request Field Visit")
	public void the_engineer_completes_the_change_school_location_request_field_visit() throws IOException, InterruptedException {
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
			adminLoginPageActions.selectEngLang();
			adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
			String  changeSchoolLocationRequestNumber = (String) scenarioContext.getData("ModificationorAdditiontoSchoolBuildingRequest");
			   adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
			   adminAgentQueueActions.adminOpenRequestDetailsScreen();
			   adminChangeSchoolLocationActions.engineerCompletetheInitialTechnicalApproval("الموقع / رقم قطعة الأرض باللغة الإنجليزية – طلب تغيير موقع مدرسة","الموقع / رقم قطعة الأرض باللغة العربية طلب تغيير موقع مدرسة ");
	}

	@Then("The Employee Approves the Change School Location Request")
	public void the_employee_approves_the_change_school_location_request() throws InterruptedException, IOException {
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		  Thread.sleep(1000);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolNameRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(changeSchoolLocationRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen();
		
		adminChangeSchoolLocationActions.employeeApprovestheChangeSchoolLocatiolRequest("الموقع / رقم قطعة الأرض باللغة الإنجليزية – طلب تغيير موقع مدرسة","الموقع / رقم قطعة الأرض باللغة العربية طلب تغيير موقع مدرسة ");
		 adminAgentQueueActions.adminLogout();
		    adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	}

	@Then("The Applicant Pays The Change School Location Request fees")
	public void the_applicant_pays_the_change_school_location_request_fees() throws InterruptedException, IOException {
		// adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		 	Thread.sleep(1000);
		 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
			userWorkspacePageActions.clickonSideMenuRequestslink();
			String changeSchoolLocationRequestNumber = (String) scenarioContext.getData("changeSchoolManagerRequestNumber");
			 userRequestsPageActions.searchForaRequestbyNumber(changeSchoolLocationRequestNumber);
			userRequestsPageActions.clickDetailsButton();
			
			changeSchoolLocationActions.payRequestfees();
		 	userWorkspacePageActions.logout();
	}*/
}
