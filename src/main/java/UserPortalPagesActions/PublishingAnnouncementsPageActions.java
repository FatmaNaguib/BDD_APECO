package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.PublishingAnnouncementsPageLocators;

public class PublishingAnnouncementsPageActions extends APECOTestBase {

	PublishingAnnouncementsPageLocators publishingAnnouncementsPageLocator;
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public PublishingAnnouncementsPageActions() throws IOException {
		super();
		publishingAnnouncementsPageLocator = new PublishingAnnouncementsPageLocators();
		PageFactory.initElements(driver, publishingAnnouncementsPageLocator);
	}

	
	public String submitPublishingAnnouncementsRequest(String channelName  ,String advertisementFile) throws AWTException, InterruptedException {
		commonFunctions.enterddlValue(publishingAnnouncementsPageLocator.channelName_ddl,channelName);
		commonFunctions.uploadfile(publishingAnnouncementsPageLocator.advertisement_uploader, advertisementFile);
		commonFunctions.moveToWebElement(publishingAnnouncementsPageLocator.dataAcknowledge_Checkbox);
		publishingAnnouncementsPageLocator.dataAcknowledge_Checkbox.click();
		commonFunctions.moveToWebElement(publishingAnnouncementsPageLocator.pay_btn);
		publishingAnnouncementsPageLocator.pay_btn.click();
		publishingAnnouncementsPageLocator.payNow_btn.click();
		//Thread.sleep(1000);
		commonFunctions.fluentWait(publishingAnnouncementsPageLocator.submit_btn);
		publishingAnnouncementsPageLocator.submit_btn.click();
		//Thread.sleep(1000);
		commonFunctions.fluentWait(publishingAnnouncementsPageLocator.confirmation_msg);
		 String msg = publishingAnnouncementsPageLocator.confirmation_msg.getText();
		 String publishingAnnouncementsRequestNumber = msg.replaceAll("[^0-9]","");
		publishingAnnouncementsPageLocator.confirmation_btn.click();
		return publishingAnnouncementsRequestNumber;
	}	
}
