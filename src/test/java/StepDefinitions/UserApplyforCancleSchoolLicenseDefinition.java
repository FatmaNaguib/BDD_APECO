package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforCancleSchoolLicenseDefinition extends APECOTestBase {
	
	public UserApplyforCancleSchoolLicenseDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}

	@When("^User Starts New Cancle School License  Request Request$")
	public void user_starts_new_cancle_school_license_request_request() throws InterruptedException {
		Thread.sleep(1000);
		userServicesPageActions.clickSchoolLicenseCancelationServiceLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
		 System.out.println("1-User Starts New Cancle School License  Request Request");
	}

	@Then("^User Enters Valid data in the Cancel School License Step$")
	public void user_enters_valid_data_in_the_cancel_school_license_step() {
		
		cancleSchoolLicenseActions.resoneofSchoolCancellation("Financial reasons","We Don't Have Mony");
		 System.out.println("2-User Enters Valid data in the Cancel School License Step");
	}

	@Then("^User Enters Valid data in the School Cancellation Attachments Step$")
	public void user_enters_valid_data_in_the_school_cancellation_attachments_step() throws AWTException, InterruptedException {
		cancleSchoolLicenseActions.attachSchoolCancellationAttachments("UploadFile.pdf","UploadFile.pdf");
		 System.out.println("3-User Enters Valid data in the SchoolC ancellation Attachments Step");
	}

	@Then("^User Enters Sumbits The Cancle School License  Request Request$")
	public void user_enters_sumbits_the_cancle_school_license_request_request() throws InterruptedException {
		cancleSchoolLicenseActions.submitCancelSchoolLicenseRequest();
		 System.out.println("4-User Enters Sumbits The Cancle School License  Request Request");
	}



}
