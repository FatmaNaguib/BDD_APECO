package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.InternationalTravelLocators;

public class InternationalTravelActions  extends APECOTestBase{
 
	InternationalTravelLocators  internationalTravelLocators;
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public InternationalTravelActions() throws IOException {
		internationalTravelLocators = new InternationalTravelLocators();
		PageFactory.initElements(driver, internationalTravelLocators);
	}
	
	
public String  submitInternationalTravelRequest(String destination,  String targetedStages, String departureDate,
		String returnDateDate, String goalofTheTrip, String coordinatorName, String coordinatorPhoneNumber,String email, String dailyTripProgram, String invitation ) throws AWTException, InterruptedException {
	 internationalTravelLocators.destinationTextbox.sendKeys(destination);
	//commonFunctions.enterddlValue(approvalforInternationalTravelLocators.Curriculum_ddl, curriculum);
	commonFunctions.enterddlValue( internationalTravelLocators.targetedStages_ddl, targetedStages);
	 internationalTravelLocators.pageBody.click();
	commonFunctions.moveToWebElement( internationalTravelLocators.departureDateDatepicker);
	commonFunctions.enterddlValue( internationalTravelLocators.departureDateDatepicker, departureDate);
	commonFunctions.enterddlValue( internationalTravelLocators.returnDateDatepicker, returnDateDate);
	 internationalTravelLocators.goalofTheTripTextarea.sendKeys(goalofTheTrip);
	 internationalTravelLocators.coordinatorNameTextbox.sendKeys(coordinatorName); 
	 internationalTravelLocators.coordinatorPhoneNumberTextbox.sendKeys(coordinatorPhoneNumber);
	js.executeScript("window.scrollBy(0,3000)");
	 internationalTravelLocators.emailTextbox.sendKeys(email);
	 internationalTravelLocators.dailyTripProgramTextbox.sendKeys(dailyTripProgram);
	js.executeScript("window.scrollBy(0,3000)");
	commonFunctions.moveToWebElement( internationalTravelLocators. travelDataNext_btn);
	 internationalTravelLocators.travelDataNext_btn.click();
	 commonFunctions.moveToWebElement( internationalTravelLocators.addAttachments_btn);
	 internationalTravelLocators.addAttachments_btn.click();
	 internationalTravelLocators.attachmentExpand_btn.click();
	// commonFunctions.clickWebElement(internationalTravelLocators.attachmentExpand_btn);
	commonFunctions.uploadfile( internationalTravelLocators.invitationUploader, invitation);
	 internationalTravelLocators.attachmentsNext_btn.click();
	 internationalTravelLocators.dataAcknowledge_Checkbox.click();
	 internationalTravelLocators.submit_btn.click();
	
	//Thread.sleep(2000);
	 commonFunctions.fluentWait(internationalTravelLocators.confirmation_msg);
	 String msg =  internationalTravelLocators.confirmation_msg.getText();
	 String internationalTravelRequestNumber = msg.replaceAll("[^0-9]","");
	 //Thread.sleep(2000);
	 commonFunctions.fluentWait( internationalTravelLocators.confirmation_btn);
	 internationalTravelLocators.confirmation_btn.click();
	 return internationalTravelRequestNumber;
	
	}

}
