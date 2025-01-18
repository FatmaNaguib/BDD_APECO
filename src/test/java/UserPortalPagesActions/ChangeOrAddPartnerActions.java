package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.ChangeOrAddPartnerLocators;

public class ChangeOrAddPartnerActions extends APECOTestBase {

	ChangeOrAddPartnerLocators changeOrAddPartnerLocators ;
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 Actions actions = new Actions(driver);
	 
	public ChangeOrAddPartnerActions() throws IOException {
		super();
		changeOrAddPartnerLocators = new ChangeOrAddPartnerLocators(); 
		PageFactory.initElements(driver, changeOrAddPartnerLocators);
	}

	public void StartAddNewOwnersRequest() {
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.requestType_NextBtn);
		changeOrAddPartnerLocators.requestType_NextBtn.click();
	}
	
	public String  enterOwnerPersonalData( 
			String ownerType, String companyName ,
			String ownersFullname, String ownersFamilyName,
			String photographName,
			String criminalStatusCertifion,
			String ownersPlaceofbirth,String dateofBirth ,String ownersCurrentnationality, 
			String ownersReligion, String ownerOccupation, 
			String ownersSalary) throws AWTException, InterruptedException   {
		
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.TypeofOwner_ddl, ownerType);
		changeOrAddPartnerLocators.institutionorCompanyTextbox.sendKeys(companyName);
		changeOrAddPartnerLocators.ownersFullnameTextbox.sendKeys(ownersFullname);
		changeOrAddPartnerLocators.ownersFamilyNameTextbox.sendKeys(ownersFamilyName);
		commonFunctions.uploadfile(changeOrAddPartnerLocators.PhotographUploader,photographName);
		commonFunctions.uploadfile(changeOrAddPartnerLocators.criminalStatusCertificate,criminalStatusCertifion);;
		Thread.sleep(1000);
		changeOrAddPartnerLocators.ownersPlaceofbirthTextbox.sendKeys(ownersPlaceofbirth);
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.dateofBirthDatepicker);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.dateofBirthDatepicker, dateofBirth);
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.ownersCurrentnationality_ddl);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.ownersCurrentnationality_ddl, ownersCurrentnationality);
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.ownersReligion_ddl);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.ownersReligion_ddl,ownersReligion);
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.ownerOccupationTextbox);
		changeOrAddPartnerLocators.ownerOccupationTextbox.sendKeys(ownerOccupation);
		changeOrAddPartnerLocators.ownersSalaryTextbox.sendKeys(ownersSalary);
      commonFunctions.moveToWebElement(changeOrAddPartnerLocators.passportDetailsTap);		
      changeOrAddPartnerLocators.passportDetailsTap.click();
	String personalDataComplitionStat = commonFunctions.getLableText(changeOrAddPartnerLocators.personalDataComplitionLable);
	System.out.println(personalDataComplitionStat);

		return personalDataComplitionStat;
		
	}
	
	public String enterOwnerpassportDetails(String ownerPassportNumber, String passportplaceOfIssue,String passportReleaseDate, String passportExpiryDate, String passport ) throws AWTException, InterruptedException {
		
		changeOrAddPartnerLocators.ownerPassportNumberTextBox.sendKeys(ownerPassportNumber);
		changeOrAddPartnerLocators.passportplaceOfIssueTextBox.sendKeys(passportplaceOfIssue);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.passportReleaseDateDatepicker, passportReleaseDate);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.passportExpiryDateDatepicker, passportExpiryDate);
		commonFunctions.uploadfile(changeOrAddPartnerLocators.passportUploader, passport);
		
		changeOrAddPartnerLocators.residenceDetailsTap.click();
		String passportDetailComplitionStat =commonFunctions.getLableText(changeOrAddPartnerLocators.passportDetailComplitionLable);
		return passportDetailComplitionStat;
		
	}
	
	
	public String enterResidenceDetailsDetails(String emiratesID, String validEmiratesID) throws AWTException, InterruptedException {
		
		changeOrAddPartnerLocators.emiratesIDTextbox.sendKeys(emiratesID);
		commonFunctions.uploadfile(changeOrAddPartnerLocators.validEmiratesIDUploader, validEmiratesID);
		Thread.sleep(1000);
		changeOrAddPartnerLocators.QualifyingTap.click();
		String ResidenceDetailsStat =commonFunctions.getLableText(changeOrAddPartnerLocators.passportDetailComplitionLable);
		return ResidenceDetailsStat;
		
	}
	
	public String enterOwnerQualificationsDetails(String qualificationType, String schoolandUniversity,String qualificationObtainedDate, String qualificationCountry ) throws Exception {

		commonFunctions.enterddlValue(changeOrAddPartnerLocators.qualificationType_ddl, qualificationType);
		changeOrAddPartnerLocators.schoolandUniversitytextbox.sendKeys(schoolandUniversity);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.qualificationObtainedDatepicker, qualificationObtainedDate);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.qualificationCountry_ddl, qualificationCountry);
		changeOrAddPartnerLocators.maritalStatusDataTap.click();
		Thread.sleep(5000);
		String qualificationsDetailsComplitionStat =commonFunctions.getLableText(changeOrAddPartnerLocators.QualificationsComplitionLable);
		return qualificationsDetailsComplitionStat;
	}
	
	
	public String enterMaritalStatusDetails(String MaritalStatus) {

		commonFunctions.enterddlValue(changeOrAddPartnerLocators.fmaritalStatus_ddl, MaritalStatus);
		js.executeScript("window.scrollBy(0,1000)");
		//commonFunctions.moveToWebElement(initialApplovalPageOwnersProfilesLocators.fatherAndMotherTap);
		changeOrAddPartnerLocators.fatherAndMotherTap.click();
		String  maritalStatusDetailsStat =commonFunctions.getLableText(changeOrAddPartnerLocators.maritalStatusComplitionLable);
		return  maritalStatusDetailsStat;

	}
	
	public String enterFatherandMotherDetails(String fatherName,String fatherNationality, String motherNationality, String motherName) {
		changeOrAddPartnerLocators.fatherNameTextbox.sendKeys(fatherName);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.fatherNationality_ddl, fatherNationality);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.motherNationality_ddl);
		changeOrAddPartnerLocators.motherNameTextbox.sendKeys(motherName);
		commonFunctions.enterddlValue(changeOrAddPartnerLocators.motherNationality_ddl, motherNationality);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.housingDetailsTap);
		changeOrAddPartnerLocators.housingDetailsTap.click();
		String FatherandMotherDetailsStat =commonFunctions.getLableText(changeOrAddPartnerLocators.QualificationsComplitionLable);
		return FatherandMotherDetailsStat;

	}
	
	public String enterHousingDetails(String region, String street, String mobileNumber,String poBoxNumber) {

		changeOrAddPartnerLocators.regionTextBox.sendKeys(region);
		changeOrAddPartnerLocators.streetTextBox.sendKeys(street);
		changeOrAddPartnerLocators.mobileNumberTextBox.sendKeys(mobileNumber);
		changeOrAddPartnerLocators.poBoxTextBox.sendKeys(poBoxNumber);
		//commonFunctions.moveToWebElement(changeOrAddPartnerLocators.ownerSharedPercentageTap);
	//	changeOrAddPartnerLocators.ownerSharedPercentageTap.click()
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.ownerProfileNextButton);
		js.executeScript("window.scrollBy(0,1000)");
		String housingDetailsStat =commonFunctions.getLableText(changeOrAddPartnerLocators.QualificationsComplitionLable);
		changeOrAddPartnerLocators.ownerProfileNextButton.click();
		return housingDetailsStat;
	}
	public void enterPartnersharepercentage() {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.firstPartnerPercentage_Textbox);
		changeOrAddPartnerLocators.firstPartnerPercentage_Textbox.click();
		changeOrAddPartnerLocators.firstPartnerPercentageArrow_Textbox.click();
		changeOrAddPartnerLocators.secoundPartnerPercentage_Textbox.click();
		changeOrAddPartnerLocators.secoundPartnerPercentageArrow_Textbox.click();
		changeOrAddPartnerLocators.PartnerPercentageNext_Btn.click();
	}
	
	public void downloadDocument() throws InterruptedException {
		
		Thread.sleep(1000);
		changeOrAddPartnerLocators.downloadPopup_btn.click();
		Thread.sleep(1000);
		changeOrAddPartnerLocators.downloadDocNext_btn.click();
	}
	
	public void uploadocument(String licenseModificationRequest_uploader, String certifiedPartnershipAgreement_uploader , String introductionDocumentsat_uploader) throws AWTException, InterruptedException {
		commonFunctions.uploadfile(changeOrAddPartnerLocators.licenseModificationRequest_uploader, licenseModificationRequest_uploader);
		commonFunctions.uploadfile(changeOrAddPartnerLocators.certifiedPartnershipAgreement_uploader, certifiedPartnershipAgreement_uploader);
		commonFunctions.uploadfile(changeOrAddPartnerLocators.introductionDocumentsat_uploader, introductionDocumentsat_uploader);
		Thread.sleep(2000);
		changeOrAddPartnerLocators. attachmentsNext_btn.click();
		
	}
	public void checkTheDataAcknowledge() throws InterruptedException  {

		Thread.sleep(1000);
		
		changeOrAddPartnerLocators.dataAcknowledge_Checkbox.click();
		changeOrAddPartnerLocators.paymentAcknowledge_Checkbox.click();
		commonFunctions.clickWebElement(changeOrAddPartnerLocators.pay_btn);
		//changeOrAddPartnerLocators.pay_btn.click();
	}
	
	public String payTheRequestFees() throws InterruptedException  {

		commonFunctions.clickWebElement(changeOrAddPartnerLocators.payNow_btn);
		//changeOrAddPartnerLocators.payNow_btn.click();
		commonFunctions.clickWebElement(changeOrAddPartnerLocators.submit_btn);
		changeOrAddPartnerLocators.submit_btn.click();
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(changeOrAddPartnerLocators.confirmation_msg);
		 String msg = changeOrAddPartnerLocators.confirmation_msg.getText();
		 String ChangeOrAddPartnerRequestNumber = msg.replaceAll("[^0-9]","");
		changeOrAddPartnerLocators.confirmation_btn.click();
		return ChangeOrAddPartnerRequestNumber;		
	}
	public void postPayRequestfees() throws InterruptedException {
		commonFunctions.waitElementToBevisible(changeOrAddPartnerLocators.pay_btn);
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.pay_btn);
		changeOrAddPartnerLocators.pay_btn.click();
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.payNow_btn);
		changeOrAddPartnerLocators.payNow_btn.click();
		commonFunctions.waitElementToBevisible(changeOrAddPartnerLocators.submit_btn);
		changeOrAddPartnerLocators.submit_btn.click();	
		commonFunctions.moveToWebElement(changeOrAddPartnerLocators.okay_btn);
		commonFunctions.waitElementToBevisible(changeOrAddPartnerLocators.okay_btn);
		changeOrAddPartnerLocators. okay_btn.click();
		Thread.sleep(3000);
	}
	
}
