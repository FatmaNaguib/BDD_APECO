package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import UserPortalPagesActions.UserSchoolsListActions;
import io.cucumber.java.en.Then;

public class UserApplyforChangeSchoolNameRequestDefinition extends APECOTestBase {

	public UserApplyforChangeSchoolNameRequestDefinition() throws IOException {
		UserPagesInitialization();
	}

	
	@Then("^User Starts New Change School Name Request$")
	public void user_starts_new_change_school_name_request() throws InterruptedException, AWTException {
		userServicesPageActions.startChangeSchoolNameRequest();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	}

	@Then("^User Enters Valid Data in All Fields and Sumbits The New Change School Name Request$")
	public void user_enters_valid_data_in_all_fields_and_sumbits_the_new_change_school_name_request() throws AWTException, InterruptedException {
		String[] schoolNames = UserSchoolsListActions.schoolName();
		String schoolNameAr = schoolNames[0];
		String schoolNameEng = schoolNames[1];
		changeSchoolNameActions.submitChangeSchoolNameRequest(schoolNameEng,schoolNameAr, "Intoduction Document.pdf","Intoduction Document.pdf");
		changeSchoolNameActions.payRequestfees();
		changeSchoolNameActions.confirmRequest();
	}
}
