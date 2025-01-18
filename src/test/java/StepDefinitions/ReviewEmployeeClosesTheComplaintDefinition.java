package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesActions.SubmitaComplaintActions;
import io.cucumber.java.en.Then;

public class ReviewEmployeeClosesTheComplaintDefinition extends APECOTestBase{

	
	public ReviewEmployeeClosesTheComplaintDefinition() throws IOException {

		UserPagesInitialization();
		AdminPagesInitialization();
	}
	@Then("The user Searchs for The Complaint")
	public void the_user_searchs_for_the_complaint() throws InterruptedException {
		String requestNo = String.valueOf(SubmitaComplaintActions.requestNumber);
		   //userRequestsPageActions.searchForaRequestbyNumber(requestNo);
		adminAgentQueueActions.adminSearchforaRequest(requestNo);
	}

	@Then("User Opnes Complaint Details Screen")
	public void user_opnes_complaint_details_screen() {
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
	}

	@Then("User Closes The Complaint")
	public void user_closes_the_complaint() {
		adminComplaintActions.adminClosesTheComplaint();
	}

}
