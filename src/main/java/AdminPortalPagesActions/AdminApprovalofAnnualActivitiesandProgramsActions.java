package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import AdminPortaPageslLocators.AdminApprovalofAnnualActivitiesandProgramsLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;

public class AdminApprovalofAnnualActivitiesandProgramsActions  extends APECOTestBase{
	CommonFunctions commonFunctions = new CommonFunctions();
	AdminApprovalofAnnualActivitiesandProgramsLocators adminApprovalofAnnualActivitiesandProgramsLocators ;
	
	public AdminApprovalofAnnualActivitiesandProgramsActions() throws IOException {
		adminApprovalofAnnualActivitiesandProgramsLocators = new AdminApprovalofAnnualActivitiesandProgramsLocators();
		PageFactory.initElements(driver,adminApprovalofAnnualActivitiesandProgramsLocators);
	}
	
	public  void employeeApprovesTheApprovalofAnnualActivitiesandProgramsRequest() throws AWTException, InterruptedException {
		
		adminApprovalofAnnualActivitiesandProgramsLocators.employeeApproval_btn.click();
		commonFunctions.clickWebElement(adminApprovalofAnnualActivitiesandProgramsLocators.save_btn);
		//adminAgentQueueActions.adminLogout();

	}
	public  void employeeApprovesTheReturnedAnnualActivitiesandProgramsRequest() throws AWTException, InterruptedException {
		
		adminApprovalofAnnualActivitiesandProgramsLocators.returnedApproval_btn.click();
		commonFunctions.clickWebElement(adminApprovalofAnnualActivitiesandProgramsLocators.save_btn);
		//adminAgentQueueActions.adminLogout();

	}
	
public void employeeRejectsTheApprovalofAnnualActivitiesandProgramsRequest() {
	
	commonFunctions.waitElementToBevisible(adminApprovalofAnnualActivitiesandProgramsLocators.employeeReject_btn);
	adminApprovalofAnnualActivitiesandProgramsLocators.employeeReject_btn.click();
	adminApprovalofAnnualActivitiesandProgramsLocators.employeeAction_ddl.click();
	adminApprovalofAnnualActivitiesandProgramsLocators.employeeActionValue1ddl.click();
	commonFunctions.waitElementToBeClickable(adminApprovalofAnnualActivitiesandProgramsLocators.save_btn);
	adminApprovalofAnnualActivitiesandProgramsLocators.save_btn.click();
}

public void employeeReturnsTheApprovalofAnnualActivitiesandProgramsRequest() {
	
	commonFunctions.waitElementToBevisible(adminApprovalofAnnualActivitiesandProgramsLocators.employeeReturn_btn);
	adminApprovalofAnnualActivitiesandProgramsLocators.employeeReturn_btn.click();
	adminApprovalofAnnualActivitiesandProgramsLocators.employeeAction_ddl.click();
	adminApprovalofAnnualActivitiesandProgramsLocators.employeeActionValue1ddl.click();
	commonFunctions.waitElementToBeClickable(adminApprovalofAnnualActivitiesandProgramsLocators.save_btn);
	adminApprovalofAnnualActivitiesandProgramsLocators.save_btn.click();
}
	
}
