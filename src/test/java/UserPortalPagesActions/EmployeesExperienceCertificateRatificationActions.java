package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.EmployeesExperienceCertificateRatificationLocators;


public class EmployeesExperienceCertificateRatificationActions extends APECOTestBase{

	CommonFunctions commonFunctions = new CommonFunctions();
	EmployeesExperienceCertificateRatificationLocators  employeesExperienceCertificateRatificationLocators;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public EmployeesExperienceCertificateRatificationActions() throws IOException {
		employeesExperienceCertificateRatificationLocators = new EmployeesExperienceCertificateRatificationLocators();
		PageFactory.initElements(driver, employeesExperienceCertificateRatificationLocators);
	}
	
	public void enterExperienceCertificateData(
			String employeeNameEng, String employeeNameAr, String specializationEng, String specializationAr,
			String jobTitleEng,String jobTitleAr,  String curriculum, String stages,
			String departureDateDate, String returnDate
			) {
		employeesExperienceCertificateRatificationLocators.employeeData_tab.click();
		employeesExperienceCertificateRatificationLocators.employeeNameEng_Textbox.sendKeys(employeeNameEng);
		employeesExperienceCertificateRatificationLocators.employeeNameAr_Textbox.sendKeys(employeeNameAr);
		
		employeesExperienceCertificateRatificationLocators.specializationEng_Textbox.sendKeys(specializationEng);
		employeesExperienceCertificateRatificationLocators.specializationAr_Textbox.sendKeys(specializationAr);
		employeesExperienceCertificateRatificationLocators.jobTitleEng.sendKeys(jobTitleEng);
		employeesExperienceCertificateRatificationLocators.jobTitleAr.sendKeys(jobTitleAr);	
		commonFunctions.enterddlValue(employeesExperienceCertificateRatificationLocators.curriculum_ddl, curriculum);
		commonFunctions.enterddlValue(employeesExperienceCertificateRatificationLocators.stages_ddl, stages);
		employeesExperienceCertificateRatificationLocators.pageBody.click();
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.departureDateDatepicker);
		//js.executeScript("window.scrollBy(0,1000)");
		
		commonFunctions.enterddlValue(employeesExperienceCertificateRatificationLocators.departureDateDatepicker,departureDateDate);
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.departureDateDatepicker);
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.experienceCertificateAttachmentsNext_btn);
		commonFunctions.enterddlValue(employeesExperienceCertificateRatificationLocators.returnDateDatepicker,returnDate);
		employeesExperienceCertificateRatificationLocators.experienceCertificateAttachmentsNext_btn.click();
	}
	
	public void enterExperienceCertificateAttachments(String nationalID, String recruitmentNotification) throws AWTException, InterruptedException {
		commonFunctions.uploadfile(employeesExperienceCertificateRatificationLocators.nationalID_Uploader, nationalID);
		commonFunctions.uploadfile(employeesExperienceCertificateRatificationLocators.recruitmentNotification_Uploader,recruitmentNotification);
		employeesExperienceCertificateRatificationLocators.experienceCertificateAttachmentsNext_btn.click();
	}
	
	public void payExperienceCertificateRequestRequestfees() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.dataAcknowledge_Checkbox);
		employeesExperienceCertificateRatificationLocators.dataAcknowledge_Checkbox.click();
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.pay_btn);
		employeesExperienceCertificateRatificationLocators.pay_btn.click();
		employeesExperienceCertificateRatificationLocators.payNow_btn.click();
		Thread.sleep(1000);
		employeesExperienceCertificateRatificationLocators.submit_btn.click();
		Thread.sleep(1000);
	}
	
	public int getRequestNumber() throws InterruptedException {
		Thread.sleep(1000);
		 String msg = employeesExperienceCertificateRatificationLocators.confirmation_msg.getText();
		 int number = Integer.parseInt(msg.replaceAll("[^0-9]",""));
		System.out.println(employeesExperienceCertificateRatificationLocators.confirmation_msg.getText());
		employeesExperienceCertificateRatificationLocators.confirmation_btn.click();
		System.out.println(number);
		return number;
	}

}
