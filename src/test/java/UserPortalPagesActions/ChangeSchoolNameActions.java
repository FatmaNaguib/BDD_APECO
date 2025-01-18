package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;

import UserPortalPagesLocators.ChangeSchoolNameLocators;


public class ChangeSchoolNameActions extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	ChangeSchoolNameLocators changeSchoolNameLocators;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public ChangeSchoolNameActions() throws IOException {
		
		changeSchoolNameLocators = new ChangeSchoolNameLocators();
		PageFactory.initElements(driver, changeSchoolNameLocators);
	}

	
	public void submitChangeSchoolNameRequest(
			String newSchoolNameEn, String newSchoolNameAr,
		
			String reservationfileforTheNewSchoolName, String officialletterfromtheLicenseHolderRegardingNameChange ) throws AWTException, InterruptedException {
		changeSchoolNameLocators.newSchoolNameEn_textBox.sendKeys(newSchoolNameEn);
		changeSchoolNameLocators.newSchoolNameAr_textBox.sendKeys(newSchoolNameAr);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.uploadfile(changeSchoolNameLocators.newSchoolNameReservationFile_uploader,reservationfileforTheNewSchoolName);
		commonFunctions.uploadfile(changeSchoolNameLocators.licenseHolderNameChangeLetter_uploader,officialletterfromtheLicenseHolderRegardingNameChange);
		Thread.sleep(2000);
	}
	
	public void payRequestfees() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(changeSchoolNameLocators.dataAcknowledge_Checkbox);
		changeSchoolNameLocators.dataAcknowledge_Checkbox.click();
		commonFunctions.waitElementToBeClickable(changeSchoolNameLocators.pay_btn);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(changeSchoolNameLocators.pay_btn);
		changeSchoolNameLocators.pay_btn.click();
		Thread.sleep(2000);
		commonFunctions.waitElementToBevisible(changeSchoolNameLocators.payNow_btn);
		changeSchoolNameLocators.payNow_btn.click();
		changeSchoolNameLocators.submit_btn.click();
	
	}
	

	public String confirmRequest() throws InterruptedException {
		commonFunctions.waitElementToBevisible(changeSchoolNameLocators.confirmation_msg);
		 String msg = changeSchoolNameLocators.confirmation_msg.getText();
		 String  changeSchoolNameRequestNumber =msg.replaceAll("[^0-9]","");	
		commonFunctions.clickWebElement(changeSchoolNameLocators.confirmation_btn);
	//	commonFunctions.waitElementToBevisible(changeSchoolNameLocators.confirmation_btn);
		//changeSchoolNameLocators.confirmation_btn.click();
		return changeSchoolNameRequestNumber;
	}
	
}
