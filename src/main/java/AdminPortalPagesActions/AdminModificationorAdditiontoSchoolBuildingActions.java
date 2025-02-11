package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminModificationorAdditiontoSchoolBuildingLocators;
import Bases.APECOTestBase;


public class AdminModificationorAdditiontoSchoolBuildingActions extends APECOTestBase {

	AdminModificationorAdditiontoSchoolBuildingLocators adminModificationorAdditiontoSchoolBuildingLocators;
	public AdminModificationorAdditiontoSchoolBuildingActions() throws IOException {
		adminModificationorAdditiontoSchoolBuildingLocators = new AdminModificationorAdditiontoSchoolBuildingLocators();
		PageFactory.initElements(driver,adminModificationorAdditiontoSchoolBuildingLocators);
	}
	public void engineerRatsTheStudyPlanforTheModificationorAdditiontoSchoolBuildingRequest() throws InterruptedException {
		
		//Thread.sleep(1000);
		commonFunctions.fluentWait(adminModificationorAdditiontoSchoolBuildingLocators.approve_btn);
		commonFunctions.waitElementToBevisible(adminModificationorAdditiontoSchoolBuildingLocators.approve_btn);
		adminModificationorAdditiontoSchoolBuildingLocators.approve_btn.click();
		adminModificationorAdditiontoSchoolBuildingLocators.save_btn.click();
		//adminAgentQueueActions.adminLogout();
	}
	
	public void engineerCompletetheInitialTechnicalApproval(String engineerApprovalLocationEn, String engineerApprovalLocationAr	) throws InterruptedException  {
	//	Thread.sleep(1000);
		commonFunctions.fluentWait(adminModificationorAdditiontoSchoolBuildingLocators.complete_btn);
		commonFunctions.waitElementToBevisible(adminModificationorAdditiontoSchoolBuildingLocators.complete_btn);
		adminModificationorAdditiontoSchoolBuildingLocators.complete_btn.click();
		commonFunctions.waitElementToBeClickable(adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationEn_Textbox);
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationEn_Textbox.clear();
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationEn_Textbox.sendKeys(engineerApprovalLocationEn);
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationAr_Textbox.clear();
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationAr_Textbox.sendKeys(engineerApprovalLocationAr);
		adminModificationorAdditiontoSchoolBuildingLocators.save_btn.click();
		//adminAgentQueueActions.adminLogout();
	}
	
	public void engineerCompletetheInitialVisit(String engineerApprovalLocationEn, String engineerApprovalLocationAr	) throws InterruptedException {
//		commonFunctions.waitElementToBevisible(adminModificationorAdditiontoSchoolBuildingLocators.initialVisitApprove_btn);
//		adminModificationorAdditiontoSchoolBuildingLocators.approve_btn.click();
		commonFunctions.clickWebElement(adminModificationorAdditiontoSchoolBuildingLocators.initialVisitApprove_btn);
		commonFunctions.waitElementToBevisible(adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationEn_Textbox);
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationEn_Textbox.clear();
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationEn_Textbox.sendKeys(engineerApprovalLocationEn);
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationAr_Textbox.clear();
		adminModificationorAdditiontoSchoolBuildingLocators.engineerApprovalLocationAr_Textbox.sendKeys(engineerApprovalLocationAr);
		adminModificationorAdditiontoSchoolBuildingLocators.save_btn.click();
	//	adminAgentQueueActions.adminLogout();
		
	}

}
