package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppointmentNotificationforEmployeesLocators {

	 @FindBy(xpath = "//body") public WebElement appointmentNotificationforEmployeesBody;
    @FindBy(xpath = "//label[@for='typeOfHiring']//following::input[1]") public WebElement typeofHiring_ddl;
    @FindBy(xpath = "//div[@class=\"ant-tabs-tab ng-star-inserted\"]//button[1]") public WebElement basicCandidateData_btn;
    
    @FindBy(id = "name") public WebElement employeeNameTextBox;
    @FindBy(xpath = "//label[@for=\"nationality\"]//following::input[1]") public WebElement empolyeeNationality_ddl;
	@FindBy(xpath = "//label[@for=\"gender\"]//following::input[1]") public WebElement empolyeeGender_ddl;
    @FindBy(id = "subject") public WebElement teachingSubjectTextBox;
	@FindBy(xpath = "//label[@for=\"curriculum\"]//following::input[1]") public WebElement curriculum_ddl;
	@FindBy(xpath = "//label[@for=\"grades\"]//following::input[1]") public WebElement grades_ddl;
	@FindBy(id = "appliedPosition") public WebElement appliedPosition_TextBox;
	@FindBy(xpath = "//label[@for=\"maritalStatus\"]//following::input[1]") public WebElement maritalStatus_ddl;
	@FindBy(xpath = "//label[@for=\"birthDate\"]//following::input[1]") public WebElement birthDate_Calendar;
	@FindBy(xpath= "//label[@for='placeOfDate']//following::input[1]") public WebElement placeOfBirthTextBox;
	@FindBy(id = "idCardNumber") public WebElement idCardNumber_TextBox;
	@FindBy(xpath = "//input[@placeholder='ID Card Expiration Date']") public WebElement idCardExpirationDate_TextBox;
	@FindBy(id = "passportNumber") public WebElement passportNumber_TextBox;
	@FindBy(xpath = "//input[@placeholder='Passport Expiration Date']") public WebElement passportExpirationDate_Calendar;
	@FindBy(xpath = "//label[@for=\"religion\"]//following::input[1]") public WebElement religion_ddl;
	@FindBy(xpath = "	//input[@placeholder='Residency Expiration Date']") public WebElement residencyExpirationDate_Calendar;
	@FindBy(id = "addressInsideCountry") public WebElement addressInsideCountry_TextBox;
	@FindBy(id = "email") public WebElement email_TextBox;
	@FindBy(id = "phoneNumber") public WebElement phoneNumber_TextBox;
	@FindBy(xpath = "//button[normalize-space()='Qualifications']") public WebElement qualifications_tab;
	
	@FindBy(xpath = "//select-input[@ng-reflect-name='qualification']//nz-select//input[1]") public WebElement qualification_ddl;
	@FindBy(xpath = "//input[@id='Specialization']") public WebElement specialization_TextBox;
	@FindBy(xpath = "//input[@placeholder='Qualification Date']") public WebElement qualificationDate_Calendar;
	@FindBy(xpath = "//input[@id='Certificate Issuing Authority']") public WebElement certificateIssuingAuthority_Textbox;
	@FindBy (xpath ="//label[@for=\"scientificQualification\"]//following::span[1]")public WebElement scientificQualification_uploader;
	@FindBy (xpath ="//label[@for=\"equivalencyAcademicQualificationOrPaymentReceipt\"]//following::span[1]")public WebElement equivalencyAcademicQualificationOrPaymentReceipt_uploader;
	@FindBy (xpath ="//label[@for=\"authenticationAcademicQualifications\"]//following::span[1]")public WebElement authenticationAcademicQualifications_uploader;
	 @FindBy(xpath = "//button[@id='nz-tabs-0-tab-3']") public  WebElement previousExperience_btn;
	  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public  WebElement managerDataNext_btn; 
	  ////
	  @FindBy (xpath ="//label[@for=\"coloredPassport\"]//following::span[1]")public WebElement coloredPassport_uploader;
	  @FindBy (xpath ="//label[@for=\"coloredNationalID\"]//following::span[1]")public WebElement coloredNationalID_uploader;
		@FindBy (xpath ="//label[@for=\"administrativeApproval\"]//following::span[1]")public WebElement administrativeApproval_uploader;
		@FindBy (xpath ="//label[@for=\"certificateOfGoodConduct\"]//following::span[1]")public WebElement certificateOfGoodConduct_uploader;		
		@FindBy (xpath ="//label[@for='profilePicture']//following::span[1]")public WebElement profilePicture_uploader;
		@FindBy (xpath ="//label[@for=\"sponsorLetter\"]//following::span[1]")public WebElement sponsorLetter_uploader;			
		@FindBy (xpath ="//label[@for=\"appointmentInterviewPassDocument\"]//following::span[1]")public WebElement appointmentInterviewPassDocument_uploader;
		
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement attachmentsNxt_btn;
		@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
		@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement pay_btn;
		@FindBy(xpath = "//button[@nztype=\"primary\"]") public WebElement payNow_btn;
		@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
		@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
		@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
		
	
}


