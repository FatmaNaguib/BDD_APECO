package AdminPortalPagesActions;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import AdminPortaPageslLocators.AdminFinalApprovalLocators;
import Bases.APECOTestBase;

public class AdminFinalApprovalActions extends APECOTestBase {
	
	
	AdminFinalApprovalLocators adminFinalApprovalLocators;
	public AdminFinalApprovalActions() throws IOException {


		adminFinalApprovalLocators = new AdminFinalApprovalLocators();
		PageFactory.initElements(driver,adminFinalApprovalLocators);

	}

	public void reviewEmployeeRatsTheStudyPlanforTheFinalApprovalRequest() throws InterruptedException {
		
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.Approve_btn);
		adminFinalApprovalLocators.Approve_btn.click();
		adminFinalApprovalLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void reviewEmployeeScheduleMeetingForTheFinalApprovalRequest(
			String title, String date, String from, String to, String location, String description
			) throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.scheduleMeeting_btn);
		adminFinalApprovalLocators.scheduleMeeting_btn.click(); 
		adminFinalApprovalLocators.title_TextBox.sendKeys(title);
		commonFunctions.enterddlValue(adminFinalApprovalLocators.date_Datepicker,date);
		commonFunctions.enterddlValue(adminFinalApprovalLocators.from_TxtBox,from);
		commonFunctions.enterddlValue(adminFinalApprovalLocators.to_TxtBox,to);
		adminFinalApprovalLocators.location_TextBox.sendKeys(location);
		adminFinalApprovalLocators.description_TextBox.sendKeys(description);
		adminFinalApprovalLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void adminAcceptsScheduledMeeting() throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.accept_btn);
		adminFinalApprovalLocators.accept_btn.click();
		adminFinalApprovalLocators.save_btn.click();
		//adminFinalApprovalLocators.Approve_btn.click();
	//	adminFinalApprovalLocators.save_btn.click();
		Thread.sleep(1000);
		adminAgentQueueActions.adminLogout();
	}
	
	public void reviewEmployeeMeetsTheManager() throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.done_btn);
		adminFinalApprovalLocators.done_btn.click();
		adminFinalApprovalLocators.save_btn.click();
	//	adminFinalApprovalLocators.Approve_btn.click();
	//	adminFinalApprovalLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void engineerTechnicalApproval(
			String engineerApprovalLocationEn, String engineerApprovalLocationAr
			) throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.accept_btn);
		adminFinalApprovalLocators.accept_btn.click();
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.engineerApprovalLocationEn_Textbox);
		adminFinalApprovalLocators.engineerApprovalLocationEn_Textbox.clear();
		adminFinalApprovalLocators.engineerApprovalLocationEn_Textbox.sendKeys(engineerApprovalLocationEn);
		adminFinalApprovalLocators.engineerApprovalLocationAr_Textbox.clear();
		adminFinalApprovalLocators.engineerApprovalLocationAr_Textbox.sendKeys(engineerApprovalLocationAr);
		adminFinalApprovalLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void employeelApproval() throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminFinalApprovalLocators.employeeApproval_btn);
		adminFinalApprovalLocators.employeeApproval_btn.click();
		adminFinalApprovalLocators.employeeTypeofHiring_ddl.click();
		adminFinalApprovalLocators.employeeTypeofHiringValue1ddl.click();
		commonFunctions.waitElementToBeClickable(adminFinalApprovalLocators.save_btn);
		adminFinalApprovalLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	

}
