package Definitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_SubmitsaComplaint extends APECOTestBase  {
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_SubmitsaComplaint(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}

	@Then("The Applicant Submits a New Complaint Request")
	public void the_applicant_submits_a_new_complaint_request() throws IOException, InterruptedException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		   userServicesPageActions.startSubmitaComplaintRequest();
		
		   submitaComplaintActions.enterApplicantData("Ali Taher", "00966252115156");
		   String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		//   submitaComplaintActions.enterComplaintData(properties.getProperty("SchoolNameEng"), "Complaint Statement");
		   submitaComplaintActions.enterComplaintData(licensedSchoolName, "Complaint Statement");
		   submitaComplaintActions.enterComplaintAttachments("UploadFile.pdf");
		   
		String complaintRequestNumber = submitaComplaintActions.confirmRequest();		
		scenarioContext.setData("complaintRequestNumber", complaintRequestNumber);
		assertTrue(complaintRequestNumber.length() > 0);
		Thread.sleep(1000);  
		//commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
		
	}

	@Then("The School Representative Can Reply The Complaint")
	public void the_school_representative_can_reply_the_complaint() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.get("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String complaintRequestNumber  =  (String) scenarioContext.getData("complaintRequestNumber");
		   userRequestsPageActions.searchForaRequestbyNumber(complaintRequestNumber);
		 userRequestsPageActions.clickDetailsButton(complaintRequestNumber);
		 userRequestsPageActions.replyComplaint("No Comment");
		Thread.sleep(1000);  
			userWorkspacePageActions.logout();
	}

	@Then("The Review Employee Closes The Complaint")
	public void the_review_employee_closes_the_complaint() throws InterruptedException, IOException {
		Thread.sleep(1000);
		 driver.get(properties.getProperty("url"));
		adminLoginPageActions.selectEngLang();	  
		adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
		String complaintRequestNumber = (String) scenarioContext.getData("complaintRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(complaintRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(complaintRequestNumber);
		adminComplaintActions.adminClosesTheComplaint();
	}
}
