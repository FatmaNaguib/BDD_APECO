package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class FinalAprovalRequestDefinition extends APECOTestBase {
	private final ScenarioContext scenarioContext;

	
	public FinalAprovalRequestDefinition(ScenarioContext scenarioContext) throws IOException {	
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		UserPagesInitialization();	
		}
	
	@Then("User Navigates to The Services Screen")
	public void user_navigates_to_the_services_screen() throws IOException {
		userWorkspacePageActions.clickonSideMenu_Services_link();
	}

	@Then("User Starts New Final Approval Request")
	public void user_starts_new_final_approval_request() throws InterruptedException {
		userServicesPageActions.clickeFinalApprovalServiceLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		System.out.println(licensedSchoolName);
		userSchoolsListActions.selectSchool(licensedSchoolName);
	}

	@Then("User Enters Valid Data in The School Fees Step")
	public void user_enters_valid_data_in_the_school_fees_step() {
		finalApprovalActions.enterSchoolFees("100", "100", "100","200", "200", "200","300", "300", "300", "Dubai", "500", "500");
	}

	@Then("User Enters Valid Data in the Manager Data Step")
	public void user_enters_valid_data_in_the_manager_data_step() throws InterruptedException, AWTException {
		 finalApprovalActions.enterCandidateData();
		 finalApprovalActions.enterManagerData("Mohamed Nader","Emirati","Male","School Manager","Single","1990-11-05","United Arab Emirates","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib99@hotmail.com","123456", "123456", "123456", "123456");
		 finalApprovalActions.enterQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","School","Manager","UploadFile.pdf");
	}

	@Then("User Enters Valid data in the Final Approval Attachments Step")
	public void user_enters_valid_data_in_the_final_approval_attachments_step() throws InterruptedException, AWTException {
		 finalApprovalActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
	}

	@Then("User Submits the Final Approval Request")
	public void user_submits_the_final_approval_request() throws InterruptedException {
		finalApprovalActions.submitTheRequest();
		// finalApprovalActions.confirmRequest();
		String  finalapprovalRequestNumber = finalApprovalActions.confirmRequest();
		 scenarioContext.setData("finalapprovalRequestNumber", finalapprovalRequestNumber);
	}
	
	@Then("User Logs Out")
	public void  user_logs_out() throws InterruptedException {
		Thread.sleep(1000);
			userWorkspacePageActions.logout();
	}	
	
	@Then("User Enters Valid data in the School fees Step For One Stage")
	public void user_enters_valid_data_in_the_school_fees_step_for_one_stage() {
		finalApprovalActions.enterOneStageSchoolFees("100", "100", "100","Dubai", "500", "500");
	}
}
