package StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;



import Bases.APECOTestBase;
import UserPortalPagesActions.UserSchoolsListActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforInitialApprovalForThreeStagesRequestDefinition extends APECOTestBase{
	

	
	public UserApplyforInitialApprovalForThreeStagesRequestDefinition() throws IOException {
		UserPagesInitialization();

	}

	@Given("^User loged in and is on Workspace Page$")
	public void user_loged_in_and_is_on_workspace_page() throws IOException {
	  userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}

	@When("^User Navigats to The Services Screen$")
	public void user_navigats_to_the_services_screen() throws IOException {
		userWorkspacePageActions.clickonSideMenu_Services_link();
		// String servicesHeaderLable;
		// servicesHeaderLable = userServicesPageActions.getServicesPageHeaderText();
	//	assertEquals(servicesHeaderLable,"Services");
	}

	@Then("^User Starts New Initial Approval Request$")
	public void user_starts_new_initial_approval_request() throws InterruptedException {
	userServicesPageActions.startNewInitialApprovalRequest();
	}

	@Then("^User is Navigated to Personal Data Screen$")
	public void user_is_navigated_to_personal_data_screen() {
	}

	@When("^User Clicks on Next Button in Application Information Step$")
	public void user_clicks_on_next_button_in_application_information_step() throws InterruptedException {
		initialApplovalOwnersProfilesPageActions.clicknextButton();
	}

	@Then("^User Enters Owner's Personal Details$")
	public void user_enters_owner_s_personal_details() throws AWTException, InterruptedException {
		String personalDataComplitionStat =initialApplovalOwnersProfilesPageActions.enterOwnerPersonalData("Company","الشركة المتحدة","Omar Kamel", "Al-Ali","Omar.jpeg","CriminalStatusCertifion.jpg","UAE","2024-05-27","Emirati","Muslim", "Engineer","600");
		assertEquals(personalDataComplitionStat, "Completed");	
	}

	@Then("^User Enters Owner's Passport Details$")
	public void user_enters_owner_s_passport_details() throws AWTException, InterruptedException {
		String passportDetailComplitionStat = initialApplovalOwnersProfilesPageActions.enterOwnerpassportDetails("A123456","UAE","2024-05-27","2025-05-27","Passport.jpg");
		  Thread.sleep(1000);
		assertEquals(passportDetailComplitionStat, "Completed"); 
	}
	
	@Then("^User Enters Residence Details$")
	public void user_enters__enters_residence_details() throws AWTException, InterruptedException {
		String residenceDetailComplitionStat = initialApplovalOwnersProfilesPageActions.enterResidenceDetailsDetails("123456789123456","Residence.jpg");
		  Thread.sleep(1000);
		assertEquals( residenceDetailComplitionStat, "Completed"); 
	}

	@Then("^User Enters Owner's Qualifications Details$")
	public void user_enters_owner_s_qualifications_details() throws Exception {
		String qualificationsDetailsComplitionStat =initialApplovalOwnersProfilesPageActions.enterOwnerQualificationsDetails("Bachelor's Degree","جامعة القاهرة","2024-05-27","Egypt");
		assertEquals(qualificationsDetailsComplitionStat, "Completed"); 
	}

	@Then("^User Enters Marital Status Details$")
	public void user_enters_Marital_Statusdetails() {		
		String  maritalStatusDetailsStat = 	initialApplovalOwnersProfilesPageActions.enterMaritalStatusDetails("Single");
		assertEquals(maritalStatusDetailsStat, "Completed");
	}
	
	
	@Then("^User Enters Owner's Father and Mother Details$")
	public void user_enters_owner_s_father_and_mother_details() {
		String  maritalStatusDetailsStat = 	initialApplovalOwnersProfilesPageActions.enterMaritalStatusDetails("Single");
		assertEquals(maritalStatusDetailsStat, "Completed");
	}

	@Then("^User Enters Owner's Housing Details$")
	public void user_enters_owner_s_housing_details() {
		 String housingDetailsStat = initialApplovalOwnersProfilesPageActions.enterHousingDetails("القاهرة","شارع شبرا","010505050","12345");
		 assertEquals(housingDetailsStat, "Completed");	
	}

	@Then("^User Enters Owner's Shared Percentage Details$")
	public void user_enters_owner_s_shared_percentage_details() {
		initialApplovalOwnersProfilesPageActions.enterOwnerSharedPercentage("100");
	}

	@Then("^User Enters School Details$$")
	public void user_enters_school_details() throws AWTException, InterruptedException {

			String[] schoolNames = UserSchoolsListActions.schoolName();
			String schoolNameAr = schoolNames[0];
			String schoolNameEng = schoolNames[1];
		
		initialApplovalSchoolInformationPageActions.enterSchoolDetails("New building - empty land to be built on", schoolNameAr, schoolNameEng, "Moahamed Essam", "شارع سالم المبارك", "Girls", "الموقع / رقم قطعة الأرض باللغة الإنجليزية - طلب تمهيدي - تقديم طلب تصريح مدرسة خاصة","الموقع / رقم قطعة الأرض باللغة العربية - طلب تمهيدي - تقديم طلب تصريح مدرسة خاصة" ,"Rent", "Rent", "900","1000", "500", "100", "Relationship to School Building","0100553322", "ملف الحجز الخاص باسم المدرسة.pdf", "المخطط الهندسى.pdf","map of the land.jpg");

	}


	@Then("^User Enters Curriculum Details$")
	public void user_enters_curriculum_details() throws InterruptedException {
		initialApplovalSchoolInformationPageActions.enterCurriculumDetails("Australian","Pre-Kindergarten","Pre-Kindergarten","50","10","Kindergarten","KG 1","50","20","Stage 1","Grade 1","900","30");
	}

	
	@Then("^User Downloads Intoduction Documents$")
	public void user_downloads_intoduction_documents() throws InterruptedException {
		initialApplovalDocumentsPageActions.downloadDocument();
	}
	
	
	@Then("^User Uploads Intoduction Document$")
	public void user_uploads_intoduction_document() throws InterruptedException, AWTException {
		initialApplovalDocumentsPageActions.uploadDocument("UploadFile.pdf");
	}
	@Then("^User Pays The Request fees$")
	public void user_Pays_the_request_fees() throws InterruptedException, AWTException {
		initialApplovalDocumentsPageActions.payRequestfees();
		initialApplovalDocumentsPageActions.confirmRequest();
	}
	
	
	
}
