package Definitions;

import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesActions.UserSchoolsListActions;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;

public class TheApplicantHasanApprovedInitiaapprovalrequestDefinition_InitialApproval extends APECOTestBase  {
	private final ScenarioContext scenarioContext;

	public TheApplicantHasanApprovedInitiaapprovalrequestDefinition_InitialApproval(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}

	@Given("The Applicant is logged in to the system.")
	public void the_applicant_is_logged_in_to_the_system() throws IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}

	@Given("The Applicant Has an Approved Initial approval request")
	public void  the_applicant_has_an_approved_initial_approval_request() throws Exception {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.startNewInitialApprovalRequest();
		initialApplovalOwnersProfilesPageActions.clicknextButton();
		initialApplovalOwnersProfilesPageActions.enterOwnerPersonalData("Company","الشركة المتحدة","Omar Kamel", "Al-Ali","Omar.jpeg","CriminalStatusCertifion.jpg","UAE","2024-05-27","Emirati","Muslim", "Engineer","600");
		initialApplovalOwnersProfilesPageActions.enterOwnerpassportDetails("A123456","UAE","2024-05-27","2025-05-27","Passport.jpg");
		  Thread.sleep(1000);
		 initialApplovalOwnersProfilesPageActions.enterResidenceDetailsDetails("123456789123456","Residence.jpg");
		  Thread.sleep(1000);
		initialApplovalOwnersProfilesPageActions.enterOwnerQualificationsDetails("Bachelor's Degree","جامعة القاهرة","2024-05-27","Egypt");
		initialApplovalOwnersProfilesPageActions.enterMaritalStatusDetails("Single");
		initialApplovalOwnersProfilesPageActions.enterFatherandMotherDetails("Mohamed Ali","Faten");
		initialApplovalOwnersProfilesPageActions.enterHousingDetails("القاهرة","شارع شبرا","010505050","12345");
		 initialApplovalOwnersProfilesPageActions.enterOwnerSharedPercentage("100");
			String[] schoolNames = UserSchoolsListActions.schoolName();
			String schoolNameAr = schoolNames[0];
			String schoolNameEng = schoolNames[1];
		initialApplovalSchoolInformationPageActions.enterSchoolDetails("New building - empty land to be built on", schoolNameAr, schoolNameEng, "Moahamed Essam", "شارع سالم المبارك", "Girls", "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تمهيدي - تقديم طلب تصريح مدرسة خاصة","الموقع / رقم قطعة الأرض باللغة العربية - طلب تمهيدي - تقديم طلب تصريح مدرسة خاصة" ,"Rent", "Rent", "900","1000", "500", "100", "Relationship to School Building","0100553322", "ملف الحجز الخاص باسم المدرسة.pdf", "المخطط الهندسى.pdf","map of the land.jpg");
		initialApplovalSchoolInformationPageActions.enterCurriculumDetails("Australian","Pre-Kindergarten","Pre-Kindergarten","50","10","Kindergarten","KG 1","50","20","Stage 1","Grade 1","900","30");
		initialApplovalDocumentsPageActions.downloadDocument();
		initialApplovalDocumentsPageActions.uploadDocument("UploadFile.pdf");
		initialApplovalDocumentsPageActions.payRequestfees();
		int initialApprovalRequestNumber = initialApplovalDocumentsPageActions.confirmRequest();
		 scenarioContext.setData("requestNumber", initialApprovalRequestNumber);
		userWorkspacePageActions.logout();
		Thread.sleep(1000);
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
	  Thread.sleep(2000);
	    adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminInitialApprovalRequestDetailsActions.employeeApprovesTheInitialApprovalRequest("UploadFile.pdf");
		adminAgentQueueActions.adminLogout();
		Thread.sleep(1000);
		 adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
	    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
	    adminAgentQueueActions.adminOpenRequestDetailsScreen();
		adminInitialApprovalRequestDetailsActions.engineerApprovesTheInitialApprovalRequest("Technical Engineer Approval School Location in The Initiall Approval Request");
		Thread.sleep(2000);
		 String licensedSchoolName = adminInitialApprovalRequestDetailsActions.getLicensedSchoolName();
		 scenarioContext.setData("licensedSchoolName", licensedSchoolName);
		adminAgentQueueActions.adminLogout();
		 adminLoginPageActions.adminLoginurl("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
	}
	
}
