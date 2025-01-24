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
		adminAgentQueueActions.adminLogout();

	}
}
