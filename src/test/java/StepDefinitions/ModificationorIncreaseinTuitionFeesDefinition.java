package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class ModificationorIncreaseinTuitionFeesDefinition extends APECOTestBase {

	public ModificationorIncreaseinTuitionFeesDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}
	
@Then("User Starts New Modification or Increase in Tuition Fees Request")
public void user_starts_new_modification_or_increase_in_tuition_fees_request() throws InterruptedException {
userServicesPageActions.clickModificationorIncreaseinTuitionFeesLink();
userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
}

@Then("User Enters Valid School fees Data")
public void user_enters_valid_school_fees_data() {
	modificationorIncreaseinTuitionFeesActions.enterThreeStagesSchoolFees("100","100","100","200","200","200","300","300","300", "400", "400");

}

@Then("User Enters Modification or Increase in Tuition Fees Request Attachments")
public void user_enters_modification_or_increase_in_tuition_fees_request_attachments() throws InterruptedException, AWTException {
	modificationorIncreaseinTuitionFeesActions.enterTuitionFeesAttachments("UploadFile.pdf", "UploadFile.pdf");
}

@Then("User Submits The Modification or Increase in Tuition Fees Request")
public void user_submits_the_modification_or_increase_in_tuition_fees_request() throws InterruptedException {
	modificationorIncreaseinTuitionFeesActions.payRequestfees();
	modificationorIncreaseinTuitionFeesActions.confirmRequest();
}


}
