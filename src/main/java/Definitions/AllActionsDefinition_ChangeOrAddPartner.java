package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ChangeOrAddPartner extends APECOTestBase {
	
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ChangeOrAddPartner(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}

	
	@Then("The Applicant Applies for a New Change Or Add Partner Request")
	public void the_applicant_applies_for_a_new_change_or_add_partner_request() throws Exception {

		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();	
		userServicesPageActions.clickChangeorAddPartnerRequestLink();
//		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
//		userSchoolsListActions.selectSchool(licensedSchoolName);
		userSchoolsListActions.selectSchool("New Education School 64590");
		changeOrAddPartnerActions.StartAddNewOwnersRequest(); 
		 changeOrAddPartnerActions.enterOwnerPersonalData("Company","الشركة المتحدة","Omar Kamel", "Al-Ali","Omar.jpeg","CriminalStatusCertifion.jpg","UAE","2024-05-27","Emirati","Muslim", "Engineer","600");
		 changeOrAddPartnerActions.enterOwnerpassportDetails("A123456","UAE","2024-05-27","2025-05-27","Passport.jpg");
		 commonFunctions.implicitWait(10);
		changeOrAddPartnerActions.enterResidenceDetailsDetails("123456789123456","Residence.jpg");		 
		 changeOrAddPartnerActions.enterOwnerQualificationsDetails("Bachelor's Degree","جامعة القاهرة","2024-05-27","Egypt");
		changeOrAddPartnerActions.enterMaritalStatusDetails("Single");				 
		 changeOrAddPartnerActions.enterFatherandMotherDetails("Mohamed Ali","Emirati","Emirati","Faten");
		  changeOrAddPartnerActions.enterHousingDetails("القاهرة","شارع شبرا","010505050","12345");	
		 changeOrAddPartnerActions.enterPartnersharepercentage();				 
		 changeOrAddPartnerActions.downloadDocument();				 
		 changeOrAddPartnerActions.uploadocument("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");	 
		changeOrAddPartnerActions.checkTheDataAcknowledge();	 		
		String  changeOrAddPartnerRequestNumber = changeOrAddPartnerActions.payTheRequestFees();		
		scenarioContext.setData("changeOrAddPartnerRequestNumber",changeOrAddPartnerRequestNumber );	
		assertTrue(changeOrAddPartnerRequestNumber.length() > 0);
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
		Thread.sleep(1000);
	
	}
	
	@Then("Employee Approves The Change Or Add Partner Approval Request")
	public void employee_approves_the_change_or_add_partner_approval_request() throws AWTException, InterruptedException, IOException {
		 driver.get(properties.getProperty("AdminPortalUrl"));
		 adminLoginPageActions.selectEngLang();
		 commonFunctions.implicitWait(10);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String changeOrAddPartnerRequestNumber = (String) scenarioContext.getData("changeOrAddPartnerRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(changeOrAddPartnerRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(changeOrAddPartnerRequestNumber);
		adminChangeOrAddPartnerActions.employeeApprovesTheChangeOrAddPartnerApprovalRequest();	
		adminAgentQueueActions.checkRequestStatus(changeOrAddPartnerRequestNumber, "Open - Employee Upload Security Permits");
		System.out.println("Request Status: " + changeOrAddPartnerRequestNumber);
//		 adminAgentQueueActions.adminOpenAgentQueueScreen();
//		 commonFunctions.implicitWait(20);
//		  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(changeOrAddPartnerRequestNumber));
//		 commonFunctions.implicitWait(10);
//	      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	       System.out.println("Request Status: " + requestStatus);
//	       assertEquals(requestStatus,"Open - Employee Upload Security Permits");
//	       commonFunctions.implicitWait(10);
	       adminAgentQueueActions.adminLogout();
	}

	@Then("Employeemployee Uploads Security Permit For The Change Or Add Partner Approval Request")
	public void employeemployee_uploads_security_permit_for_the_change_or_add_partner_approval_request() throws AWTException, InterruptedException, IOException {
		
		Thread.sleep(1000);
		 driver.get(properties.getProperty("AdminPortalUrl"));
		 adminLoginPageActions.selectEngLang();
		 commonFunctions.implicitWait(10);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String changeOrAddPartnerRequestNumber = (String) scenarioContext.getData("changeOrAddPartnerRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(changeOrAddPartnerRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen(changeOrAddPartnerRequestNumber);
		adminChangeOrAddPartnerActions.employeemployeeUploadSecurityPermitRequest("UploadFile.pdf");
		
		adminAgentQueueActions.checkRequestStatus(changeOrAddPartnerRequestNumber, "Open - Payment Step");
		
		
//		 adminAgentQueueActions.adminOpenAgentQueueScreen();
//		 commonFunctions.implicitWait(20);
//		  adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(changeOrAddPartnerRequestNumber));
//		 commonFunctions.implicitWait(10);
//	      String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//	       System.out.println("Request Status: " + requestStatus);
//	 assertEquals(requestStatus,"Open - Payment Step");
	 adminAgentQueueActions.adminLogout();
	
	}

	@Then("Applicant Pays The Change Or Add Partner Approval Request Fees")
	public void applicant_pays_the_change_or_add_partner_approval_request_fees() throws InterruptedException, IOException {
	 	Thread.sleep(1000);
	 	driver.get(properties.getProperty("url"));
	 	commonFunctions.implicitWait(10);
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String changeOrAddPartnerRequestNumber = (String) scenarioContext.getData("changeOrAddPartnerRequestNumber");
		 userRequestsPageActions.searchForaRequestbyNumber(changeOrAddPartnerRequestNumber);
		userRequestsPageActions.clickDetailsButton(changeOrAddPartnerRequestNumber);
		changeOrAddPartnerActions.postPayRequestfees();
		
		userWorkspacePageActions.clickonSideMenuRequestslink();
		userRequestsPageActions.searchForaRequestbyNumber(changeOrAddPartnerRequestNumber);
		
		userRequestsPageActions.getRequestStatus("Closed - Accepted");
		//userRequestsPageActions.clickDetailsButton(changeOrAddPartnerRequestNumber);
		
		//userWorkspacePageActions.logout();
	}
}
