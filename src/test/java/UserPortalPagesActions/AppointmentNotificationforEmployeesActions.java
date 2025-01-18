package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import UserPortalPagesLocators.AppointmentNotificationforEmployeesLocators;

public class AppointmentNotificationforEmployeesActions  extends APECOTestBase{
	
	AppointmentNotificationforEmployeesLocators appointmentNotificationforEmployeesLocators;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public AppointmentNotificationforEmployeesActions() throws IOException {
		super();
		 appointmentNotificationforEmployeesLocators = new AppointmentNotificationforEmployeesLocators();
		 PageFactory.initElements(driver, appointmentNotificationforEmployeesLocators);
	}
	
	public void enterEmployeesGeneralData(	String typeofHiring) {
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.typeofHiring_ddl, typeofHiring);
		appointmentNotificationforEmployeesLocators.basicCandidateData_btn.click();
	}

	public void enterBasicCandidateData(
			String employeeName, String empolyeeNationality,
			String empolyeeGender, String teachingSubject,
			String Curriculum, String grades, String appliedPosition,
			String maritalStatus, String birthDate, String placeOfBirth,
			String idCardNumber, String idCardExpirationDate,
			String passportNumber, String passportExpirationDate,
			String religion, String esidencyExpirationDate, String addressInsideCountry,
			String email, String phoneNumber
			) {
		appointmentNotificationforEmployeesLocators.employeeNameTextBox.sendKeys(employeeName);
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.empolyeeNationality_ddl, empolyeeNationality);
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.empolyeeGender_ddl, empolyeeGender);
		appointmentNotificationforEmployeesLocators.teachingSubjectTextBox.sendKeys(teachingSubject);
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.curriculum_ddl,Curriculum);
		appointmentNotificationforEmployeesLocators.appointmentNotificationforEmployeesBody.click();
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.grades_ddl,grades);
		appointmentNotificationforEmployeesLocators.appointmentNotificationforEmployeesBody.click();
		
		appointmentNotificationforEmployeesLocators.appliedPosition_TextBox.sendKeys(appliedPosition);
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.maritalStatus_ddl);
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.maritalStatus_ddl,maritalStatus);
		appointmentNotificationforEmployeesLocators.birthDate_Calendar.sendKeys(birthDate);
		appointmentNotificationforEmployeesLocators.placeOfBirthTextBox.sendKeys(placeOfBirth);
		appointmentNotificationforEmployeesLocators.idCardNumber_TextBox.sendKeys(idCardNumber);
		appointmentNotificationforEmployeesLocators.idCardExpirationDate_TextBox.sendKeys(idCardExpirationDate);
		appointmentNotificationforEmployeesLocators.passportNumber_TextBox.sendKeys(passportNumber);
		appointmentNotificationforEmployeesLocators.passportExpirationDate_Calendar.sendKeys(passportExpirationDate);
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.religion_ddl);
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.religion_ddl,religion);
		appointmentNotificationforEmployeesLocators.residencyExpirationDate_Calendar.sendKeys(esidencyExpirationDate);
		appointmentNotificationforEmployeesLocators.addressInsideCountry_TextBox.sendKeys(addressInsideCountry);
		appointmentNotificationforEmployeesLocators.email_TextBox.sendKeys(email);
		appointmentNotificationforEmployeesLocators.phoneNumber_TextBox.sendKeys(phoneNumber);
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.qualifications_tab);
		appointmentNotificationforEmployeesLocators.qualifications_tab.click();
	}
	
	public void enterEmployeeQualificationsData(
			String qualification,	String specialization,
			String qualificationDate, String certificateIssuingAuthority, 
			String scientificQualification, String equivalencyAcademicQualificationOrPaymentReceipt, String authenticationAcademicQualifications
			
			) throws InterruptedException, AWTException {
		
		
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.qualifications_tab);
		appointmentNotificationforEmployeesLocators.qualifications_tab.click();
		
		commonFunctions.enterddlValue(appointmentNotificationforEmployeesLocators.qualification_ddl,qualification);
		appointmentNotificationforEmployeesLocators.specialization_TextBox.sendKeys(specialization);
		appointmentNotificationforEmployeesLocators.qualificationDate_Calendar.sendKeys(qualificationDate);
		appointmentNotificationforEmployeesLocators.certificateIssuingAuthority_Textbox.sendKeys(certificateIssuingAuthority);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.scientificQualification_uploader, scientificQualification);
		commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.equivalencyAcademicQualificationOrPaymentReceipt_uploader, equivalencyAcademicQualificationOrPaymentReceipt);
		commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators. authenticationAcademicQualifications_uploader, authenticationAcademicQualifications);
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.previousExperience_btn);
	
		appointmentNotificationforEmployeesLocators.previousExperience_btn.click();
		Thread.sleep(1000);
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.managerDataNext_btn);
		appointmentNotificationforEmployeesLocators. managerDataNext_btn.click();		
	}
	public void uploadEmployeeAttachments(
			String coloredPassport, String coloredNationalID,
			String administrativeApproval, String certificateOfGoodConduct,
			String profilePicture, String sponsorLetter, String appointmentInterviewPassDocument
			
			) throws AWTException, InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.waitElementToBevisible(appointmentNotificationforEmployeesLocators.coloredPassport_uploader);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.coloredPassport_uploader, coloredPassport);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.coloredNationalID_uploader,coloredNationalID);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.administrativeApproval_uploader,administrativeApproval);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.certificateOfGoodConduct_uploader,certificateOfGoodConduct);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.profilePicture_uploader,profilePicture);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.sponsorLetter_uploader,sponsorLetter);
				commonFunctions.uploadfile(appointmentNotificationforEmployeesLocators.appointmentInterviewPassDocument_uploader,appointmentInterviewPassDocument);
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,500)");
				commonFunctions.clickWebElement(appointmentNotificationforEmployeesLocators.attachmentsNxt_btn);
				//commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.attachmentsNxt_btn);
				//appointmentNotificationforEmployeesLocators.attachmentsNxt_btn.click();
	}
	public void payRequestfees() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.dataAcknowledge_Checkbox);
		appointmentNotificationforEmployeesLocators.dataAcknowledge_Checkbox.click();
		appointmentNotificationforEmployeesLocators.pay_btn.click();
		commonFunctions.waitElementToBevisible(appointmentNotificationforEmployeesLocators.payNow_btn);
		Thread.sleep(1000);
	//	js.executeScript("window.scrollBy(0,2000)");
		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.payNow_btn);
		appointmentNotificationforEmployeesLocators.payNow_btn.click();
		Thread.sleep(2000);
		commonFunctions.waitElementToBevisible(appointmentNotificationforEmployeesLocators.submit_btn);
		//commonFunctions.clickWebElement(appointmentNotificationforEmployeesLocators.payNow_btn);
		//appointmentNotificationforEmployeesLocators.payNow_btn.click();

		commonFunctions.moveToWebElement(appointmentNotificationforEmployeesLocators.submit_btn);
		
		commonFunctions.clickWebElement(appointmentNotificationforEmployeesLocators.submit_btn);
	}
	
	public String getRequestNumber() throws InterruptedException {
		Thread.sleep(3000);
		
		commonFunctions.waitElementToBevisible(appointmentNotificationforEmployeesLocators.confirmation_msg);
		 String msg = appointmentNotificationforEmployeesLocators.confirmation_msg.getText();
		 String apointmentNotificationforEmployeesRequestNumber = msg.replaceAll("[^0-9]","");
		appointmentNotificationforEmployeesLocators.confirmation_btn.click();
		return apointmentNotificationforEmployeesRequestNumber;
	}
	
}
