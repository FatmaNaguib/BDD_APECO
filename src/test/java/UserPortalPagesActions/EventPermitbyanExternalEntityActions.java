package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.EventPermitbyanExternalEntityLocators;

public class EventPermitbyanExternalEntityActions extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	EventPermitbyanExternalEntityLocators  eventPermitbyanExternalEntityLocators;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public EventPermitbyanExternalEntityActions() throws IOException {
		super();
		eventPermitbyanExternalEntityLocators = new EventPermitbyanExternalEntityLocators();
		PageFactory.initElements(driver, eventPermitbyanExternalEntityLocators);
	}

	public void enterEventData(
			String eventType, String implementationMechanism,
			String attendeeNames, String thirdPartyName,
			String coordinatorSchoolName, String coordinatorPhoneNumber_Textbox,
			String dateFrom, String dateTo
			) {
		commonFunctions.enterddlValue(eventPermitbyanExternalEntityLocators.eventType_ddl, eventType);
		eventPermitbyanExternalEntityLocators.implementationMechanism_TextArea.sendKeys(implementationMechanism);
		eventPermitbyanExternalEntityLocators.attendeeNames_TextArea.sendKeys(attendeeNames);
		eventPermitbyanExternalEntityLocators.thirdPartyName_TextBox.sendKeys(thirdPartyName);
		eventPermitbyanExternalEntityLocators.coordinatorSchoolName_Textbox.sendKeys(coordinatorSchoolName);
		eventPermitbyanExternalEntityLocators.coordinatorPhoneNumber_Textbox.sendKeys(coordinatorPhoneNumber_Textbox);
		js.executeScript("window.scrollBy(0,500)");
		commonFunctions.enterddlValue(eventPermitbyanExternalEntityLocators.dateFrom_Datepicker,dateFrom);
		commonFunctions.moveToWebElement(eventPermitbyanExternalEntityLocators.eventdataNext_btn);
		commonFunctions.enterddlValue(eventPermitbyanExternalEntityLocators.dateTo_Datepicker,dateTo);
		eventPermitbyanExternalEntityLocators.eventdataNext_btn.click();
	}
	
	public void enterEventAttachments( String managerLetter ,String administrativeApproval) throws AWTException, InterruptedException {
		commonFunctions.uploadfile(eventPermitbyanExternalEntityLocators.managerLetter_uploader,managerLetter);
		commonFunctions.uploadfile(eventPermitbyanExternalEntityLocators.administrativeApproval_uploader,administrativeApproval);
		eventPermitbyanExternalEntityLocators.eventAttachmentsNext_btn.click();
	}
	
	public void submitEventPermitbyanExternalEntityRequest() {
		eventPermitbyanExternalEntityLocators.dataAcknowledge_Checkbox.click();
		eventPermitbyanExternalEntityLocators.submit_btn.click();
		
		 String msg = eventPermitbyanExternalEntityLocators.confirmation_msg.getText();
	
		 int number = Integer.parseInt(msg.replaceAll("[^0-9]",""));
		 System.out.println(number);
		 
		System.out.println("Hiiiiiiiiiiiiiiiiiiii"+eventPermitbyanExternalEntityLocators.confirmation_msg.getText());
		eventPermitbyanExternalEntityLocators.confirmation_btn.click();
	}
}
