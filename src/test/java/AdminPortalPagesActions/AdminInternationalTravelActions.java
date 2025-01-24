package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminInternationalTravelLocators;
import Bases.APECOTestBase;

public class AdminInternationalTravelActions extends APECOTestBase {
	AdminInternationalTravelLocators adminInternationalTravelLocators;
	public AdminInternationalTravelActions() throws IOException {
		adminInternationalTravelLocators = new AdminInternationalTravelLocators();
		PageFactory.initElements(driver,adminInternationalTravelLocators);
	}
	public void employeeApprovesInternationalTravelRequest() throws InterruptedException {
		
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(adminInternationalTravelLocators.approve_btn);
		adminInternationalTravelLocators.approve_btn.click();
		adminInternationalTravelLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
}
