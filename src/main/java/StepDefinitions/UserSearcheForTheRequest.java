package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.When;

public class UserSearcheForTheRequest extends APECOTestBase {
	private final ScenarioContext scenarioContext;
	
	public UserSearcheForTheRequest(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
	}

	@When("User Searchs The Final approval Request")
	public void user_searchs_the_final_approval_request() throws InterruptedException {
		
		String requestNo = (String) scenarioContext.getData("initialApprovalRequestNumber");
		   userRequestsPageActions.searchForaRequestbyNumber(requestNo);
	}
	
	
}
