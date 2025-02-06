package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class UserApplyforInitialApprovalForOneStageRequestDefinition extends APECOTestBase {

	public UserApplyforInitialApprovalForOneStageRequestDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}
	@Then("User Enters Curriculum Details for One Stage")
	public void user_enters_curriculum_details_for_one_stage() throws InterruptedException {
		initialApplovalSchoolInformationPageActions.enterOneStageCurriculumDetails("Australian","Stage 3","Grade 12","301","10");
	}
	
	
	
}
