package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class UserApplyforFinalAprovalForTwoStageRequestDefinition extends APECOTestBase {

	public UserApplyforFinalAprovalForTwoStageRequestDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}
	@Then("User Enters Valid data in the School fees Step For Two Stages")
	public void user_enters_valid_data_in_the_school_fees_step_for_two_stages() throws InterruptedException {
		finalApprovalActions.enterTwoStageSchoolFees("100", "100", "100","200", "200", "200","Dubai", "500", "500");
	}
}
