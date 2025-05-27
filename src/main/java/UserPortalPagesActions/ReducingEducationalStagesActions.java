package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.ReducingEducationalStagesLocators;

public class ReducingEducationalStagesActions extends APECOTestBase {
	CommonFunctions commonFunctions = new CommonFunctions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	ReducingEducationalStagesLocators reducingEducationalStagesLocators;
	
	public ReducingEducationalStagesActions() throws IOException {
		reducingEducationalStagesLocators = new ReducingEducationalStagesLocators();
		PageFactory.initElements(driver,reducingEducationalStagesLocators);
	}
	
	public void selectEducationalStages() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		reducingEducationalStagesLocators.firstEducationalStageCheckBox.click();
		Thread.sleep(1000);
		reducingEducationalStagesLocators.nextButton.click();
	}

	public void reducingEducationalStagesAttachments(
			String officialLetter, String currentEngineeringPlanApproved, 
			String newEngineeringPlanIssued, String landMap
			) throws AWTException, InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.uploadfile(reducingEducationalStagesLocators.officialDocumentSignedByLicenseHolderUploader, officialLetter);
		commonFunctions.uploadfile(reducingEducationalStagesLocators.currentEngineeringPlanApprovedUploader, currentEngineeringPlanApproved);
		commonFunctions.uploadfile(reducingEducationalStagesLocators. newEngineeringPlanIssuedUploader,newEngineeringPlanIssued);
		commonFunctions.uploadfile(reducingEducationalStagesLocators.landMapUploader,landMap);
		//Thread.sleep(2000);
		commonFunctions.implicitWait(20);
	}
	
	public void submitRequest() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		//commonFunctions.fluentWait(reducingEducationalStagesLocators.dataAcknowledge_Checkbox);
		commonFunctions.moveToWebElement(reducingEducationalStagesLocators.dataAcknowledge_Checkbox);
		reducingEducationalStagesLocators.dataAcknowledge_Checkbox.click();
		reducingEducationalStagesLocators.submitButton.click();
	}
	
	public String getRequestNumber() throws InterruptedException {
		//Thread.sleep(1000);
		commonFunctions.fluentWait(reducingEducationalStagesLocators.confirmation_msg);
		 String msg =reducingEducationalStagesLocators.confirmation_msg.getText();
		 String reducingEducationalStagesRequestNumber = msg.replaceAll("[^0-9]","");
		reducingEducationalStagesLocators.confirmation_btn.click();
		return reducingEducationalStagesRequestNumber;
	}
	
	public void postPayRequestfees() throws InterruptedException {
		
		commonFunctions.waitElementToBevisible(reducingEducationalStagesLocators.postPay_btn);
		commonFunctions.moveToWebElement(reducingEducationalStagesLocators.postPay_btn);
		reducingEducationalStagesLocators.postPay_btn.click();
		Thread.sleep(1000);
		commonFunctions.moveToWebElement(reducingEducationalStagesLocators.payNow_btn);
		commonFunctions.clickWebElement(reducingEducationalStagesLocators.payNow_btn);
		//reducingEducationalStagesLocators.payNow_btn.click();
		commonFunctions.waitElementToBevisible(reducingEducationalStagesLocators.submit_btn);
		commonFunctions.moveToWebElement(reducingEducationalStagesLocators.submit_btn);
		reducingEducationalStagesLocators.submit_btn.click();	
		commonFunctions.moveToWebElement(reducingEducationalStagesLocators.okay_btn);
		commonFunctions.waitElementToBevisible(reducingEducationalStagesLocators.okay_btn);
		reducingEducationalStagesLocators.okay_btn.click();
		//Thread.sleep(3000);
		commonFunctions.implicitWait(30);
		
	}
}
