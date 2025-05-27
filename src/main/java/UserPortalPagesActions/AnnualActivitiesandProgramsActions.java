package UserPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.AnnualActivitiesandProgramsLocators;

public class AnnualActivitiesandProgramsActions extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	AnnualActivitiesandProgramsLocators annualActivitiesandProgramsLocators;
	
	public AnnualActivitiesandProgramsActions() throws IOException {
		annualActivitiesandProgramsLocators = new AnnualActivitiesandProgramsLocators();
		 PageFactory.initElements(driver,annualActivitiesandProgramsLocators);
	}

	public void enterRequestData(
			String coordinatorsName, String coordinatorsPhoneNo, String coordinatorsEmail	) {
		annualActivitiesandProgramsLocators.coordinatorsDataTab.click();
		annualActivitiesandProgramsLocators.coordinatorsName_TextBox.sendKeys(coordinatorsName);
		annualActivitiesandProgramsLocators.coordinatorsPhoneNumber.sendKeys(coordinatorsPhoneNo);
		annualActivitiesandProgramsLocators.coordinatorsEmail_TextBox.sendKeys(coordinatorsEmail);
		annualActivitiesandProgramsLocators.pay_btn.click();
	}
	
	public void payRequestfees() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.dataAcknowledge_Checkbox);
		annualActivitiesandProgramsLocators.dataAcknowledge_Checkbox.click();
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.pay_btn);
		annualActivitiesandProgramsLocators.pay_btn.click();
		annualActivitiesandProgramsLocators.payNow_btn.click();
		commonFunctions.implicitWait(10);
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.submit_btn);
		annualActivitiesandProgramsLocators.submit_btn.click();	
		commonFunctions.implicitWait(10);
	}
	
	
	public void enterReturnedRequestData(
			String coordinatorsName, String coordinatorsPhoneNo, String coordinatorsEmail	) {
		
		annualActivitiesandProgramsLocators.coordinatorsDataTab.click();
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.coordinatorsName_TextBox);
		annualActivitiesandProgramsLocators.coordinatorsName_TextBox.clear();
		annualActivitiesandProgramsLocators.coordinatorsName_TextBox.sendKeys(coordinatorsName);
		annualActivitiesandProgramsLocators.coordinatorsPhoneNumber.clear();
		annualActivitiesandProgramsLocators.coordinatorsPhoneNumber.sendKeys(coordinatorsPhoneNo);
		annualActivitiesandProgramsLocators.coordinatorsEmail_TextBox.clear();
		annualActivitiesandProgramsLocators.coordinatorsEmail_TextBox.sendKeys(coordinatorsEmail);
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.nextButton);
		annualActivitiesandProgramsLocators.nextButton.click();
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.dataAcknowledge_Checkbox);
		annualActivitiesandProgramsLocators.dataAcknowledge_Checkbox.click();
		commonFunctions.moveToWebElement(annualActivitiesandProgramsLocators.save_Btn);
		annualActivitiesandProgramsLocators.save_Btn.click();
		annualActivitiesandProgramsLocators.okay_btn.click();

	}
	

	public String getRequestNumber() throws InterruptedException {
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		 String msg = annualActivitiesandProgramsLocators.confirmation_msg.getText();
		 String anuannualActivitiesandProgramsmberRequestNumber = msg.replaceAll("[^0-9]","");
		 commonFunctions.waitElementToBevisible(annualActivitiesandProgramsLocators.confirmation_btn);
		annualActivitiesandProgramsLocators.confirmation_btn.click();
		return anuannualActivitiesandProgramsmberRequestNumber;
	}
	public void resubmitRequest() {
		annualActivitiesandProgramsLocators.resubmit_btn.click();
		annualActivitiesandProgramsLocators.resubmitSave_btn.click();
		commonFunctions.implicitWait(30);
	}
}
