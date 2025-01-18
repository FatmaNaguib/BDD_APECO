package StepDefinitions;

import java.io.IOException;

import AdminPortaPageslLocators.AdminAgentQueueLocators;
import Bases.APECOTestBase;

import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AdminOpnesTheRequestDetailsScreenDefinition  extends APECOTestBase{
	private final ScenarioContext scenarioContext;
AdminAgentQueueLocators adminAgentQueueLocators;
	
	public AdminOpnesTheRequestDetailsScreenDefinition(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		adminAgentQueueLocators = new AdminAgentQueueLocators();
		UserPagesInitialization(); AdminPagesInitialization();
	}

	@Then("The Employee Searchs for the Request")
	public void the_employee_searchs_for_the_request() throws InterruptedException, IOException {
		
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String requestNo = "2947";
		//adminAgentQueueActions.adminSearchforaRequest(changeOrAddPartnerRequestNumber);
		//String requestNo = (String) scenarioContext.getData("initialApprovalRequestNumber");
		   //userRequestsPageActions.searchForaRequestbyNumber(requestNo);
		adminAgentQueueActions.adminSearchforaRequest(requestNo);
	}
	
	@Then("The Employee Searchs for the Final Approval Request")
	public void the_employee_searchs_for_the_final_approval_request() throws InterruptedException {
		//String finalApprocalRequestNumber = (String) scenarioContext.getData("finalApprocalRequestNumber");
		 //  userRequestsPageActions.searchForaRequestbyNumber(requestNo);
		String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest2(finalapprovalRequestNumber,adminAgentQueueLocators.saerch_Textbox );
	}
	
	
	
	@Then("The Employee Searchs for the Change School Name Request")
	public void the_employee_searchs_for_the_change_school_name_request() throws InterruptedException {
		int requestNumber = initialApplovalDocumentsPageActions.confirmRequest();
		 scenarioContext.setData("requestNumber", requestNumber);
		//String requestNo = String.valueOf(ChangeSchoolNameActions.requestNumber);
	    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(requestNumber));
	}
	
	
	
	@Then("The Employee Opens The Request Details")
	public void the_employee_opens_the_request_details() {
	    adminAgentQueueActions.adminOpenRequestDetailsScreen();
	}
}
