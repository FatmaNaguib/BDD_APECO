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

	
	public void submitPublishingAnnouncementsRequest(String channelName  ,String advertisementFile) throws AWTException, InterruptedException {
		
		
		commonFunctions.enterddlValue(publishingAnnouncementsPageLocator.channelName_ddl,channelName);
		commonFunctions.uploadfile(publishingAnnouncementsPageLocator.advertisement_uploader, advertisementFile);
		
		commonFunctions.moveToWebElement(publishingAnnouncementsPageLocator.dataAcknowledge_Checkbox);
		publishingAnnouncementsPageLocator.dataAcknowledge_Checkbox.click();
		commonFunctions.moveToWebElement(publishingAnnouncementsPageLocator.pay_btn);
		publishingAnnouncementsPageLocator.pay_btn.click();
		Thread.sleep(1000);
		publishingAnnouncementsPageLocator.submit_btn.click();
		  
		Thread.sleep(1000);
		 String msg = publishingAnnouncementsPageLocator.confirmation_msg.getText();
	
		 int number = Integer.parseInt(msg.replaceAll("[^0-9]",""));
		 System.out.println(number);
			
		System.out.println(publishingAnnouncementsPageLocator.confirmation_msg.getText());
		publishingAnnouncementsPageLocator.confirmation_btn.click();
	}
	
	
}
