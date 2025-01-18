package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_AddingEducationalStages extends APECOTestBase{
	public AllActionsDefinition_AddingEducationalStages(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
	}

	private final ScenarioContext scenarioContext;

	@Then("The Applicant Applies for a New Adding Educational Stages Request")
	public void the_applicant_applies_for_a_new_adding_educational_stages_request() throws InterruptedException, AWTException, IOException {
		adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		
		userServicesPageActions.clickAddingEducationalStagesLink();
		
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		System.out.println(licensedSchoolName);
		userSchoolsListActions.selectSchool(licensedSchoolName);
		addingEducationalStagesActions.enterSchoolData("15155", "Applicant Relationship of School Building");
		addingEducationalStagesActions.addingThefourthEducationalStages("Stage 3", "100","10", "Grade 9", "100", "200", "300");
		addingEducationalStagesActions.addingEducationalStagesAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf");
		
		addingEducationalStagesActions.payRequestfees();
		
		
		String addingEducationalStagesNumber =addingEducationalStagesActions.confirmRequest();
		scenarioContext.setData("addingEducationalStagesActions", addingEducationalStagesNumber);
		Thread.sleep(1000);    
		userWorkspacePageActions.logout();
	}

	@Then("The Engineer Aprroves The Adding Educational Stages Request")
	public void the_engineer_aprroves_the_adding_educational_stages_request() throws InterruptedException, IOException {
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		  Thread.sleep(1000);
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
		//String changeSchoolNameRequestNumber = (String) scenarioContext.getData("changeSchoolNameRequestNumber");

	}

	@Then("The Employee Aprroves The Adding Educational Stages Request")
	public void the_employee_aprroves_the_adding_educational_stages_request() {

	}
	
	
}
