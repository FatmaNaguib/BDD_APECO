package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ModificationorIncreaseinTuitionFees extends APECOTestBase {
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ModificationorIncreaseinTuitionFees(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();

	}
	@Then("The Applicant Applies for a New Modification or Increase in Tuition Fees")
	public void the_applicant_applies_for_a_new_modification_or_increase_in_tuition_fees() throws InterruptedException, AWTException, IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		//adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	//	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickModificationorIncreaseinTuitionFeesLink();
		
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		modificationorIncreaseinTuitionFeesActions.enterThreeStagesSchoolFees("100","100","100","200","200","200","300","300","300", "400", "400");
		modificationorIncreaseinTuitionFeesActions.enterTuitionFeesAttachments("UploadFile.pdf", "UploadFile.pdf");
		modificationorIncreaseinTuitionFeesActions.payRequestfees();
		Thread.sleep(1000);
		String tuitionFeesRequestNumber = modificationorIncreaseinTuitionFeesActions.confirmRequest();
		 scenarioContext.setData("tuitionFeesRequestNumber", tuitionFeesRequestNumber);
			Thread.sleep(1000);    
			userWorkspacePageActions.logout();			
	}

	@Then("The Employee Aprroves The Modification or Increase in Tuition Fees Request")
	public void the_employee_aprroves_the_modification_or_increase_in_tuition_fees_request() throws InterruptedException, IOException, AWTException {
		Thread.sleep(1000);  
		driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
			 adminLoginPageActions.selectEngLang();
		  adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		  Thread.sleep(1000);

		
			String  tuitionFeesRequestNumber = (String) scenarioContext.getData("tuitionFeesRequestNumber");
			 
			   adminAgentQueueActions.adminSearchforaRequest(tuitionFeesRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen();
			adminModificationorIncreaseinTuitionFeesActions.employeeApprovesTheModificationorIncreaseinTuitionFeesRequest();		
			Thread.sleep(1000);    
			userWorkspacePageActions.logout();
		
	}
}
