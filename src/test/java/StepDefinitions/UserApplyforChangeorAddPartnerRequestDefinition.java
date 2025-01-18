package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforChangeorAddPartnerRequestDefinition extends APECOTestBase{

	public UserApplyforChangeorAddPartnerRequestDefinition() throws IOException {
		super();
		AdminPagesInitialization();
	}
	@When("User Starts New Change or Add Partner Request")
	public void user_starts_new_change_or_add_partner_request() throws InterruptedException {
	 userServicesPageActions.clickChangeorAddPartnerRequestLink();
	 userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	}

	@Then("The Applicant Starts Add New Owners Request")
	public void the_applicant_starts_add_new_owners_request() {
	    changeOrAddPartnerActions.StartAddNewOwnersRequest();
	}
	
	@Then("The Applicant Enters The Owner's Personal Details")
	public void the_applicant_enters_the_owner_s_personal_details() throws AWTException, InterruptedException {
		String personalDataComplitionStat = changeOrAddPartnerActions.enterOwnerPersonalData("Company","الشركة المتحدة","Omar Kamel", "Al-Ali","Omar.jpeg","CriminalStatusCertifion.jpg","UAE","2024-05-27","Emirati","Muslim", "Engineer","600");
		assertEquals(personalDataComplitionStat, "Completed");	
		 System.out.println("6-User Enters Owner's Personal Details");
	}
	
	@Then("The Applicant Enters Owner's Passport Details")
	public void the_applicant_enters_owner_s_passport_details() throws InterruptedException, AWTException {
		String passportDetailComplitionStat =  changeOrAddPartnerActions.enterOwnerpassportDetails("A123456","UAE","2024-05-27","2025-05-27","Passport.jpg");
		  Thread.sleep(1000);
		assertEquals(passportDetailComplitionStat, "Completed"); 
		 System.out.println("7-User Enters Owner's Passport Details");
	}

	@Then("The Applicant Enters Residence Details")
	public void the_applicant_enters_residence_details() throws InterruptedException, AWTException {
		String residenceDetailComplitionStat =  changeOrAddPartnerActions.enterResidenceDetailsDetails("123456789123456","Residence.jpg");
		  Thread.sleep(1000);
		assertEquals( residenceDetailComplitionStat, "Completed"); 
		 System.out.println("8-User Enters Residence Details");
	}

	@Then("The Applicant Enters Owner's Qualifications Details")
	public void the_applicant_enters_owner_s_qualifications_details() throws Exception {
		String qualificationsDetailsComplitionStat = changeOrAddPartnerActions.enterOwnerQualificationsDetails("Bachelor's Degree","جامعة القاهرة","2024-05-27","Egypt");
		assertEquals(qualificationsDetailsComplitionStat, "Completed"); 

		 System.out.println("9-User Enters Owner's Qualifications Details");
	}

	@Then("The Applicant Enters Marital Status Details")
	public void the_applicant_enters_marital_status_details() {
		String  maritalStatusDetailsStat = 	 changeOrAddPartnerActions.enterMaritalStatusDetails("Single");
		assertEquals(maritalStatusDetailsStat, "Completed");
		 System.out.println("10-User Enters Owner's Father and Mother Details");
	}

	@Then("The Applicant Enters Owner's Father and Mother Details")
	public void the_applicant_enters_owner_s_father_and_mother_details() {
		String  FatherandMotherDetailsStat = 	 changeOrAddPartnerActions.enterFatherandMotherDetails("Mohamed Ali","Emirati","Emirati","Faten");
		assertEquals(FatherandMotherDetailsStat, "Completed");
		 System.out.println("11-User Enters Owner's Father and Mother Details");
	}

	@Then("The Applicant Enters Owner's Housing Details")
	public void the_applicant_enters_owner_s_housing_details() {
		 String housingDetailsStat =  changeOrAddPartnerActions.enterHousingDetails("القاهرة","شارع شبرا","010505050","12345");
		 assertEquals(housingDetailsStat, "Completed");	
		 System.out.println("12-User Enters Owner's Housing Details");
		 changeOrAddPartnerActions.enterPartnersharepercentage();
	}
	@Then("The Applicant Downloads the Introduction Documents")
	public void the_applicant_downloads_the_intoduction_documents() throws InterruptedException {
		 changeOrAddPartnerActions.downloadDocument();
	}
	
	@Then("The Applicant Uploads The Required Documents")
	public void The_Applicant_Uploads_the_Required_Documents() throws InterruptedException, AWTException {
		 changeOrAddPartnerActions.uploadocument("UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
	}
	
	@Then("The Applicant Admints The Correctness of All Provided Data")
	public void The_Applicant_Admints_The_Correctness_of_All_Provided_Data() throws InterruptedException  {
		 changeOrAddPartnerActions.checkTheDataAcknowledge();
	}
	@Then("The Applicant Pays The Change or Add Partner Request Fees")
	public void The_Applicant_Pays_The_Change_or_Add_Partner_Request_Fees() throws InterruptedException  {
		 changeOrAddPartnerActions.payTheRequestFees();
	}
}
