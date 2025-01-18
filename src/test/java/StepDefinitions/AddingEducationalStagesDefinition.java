package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AddingEducationalStagesDefinition extends APECOTestBase{
	private final ScenarioContext scenarioContext;
	public AddingEducationalStagesDefinition(ScenarioContext scenarioContext) throws IOException {
		super();
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
	}
	
	@Then("User Starts New Adding Educational Stages Request")
	public void user_starts_new_adding_educational_stages_request() throws InterruptedException {
		userServicesPageActions.clickAddingEducationalStagesLink();
		String licensedSchoolName = (String) scenarioContext.getData("scenarioContext");
		userSchoolsListActions.selectSchool(licensedSchoolName);
	}

	@Then("User Enters Valid School Data for the Adding Educational Stages Request")
	public void user_enters_valid_school_data_for_the_adding_educational_stages_request() throws InterruptedException, AWTException {
		addingEducationalStagesActions.enterSchoolData("15155", "Applicant Relationship of School Building");
	}

	@Then("User Enters Valid Educational Stages Data for The Adding Educational Stages Request")
	public void user_enters_valid_educational_stages_data_for_the_adding_educational_stages_request() throws AWTException, InterruptedException {
		addingEducationalStagesActions.addingThefourthEducationalStages("Stage 3", "100","10", "Grade 9", "100", "200", "300");
	}

	@Then("User Enters for The Adding Educational Stages Request Request Attachments")
	public void user_enters_for_the_adding_educational_stages_request_request_attachments() throws AWTException, InterruptedException {
		addingEducationalStagesActions.addingEducationalStagesAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf");
	}

	@Then("User Submits The Adding Educational Stages Request")
	public void user_submits_the_adding_educational_stages_request() throws InterruptedException {
		addingEducationalStagesActions.payRequestfees();
		addingEducationalStagesActions.confirmRequest();
	}
}
