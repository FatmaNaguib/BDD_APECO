package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.ModificationorIncreaseinTuitionFeesLocators;

public class ModificationorIncreaseinTuitionFeesActions  extends APECOTestBase{
	CommonFunctions commonFunctions = new CommonFunctions();
	ModificationorIncreaseinTuitionFeesLocators modificationorIncreaseinTuitionFeesLocators;
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public ModificationorIncreaseinTuitionFeesActions() throws IOException {
		 modificationorIncreaseinTuitionFeesLocators = new ModificationorIncreaseinTuitionFeesLocators();
			PageFactory.initElements(driver, modificationorIncreaseinTuitionFeesLocators);
	}

	public void enterThreeStagesSchoolFees(
			String  newTuitionfees1, String newschoolbookfees1, String newschooluniformfees1, 
			String newTuitionfees2, String newschoolbookfees2, String newschooluniformfees2,
			String newTuitionfees3, String newschoolbookfees3, String newschooluniformfees3,
			String newOneDirectionTransportationfees, String newTwoDirectionTransportationfees
			) {
		js.executeScript("window.scrollBy(0,2000)");
		commonFunctions.moveToWebElement(modificationorIncreaseinTuitionFeesLocators. newTuitionfees1_Textbox);
		modificationorIncreaseinTuitionFeesLocators. newTuitionfees1_Textbox.sendKeys( newTuitionfees1);
		modificationorIncreaseinTuitionFeesLocators.newschoolbookfees1_Textbox.sendKeys(newschoolbookfees1);
		modificationorIncreaseinTuitionFeesLocators.newschooluniformfees1_Textbox.sendKeys(newschooluniformfees1);
		
		commonFunctions.moveToWebElement(modificationorIncreaseinTuitionFeesLocators.newTuitionfees2_Textbox);
		modificationorIncreaseinTuitionFeesLocators.newTuitionfees2_Textbox.sendKeys(newTuitionfees2);
		modificationorIncreaseinTuitionFeesLocators.newschoolbookfees2_Textbox.sendKeys(newschoolbookfees2);
		modificationorIncreaseinTuitionFeesLocators.newschooluniformfees2_Textbox.sendKeys(newschooluniformfees2);
		
		commonFunctions.moveToWebElement(modificationorIncreaseinTuitionFeesLocators.newTuitionfees3_Textbox);
		modificationorIncreaseinTuitionFeesLocators.newTuitionfees3_Textbox.sendKeys(newTuitionfees3);
		modificationorIncreaseinTuitionFeesLocators.newschoolbookfees3_Textbox.sendKeys(newschoolbookfees3);
		modificationorIncreaseinTuitionFeesLocators.newschooluniformfees3_Textbox.sendKeys(newschooluniformfees3);
		commonFunctions.moveToWebElement(modificationorIncreaseinTuitionFeesLocators.newOneDirectionTransportationfeesTextbox);
		modificationorIncreaseinTuitionFeesLocators.newOneDirectionTransportationfeesTextbox.sendKeys(newOneDirectionTransportationfees);
		modificationorIncreaseinTuitionFeesLocators.newTwoDirectionTransportationfeesTextbox.sendKeys(newTwoDirectionTransportationfees);
		commonFunctions.moveToWebElement(modificationorIncreaseinTuitionFeesLocators.nextButton);
		modificationorIncreaseinTuitionFeesLocators.nextButton.click();
	}
	
	public void enterTuitionFeesAttachments(
			String officiallyLicensedAuthorizedManual, String financialReport			
			) throws InterruptedException, AWTException {
		
		commonFunctions.uploadfile(modificationorIncreaseinTuitionFeesLocators.officiallyLicensedAuthorizedManual_uploader,officiallyLicensedAuthorizedManual);
		commonFunctions.uploadfile(modificationorIncreaseinTuitionFeesLocators.financialReport_uploader,financialReport);
		commonFunctions.clickWebElement(modificationorIncreaseinTuitionFeesLocators.nextButton);
	//	modificationorIncreaseinTuitionFeesLocators.nextButton.click();
	}

	
	public void payRequestfees() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
	commonFunctions.moveToWebElement(modificationorIncreaseinTuitionFeesLocators.dataAcknowledge_Checkbox);
		//commonFunctions.clickWebElement(modificationorIncreaseinTuitionFeesLocators.dataAcknowledge_Checkbox);
	commonFunctions.waitElementToBeClickable(modificationorIncreaseinTuitionFeesLocators.dataAcknowledge_Checkbox);
		modificationorIncreaseinTuitionFeesLocators.dataAcknowledge_Checkbox.click();
		modificationorIncreaseinTuitionFeesLocators.payButton.click();
		modificationorIncreaseinTuitionFeesLocators.payNowButton.click();
		//modificationorIncreaseinTuitionFeesLocators.submit_btn.click();
		commonFunctions.clickWebElement(modificationorIncreaseinTuitionFeesLocators.submit_btn);
	}
	
	public String confirmRequest() throws InterruptedException {
		Thread.sleep(1000);
		 String msg = modificationorIncreaseinTuitionFeesLocators.confirmation_msg.getText();
		 String tuitionFeesRequestNumber  =msg.replaceAll("[^0-9]","");
		System.out.println(tuitionFeesRequestNumber);
		commonFunctions.waitElementToBevisible(modificationorIncreaseinTuitionFeesLocators.confirmation_btn);
		modificationorIncreaseinTuitionFeesLocators.confirmation_btn.click();
		return tuitionFeesRequestNumber;
	}
}
