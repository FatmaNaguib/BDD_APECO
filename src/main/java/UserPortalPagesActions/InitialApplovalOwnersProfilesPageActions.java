package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.InitialApplovalDocumentsPageLocators;
import UserPortalPagesLocators.InitialApplovalOwnersProfilesPageLocators;

public class InitialApplovalOwnersProfilesPageActions extends APECOTestBase{

	private	 InitialApplovalOwnersProfilesPageLocators initialApplovalPageOwnersProfilesLocators;
	private	 InitialApplovalDocumentsPageLocators initialApplovalDocumentsPageLocators;
	
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public InitialApplovalOwnersProfilesPageActions() throws IOException {
		super();
		initialApplovalPageOwnersProfilesLocators = new InitialApplovalOwnersProfilesPageLocators();

	    PageFactory.initElements(driver, initialApplovalPageOwnersProfilesLocators);

	}

	public String getApplicationInformationText() {
		commonFunctions.clickWebElement(initialApplovalPageOwnersProfilesLocators.applicationInformation);
		//initialApplovalPageOwnersProfilesLocators.applicationInformation.click();
		return initialApplovalPageOwnersProfilesLocators.applicationInformation.getText();
	}
	

	public Boolean ownersProfilesDataLableisDisplayed() {
		
		return initialApplovalPageOwnersProfilesLocators.ownersProfilesDataLable.isDisplayed();
		
	}

	
	public void clicknextButton() throws InterruptedException {
		commonFunctions.clickWebElement(initialApplovalPageOwnersProfilesLocators.nextButton);
	}
	

	public String getLableText(WebElement webElementt) {
	
		String lableText = webElementt.getText();
		return lableText;
		}
		

	public String  enterOwnerPersonalData( 
			String ownerType, String companyName ,
			String ownersFullname, String ownersFamilyName,
			String photographName,
			String criminalStatusCertifion,
			String ownersPlaceofbirth,String dateofBirth ,String ownersCurrentnationality, 
			String ownersReligion, String ownerOccupation, 
			String ownersSalary) throws AWTException, InterruptedException   {

		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.TypeofOwner_ddl, ownerType);
		initialApplovalPageOwnersProfilesLocators.institutionorCompanyTextbox.sendKeys(companyName);
		initialApplovalPageOwnersProfilesLocators.ownersFullnameTextbox.sendKeys(ownersFullname);
		initialApplovalPageOwnersProfilesLocators.ownersFamilyNameTextbox.sendKeys(ownersFamilyName);
		js.executeScript("window.scrollTo(0,800)");
		commonFunctions.uploadfile(initialApplovalPageOwnersProfilesLocators.PhotographUploader,photographName);
		commonFunctions.uploadfile(initialApplovalPageOwnersProfilesLocators.criminalStatusCertificate,criminalStatusCertifion);;
		commonFunctions.fluentWait(initialApplovalPageOwnersProfilesLocators.ownersPlaceofbirthTextbox);
		initialApplovalPageOwnersProfilesLocators.ownersPlaceofbirthTextbox.sendKeys(ownersPlaceofbirth);
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.dateofBirthDatepicker);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.dateofBirthDatepicker, dateofBirth);
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.ownersCurrentnationality_ddl);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.ownersCurrentnationality_ddl, ownersCurrentnationality);
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.ownersReligion_ddl);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.ownersReligion_ddl,ownersReligion);
		js.executeScript("window.scrollTo(0,1300)");
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.ownerOccupationTextbox);
		commonFunctions.implicitWait(10);
		initialApplovalPageOwnersProfilesLocators.ownerOccupationTextbox.sendKeys(ownerOccupation);
		initialApplovalPageOwnersProfilesLocators.ownersSalaryTextbox.sendKeys(ownersSalary);

			commonFunctions.moveTotoTheTop();

			if (initialApplovalPageOwnersProfilesLocators.passportDetailsTap.isDisplayed()) {
			   js.executeScript("arguments[0].scrollIntoView(true);", initialApplovalPageOwnersProfilesLocators.passportDetailsTap);
			}
			Thread.sleep(1000);
      initialApplovalPageOwnersProfilesLocators.passportDetailsTap.click();
	String personalDataComplitionStat = getLableText(initialApplovalPageOwnersProfilesLocators.personalDataComplitionLable);
	System.out.println(personalDataComplitionStat);
		return personalDataComplitionStat;
	}
	
	public void reenterOwnerPersonalData( 

			String companyName ,
			String ownersFullname, String ownersFamilyName,
			String photographName,
			String criminalStatusCertifion,
			String ownersPlaceofbirth,String dateofBirth ,
			String ownerOccupation, 
			String ownersSalary) throws AWTException, InterruptedException   {

		Thread.sleep(1000);

		commonFunctions.clearText(initialApplovalPageOwnersProfilesLocators.institutionorCompanyTextbox);
		initialApplovalPageOwnersProfilesLocators.institutionorCompanyTextbox.sendKeys(companyName);
		commonFunctions.clearText(initialApplovalPageOwnersProfilesLocators.ownersFullnameTextbox);
		initialApplovalPageOwnersProfilesLocators.ownersFullnameTextbox.sendKeys(ownersFullname);
		commonFunctions.clearText(initialApplovalPageOwnersProfilesLocators.ownersFamilyNameTextbox);
		initialApplovalPageOwnersProfilesLocators.ownersFamilyNameTextbox.sendKeys(ownersFamilyName);
		js.executeScript("window.scrollTo(0,800)");
		commonFunctions.uploadfile(initialApplovalPageOwnersProfilesLocators.PhotographUploader,photographName);
		commonFunctions.uploadfile(initialApplovalPageOwnersProfilesLocators.criminalStatusCertificate,criminalStatusCertifion);;
		commonFunctions.fluentWait(initialApplovalPageOwnersProfilesLocators.ownersPlaceofbirthTextbox);
		commonFunctions.clearText(	initialApplovalPageOwnersProfilesLocators.ownersPlaceofbirthTextbox);
		initialApplovalPageOwnersProfilesLocators.ownersPlaceofbirthTextbox.sendKeys(ownersPlaceofbirth);
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.dateofBirthDatepicker);
		commonFunctions.clearText(initialApplovalPageOwnersProfilesLocators.dateofBirthDatepicker);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.dateofBirthDatepicker, dateofBirth);
		js.executeScript("window.scrollTo(0,800)");
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.ownerOccupationTextbox);
		commonFunctions.clearText(initialApplovalPageOwnersProfilesLocators.ownerOccupationTextbox);
		initialApplovalPageOwnersProfilesLocators.ownerOccupationTextbox.sendKeys(ownerOccupation);
		js.executeScript("window.scrollTo(0,800)");
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.ownersSalaryTextbox);
		commonFunctions.clearText(initialApplovalPageOwnersProfilesLocators.ownersSalaryTextbox);
		initialApplovalPageOwnersProfilesLocators.ownersSalaryTextbox.sendKeys(ownersSalary);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.waitElementToBeClickable(initialApplovalPageOwnersProfilesLocators. returnOwnerProfileNextButton);
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators. returnOwnerProfileNextButton);

		js.executeScript("arguments[0].click();", initialApplovalPageOwnersProfilesLocators.returnOwnerProfileNextButton);
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].click();", initialApplovalPageOwnersProfilesLocators.returnOwnerProfileNextButton);
		initialApplovalDocumentsPageActions.downloadDocument();
		js.executeScript("arguments[0].click();", initialApplovalPageOwnersProfilesLocators.returnOwnerProfileNextButton);
		commonFunctions.moveToWebElement(initialApplovalDocumentsPageLocators.dataAcknowledge_Checkbox);
		initialApplovalDocumentsPageLocators.dataAcknowledge_Checkbox.click();
	}


	public String enterOwnerpassportDetails(String ownerPassportNumber, String passportplaceOfIssue,String passportReleaseDate, String passportExpiryDate, String passport ) throws AWTException, InterruptedException {
	
		initialApplovalPageOwnersProfilesLocators.ownerPassportNumberTextBox.sendKeys(ownerPassportNumber);
		initialApplovalPageOwnersProfilesLocators.passportplaceOfIssueTextBox.sendKeys(passportplaceOfIssue);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.passportReleaseDateDatepicker, passportReleaseDate);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.passportExpiryDateDatepicker, passportExpiryDate);
		commonFunctions.uploadfile(initialApplovalPageOwnersProfilesLocators.passportUploader, passport);
		initialApplovalPageOwnersProfilesLocators.residenceDetailsTap.click();
		String passportDetailComplitionStat =commonFunctions.getLableText(initialApplovalPageOwnersProfilesLocators.passportDetailComplitionLable);
		return passportDetailComplitionStat;
	}
	
	
	public String enterResidenceDetailsDetails(String emiratesID, String validEmiratesID) throws AWTException, InterruptedException {
		
		initialApplovalPageOwnersProfilesLocators.emiratesIDTextbox.sendKeys(emiratesID);
		commonFunctions.uploadfile(initialApplovalPageOwnersProfilesLocators.validEmiratesIDUploader, validEmiratesID);
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		initialApplovalPageOwnersProfilesLocators.QualifyingTap.click();
		String ResidenceDetailsStat =commonFunctions.getLableText(initialApplovalPageOwnersProfilesLocators.passportDetailComplitionLable);
		return ResidenceDetailsStat;		
	}
	
	public String enterOwnerQualificationsDetails(String qualificationType, String schoolandUniversity,String qualificationObtainedDate, String qualificationCountry ) throws Exception {

		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.qualificationType_ddl, qualificationType);
		initialApplovalPageOwnersProfilesLocators.schoolandUniversitytextbox.sendKeys(schoolandUniversity);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.qualificationObtainedDatepicker, qualificationObtainedDate);
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.qualificationCountry_ddl, qualificationCountry);
		initialApplovalPageOwnersProfilesLocators.maritalStatusDataTap.click();
		//Thread.sleep(3000);
		commonFunctions.implicitWait(10);
		String qualificationsDetailsComplitionStat =commonFunctions.getLableText(initialApplovalPageOwnersProfilesLocators.QualificationsComplitionLable);
		return qualificationsDetailsComplitionStat;
	}
	
	public String enterMaritalStatusDetails(String MaritalStatus) {
		commonFunctions.enterddlValue(initialApplovalPageOwnersProfilesLocators.fmaritalStatus_ddl, MaritalStatus);
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalPageOwnersProfilesLocators.fatherAndMotherTap.click();
		String  maritalStatusDetailsStat =commonFunctions.getLableText(initialApplovalPageOwnersProfilesLocators.maritalStatusComplitionLable);
		return  maritalStatusDetailsStat;
	}
	
	public String enterFatherandMotherDetails(String fatherName, String motherName) {
		initialApplovalPageOwnersProfilesLocators.fatherNameTextbox.sendKeys(fatherName);
		initialApplovalPageOwnersProfilesLocators.motherNameTextbox.sendKeys(motherName);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.housingDetailsTap);
		initialApplovalPageOwnersProfilesLocators.housingDetailsTap.click();
		String FatherandMotherDetailsStat =commonFunctions.getLableText(initialApplovalPageOwnersProfilesLocators.QualificationsComplitionLable);
		return FatherandMotherDetailsStat;

	}
	
	public String enterHousingDetails(String region, String street, String mobileNumber,String poBoxNumber) throws InterruptedException {

		initialApplovalPageOwnersProfilesLocators.regionTextBox.sendKeys(region);
		initialApplovalPageOwnersProfilesLocators.streetTextBox.sendKeys(street);
		initialApplovalPageOwnersProfilesLocators.mobileNumberTextBox.sendKeys(mobileNumber);
		initialApplovalPageOwnersProfilesLocators.poBoxTextBox.sendKeys(poBoxNumber);
		
		
		//js.executeScript("window.scrollTo((0, 0);");
		commonFunctions.moveTotoTheTop();
	


		if (initialApplovalPageOwnersProfilesLocators.ownerSharedPercentageTap.isDisplayed()) {
		   js.executeScript("arguments[0].scrollIntoView(true);", initialApplovalPageOwnersProfilesLocators.ownerSharedPercentageTap);
		}
		Thread.sleep(1000);
		
		
		initialApplovalPageOwnersProfilesLocators.ownerSharedPercentageTap.click();
		js.executeScript("window.scrollBy(0,1000)");
		String housingDetailsStat =commonFunctions.getLableText(initialApplovalPageOwnersProfilesLocators.QualificationsComplitionLable);
		return housingDetailsStat;
		
	}
	
	public void enterOwnerSharedPercentage(String ownerSharedPercentage ) throws InterruptedException {
		js.executeScript("window.scrollBy(0,-1000)");
		initialApplovalPageOwnersProfilesLocators.ownerSharedPercentageTextBox.sendKeys(ownerSharedPercentage);
		js.executeScript("window.scrollBy(0, 500);");
		commonFunctions.waitElementToBeClickable(initialApplovalPageOwnersProfilesLocators.ownerProfileNextButton);

		if (initialApplovalPageOwnersProfilesLocators.ownerProfileNextButton.isDisplayed()) {
		   js.executeScript("arguments[0].scrollIntoView(true);",initialApplovalPageOwnersProfilesLocators.ownerProfileNextButton);
		}
		Thread.sleep(1000);
		
		
		initialApplovalPageOwnersProfilesLocators.ownerProfileNextButton.click();
		js.executeScript("window.scrollBy(0,-1000)");
	}
	

	
}
