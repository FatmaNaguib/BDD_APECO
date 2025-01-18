package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeOrAddPartnerLocators {

	@FindBy(xpath = "//span[normalize-space()='Next']") public WebElement requestType_NextBtn;
	
	@FindBy(xpath = "//label[@for='owner_type']//following::input[1]") public WebElement TypeofOwner_ddl;
	@FindBy(id ="company_name") public WebElement institutionorCompanyTextbox;
	@FindBy(id = "full_name") public WebElement ownersFullnameTextbox;
	@FindBy(xpath = "//input[@id='family_Name']") public WebElement ownersFamilyNameTextbox;
	@FindBy (xpath = "//label[@for='Photograph']//following::span[1]") public WebElement PhotographUploader;
	@FindBy(xpath = "//label[@for='criminal_status_certificate']//following::span[1]") public WebElement criminalStatusCertificate;
	@FindBy(id  =  "PlaceOfBirth") public WebElement ownersPlaceofbirthTextbox;
	@FindBy(xpath = "//input[@placeholder='Date of Birth']") public WebElement dateofBirthDatepicker;
	@FindBy(xpath= "//label[@for='CurrentNationality']//following::input[1]") public WebElement ownersCurrentnationality_ddl; 
	@FindBy(xpath= "//label[@for='Religion']//following::input[1]") public WebElement ownersReligion_ddl;
	@FindBy(id  = "occupation") public WebElement ownerOccupationTextbox;
	@FindBy(xpath = "//label[@for='salary']//following::input[1]") public WebElement ownersSalaryTextbox;
	@FindBy(xpath = "//span[normalize-space()='Personal Details']//following::span[1]") public WebElement personalDataComplitionLable;
	
	//Owners Passport Details
	@FindBy(xpath = "//span[normalize-space()='Passport Details']") public WebElement passportDetailsTap;
    @FindBy(id = "passportNumber") public WebElement  ownerPassportNumberTextBox;
	@FindBy (id  = "placeOfIssue") public WebElement passportplaceOfIssueTextBox;
	@FindBy(xpath = "//input[@placeholder='Release Date']") public WebElement passportReleaseDateDatepicker;
	@FindBy(xpath = "//input[@placeholder='Expiry Date']") public WebElement passportExpiryDateDatepicker;
	@FindBy (xpath = " //label[@for='passport']//following::span[1] ") public WebElement passportUploader;
	@FindBy(xpath = "//span[normalize-space()='Passport Details']//following::span[1]") public WebElement passportDetailComplitionLable;
	
	
   
   //Owners Residence Details
	@FindBy(xpath = "//span[normalize-space()='Residence Details']") public WebElement residenceDetailsTap;
	@FindBy(id = "emiratesID") public WebElement emiratesIDTextbox;
	@FindBy(xpath =" //label[@for='validEmiratesID']//following::span[1]") public WebElement validEmiratesIDUploader;
	@FindBy (xpath = "//span[normalize-space()='Passport Details']//following::span[1]") public WebElement residenceDetailsComplitionLable;
;
	
	
	//Owners Qualifying
	@FindBy(xpath = "//span[normalize-space()='Qualifying']") public WebElement QualifyingTap;
	@FindBy(xpath = "//label[@for='qualifyingType']//following::input[1]") public WebElement qualificationType_ddl;
	@FindBy(id  = "schoole") public WebElement schoolandUniversitytextbox;
	@FindBy(xpath = "//input[@placeholder='Date of Obtaining Certificate']") public WebElement qualificationObtainedDatepicker;
	@FindBy(xpath = " //label[@for='country']//following::input[1]") public WebElement qualificationCountry_ddl;
	@FindBy(xpath = "//span[normalize-space()='Qualifying']//following::span[1]") public WebElement QualificationsComplitionLable;

	//MaritalStatuaData
	@FindBy (xpath = "//span[normalize-space()='Marital Status Data']") public WebElement maritalStatusDataTap;
	@FindBy(xpath = "//label[@for='maritalStatus']//following::input[1]") public WebElement fmaritalStatus_ddl;
	@FindBy(xpath = "//span[normalize-space()='Marital Status Data']//following::span[1]") public WebElement maritalStatusComplitionLable;

	//span[@class='completion-status text-success ng-star-inserted']
	
	
    //@FatharandMotherdata
	@FindBy (xpath = "//span[normalize-space()='Father/Mother Data']") public WebElement fatherAndMotherTap;
	@FindBy (id  = "fatherName") public WebElement fatherNameTextbox;
	@FindBy (id = "motherName") public WebElement motherNameTextbox;
	@FindBy(xpath = "//label[@for='fatherNationality']//following::input[1]") public WebElement fatherNationality_ddl;
	@FindBy(xpath = "//label[@for='motherNationality']//following::input[1]") public WebElement motherNationality_ddl;
	@FindBy(id = "fatherPlaceOfBirth") public WebElement fatherPlaceOfBirthTextbox;
	@FindBy(id = "motherPlaceOfBirth") public WebElement motherPlaceOfBirthTextbox;
	@FindBy(xpath = "//input[@placeholder='Father Date of Birth']")public  WebElement fatherDateOfBirthDateDatepicker;
	@FindBy(xpath = "//input[@placeholder='Mother Date of Birth']") public WebElement motherDateOfBirthDateDatepicker;
	@FindBy(id = "fatherWorkplace") public WebElement fatherWorkplaceTextbox;
	@FindBy(id = "fatherOccupation") public WebElement fatherOccupationTextbox;
	
	
	
	//HousingData
	@FindBy(xpath = "//span[normalize-space()='Housing Data']")	public  WebElement housingDetailsTap;
	@FindBy(id  = "region") public WebElement regionTextBox;
	@FindBy (id ="street") public WebElement streetTextBox;
	@FindBy(xpath = "//input[@placeholder='Mobile Phone Number']") public WebElement mobileNumberTextBox;
	@FindBy(xpath = "//input[@placeholder='PO Box Number']") public WebElement poBoxTextBox;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement ownerProfileNextButton;
	
	//Owners share percentage
	////input[@class='ant-input-number-input ng-untouched ng-pristine ng-valid']
	@FindBy(xpath = "//tr[1]//td//div[@class=\"editable-cell\"]")	public  WebElement firstPartnerPercentage_Textbox;
	@FindBy(xpath = "//tr[1]//td//span[@class=\"ant-input-number-handler ant-input-number-handler-down\"]")	public  WebElement firstPartnerPercentageArrow_Textbox;
	//@FindBy(xpath = "//input[@class='ant-input-number-input ng-pristine ng-valid ng-touched']")	public  WebElement firstPartnerPercentage_Textbox;
	@FindBy(xpath = "//tr[2]//td//div[@class=\"editable-cell\"]")	public  WebElement secoundPartnerPercentage_Textbox;
	@FindBy(xpath = "//tr[2]//td//span[@class=\"ant-input-number-handler ant-input-number-handler-up\"]")	public  WebElement secoundPartnerPercentageArrow_Textbox;
	@FindBy(xpath = "//span[normalize-space()='Next']")	public  WebElement PartnerPercentageNext_Btn;
	
	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement downloadPopup_btn;
	@FindBy (xpath ="	//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']//span[normalize-space()='Next']") public WebElement downloadDocNext_btn;	
	
	@FindBy (xpath =" //label[@for=\"licenseModificationRequest\"]//following::span[1]")public WebElement licenseModificationRequest_uploader;
	@FindBy (xpath =" //label[@for=\"certifiedPartnershipAgreement\"]//following::span[1]")public WebElement certifiedPartnershipAgreement_uploader;
	@FindBy (xpath =" //label[@for='attachment']//following::span[1]")public WebElement introductionDocumentsat_uploader;
	@FindBy(xpath ="//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement attachmentsNext_btn;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]") public WebElement paymentAcknowledge_Checkbox;
	@FindBy(xpath = "//button[@class=\"btn btn-lg btn-success ng-star-inserted\"]") public WebElement pay_btn;
	@FindBy(xpath = " //button[@class=\"ant-btn ant-btn-primary ant-btn-lg\"]") public WebElement payNow_btn;
	@FindBy(xpath = " //span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;
}
