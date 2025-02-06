package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class UserApplyForModificationorAdditiontoSchoolBuildingRequest extends APECOTestBase{

	public UserApplyForModificationorAdditiontoSchoolBuildingRequest() throws IOException {
		super();
		UserPagesInitialization();
	}

	@Then("User Starts New Modification or Addition to School Building Request")
	public void user_starts_new_modification_or_addition_to_school_building_request() throws InterruptedException {
		userServicesPageActions.clickModificationorAdditiontoSchoolBuildingLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	}

	@Then("User Enters Valid School Data for Modification or Addition to School Building Request")
	public void user_enters_valid_school_data_for_modification_or_addition_to_school_building_request() throws AWTException, InterruptedException {
		modificationorAdditiontoSchoolBuildingActions.enterSchoolDetails	("Modification of existing building", "Moahamed Essam", "شارع جابر المبارك", "Boys",  "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تغيير موقع مدرسة", "الموقع / رقم قطعة الأرض باللغة العربية - طلب تغيير موقع مدرسة",  "800","900", "400", "90", "First Class","Owner");
	}

	@Then("User Enters Change School Location Request Attachments for Modification or Addition to School Building Request")
	public void user_enters_change_school_location_request_attachments_for_modification_or_addition_to_school_building_request() throws AWTException, InterruptedException {
		modificationorAdditiontoSchoolBuildingActions.uploadAttachments("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
	}

	@Then("User Submits The Modification or Addition to School Building Request")
	public void user_submits_the_modification_or_addition_to_school_building_request() throws InterruptedException {
	   modificationorAdditiontoSchoolBuildingActions.submitModificationorAdditiontoSchoolBuildingRequest();
	   modificationorAdditiontoSchoolBuildingActions.confirmRequest();
	}
}
