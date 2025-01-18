package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforEmployeesExperienceCertificateRatificationDefinition extends APECOTestBase {

	public UserApplyforEmployeesExperienceCertificateRatificationDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}

	@When("^User Starts New Employees Experience Certificate Ratification Request$")
	public void user_starts_new_employees_experience_certificate_ratification_request() throws InterruptedException {
		Thread.sleep(1000);
		userServicesPageActions.clickexperienceCertificateforEmployeesServiceLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	}

	@Then("^User Enters Valid data in the Experience Certificate Step$")
	public void user_enters_valid_data_in_the_experience_certificate_step() {
		employeesExperienceCertificateRatificationActions.enterExperienceCertificateData("Mohamed Samir","محمد سمير","English", "اللغة الانجليزية","English Teacher","مدرس لغة انجليزية", "British", "Pre-Kindergarten", "2020-11-04", "2023-11-04");
	    
	}

	@Then("^User Enters Valid data in the Employees Experience Certificate Ratification Attachments Step$")
	public void user_enters_valid_data_in_the_employees_experience_certificate_ratification_attachments_step() throws AWTException, InterruptedException {
		employeesExperienceCertificateRatificationActions.enterExperienceCertificateAttachments("UploadFile.pdf","UploadFile.pdf");
	}

	@Then("^User Sumbits The Employees Experience Certificate Ratification Request$")
	public void user_sumbits_the_employees_experience_certificate_ratification_request_request() throws InterruptedException {
		employeesExperienceCertificateRatificationActions.payExperienceCertificateRequestRequestfees();
		employeesExperienceCertificateRatificationActions.getRequestNumber();
	}
	
}
