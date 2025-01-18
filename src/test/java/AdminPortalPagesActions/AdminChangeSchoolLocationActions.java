package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminChangeSchoolLocationLocators;

import Bases.APECOTestBase;

public class AdminChangeSchoolLocationActions  extends APECOTestBase{

	AdminChangeSchoolLocationLocators adminChangeSchoolLocationLocators;
	public AdminChangeSchoolLocationActions() throws IOException {
		adminChangeSchoolLocationLocators = new AdminChangeSchoolLocationLocators();
		 PageFactory.initElements(driver, adminChangeSchoolLocationLocators);
		 
	}
	
public void engineerRatsTheStudyPlanforTheModificationorAdditiontoSchoolBuildingRequest() throws InterruptedException {
		
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(adminChangeSchoolLocationLocators.engineerRateApprove_btn);
		adminChangeSchoolLocationLocators.engineerRateApprove_btn.click();
		adminChangeSchoolLocationLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void engineerCompletetheInitialTechnicalApproval(String engineerApprovalLocationEn, String engineerApprovalLocationAr	) throws InterruptedException  {
		Thread.sleep(1000);
		
		commonFunctions.waitElementToBevisible(adminChangeSchoolLocationLocators.complete_btn);
		adminChangeSchoolLocationLocators.complete_btn.click();
		commonFunctions.waitElementToBeClickable(adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox);
		adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox.clear();
		adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox.sendKeys(engineerApprovalLocationEn);
		adminChangeSchoolLocationLocators.engineerApprovalLocationAr_Textbox.clear();
		adminChangeSchoolLocationLocators.engineerApprovalLocationAr_Textbox.sendKeys(engineerApprovalLocationAr);
		adminChangeSchoolLocationLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void engineerCompletetheInitialVisit(String engineerApprovalLocationEn, String engineerApprovalLocationAr	) throws InterruptedException {
//		commonFunctions.waitElementToBevisible(adminModificationorAdditiontoSchoolBuildingLocators.initialVisitApprove_btn);
//		adminModificationorAdditiontoSchoolBuildingLocators.approve_btn.click();
		commonFunctions.clickWebElement(adminChangeSchoolLocationLocators.initialVisitApprove_btn);
		commonFunctions.waitElementToBevisible(adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox);
		adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox.clear();
		adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox.sendKeys(engineerApprovalLocationEn);
		adminChangeSchoolLocationLocators.engineerApprovalLocationAr_Textbox.clear();
		adminChangeSchoolLocationLocators.engineerApprovalLocationAr_Textbox.sendKeys(engineerApprovalLocationAr);
		adminChangeSchoolLocationLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
		
	}
	
	public void employeeApprovestheChangeSchoolLocatiolRequest() throws InterruptedException {
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(adminChangeSchoolLocationLocators.approve_btn);
		adminChangeSchoolLocationLocators.approve_btn.click();
//		adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox.clear();
//		adminChangeSchoolLocationLocators.engineerApprovalLocationEn_Textbox.sendKeys(engineerApprovalLocationEn);
//		adminChangeSchoolLocationLocators.engineerApprovalLocationAr_Textbox.clear();
//		adminChangeSchoolLocationLocators.engineerApprovalLocationAr_Textbox.sendKeys(engineerApprovalLocationAr);
		adminChangeSchoolLocationLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	

}
