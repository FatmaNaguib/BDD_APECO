package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesLocators.SubmitaComplaintLocators;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSubmitsaComplaintDefinitions  extends APECOTestBase {

	SubmitaComplaintLocators submitaComplaintLocators;
	
	public UserSubmitsaComplaintDefinitions() throws IOException {
		UserPagesInitialization();
		submitaComplaintLocators = new SubmitaComplaintLocators();
	}

	@When("User Submits a New Complaint Request")
	public void user_submits_a_new_complaint_request() throws InterruptedException {
	   userServicesPageActions.startSubmitaComplaintRequest();
	}

	@Then("User Enters Valid Applicant Data")
	public void user_enters_valid_applicant_data() {
		submitaComplaintActions.enterApplicantData("Ali Taher", "00966252115156");
	}

	@Then("User Enters Valid Complaint Data")
	public void user_enters_valid_complaint_data() {
		submitaComplaintActions.enterComplaintData(properties.getProperty("SchoolNameEng"), "Complaint Statement");
	}

	@Then("User Enters Valid Complaint Attachments")
	public void user_enters_valid_complaint_attachments() throws AWTException, InterruptedException {
	    submitaComplaintActions.enterComplaintAttachments("UploadFile.pdf");
	}

	@Then("User Submits The Request")
	public void user_submits_the_request() throws InterruptedException {
	 submitaComplaintActions.confirmRequest();
	}
}
