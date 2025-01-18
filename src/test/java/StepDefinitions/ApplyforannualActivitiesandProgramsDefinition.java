package StepDefinitions;

import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class ApplyforannualActivitiesandProgramsDefinition  extends APECOTestBase {

	public ApplyforannualActivitiesandProgramsDefinition() throws IOException {
		UserPagesInitialization();
	}

	@Then("User Starts New Annual Activities and Programs Request")
	public void user_starts_new_annual_activities_and_programs_request() throws InterruptedException {
	  userServicesPageActions.clickAnnualActivitiesandProgramsLink();
	  userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	}

	@Then("User Enters valid Annual Activities and Programs Request Data")
	public void user_enters_valid_annual_activities_and_programs_request_data() {
	    annualActivitiesandProgramsActions.enterRequestData("Omar Khaled", "01022002200", "omar@hotmail.com");
	}

	@Then("User Submits The Annual Activities and Programs Request")
	public void user_submits_the_annual_activities_and_programs_request() throws InterruptedException {
		 annualActivitiesandProgramsActions.payRequestfees();
		 annualActivitiesandProgramsActions.getRequestNumber();
	}

}
