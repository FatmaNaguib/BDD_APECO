package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class InitialApprovalRequest_EmployeeApprovalDefinition extends APECOTestBase{

	public InitialApprovalRequest_EmployeeApprovalDefinition() throws IOException {
		super();
		AdminPagesInitialization();
	}
	@Then("The Employee Aprroves The Initial Approval Request")
	public void the_employee_aprroves_the_initial_approval_request() throws AWTException, InterruptedException {
		adminInitialApprovalRequestDetailsActions.employeeApprovesTheInitialApprovalRequest("UploadFile.pdf");
	}
	
	@Then("The Employee Approves The New Initial Approval Request Successfully")
	public void the_employee_approves_the_new_initial_approval_request_successfully() throws AWTException, InterruptedException {
		adminInitialApprovalRequestDetailsActions.employeeApprovesTheInitialApprovalRequest("UploadFile.pdf");
	}
	
	
}
