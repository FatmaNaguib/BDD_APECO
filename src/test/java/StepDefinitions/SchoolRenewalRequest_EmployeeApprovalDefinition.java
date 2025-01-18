package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class SchoolRenewalRequest_EmployeeApprovalDefinition extends APECOTestBase {

	public SchoolRenewalRequest_EmployeeApprovalDefinition() throws IOException {
		super();
		AdminPagesInitialization();
	}
	


	@Then("The Employee Aprroves The Request")
	public void the_employee_aprroves_the_request() {
		adminRequestDetailsActions.employeeApprovesTheSchoolRenewalRequest();
	}

}
