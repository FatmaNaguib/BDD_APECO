package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialApplovalOwnersProfilesPageLocators  {

//Owner's Personal Details:
	
    @FindBy(xpath = "//h2[@class='fw-bold my-4']") public WebElement ownersProfilesDataLable;
    @FindBy(id = "nz-tabs-2-tab-0") public WebElement applicationInformation;

    @FindBy(xpath = "(//button)[6]") public WebElement nextButton;
    
   // @FindBy(xpath = "//button[normalize-space()='Next']") public WebElement nextButton;
    
//	@FindBy(xpath = " //label[@for='owner_type']//following::input[1]") WebElement TypeofOwner_dll;
	@FindBy(xpath = " //label[@for='owner_type']//following::input[1]") public WebElement TypeofOwner_ddl;
	@FindBy(id ="company_name") public WebElement institutionorCompanyTextbox;
	@FindBy(id = "full_name") public WebElement ownersFullnameTextbox;
	@FindBy(id = "family_Name") public WebElement ownersFamilyNameTextbox;

	
	@FindBy (id = "Photograph") public WebElement PhotographUploader;
	
	@FindBy( id="criminal_status_certificate") public WebElement criminalStatusCertificate;
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
	@FindBy (id="passport") public WebElement passportUploader;
	@FindBy(xpath = "//span[normalize-space()='Passport Details']//following::span[1]") public WebElement passportDetailComplitionLable;

	
   
   //Owners Residence Details
	@FindBy(xpath = "//span[normalize-space()='Residence Details']") public WebElement residenceDetailsTap;
	@FindBy(id = "emiratesID") public WebElement emiratesIDTextbox;
	@FindBy(id = "validEmiratesID") public WebElement validEmiratesIDUploader;
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

	
	//SahrePercentage
	@FindBy(xpath = "//span[normalize-space()='Share Percnetage']") public WebElement ownerSharedPercentageTap;
	@FindBy(xpath = "//label[@for='sharePercentage']") public WebElement sharePercentageLable;
	//@FindBy(xpath = "//input[@placeholder='Owner Share Percentage']") public WebElement ownerSharedPercentageTextBox;
	@FindBy(xpath = "//label[@for='sharePercentage']//following::input[1]") public WebElement ownerSharedPercentageTextBox;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement ownerProfileNextButton;
	

	
}
