package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.InternationalTravelLocators;

public class InternationalTravelActions  extends APECOTestBase{
 
	InternationalTravelLocators  InternationalTravelLocators;
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public InternationalTravelActions() throws IOException {
		super();
		InternationalTravelLocators = new InternationalTravelLocators();
		PageFactory.initElements(driver, approvalforInternationalTravelLocators);
	}
	
	//String curriculum,
	
public void submitInternationalTravelRequest(String destination,  String targetedStages, String departureDate,
		String returnDateDate, String goalofTheTrip, String coordinatorName, String coordinatorPhoneNumber,String email, String dailyTripProgram, String invitation ) throws AWTException, InterruptedException {
	approvalforInternationalTravelLocators.destinationTextbox.sendKeys(destination);
	//commonFunctions.enterddlValue(approvalforInternationalTravelLocators.Curriculum_ddl, curriculum);
	commonFunctions.enterddlValue(approvalforInternationalTravelLocators.targetedStages_ddl, targetedStages);
	approvalforInternationalTravelLocators.pageBody.click();
	commonFunctions.moveToWebElement(approvalforInternationalTravelLocators.departureDateDatepicker);
	commonFunctions.enterddlValue(approvalforInternationalTravelLocators.departureDateDatepicker, departureDate);
	commonFunctions.enterddlValue(approvalforInternationalTravelLocators.returnDateDatepicker, returnDateDate);
	InternationalTravelLocators.goalofTheTripTextarea.sendKeys(goalofTheTrip);
	approvalforInternationalTravelLocators.coordinatorNameTextbox.sendKeys(coordinatorName);
	approvalforInternationalTravelLocators.coordinatorPhoneNumberTextbox.sendKeys(coordinatorPhoneNumber);
	js.executeScript("window.scrollBy(0,3000)");
	approvalforInternationalTravelLocators.emailTextbox.sendKeys(email);
	approvalforInternationalTravelLocators.dailyTripProgramTextbox.sendKeys(dailyTripProgram);
	js.executeScript("window.scrollBy(0,3000)");
	commonFunctions.moveToWebElement(approvalforInternationalTravelLocators. travelDataNext_btn);
	approvalforInternationalTravelLocators.travelDataNext_btn.click();
	
	approvalforInternationalTravelLocators.addAttachments_btn.click();
	approvalforInternationalTravelLocators.attachmentExpand_btn.click();
	commonFunctions.uploadfile(approvalforInternationalTravelLocators.invitationUploader, invitation);
	approvalforInternationalTravelLocators.attachmentsNext_btn.click();
	
	approvalforInternationalTravelLocators.dataAcknowledge_Checkbox.click();
	approvalforInternationalTravelLocators.submit_btn.click();
	
	Thread.sleep(2000);
	 String msg = approvalforInternationalTravelLocators.confirmation_msg.getText();

	 int number = Integer.parseInt(msg.replaceAll("[^0-9]",""));
	 System.out.println(number);
	 Thread.sleep(2000);
	System.out.println(approvalforInternationalTravelLocators.confirmation_msg.getText());
	approvalforInternationalTravelLocators.confirmation_btn.click();
	
	}

}
