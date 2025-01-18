package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class UserApplyforInitialApprovalForTwoStageRequestDefinition extends APECOTestBase{

	public UserApplyforInitialApprovalForTwoStageRequestDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}
	@Then("User Enters Curriculum Details for Two Stages")
	public void user_enters_curriculum_details_for_two_stages() throws InterruptedException {
		initialApplovalSchoolInformationPageActions.enterTwoStageCurriculumDetails("Australian","Pre-Kindergarten","Pre-Kindergarten","50","10","Kindergarten","KG 1","50","20");
	}
}
