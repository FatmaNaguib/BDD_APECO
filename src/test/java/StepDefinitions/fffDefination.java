package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Then;

public class fffDefination extends APECOTestBase {

	
	public fffDefination() throws IOException {

	}

	@Then("The Review Employee Rats the Study Plan for The Final Approval Requesttt")
	public void the_review_employee_Rats_the_study_plan_for_the_final_approval_requesttt() throws  InterruptedException, IOException {
	//	driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	//	adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");

		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
		//String  finalapprovalRequestNumber = (String) scenarioContext.getData("finalapprovalRequestNumber");
	    //adminAgentQueueActions.adminSearchforFinalApprovalRequest(finalapprovalRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminFinalApprovalActions.reviewEmployeeRatsTheStudyPlanforTheFinalApprovalRequest();
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
//		adminAgentQueueActions.adminLogout();
		// adminLoginPageActions.adminLogin("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	}
}
