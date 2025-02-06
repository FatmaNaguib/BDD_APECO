package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforPartnerWithdrawalRequestDefinition  extends APECOTestBase {

	private final ScenarioContext scenarioContext;
	
	public UserApplyforPartnerWithdrawalRequestDefinition(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
	}


@When("User Starts New Partner Withdrawal Request")
public void user_starts_new_partner_withdrawal_request() throws InterruptedException {
userServicesPageActions.clickPartnerWithdrawalRequestLink();
//String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//userSchoolsListActions.selectSchool(licensedSchoolName);
userSchoolsListActions.selectSchool("New Education School  31877");
partnerWithdrawalRequestActions.selectOwner();


}

@Then("User Selects a Partner")
public void user_selects_a_partner() {
String changePercentageTitle= partnerWithdrawalRequestActions.selectOwner();
assertEquals(changePercentageTitle, "change withdrawal percentage");
}

@Then("User Enters  Partners Percentage")
public void user_enters_partners_percentage() {

}

@Then("User attaches The request Documents")
public void user_attaches_the_request_documents() {

}

@Then("User Pays The  Request fees")
public void user_pays_the_request_fees() {

}
	
}
