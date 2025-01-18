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
		Thread.sleep(1000);
		annualActivitiesandProgramsLocators.submit_btn.click();	
		Thread.sleep(3000);
	}
	
	public String getRequestNumber() throws InterruptedException {
		Thread.sleep(1000);
		 String msg = annualActivitiesandProgramsLocators.confirmation_msg.getText();
		 String anuannualActivitiesandProgramsmberRequestNumber = msg.replaceAll("[^0-9]","");
	
		annualActivitiesandProgramsLocators.confirmation_btn.click();
		return anuannualActivitiesandProgramsmberRequestNumber;
	}
}
