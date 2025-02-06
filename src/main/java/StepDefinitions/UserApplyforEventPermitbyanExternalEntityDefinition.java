package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforEventPermitbyanExternalEntityDefinition extends APECOTestBase {

	public UserApplyforEventPermitbyanExternalEntityDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}
	
	@When("User Starts New Event Permit by an External Entity Request")
	public void user_starts_new_event_permit_by_an_external_entity_request() {
	   
	}

	@Then("User Enters Valid Event Data Step")
	public void user_enters_valid_event_data_step() throws InterruptedException {
		userServicesPageActions.clickEventPermitbyanExternalEntityServiceLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
		eventPermitbyanExternalEntityActions.enterEventData("Lecture", "Implementation Mechanism Value", "Attendee Names", "Third Party Name", "Mohamed Mouner", "012255211", "2025-11-12 01:37 AM", "2025-11-15 01:37 AM");
	}

	@Then("User Enters Valid data in the Event Attachments Step")
	public void user_enters_valid_data_in_the_event_attachments_step() throws AWTException, InterruptedException {
		eventPermitbyanExternalEntityActions.enterEventAttachments("UploadFile.pdf","UploadFile.pdf");
	    
	}

	@Then("User Enters Sumbits The New Event Permit by an External Entity Request")
	public void user_enters_sumbits_the_new_event_permit_by_an_external_entity_request() {
		eventPermitbyanExternalEntityActions.submitEventPermitbyanExternalEntityRequest();
	}


}
