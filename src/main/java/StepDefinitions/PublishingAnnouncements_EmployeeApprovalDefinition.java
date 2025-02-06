package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class PublishingAnnouncements_EmployeeApprovalDefinition extends APECOTestBase {

	
	
	public PublishingAnnouncements_EmployeeApprovalDefinition() throws IOException {
		super();
		AdminPagesInitialization();
	}

	@Then("The Employee Aprroves The Publishing Announcements Request")
	public void the_employee_aprroves_the_publishing_announcements_request() {
	    adminPublishingAnnouncementsActions.adminApprovesThePublishingAnnouncementsRequest();
	}

}
