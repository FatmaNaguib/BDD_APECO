package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class ReducingEducationalStagesDefinition extends APECOTestBase {

	public ReducingEducationalStagesDefinition() throws IOException {
		UserPagesInitialization();
	}
	@Then("User Starts New Reducing Educational Stages Request")
	public void user_starts_new_reducing_educational_stages_request() throws InterruptedException {
		userServicesPageActions.clickReducingEducationalStagesLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	
	}

	@Then("User Selects Reducing Educational Stages for the Reducing Educational Stages Request")
	public void user_selects_reducing_educational_stages_for_the_reducing_educational_stages_request() throws InterruptedException {
		reducingEducationalStagesActions.selectEducationalStages();
	}

	@Then("User Enters for The Reducing Educational Stages Request Request Attachments")
	public void user_enters_for_the_reducing_educational_stages_request_request_attachments() throws AWTException, InterruptedException {
		reducingEducationalStagesActions.reducingEducationalStagesAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
	}

	@Then("User Submits The Reducing Educational Stages Request")
	public void user_submits_the_reducing_educational_stages_request() throws InterruptedException {
		reducingEducationalStagesActions.postPayRequestfees();
		reducingEducationalStagesActions.getRequestNumber();
	}

}
