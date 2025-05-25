package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import Bases.APECOTestBase;
import UserPortalPagesActions.UserSchoolsListActions;
import Util.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_InitialApproval extends APECOTestBase {

	
	private final ScenarioContext scenarioContext;
	
	
	public AllActionsDefinition_InitialApproval(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		UserPagesInitialization();
		AdminPagesInitialization();
	}

	@Given("Given  User Logged to The system")
	public void given_user_logged_to_the_system() throws IOException {
	//	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}

	@Then("The Applicant Applys For a New Initial application Request")
	public void the_applicant_applys_for_a_new_initial_application_request() throws Exception {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.startNewInitialApprovalRequest();
		initialApplovalOwnersProfilesPageActions.clicknextButton();
		initialApplovalOwnersProfilesPageActions.enterOwnerPersonalData("Company","الشركة المتحدة","Omar Kamel", "Al-Ali","Omar.jpeg","CriminalStatusCertifion.jpg","UAE","2024-05-27","Emirati","Muslim", "Engineer","600");
		initialApplovalOwnersProfilesPageActions.enterOwnerpassportDetails("A123456","UAE","2024-05-27","2025-05-27","Passport.jpg");
		commonFunctions.implicitWait(20);
		 initialApplovalOwnersProfilesPageActions.enterResidenceDetailsDetails("123456789123456","Residence.jpg");
		 commonFunctions.implicitWait(10);
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
		 String  initialApprovalRequestNumber = initialApplovalDocumentsPageActions.confirmRequest();
		 scenarioContext.setData("initialApprovalRequestNumber", initialApprovalRequestNumber);
		 System.out.println(initialApprovalRequestNumber);
			assertTrue(initialApprovalRequestNumber.length() > 0);
		userWorkspacePageActions.logout();
	}
	

@Then("The Employee Approves The Initial application Request")
public void the_employee_approves_the_initial_application_request() throws InterruptedException, IOException, AWTException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String initialApprovalRequestNumber = (String) scenarioContext.getData("initialApprovalRequestNumber");
   adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
	// adminAgentQueueActions.adminSearchforaRequest("6103");
    commonFunctions.implicitWait(20);
  adminAgentQueueActions.adminOpenRequestDetailsScreen(String.valueOf(initialApprovalRequestNumber));
  //  adminAgentQueueActions.adminOpenRequestDetailsScreen("6103");
	adminInitialApprovalRequestDetailsActions.employeeApprovesTheInitialApprovalRequest("UploadFile.pdf");	
	 adminAgentQueueActions.adminOpenAgentQueueScreen();
	 commonFunctions.implicitWait(20);
	    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(initialApprovalRequestNumber));
	 commonFunctions.implicitWait(10);
        String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
        assertEquals(requestStatus,"Open - Technical Engineer Review");
        System.out.println("Request Status: " + requestStatus);
	 	adminAgentQueueActions.adminLogout();
}

@Then("The Engineer Approves The Initial application Request")
public void the_engineer_approves_the_initial_application_request() throws InterruptedException, IOException, AWTException {
	commonFunctions.implicitWait(10);
	driver.get(properties.getProperty("AdminPortalUrl"));
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
	String initialApprovalRequestNumber = (String) scenarioContext.getData("initialApprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
    adminAgentQueueActions.adminOpenRequestDetailsScreen(String.valueOf(initialApprovalRequestNumber));
	adminInitialApprovalRequestDetailsActions.engineerApprovesTheInitialApprovalRequest("Technical Engineer Approval School Location in The Initiall Approval Request");
	commonFunctions.implicitWait(10);
//	 String licensedSchoolName = adminInitialApprovalRequestDetailsActions.getLicensedSchoolName();
//	 scenarioContext.setData("licensedSchoolName", licensedSchoolName);
	 adminAgentQueueActions.adminOpenAgentQueueScreen();
	 adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(initialApprovalRequestNumber));
	 commonFunctions.implicitWait(20);
	 initialApprovalRequestNumber =adminAgentQueueActions.getRequestServiceAndStatus();
	 assertEquals(initialApprovalRequestNumber,"Closed - Accepted");
        System.out.println("Request Status: " + initialApprovalRequestNumber);
    	adminAgentQueueActions.adminLogout();
}

@Then("The Employee Rejects The Initial application Request")
public void the_employee_rejects_the_initial_application_request() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String initialApprovalRequestNumber = (String) scenarioContext.getData("initialApprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
    commonFunctions.implicitWait(20);
    adminAgentQueueActions.adminOpenRequestDetailsScreen(String.valueOf(initialApprovalRequestNumber));
    
    adminInitialApprovalRequestDetailsActions.employeeRejectsTheInitialApprovalRequest();
    
    adminAgentQueueActions.adminOpenAgentQueueScreen();
	 commonFunctions.implicitWait(20);
	    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(initialApprovalRequestNumber));
	 commonFunctions.implicitWait(10);
       String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
       assertEquals(requestStatus,"Closed - Rejected");
       System.out.println("Request Status: " + requestStatus);
   	adminAgentQueueActions.adminLogout();
    
}

@Then("The Employee Returns The Initial application Request")
public void the_employee_returns_the_initial_application_request() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.get(properties.getProperty("AdminPortalUrl"));
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	String initialApprovalRequestNumber = (String) scenarioContext.getData("initialApprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
    commonFunctions.implicitWait(20);
    adminAgentQueueActions.adminOpenRequestDetailsScreen(String.valueOf(initialApprovalRequestNumber));
    
    adminInitialApprovalRequestDetailsActions.employeeReturnsTheInitialApprovalRequest();
    
    adminAgentQueueActions.adminOpenAgentQueueScreen();
	 //commonFunctions.implicitWait(20);
    Thread.sleep(2000);
	    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(initialApprovalRequestNumber));
	 commonFunctions.implicitWait(10);
       String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
       assertEquals(requestStatus,"Open - Returned");
       System.out.println("Request Status: " + requestStatus);
   	adminAgentQueueActions.adminLogout();
}

@Then("The Applicant Resubmits The Initial application Request")
public void the_applicant_resubmits_the_initial_application_request() throws IOException, InterruptedException, AWTException {
	 driver.get(properties.getProperty("url"));
	 	Thread.sleep(1000);
	 	userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenuRequestslink();
		//String initialApprovalRequestNumber = (String) scenarioContext.getData("initialApprovalRequestNumber");
		// userRequestsPageActions.searchForaRequestbyNumber(initialApprovalRequestNumber);
		 userRequestsPageActions.searchForaRequestbyNumber("4961");
		 commonFunctions.implicitWait(10);
		userRequestsPageActions.clickDetailsButton("4961");
		//userRequestsPageActions.clickDetailsButton(initialApprovalRequestNumber);
		
	//	annualActivitiesandProgramsActions.enterReturnedRequestData("Nader Mohamed", "01022002200", "Nader@hotmail.com");
		initialApplovalOwnersProfilesPageActions.clicknextButton();
		initialApplovalOwnersProfilesPageActions.reenterOwnerPersonalData("العربية الشركة المتحدة","Ahmed Ali", "Mohamed","Omar.jpeg","UploadFile.pdf","UAE","2020-05-27", "Doctor","6600");
		//initialApplovalDocumentsPageActions.resubmitRequest()
		//userWorkspacePageActions.logout();
	}
@Then("The Engineer Rejects The Initial application Request")
public void the_engineer_rejects_the_initial_application_request() throws IOException, InterruptedException {
	commonFunctions.implicitWait(10);
	driver.get(properties.getProperty("AdminPortalUrl"));
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
	String initialApprovalRequestNumber = (String) scenarioContext.getData("initialApprovalRequestNumber");
    adminAgentQueueActions.adminSearchforaRequest(String.valueOf(initialApprovalRequestNumber));
    commonFunctions.implicitWait(20);
    adminAgentQueueActions.adminOpenRequestDetailsScreen(String.valueOf(initialApprovalRequestNumber));
    adminInitialApprovalRequestDetailsActions.employeeReturnsTheInitialApprovalRequest();
    
    adminAgentQueueActions.adminOpenAgentQueueScreen();
	 commonFunctions.implicitWait(20);
	    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(initialApprovalRequestNumber));
	 commonFunctions.implicitWait(10);
       String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
       assertEquals(requestStatus,"Open - Returned");
       System.out.println("Request Status: " + requestStatus);
   	adminAgentQueueActions.adminLogout();
}
}
