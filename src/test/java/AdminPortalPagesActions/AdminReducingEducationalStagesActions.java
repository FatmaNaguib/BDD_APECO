package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminChangeSchoolLocationLocators;
import AdminPortaPageslLocators.AdminReducingEducationalStagesLocators;
import Bases.APECOTestBase;



public class AdminReducingEducationalStagesActions extends APECOTestBase {
	AdminReducingEducationalStagesLocators  adminReducingEducationalStagesLocators;
	
	public AdminReducingEducationalStagesActions() throws IOException {
		 adminReducingEducationalStagesLocators = new AdminReducingEducationalStagesLocators();
		 PageFactory.initElements(driver,  adminReducingEducationalStagesLocators);

	}
	
public void engineereRatsTheEngineeringPlanforTheModificationorAdditiontoSchoolBuildingRequest() throws InterruptedException {
		
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible( adminReducingEducationalStagesLocators.engineerRateApprove_btn);
		 adminReducingEducationalStagesLocators.engineerRateApprove_btn.click();
		 adminReducingEducationalStagesLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void employeeCompletetheInitialApproval(	) throws InterruptedException  {
		Thread.sleep(1000);
		
		commonFunctions.waitElementToBevisible(adminReducingEducationalStagesLocators.complete_btn);
		adminReducingEducationalStagesLocators.complete_btn.click();
;
		adminReducingEducationalStagesLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	

	
	public void employeeApprovestheReducingEducationalStagesRequest() throws InterruptedException {
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(adminReducingEducationalStagesLocators.approve_btn);
		adminReducingEducationalStagesLocators.approve_btn.click();
		adminReducingEducationalStagesLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	

	
}
