package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminAddingEducationalStagesLocators;
import Bases.APECOTestBase;

public class AdminAddingEducationalStagesActions  extends APECOTestBase  {
	
	AdminAddingEducationalStagesLocators adminAddingEducationalStagesLocators;
	
	public AdminAddingEducationalStagesActions() throws IOException {
		adminAddingEducationalStagesLocators = new AdminAddingEducationalStagesLocators();
		PageFactory.initElements(driver, adminAddingEducationalStagesLocators);
	}
	
	public void engineerCompleteinitsInitialFiles() throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminAddingEducationalStagesLocators.approveandcompleteinitialfiles_Btn);
		adminAddingEducationalStagesLocators.approveandcompleteinitialfiles_Btn.click();
		adminAddingEducationalStagesLocators.save_btn.click();
		//adminAgentQueueActions.adminLogout();
	}
	public void adminApproves() throws InterruptedException {
		commonFunctions.clickWebElement(adminAddingEducationalStagesLocators.approve_btn);	
		adminAddingEducationalStagesLocators.save_btn.click();
		//adminAgentQueueActions.adminLogout();
	}
	
	
}
