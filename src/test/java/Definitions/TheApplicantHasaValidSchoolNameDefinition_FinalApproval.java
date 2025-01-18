package Definitions;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;

public class TheApplicantHasaValidSchoolNameDefinition_FinalApproval extends APECOTestBase   {

	private final ScenarioContext scenarioContext;
	
	public TheApplicantHasaValidSchoolNameDefinition_FinalApproval(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		
	}
	
	@Given("The Applicant Has a Valid School Name")
	public void the_applicant_has_a_valid_school_name() throws IOException, InterruptedException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickeFinalApprovalServiceLink();
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		System.out.println(licensedSchoolName);
		userSchoolsListActions.selectSchool(licensedSchoolName);
		finalApprovalActions.enterSchoolFees("100", "100", "100","200", "200", "200","300", "300", "300", "Dubai", "500", "500");
		 finalApprovalActions.enterCandidateData();
		 finalApprovalActions.enterManagerData("Mohamed Nader","Emirati","Male","School Manager","Single","1990-11-05","United Arab Emirates","123456789","2025-11-05","987654321","2025-11-05","Muslim","fatma_naguib99@hotmail.com","123456", "123456", "123456", "123456");
		 finalApprovalActions.enterQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","School","Manager","UploadFile.pdf");
		 finalApprovalActions.enterManagerAttachments("UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf","UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
			finalApprovalActions.submitTheRequest();
			String  finalapprovalRequestNumber = finalApprovalActions.confirmRequest();
			scenarioContext.setData("finalapprovalRequestNumber", finalapprovalRequestNumber);
			Thread.sleep(1000);
			userWorkspacePageActions.logout();
			 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
	}


}
