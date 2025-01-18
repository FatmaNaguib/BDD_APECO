package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class InitialApprovalRequest_EngineerApprovalDefinition extends APECOTestBase {

	public InitialApprovalRequest_EngineerApprovalDefinition() throws IOException {
		UserPagesInitialization();
		
	}
	@Then("The Engineer Aprroves The Initial Approval Request")
	public void the_engineer_aprroves_the_initial_approval_request() throws AWTException, InterruptedException {
		adminInitialApprovalRequestDetailsActions.engineerApprovesTheInitialApprovalRequest("Technical Engineer Approval School Location in The Initiall Approval Request");

	}
}
