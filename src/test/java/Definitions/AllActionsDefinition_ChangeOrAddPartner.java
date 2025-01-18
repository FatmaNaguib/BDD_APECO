package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_ChangeOrAddPartner extends APECOTestBase {
	
	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_ChangeOrAddPartner(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
	}

	
	@Then("The Applicant Applies for a New Change Or Add Partner Request")
	public void the_applicant_applies_for_a_new_change_or_add_partner_request() throws Exception {

		adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		
		userServicesPageActions.clickChangeorAddPartnerRequestLink();

		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);
		
		
		changeOrAddPartnerActions.StartAddNewOwnersRequest(); 
		 changeOrAddPartnerActions.enterOwnerPersonalData("Company","الشركة المتحدة","Omar Kamel", "Al-Ali","Omar.jpeg","CriminalStatusCertifion.jpg","UAE","2024-05-27","Emirati","Muslim", "Engineer","600");
		 changeOrAddPartnerActions.enterOwnerpassportDetails("A123456","UAE","2024-05-27","2025-05-27","Passport.jpg");
		Thread.sleep(1000);	 
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
			Thread.sleep(1000);
			userWorkspacePageActions.logout();
			
			 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
						 
	}
	
	@Then("Employee Approves The Change Or Add Partner Approval Request")
	public void employee_approves_the_change_or_add_partner_approval_request() throws AWTException, InterruptedException, IOException {
		Thread.sleep(1000);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String changeOrAddPartnerRequestNumber = (String) scenarioContext.getData("changeOrAddPartnerRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(changeOrAddPartnerRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
	  adminChangeOrAddPartnerActions.employeeApprovesTheChangeOrAddPartnerApprovalRequest();
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
			 
	}

	@Then("Employeemployee Uploads Security Permit For The Change Or Add Partner Approval Request")
	public void employeemployee_uploads_security_permit_for_the_change_or_add_partner_approval_request() throws AWTException, InterruptedException, IOException {
		Thread.sleep(1000);
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
		String changeOrAddPartnerRequestNumber = (String) scenarioContext.getData("changeOrAddPartnerRequestNumber");
		adminAgentQueueActions.adminSearchforaRequest(changeOrAddPartnerRequestNumber);
		adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminChangeOrAddPartnerActions.employeemployeeUploadSecurityPermitRequest("UploadFile.pdf");
		 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
			 
	}

	@Then("Applicant Pays The Change Or Add Partner Approval Request Fees")
	public void applicant_pays_the_change_or_add_partner_approval_request_fees() throws InterruptedException, IOException {
	 	Thread.sleep(1000);
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		String changeOrAddPartnerRequestNumber = (String) scenarioContext.getData("changeOrAddPartnerRequestNumber");
		 userRequestsPageActions.searchForaRequestbyNumber(changeOrAddPartnerRequestNumber);
		userRequestsPageActions.clickDetailsButton();
		changeOrAddPartnerActions.postPayRequestfees();
		userWorkspacePageActions.logout();
	}
}
