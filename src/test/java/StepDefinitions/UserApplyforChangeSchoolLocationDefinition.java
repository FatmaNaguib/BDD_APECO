package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class UserApplyforChangeSchoolLocationDefinition extends APECOTestBase{

	public UserApplyforChangeSchoolLocationDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}

	@Then("User Starts New Change School Location Request")
	public void user_starts_new_change_school_location_request() throws InterruptedException {
		userServicesPageActions.clickChangeSchoolLocationLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
		
	}

	@Then("User Enters Valid School Data")
	public void user_enters_valid_school_data() throws AWTException, InterruptedException {
		changeSchoolLocationActions.enterSchoolDetails	("New building", "Moahamed Essam", "شارع جابر المبارك", "Boys",  "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تغيير موقع مدرسة", "الموقع / رقم قطعة الأرض باللغة العربية - طلب تغيير موقع مدرسة",  "800","900", "400", "90", "First","Owner");
	}

	@Then("User Enters Change School Location Request Attachments")
	public void user_enters_change_school_location_request_attachments() throws AWTException, InterruptedException {
		changeSchoolLocationActions.uploadAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
	}

	@Then("User Submits The  Change School Location Request")
	public void user_submits_the_change_school_location_request() throws InterruptedException {
		changeSchoolLocationActions.submitChangeSchoolLocationRequest();
		changeSchoolLocationActions.getRequestNumber();
	}
}
