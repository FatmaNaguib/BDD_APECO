package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.SubmitaComplaintLocators;


public class SubmitaComplaintActions extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	SubmitaComplaintLocators submitaComplaintLocators;
	public SubmitaComplaintActions() throws IOException {
		submitaComplaintLocators = new SubmitaComplaintLocators();
		PageFactory.initElements(driver, submitaComplaintLocators);
	}

	public void enterApplicantData(
			String studentName, String phoneNumber
			) {
		submitaComplaintLocators.studentName_TextBox.sendKeys(studentName);
		submitaComplaintLocators.phoneNumber_ddl.clear();
		submitaComplaintLocators.phoneNumber_ddl.sendKeys(phoneNumber);
		submitaComplaintLocators.next_Btn.click();
	}
	
	public void enterComplaintData(
			String schoolName, String complaintStatement
			) {
		commonFunctions.enterddlValue(submitaComplaintLocators.school_ddl, schoolName);
		submitaComplaintLocators.complaint_TextArea.sendKeys(complaintStatement);
		submitaComplaintLocators.next_Btn.click();
	}
	
	public void enterComplaintAttachments(
			String attachments
			) throws AWTException, InterruptedException {
		submitaComplaintLocators.add_Btn.click();
		commonFunctions.uploadfile(submitaComplaintLocators.attachment_uploader, attachments);
		Thread.sleep(2000);
		submitaComplaintLocators.submit_btn.click();
	}

	
	public static int requestNumber = 0;
	public void confirmRequest() throws InterruptedException {
		Thread.sleep(3000);
		//commonFunctions.waitElement(submitaComplaintLocators.confirmation_msg);
		String msg = submitaComplaintLocators.confirmation_msg.getText();
		//String msg = webElement.getText();
		requestNumber = Integer.parseInt(msg.replaceAll("[^0-9]",""));
		 System.out.println(requestNumber);
		 //commonFunctions.waitElement(submitaComplaintLocators.confirmation_btn);
		submitaComplaintLocators.confirmation_btn.click();
			}
	
}
