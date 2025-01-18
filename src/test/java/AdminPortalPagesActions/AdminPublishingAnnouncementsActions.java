package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminPublishingAnnouncementsLocators;
import Bases.APECOTestBase;

public class AdminPublishingAnnouncementsActions extends APECOTestBase {

	AdminPublishingAnnouncementsLocators adminPublishingAnnouncementsLocators; 
	public AdminPublishingAnnouncementsActions() throws IOException {
		super();
		 adminPublishingAnnouncementsLocators = new AdminPublishingAnnouncementsLocators();
			PageFactory.initElements(driver, adminPublishingAnnouncementsLocators);
	}
	
	public void adminApprovesThePublishingAnnouncementsRequest() {
		adminPublishingAnnouncementsLocators.approve_btn.click();
		adminPublishingAnnouncementsLocators.approvalSave_btn.click();
	}

}
