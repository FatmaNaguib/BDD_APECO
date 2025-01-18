package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalApprovalLocators {
	
	  @FindBy(xpath = "(//input[@placeholder='Approved tuition fees'])[1]") public WebElement approvedTuitionFees1_Textbox;
	  @FindBy(xpath = "(//input[@placeholder='Approved school book fees'])[1]") public WebElement approvedSchoolbookFees1_Textbox;
	  @FindBy(xpath = "(//input[@placeholder='school uniform fees'])[1]") public WebElement schoolUniformFees1_Textbox;
	
	  @FindBy(xpath = "(//input[@placeholder='Approved tuition fees'])[2]") public WebElement approvedTuitionFees2_Textbox;
	  @FindBy(xpath = "(//input[@placeholder='Approved school book fees'])[2]") public WebElement approvedSchoolbookFees2_Textbox;
	  @FindBy(xpath = "(//input[@placeholder='school uniform fees'])[2]") public WebElement schoolUniformFees2_Textbox;
	  
	  @FindBy(xpath = "(//input[@placeholder='Approved tuition fees'])[3]") public WebElement approvedTuitionFees3_Textbox;
	  @FindBy(xpath = "(//input[@placeholder='Approved school book fees'])[3]") public WebElement approvedSchoolbookFees3_Textbox;
	  @FindBy(xpath = "(//input[@placeholder='school uniform fees'])[3]") public WebElement schoolUniformFees3_Textbox;
	  
	@FindBy(xpath= "//label[@for='emirate']//following::input[1]") public WebElement emirate_ddl;
	 @FindBy(xpath = "//input[@placeholder='Annual Transportation Fees (one direction)']") public WebElement oneDirectionTransportationfeesTextbox;
	 @FindBy(xpath = "//input[@placeholder='Annual Transportation Fees (two directions)']") public WebElement twoDirectionTransportationfeesTextbox;
	 @FindBy(xpath = "//button[span ='Next']") public WebElement nextButton;
	 
	    
		@FindBy(xpath = "//button[normalize-space()='Basic Candidate Data']") public WebElement basicCandidateData_tab;
		@FindBy(id = "name") public WebElement managerNameTextBox;
		@FindBy(xpath = "//label[@for=\"nationality\"]//following::input[1]") public WebElement mangerNationality_ddl;
		@FindBy(xpath = "//label[@for=\"gender\"]//following::input[1]") public WebElement managerGender_ddl;
		@FindBy(id = "appliedPosition") public WebElement appliedPosition_TextBox;
		@FindBy(xpath = "//label[@for=\"maritalStatus\"]//following::input[1]") public WebElement maritalStatus_ddl;
		@FindBy(xpath = "//label[@for=\"birthDate\"]//following::input[1]") public WebElement birthDate_Calendar;
		@FindBy(xpath= "//label[@for='placeOfDate']//following::input[1]") public WebElement placeOfBirth_ddl;
		
		@FindBy(id = "idCardNumber") public WebElement idCardNumber_TextBox;
		@FindBy(xpath = "//input[@placeholder='ID Card Expiration Date']") public WebElement idCardExpirationDate_TextBox;
		@FindBy(id = "passportNumber") public WebElement passportNumber_TextBox;
		@FindBy(xpath = "//input[@placeholder='Passport Expiration Date']") public WebElement passportExpirationDate_Calendar;
		@FindBy(xpath = "//label[@for=\"religion\"]//following::input[1]") public WebElement religion_ddl;
		@FindBy(xpath = "	//input[@placeholder='Residency Expiration Date']") public WebElement residencyExpirationDate_Calendar;
		@FindBy(xpath = "	//input[@placeholder='Visa Expiration Date']") public WebElement visaExpirationDate_Calendar;
		@FindBy(id = "addressInsideCountry") public WebElement addressInsideCountry_TextBox;
		@FindBy(id = "email") public WebElement email_TextBox;
		@FindBy(id = "phoneNumber") public WebElement phoneNumber_TextBox;
		
		
		@FindBy(xpath = "//button[normalize-space()='Qualifications']") public WebElement qualifications_tab;
		@FindBy(xpath = "//select-input[@ng-reflect-name='qualification']//nz-select//input[1]") public WebElement qualification_ddl;
		@FindBy(xpath = "//input[@id='Specialization']") public WebElement specialization_TextBox;
		@FindBy(xpath = "//input[@placeholder='Qualification Date']") public WebElement qualificationDate_Calendar;
		@FindBy(xpath = "//input[@id='Certificate Issuing Authority']") public WebElement certificateIssuingAuthority_Textbox;
		@FindBy (xpath ="//input[@id=\"verifiedQualificationAndAcademicRecord\"]")public WebElement verifiedQualificationAndAcademicRecord_uploader;
		 @FindBy(xpath = "//button[@id='nz-tabs-0-tab-3']") public  WebElement previousExperience_btn;
		@FindBy(id = "Employer") public WebElement employer_TextBox;
		@FindBy(id = "Job Title") public WebElement jobTitle_TextBox;
		@FindBy (xpath ="//input[@id=\"experienceCertificates\"]")public WebElement experienceCertificates_uploader;
	    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public  WebElement managerDataNext_btn; 
	    
		@FindBy (xpath ="//input[@id=\"emiratiIdForManager\"]")public WebElement emiratiIdforManager_uploader;
		@FindBy (xpath ="//input[@id=\"passportForManager\"]")public WebElement passportforManager_uploader;
		@FindBy (xpath ="(//input[@id=\"criminalStatusCertificateForManager\"])[1]")public WebElement criminalStatusCertificateForManager_uploader;
		@FindBy (xpath ="(//input[@id=\"criminalStatusCertificateForManager\"])[2]")public WebElement universityDegree_uploader;
		
		@FindBy (xpath ="//input[@id=\"profilePicture\"]")public WebElement profilePicture_uploader;
		@FindBy (xpath ="//input[@id=\"managerApproval\"]")public WebElement managerApproval_uploader;	
		@FindBy (xpath ="//input[@id=\"cvManager\"]")public WebElement managerCV_uploader;
		@FindBy (xpath ="//input[@id=\"partnershipLicenseImage\"]")public WebElement partnershipLicenseImage_uploader;
		@FindBy (xpath ="//input[@id=\"academicPlan\"]")public WebElement academicPlan_uploader;
		
		@FindBy (xpath ="//input[@id=\"leaseContractOrPropertyOwnershipDocument\"]")public WebElement leaseContractOrPropertyOwnershipDocument_uploader;
		@FindBy (xpath ="//input[@id=\"partnershipContractWithMultipleAuthenticatedPartners\"]")public WebElement partnershipContractWithMultipleAuthenticatedPartners_uploader;
		@FindBy (xpath ="//input[@id=\"municipalAndCivilDefenseCertificate\"]")public WebElement municipalAndCivilDefenseCertificate_uploader;
		@FindBy (xpath ="//input[@id=\"emiratiIdForManager\"]")public WebElement emiratiIdForManager_uploader;

		
		@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement attachmentsNxt_btn;
		@FindBy(xpath = "//button[@class='btn btn-lg btn-primary ng-star-inserted']") public WebElement pay_btn;
		
		@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
		@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
		@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
		
		//@FindBy(xpath = "//button[@class='btn btn-lg btn-primary ng-star-inserted']") public WebElement pay_btn;
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") public WebElement payNow_btn;
		@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;
}
