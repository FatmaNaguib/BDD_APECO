package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;

import io.cucumber.java.en.Then;


public class UserApplyforPublishingAnnouncementsforPrivateSchoolsRequestDefinition extends APECOTestBase {

	public UserApplyforPublishingAnnouncementsforPrivateSchoolsRequestDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}
	

@Then("^User Starts New  Publishing Announcements for Private Schoolsl Requestt$")
public void user_starts_new_publishing_announcements_for_private_schoolsl_requestt() throws InterruptedException {

	userServicesPageActions.clickPublishingAnnouncementsServiceLink();
//userServicesPageActions.setDevTools();
userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	 System.out.println("3-User Starts New  Publishing Announcements for Private Schoolsl Request");
}

@Then("^User Enters Valid Data in All Fields and Sumbits The Requestt$")
public void user_enters_valid_data_in_all_fields_and_sumbits_the_requestt() throws AWTException, InterruptedException {
	publishingAnnouncementsPageActions.submitPublishingAnnouncementsRequest("Social media", "Omar.jpeg");
	System.out.println("4-User Enters Valid Data in All Fields and Sumbits The Request");
}
	

}
