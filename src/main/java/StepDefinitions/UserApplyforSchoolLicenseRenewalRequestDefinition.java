package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class UserApplyforSchoolLicenseRenewalRequestDefinition extends APECOTestBase{

	public UserApplyforSchoolLicenseRenewalRequestDefinition() throws IOException {
		super();
		UserPagesInitialization();
		
	}


	@Then("^User Starts New Private School Renewal Application$")
	public void user_starts_new_private_school_renewal_application() throws InterruptedException, AWTException {
			userServicesPageActions.clickschoolLicenseRenewalLink();
			userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
			licenseRenewalActions.submitlicenseRenewalRequest("Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf", "Intoduction Document.pdf");
			
	}
	@Then("^User Enters Valid Data in All Fields and Sumbits The New Private School Renewal Application Request$")
	public void user_enters_valid_data_in_all_fields_and_sumbits_the_new_private_school_renewal_application_request() {
	    
	}
}
