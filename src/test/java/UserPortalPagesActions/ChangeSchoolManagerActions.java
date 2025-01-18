package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;

import UserPortalPagesLocators.ChangeSchoolManagerLocators;



public class ChangeSchoolManagerActions extends APECOTestBase {
	CommonFunctions commonFunctions = new CommonFunctions();
	ChangeSchoolManagerLocators  changeSchoolManagerLocators;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public ChangeSchoolManagerActions() throws IOException {
		super();
		changeSchoolManagerLocators = new ChangeSchoolManagerLocators();
		PageFactory.initElements(driver, changeSchoolManagerLocators);
	}
	
	public void enterManagerData(
			String managerName,	
			String mangerNationality, String managerGender, 
			String appliedPosition, String maritalStatus,
			String birthDate, String placeofBirth,
			String idCardNumber, String idCardExpirationDate,
			String passportNumber, String passportExpirationDate,
			String religion, String email,
			String residencyExpirationDate, String visaExpirationDate,
			String addressInsideCountry, String phoneNumber, 
			String qualification,	String specialization,
			String qualificationDate, String certificateIssuingAuthority, 
			String verifiedQualificationAndAcademicRecord,
			String employer, String jobTitle, String workStartingDate, 
			String workCompletionDate, String country,
			String experienceCertificates
			
			) throws InterruptedException, AWTException {
		
		commonFunctions.moveToWebElement(changeSchoolManagerLocators.reasonForVacancy_TextBox);
		changeSchoolManagerLocators.reasonForVacancy_TextBox.sendKeys("New Employee");
		changeSchoolManagerLocators.basicCandidateData_tab.click();
		changeSchoolManagerLocators.managerName_TextBox.sendKeys(managerName);
		commonFunctions.enterddlValue(changeSchoolManagerLocators.mangerNationality_ddl, mangerNationality);
		commonFunctions.enterddlValue(changeSchoolManagerLocators.managerGender_ddl, managerGender);
		changeSchoolManagerLocators.appliedPosition_TextBox.sendKeys(appliedPosition);
		commonFunctions.enterddlValue(changeSchoolManagerLocators.maritalStatus_ddl,maritalStatus);
		commonFunctions.enterddlValue(changeSchoolManagerLocators.birthDate_Calendar,birthDate);		
		js.executeScript("window.scrollBy(0,500)");
		changeSchoolManagerLocators.placeofBirth_TextBox.sendKeys(placeofBirth);
		changeSchoolManagerLocators.idCardNumber_TextBox.sendKeys(idCardNumber);
		changeSchoolManagerLocators.idCardExpirationDate_TextBox.sendKeys(idCardExpirationDate);
		js.executeScript("window.scrollBy(0,500)");
		changeSchoolManagerLocators.passportNumber_TextBox.sendKeys(passportNumber);
		changeSchoolManagerLocators.passportExpirationDate_Calendar.sendKeys(passportExpirationDate);
		commonFunctions.moveToWebElement(changeSchoolManagerLocators.religion_ddl);
		commonFunctions.enterddlValue(changeSchoolManagerLocators.religion_ddl,religion);
		js.executeScript("window.scrollBy(0,500)");
		changeSchoolManagerLocators.residencyExpirationDate_Calendar.sendKeys(residencyExpirationDate);
		changeSchoolManagerLocators.visaExpirationDate_Calendar.sendKeys(visaExpirationDate);
		changeSchoolManagerLocators.addressInsideCountry_TextBox.sendKeys(addressInsideCountry);
		changeSchoolManagerLocators.email_TextBox.sendKeys(email);
		changeSchoolManagerLocators.phoneNumber_TextBox.sendKeys(phoneNumber);
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(1000);
		commonFunctions.moveToWebElement(changeSchoolManagerLocators.qualifications_tab);
		changeSchoolManagerLocators.qualifications_tab.click();
		
		commonFunctions.enterddlValue(changeSchoolManagerLocators.qualification_ddl,qualification);
		changeSchoolManagerLocators.specialization_TextBox.sendKeys(specialization);
		changeSchoolManagerLocators.qualificationDate_Calendar.sendKeys(qualificationDate);
		changeSchoolManagerLocators.certificateIssuingAuthority_Textbox.sendKeys(certificateIssuingAuthority);
		commonFunctions.uploadfile(changeSchoolManagerLocators.verifiedQualificationAndAcademicRecord_uploader, verifiedQualificationAndAcademicRecord);
		commonFunctions.moveToWebElement(changeSchoolManagerLocators.previousExperience_btn);
		changeSchoolManagerLocators.previousExperience_btn.click();
		changeSchoolManagerLocators.employer_TextBox.sendKeys(employer);
		changeSchoolManagerLocators.jobTitle_TextBox.sendKeys(jobTitle);
		js.executeScript("window.scrollBy(0,500)");
		changeSchoolManagerLocators.workStartingDate_Calendar.sendKeys(workStartingDate);
		changeSchoolManagerLocators.workCompletionDate_Calendar.sendKeys(workCompletionDate);
		commonFunctions.enterddlValue(changeSchoolManagerLocators.country_ddl,country);
		commonFunctions.uploadfile(changeSchoolManagerLocators.experienceCertificates_uploader, experienceCertificates);
		//Thread.sleep(1000);
		commonFunctions.clickWebElement(changeSchoolManagerLocators.managerDataNext_btn);
		/*commonFunctions.moveToWebElement(changeSchoolManagerLocators.managerDataNext_btn);
		changeSchoolManagerLocators.managerDataNext_btn.click();*/
		
	}
	public void enterManagerAttachments(
			String emiratiIdforManager,
			String passportforManager, String criminalStatusCertificateForManager,
			String profilePicture_uploader,
			String managerApproval, String managerCV
			
			) throws InterruptedException, AWTException {
		commonFunctions.uploadfile(changeSchoolManagerLocators.emiratiIdforManager_uploader,emiratiIdforManager);
		commonFunctions.uploadfile(changeSchoolManagerLocators.passportforManager_uploader,passportforManager);
		commonFunctions.uploadfile(changeSchoolManagerLocators.criminalStatusCertificateForManager_uploader,criminalStatusCertificateForManager);
		commonFunctions.uploadfile(changeSchoolManagerLocators.profilePicture_uploader,profilePicture_uploader);
		commonFunctions.uploadfile(changeSchoolManagerLocators.managerApproval_uploader,managerApproval);
		commonFunctions.uploadfile(changeSchoolManagerLocators.managerCV_uploader, managerCV);
		commonFunctions.clickWebElement(changeSchoolManagerLocators.attachmentsNxt_btn);
		//commonFunctions.moveToWebElement(changeSchoolManagerLocators.attachmentsNxt_btn);
	//	changeSchoolManagerLocators.attachmentsNxt_btn.click();
	}
	
	public void submitRequest() throws InterruptedException {
		
		changeSchoolManagerLocators.dataAcknowledge_Checkbox.click();
		changeSchoolManagerLocators.pay_btn.click();
		//changeSchoolManagerLocators.submit_btn.click();
	
	}
	
	
	public String confirmRequest() throws InterruptedException {
		commonFunctions.waitElementToBevisible(changeSchoolManagerLocators.confirmation_msg);
	String msg = changeSchoolManagerLocators.confirmation_msg.getText();
	String	changeSchoolManagerRequestNumber = msg.replaceAll("[^0-9]","");
	 Thread.sleep(1000);
	 commonFunctions.waitElementToBevisible(changeSchoolManagerLocators.confirmation_btn);
	changeSchoolManagerLocators.confirmation_btn.click();
	return changeSchoolManagerRequestNumber;

	}
	public void payRequestfees() throws InterruptedException {

		commonFunctions.clickWebElement(changeSchoolManagerLocators.postPay_btn);
		commonFunctions.clickWebElement(changeSchoolManagerLocators.payNow_btn);
		//commonFunctions.waitElementToBevisible(changeSchoolManagerLocators.submit_btn);
		commonFunctions.clickWebElement(changeSchoolManagerLocators.submit_btn);
		commonFunctions.clickWebElement(changeSchoolManagerLocators.okay_btn);
		Thread.sleep(3000);
	}
	

}
