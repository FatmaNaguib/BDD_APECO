package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforChangeSchoolManagerRequestDefinition extends APECOTestBase {
	
	public UserApplyforChangeSchoolManagerRequestDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}

	@When("^User Starts New Change School Manager Request$")
	public void user_starts_new_change_school_manager_request() throws InterruptedException, AWTException {
	  userServicesPageActions.clickChangeSchoolManagerLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	  
	}

	@Then("^User Enters Valid Data in The Manager data step$")
	public void user_enters_valid_data_in_the_manager_data_step() throws InterruptedException, AWTException {
		changeSchoolManagerActions.enterManagerData("Mohamed Nader","Emirati","Male","Teacher","Single","1990-11-05","UAE","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib22@hotmail.com","2025-11-05","2025-11-05","Dubai","2025-11-05",
				"Bachelor's Degree","Engineering","2020-11-05","Cairo university","UploadFile.pdf","School","Manager","2020-12-03","2024-12-03","United Arab Emirates","UploadFile.pdf");
	}

	@Then("^User Enters Valid data in the Change School Attachments Step$")
	public void user_enters_valid_data_in_the_change_school_attachments_step() throws InterruptedException, AWTException {
		changeSchoolManagerActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
	}

	@Then("^User Enters Sumbits The Change School Manager Request$")
	public void user_enters_sumbits_the_change_school_manager_request() throws InterruptedException {
		changeSchoolManagerActions.payRequestfees();
		changeSchoolManagerActions.confirmRequest();
	}

}
