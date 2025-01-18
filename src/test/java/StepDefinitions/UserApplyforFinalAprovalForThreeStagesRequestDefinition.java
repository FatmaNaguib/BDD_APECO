package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortaPageslLocators.AdminAgentQueueLocators;
import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforFinalAprovalForThreeStagesRequestDefinition extends APECOTestBase {

	private final ScenarioContext scenarioContext;

public UserApplyforFinalAprovalForThreeStagesRequestDefinition(ScenarioContext scenarioContext) throws IOException {
	this.scenarioContext = scenarioContext;

	UserPagesInitialization();
	UserPagesInitialization();
	}

@When("^User Starts New Final Aproval Request$")
public void user_starts_new_final_aproval_request() throws InterruptedException {
	userServicesPageActions.clickeFinalApprovalServiceLink();
}

@Then("^User Enters Valid data in the School fees Step$")
public void user_enters_valid_data_in_the_school_fees_step() {
finalApprovalActions.enterSchoolFees("100", "100", "100","200", "200", "200","300", "300", "300", "Dubai", "500", "500");
}

@Then("^User Enters Valid data in the Manager Data Step$")
public void user_enters_valid_data_in_the_manager_data_step() throws InterruptedException, AWTException {
 finalApprovalActions.enterCandidateData();
 finalApprovalActions.enterManagerData("Mohamed Nader","Emirati","Male","School Manager","Single","1990-11-05","United Arab Emirates","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib99@hotmail.com","123456", "123456", "123456", "123456");
 finalApprovalActions.enterQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","School","Manager","UploadFile.pdf");
}

@Then("^User Enters Valid data in the Final Aproval Attachments Step$")
public void user_enters_valid_data_in_the_final_aproval_attachments_step() throws InterruptedException, AWTException {
	 finalApprovalActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
}

@Then("^User Sumbits The Final Aproval Request$")
public void user_sumbits_the_final_aproval_request() throws InterruptedException {
	finalApprovalActions.submitTheRequest();
	// int finalApprovalRequestNumber = finalApprovalActions.confirmRequest();
	String  finalapprovalRequestNumber = finalApprovalActions.confirmRequest();
	 scenarioContext.setData("finalApprovalRequestNumber", finalapprovalRequestNumber);
}

@Then("User Applys for a New Final Approval Request Successfully")
public void user_applys_for_a_new_final_approval_request_successfully() throws InterruptedException, AWTException {
	finalApprovalActions.enterSchoolFees("100", "100", "100","200", "200", "200","300", "300", "300", "Dubai", "500", "500");
	finalApprovalActions.enterCandidateData();
	 finalApprovalActions.enterManagerData("Mohamed Nader","Emirati","Male","School Manager","Single","1990-11-05","United Arab Emirates","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib99@hotmail.com","123456", "123456", "123456", "123456");
	 finalApprovalActions.enterQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","School","Manager","UploadFile.pdf");
	 finalApprovalActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
	finalApprovalActions.submitTheRequest();	
//	int finalApprovalRequestNumber = finalApprovalActions.confirmRequest();
	String  finalapprovalRequestNumber = finalApprovalActions.confirmRequest();
	 scenarioContext.setData("finalApprovalRequestNumber", finalapprovalRequestNumber);
   adminAgentQueueActions.adminSearchforaRequest(String.valueOf(finalapprovalRequestNumber));
   adminAgentQueueActions.adminOpenRequestDetailsScreen();

}


}
