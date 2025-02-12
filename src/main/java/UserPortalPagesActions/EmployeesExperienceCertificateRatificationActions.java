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
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.stages_ddl);
		commonFunctions.enterddlValue(employeesExperienceCertificateRatificationLocators.stages_ddl, stages);
		employeesExperienceCertificateRatificationLocators.pageBody.click();
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.departureDateDatepicker);		
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
		Thread.sleep(2000);
		
	//	commonFunctions.implicitWait(20);
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.payNow_btn);
		//employeesExperienceCertificateRatificationLocators.payNow_btn.click();
		commonFunctions.clickWebElement(employeesExperienceCertificateRatificationLocators.payNow_btn);
		//Thread.sleep(1000);
		commonFunctions.implicitWait(20);
		//commonFunctions.fluentWait(employeesExperienceCertificateRatificationLocators.submit_btn);
		commonFunctions.waitElementToBevisible(employeesExperienceCertificateRatificationLocators.submit_btn);
		commonFunctions.moveToWebElement(employeesExperienceCertificateRatificationLocators.submit_btn);
		commonFunctions.clickWebElement(employeesExperienceCertificateRatificationLocators.submit_btn);
		//employeesExperienceCertificateRatificationLocators.submit_btn.click();
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
	}
	
	public String  getRequestNumber() throws InterruptedException {
		//Thread.sleep(1000);
		commonFunctions.fluentWait(employeesExperienceCertificateRatificationLocators.confirmation_msg);
		 String msg = employeesExperienceCertificateRatificationLocators.confirmation_msg.getText();
		String CertificationofExperienceCertificateforEmployeesRequestNumber = msg.replaceAll("[^0-9]","");
		employeesExperienceCertificateRatificationLocators.confirmation_btn.click();
		return CertificationofExperienceCertificateforEmployeesRequestNumber;
	}

}
