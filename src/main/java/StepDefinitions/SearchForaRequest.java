package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Given;

public class SearchForaRequest extends APECOTestBase {

	
	public SearchForaRequest() throws IOException {
		UserPagesInitialization();
		AdminPagesInitialization();
	}

	@Given("The User is searching for a request to pay it's fees")
	public void the_user_is_searching_for_a_request_to_pay_it_s_fees() throws IOException, InterruptedException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		//finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
		userRequestsPageActions.searchForaRequestbyNumber("4678");
		 
		userRequestsPageActions.clickDetailsButton("4678");
		finalApprovalActions.payRequestfees();
		userWorkspacePageActions.clickonSideMenuRequestslink();
		userRequestsPageActions.searchForaRequestbyNumber("4678");
	//	userRequestsPageActions.getRequestStatus("Closed - Accepted");
	}
}
