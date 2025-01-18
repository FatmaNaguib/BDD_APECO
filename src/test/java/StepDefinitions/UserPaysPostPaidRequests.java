package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class UserPaysPostPaidRequests extends APECOTestBase {

	private final ScenarioContext scenarioContext;
	public UserPaysPostPaidRequests(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
	}
	@Then("User Pays The Final Approval Request fees")
	public void user_pays_the_final_approval_request_fees() throws InterruptedException, IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String requestNo = (String) scenarioContext.getData("finalapprovalRequestNumber");
		 userRequestsPageActions.searchForaRequestbyNumber(requestNo);
		userRequestsPageActions.clickDetailsButton();
		finalApprovalActions.payRequestfees();
		userWorkspacePageActions.logout();
	}
}
