package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesActions.SubmitaComplaintActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserReplysTheComplaintDefinition extends APECOTestBase {
	UserSubmitsaComplaintDefinitions  userSubmitsaComplaintDefinitions = new UserSubmitsaComplaintDefinitions();
	public UserReplysTheComplaintDefinition() throws IOException {
		UserPagesInitialization();
	}

@When("User Navigats to The All Reuests Screen")
public void user_navigats_to_the_all_reuests_screen() {
	userWorkspacePageActions.clickonSideMenuRequestslink();
}

@When("User Searchs The Complaint Number")
public void user_searchs_the_complaint_number() throws InterruptedException {
	String requestNo = String.valueOf(SubmitaComplaintActions.requestNumber);
   userRequestsPageActions.searchForaRequestbyNumber(requestNo);
}
@Then("User Opnes Request Details Screen")
public void user_opnes_request_details_screen() throws InterruptedException {
	 userRequestsPageActions.clickDetailsButton();
}

@Then("User Replies and Submit The Complaint")
public void user_replies_and_submit_the_complaint() throws InterruptedException {
	userRequestsPageActions.replyComplaint("No Comment");
}
}
