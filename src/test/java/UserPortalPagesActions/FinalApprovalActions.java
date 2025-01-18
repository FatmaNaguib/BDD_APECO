package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.FinalApprovalLocators;

public class FinalApprovalActions extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	FinalApprovalLocators  finalApprovalLocators;
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public FinalApprovalActions() throws IOException {
		 finalApprovalLocators = new FinalApprovalLocators();
		 PageFactory.initElements(driver, finalApprovalLocators);
	}
	

	public void enterOneStageSchoolFees(
			String approvedTuitionFees1, String approvedSchoolbookFees1, String schoolUniformFees1, 
			String emirate,
			String oneDirectionTransportationfees, String twoDirectionTransportationfees
			) {
		js.executeScript("window.scrollBy(0,2000)");
		
		commonFunctions.moveToWebElement(finalApprovalLocators.approvedTuitionFees1_Textbox);
		finalApprovalLocators.approvedTuitionFees1_Textbox.sendKeys(approvedTuitionFees1);
		finalApprovalLocators.approvedSchoolbookFees1_Textbox.sendKeys(approvedSchoolbookFees1);
		finalApprovalLocators.schoolUniformFees1_Textbox.sendKeys(schoolUniformFees1);
		
		commonFunctions.moveToWebElement(finalApprovalLocators.emirate_ddl);
		commonFunctions.enterddlValue(finalApprovalLocators.emirate_ddl,emirate);
		
		finalApprovalLocators.oneDirectionTransportationfeesTextbox.sendKeys(oneDirectionTransportationfees);
		finalApprovalLocators.twoDirectionTransportationfeesTextbox.sendKeys(twoDirectionTransportationfees);
		commonFunctions.waitElementToBeClickable(finalApprovalLocators.nextButton);
		commonFunctions.moveToWebElement(finalApprovalLocators.nextButton);
		finalApprovalLocators.nextButton.click();
		commonFunctions.moveToWebElement(finalApprovalLocators.basicCandidateData_tab);
	}
	
	public void  enterTwoStageSchoolFees(
			String approvedTuitionFees1, String approvedSchoolbookFees1, String schoolUniformFees1, 
			String approvedTuitionFees2, String approvedSchoolbookFees2, String schoolUniformFees2,
			String emirate,
			String oneDirectionTransportationfees, String twoDirectionTransportationfees
			) {
		js.executeScript("window.scrollBy(0,2000)");
		
		commonFunctions.moveToWebElement(finalApprovalLocators.approvedTuitionFees1_Textbox);
		finalApprovalLocators.approvedTuitionFees1_Textbox.sendKeys(approvedTuitionFees1);
		finalApprovalLocators.approvedSchoolbookFees1_Textbox.sendKeys(approvedSchoolbookFees1);
		finalApprovalLocators.schoolUniformFees1_Textbox.sendKeys(schoolUniformFees1);
		
		commonFunctions.moveToWebElement(finalApprovalLocators.approvedTuitionFees2_Textbox);
		finalApprovalLocators.approvedTuitionFees2_Textbox.sendKeys(approvedTuitionFees2);
		finalApprovalLocators.approvedSchoolbookFees2_Textbox.sendKeys(approvedSchoolbookFees2);
		finalApprovalLocators.schoolUniformFees2_Textbox.sendKeys(schoolUniformFees2);
		
		commonFunctions.moveToWebElement(finalApprovalLocators.emirate_ddl);
		commonFunctions.enterddlValue(finalApprovalLocators.emirate_ddl,emirate);
		
		finalApprovalLocators.oneDirectionTransportationfeesTextbox.sendKeys(oneDirectionTransportationfees);
		finalApprovalLocators.twoDirectionTransportationfeesTextbox.sendKeys(twoDirectionTransportationfees);
		commonFunctions.waitElementToBeClickable(finalApprovalLocators.nextButton);
		commonFunctions.moveToWebElement(finalApprovalLocators.nextButton);
		finalApprovalLocators.nextButton.click();
		commonFunctions.moveToWebElement(finalApprovalLocators.basicCandidateData_tab);
	}
	public void enterSchoolFees(
			String approvedTuitionFees1, String approvedSchoolbookFees1, String schoolUniformFees1, 
			String approvedTuitionFees2, String approvedSchoolbookFees2, String schoolUniformFees2,
			String approvedTuitionFees3, String approvedSchoolbookFees3, String schoolUniformFees3,
			String emirate,
			String oneDirectionTransportationfees, String twoDirectionTransportationfees
			) {
		js.executeScript("window.scrollBy(0,2000)");
		
		commonFunctions.moveToWebElement(finalApprovalLocators.approvedTuitionFees1_Textbox);
		finalApprovalLocators.approvedTuitionFees1_Textbox.sendKeys(approvedTuitionFees1);
		finalApprovalLocators.approvedSchoolbookFees1_Textbox.sendKeys(approvedSchoolbookFees1);
		finalApprovalLocators.schoolUniformFees1_Textbox.sendKeys(schoolUniformFees1);
		
		commonFunctions.moveToWebElement(finalApprovalLocators.approvedTuitionFees2_Textbox);
		finalApprovalLocators.approvedTuitionFees2_Textbox.sendKeys(approvedTuitionFees2);
		finalApprovalLocators.approvedSchoolbookFees2_Textbox.sendKeys(approvedSchoolbookFees2);
		finalApprovalLocators.schoolUniformFees2_Textbox.sendKeys(schoolUniformFees2);
		
		commonFunctions.moveToWebElement(finalApprovalLocators.approvedTuitionFees3_Textbox);
		finalApprovalLocators.approvedTuitionFees3_Textbox.sendKeys(approvedTuitionFees3);
		finalApprovalLocators.approvedSchoolbookFees3_Textbox.sendKeys(approvedSchoolbookFees3);
		finalApprovalLocators.schoolUniformFees3_Textbox.sendKeys(schoolUniformFees3);
		
		commonFunctions.moveToWebElement(finalApprovalLocators.emirate_ddl);
		commonFunctions.enterddlValue(finalApprovalLocators.emirate_ddl,emirate);
		
		finalApprovalLocators.oneDirectionTransportationfeesTextbox.sendKeys(oneDirectionTransportationfees);
		finalApprovalLocators.twoDirectionTransportationfeesTextbox.sendKeys(twoDirectionTransportationfees);
		commonFunctions.waitElementToBeClickable(finalApprovalLocators.nextButton);
		commonFunctions.moveToWebElement(finalApprovalLocators.nextButton);
		finalApprovalLocators.nextButton.click();
		commonFunctions.moveToWebElement(finalApprovalLocators.basicCandidateData_tab);
	}
	public void enterCandidateData() {
		finalApprovalLocators.basicCandidateData_tab.click();
		
		
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
			String addressInsideCountry, String phoneNumber
			
			
			) throws InterruptedException, AWTException {
		
		finalApprovalLocators.managerNameTextBox.sendKeys(managerName);
		commonFunctions.enterddlValue(finalApprovalLocators.mangerNationality_ddl, mangerNationality);
		commonFunctions.enterddlValue(finalApprovalLocators.managerGender_ddl, managerGender);
		finalApprovalLocators.appliedPosition_TextBox.sendKeys(appliedPosition);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(finalApprovalLocators.maritalStatus_ddl);
		commonFunctions.enterddlValue(finalApprovalLocators.maritalStatus_ddl,maritalStatus);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(finalApprovalLocators.birthDate_Calendar);
		commonFunctions.enterddlValue(finalApprovalLocators.birthDate_Calendar,birthDate);
	
		commonFunctions.moveToWebElement(finalApprovalLocators.placeOfBirth_ddl);
		commonFunctions.enterddlValue(finalApprovalLocators.placeOfBirth_ddl,placeofBirth);

		finalApprovalLocators.idCardNumber_TextBox.sendKeys(idCardNumber);
		finalApprovalLocators.idCardExpirationDate_TextBox.sendKeys(idCardExpirationDate);
		js.executeScript("window.scrollBy(0,500)");
		commonFunctions.moveToWebElement(finalApprovalLocators.passportNumber_TextBox);
		finalApprovalLocators.passportNumber_TextBox.sendKeys(passportNumber);
		finalApprovalLocators.passportExpirationDate_Calendar.sendKeys(passportExpirationDate);
		commonFunctions.moveToWebElement(finalApprovalLocators.religion_ddl);
		commonFunctions.enterddlValue(finalApprovalLocators.religion_ddl,religion);
		js.executeScript("window.scrollBy(0,1000)");
		
		finalApprovalLocators.residencyExpirationDate_Calendar.sendKeys(residencyExpirationDate);
		finalApprovalLocators.visaExpirationDate_Calendar.sendKeys(visaExpirationDate);
		finalApprovalLocators.addressInsideCountry_TextBox.sendKeys(addressInsideCountry);
		finalApprovalLocators.email_TextBox.sendKeys(email);
		finalApprovalLocators.phoneNumber_TextBox.sendKeys(phoneNumber);
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(1000);

		
	}
	public void enterQualificationsData(
			String qualification,	String specialization,
			String qualificationDate, String certificateIssuingAuthority, 
			String verifiedQualificationAndAcademicRecord,
			String employer, String jobTitle,
			String experienceCertificates
			
			
			) throws InterruptedException, AWTException {
		
		
		commonFunctions.moveToWebElement(finalApprovalLocators.qualifications_tab);
		finalApprovalLocators.qualifications_tab.click();
		
		commonFunctions.enterddlValue(finalApprovalLocators.qualification_ddl,qualification);
		finalApprovalLocators.specialization_TextBox.sendKeys(specialization);
		finalApprovalLocators.qualificationDate_Calendar.sendKeys(qualificationDate);
		finalApprovalLocators.certificateIssuingAuthority_Textbox.sendKeys(certificateIssuingAuthority);
		commonFunctions.uploadfile(finalApprovalLocators.verifiedQualificationAndAcademicRecord_uploader, verifiedQualificationAndAcademicRecord);
		commonFunctions.moveToWebElement(finalApprovalLocators.previousExperience_btn);
		finalApprovalLocators.previousExperience_btn.click();
		finalApprovalLocators.employer_TextBox.sendKeys(employer);
		finalApprovalLocators.jobTitle_TextBox.sendKeys(jobTitle);
		commonFunctions.uploadfile(finalApprovalLocators.experienceCertificates_uploader, experienceCertificates);
		//Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.waitElementToBeClickable(finalApprovalLocators.managerDataNext_btn);
		commonFunctions.moveToWebElement(finalApprovalLocators.managerDataNext_btn);
		finalApprovalLocators.managerDataNext_btn.click();
		
	}
	public void enterManagerAttachments(
			String partnershipLicenseImage, String academicPlan,
			String leaseContractOrPropertyOwnershipDocument, String partnershipContractWithMultipleAuthenticatedPartners,
			String municipalAndCivilDefenseCertificate, String emiratiIdForManager ,
			String emiratiIdforManager,
			String passportforManager, String criminalStatusCertificateForManager, String universityDegree,
			String profilePicture_uploader,
			String managerApproval, String managerCV
			
			) throws InterruptedException, AWTException {
		
		commonFunctions.uploadfile(finalApprovalLocators.partnershipLicenseImage_uploader,partnershipLicenseImage);
		commonFunctions.uploadfile(finalApprovalLocators.academicPlan_uploader,academicPlan);
		commonFunctions.uploadfile(finalApprovalLocators.leaseContractOrPropertyOwnershipDocument_uploader,leaseContractOrPropertyOwnershipDocument);
		commonFunctions.uploadfile(finalApprovalLocators.partnershipContractWithMultipleAuthenticatedPartners_uploader,partnershipContractWithMultipleAuthenticatedPartners);
		commonFunctions.uploadfile(finalApprovalLocators.municipalAndCivilDefenseCertificate_uploader,municipalAndCivilDefenseCertificate);
		commonFunctions.uploadfile(finalApprovalLocators.emiratiIdForManager_uploader,emiratiIdForManager);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.uploadfile(finalApprovalLocators.emiratiIdforManager_uploader,emiratiIdforManager);
		commonFunctions.uploadfile(finalApprovalLocators.passportforManager_uploader,passportforManager);
		commonFunctions.uploadfile(finalApprovalLocators.criminalStatusCertificateForManager_uploader,criminalStatusCertificateForManager);
		commonFunctions.uploadfile(finalApprovalLocators.universityDegree_uploader,universityDegree);
		commonFunctions.uploadfile(finalApprovalLocators.profilePicture_uploader,profilePicture_uploader);
		commonFunctions.uploadfile(finalApprovalLocators.managerApproval_uploader,managerApproval);
		commonFunctions.uploadfile(finalApprovalLocators.managerCV_uploader, managerCV);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.clickWebElement(finalApprovalLocators.attachmentsNxt_btn);
		//commonFunctions.waitElementToBeClickable(finalApprovalLocators.attachmentsNxt_btn);
		//commonFunctions.moveToWebElement(finalApprovalLocators.attachmentsNxt_btn);
		//finalApprovalLocators.attachmentsNxt_btn.click();
	}
	
	public void submitTheRequest() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(finalApprovalLocators.dataAcknowledge_Checkbox);
		finalApprovalLocators.dataAcknowledge_Checkbox.click();
		//commonFunctions.moveToWebElement(finalApprovalLocators.pay_btn);
		//finalApprovalLocators.pay_btn.click();
		commonFunctions.moveToWebElement(finalApprovalLocators.submit_btn);
		finalApprovalLocators.submit_btn.click();
		Thread.sleep(3000);
	}
	
	
	public String confirmRequest() throws InterruptedException {
		commonFunctions.waitElementToBevisible(finalApprovalLocators.confirmation_msg);
		 String msg = finalApprovalLocators.confirmation_msg.getText();
		String finalApprovalRequestNumber = msg.replaceAll("[^0-9]",""); 
		 Thread.sleep(1000);
		commonFunctions.moveToWebElement(finalApprovalLocators.confirmation_btn);
		finalApprovalLocators.confirmation_btn.click();
		return finalApprovalRequestNumber;
	}
	
	public void payRequestfees() throws InterruptedException {
		commonFunctions.waitElementToBevisible(finalApprovalLocators.pay_btn);
		commonFunctions.moveToWebElement(finalApprovalLocators.pay_btn);
		finalApprovalLocators.pay_btn.click();
		commonFunctions.moveToWebElement(finalApprovalLocators.payNow_btn);
		finalApprovalLocators.payNow_btn.click();
		commonFunctions.waitElementToBevisible(finalApprovalLocators.submit_btn);
		finalApprovalLocators.submit_btn.click();	
		commonFunctions.moveToWebElement(finalApprovalLocators.okay_btn);
		commonFunctions.waitElementToBevisible(finalApprovalLocators.okay_btn);
		finalApprovalLocators. okay_btn.click();
		Thread.sleep(3000);
	}
	
	
}
