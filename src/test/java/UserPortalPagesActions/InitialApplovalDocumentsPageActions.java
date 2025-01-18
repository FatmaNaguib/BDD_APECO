package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.InitialApplovalDocumentsPageLocators;



public class InitialApplovalDocumentsPageActions extends APECOTestBase  {

	InitialApplovalDocumentsPageLocators initialApplovalDocumentsPageLocators;
	
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public InitialApplovalDocumentsPageActions() throws IOException {
		initialApplovalDocumentsPageLocators = new InitialApplovalDocumentsPageLocators();
		PageFactory.initElements(driver,  initialApplovalDocumentsPageLocators);
	}

	public void downloadDocument() throws InterruptedException {
		
		Thread.sleep(1000);
		initialApplovalDocumentsPageLocators.downloadPopup_btn.click();
		Thread.sleep(1000);
		initialApplovalDocumentsPageLocators.downloadDocNext_btn.click();
	}

	public void uploadDocument(String docAttachment) throws AWTException, InterruptedException {
		commonFunctions.uploadfile(initialApplovalDocumentsPageLocators.attachment_uploader, docAttachment);
		commonFunctions.waitElementToBeClickable(initialApplovalDocumentsPageLocators.attachmentsNext_btn);
		commonFunctions.moveToWebElement(initialApplovalDocumentsPageLocators.attachmentsNext_btn);
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.waitElementToBeClickable(initialApplovalDocumentsPageLocators.attachmentsNext_btn);
		initialApplovalDocumentsPageLocators.attachmentsNext_btn.click();
	}
	
	public void payRequestfees() throws InterruptedException {
		//js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(initialApplovalDocumentsPageLocators.dataAcknowledge_Checkbox);
		initialApplovalDocumentsPageLocators.dataAcknowledge_Checkbox.click();
		commonFunctions.moveToWebElement(initialApplovalDocumentsPageLocators.pay_btn);
		initialApplovalDocumentsPageLocators.pay_btn.click();
//		commonFunctions.waitElementToBevisible(initialApplovalDocumentsPageLocators.payNow_btn);
//		initialApplovalDocumentsPageLocators.payNow_btn.click();
		commonFunctions.clickWebElement(initialApplovalDocumentsPageLocators.payNow_btn);
		commonFunctions.waitElementToBevisible(initialApplovalDocumentsPageLocators.submit_btn);
		commonFunctions.moveToWebElement(initialApplovalDocumentsPageLocators.submit_btn);
		initialApplovalDocumentsPageLocators.submit_btn.click();	
		Thread.sleep(3000);
	}
	
	public int confirmRequest() throws InterruptedException {
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(initialApplovalDocumentsPageLocators.confirmation_msg);
		 String msg = initialApplovalDocumentsPageLocators.confirmation_msg.getText();
		 int requestNumber = Integer.parseInt(msg.replaceAll("[^0-9]",""));
		 System.out.println(requestNumber);
		 commonFunctions.moveToWebElement(initialApplovalDocumentsPageLocators.confirmation_btn);
		 //commonFunctions.waitElementToBevisible(initialApplovalDocumentsPageLocators.confirmation_btn);
		initialApplovalDocumentsPageLocators.confirmation_btn.click();
		return requestNumber;
	}
}
	
	
