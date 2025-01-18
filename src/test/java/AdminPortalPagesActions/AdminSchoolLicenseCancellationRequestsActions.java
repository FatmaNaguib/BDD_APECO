package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminSchoolLicenseCancellationRequestsLocators;
import Bases.APECOTestBase;

public class AdminSchoolLicenseCancellationRequestsActions extends APECOTestBase{

	AdminSchoolLicenseCancellationRequestsLocators adminSchoolLicenseCancellationRequestsLocators;
	public AdminSchoolLicenseCancellationRequestsActions() throws IOException {
		adminSchoolLicenseCancellationRequestsLocators = new AdminSchoolLicenseCancellationRequestsLocators();
		PageFactory.initElements(driver, adminSchoolLicenseCancellationRequestsLocators);
	}
	
	public void employeelApproval() throws InterruptedException, IOException {
		
		// adminLoginPageActions.adminLoginurl(url);
		 //adminLoginPageActions.adminLogin(userName, Password);
//		commonFunctions.waitElementToBevisible(adminSchoolLicenseCancellationRequestsLocators.approve_btn);
//		adminSchoolLicenseCancellationRequestsLocators.approve_btn.click();
		commonFunctions.clickWebElement(adminSchoolLicenseCancellationRequestsLocators.approve_btn);
		commonFunctions.clickWebElement(adminSchoolLicenseCancellationRequestsLocators.save_btn);
//		commonFunctions.waitElementToBeClickable(adminSchoolLicenseCancellationRequestsLocators.save_btn);
//		adminSchoolLicenseCancellationRequestsLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	public void departmentManagerApproval() throws InterruptedException, IOException {
		
		// adminLoginPageActions.adminLoginurl(url);
		 //adminLoginPageActions.adminLogin(userName, Password);
//		commonFunctions.waitElementToBevisible(adminSchoolLicenseCancellationRequestsLocators.approve_btn);
//		adminSchoolLicenseCancellationRequestsLocators.approve_btn.click();
		commonFunctions.clickWebElement(adminSchoolLicenseCancellationRequestsLocators.departmentManagerApprove_btn);
		commonFunctions.clickWebElement(adminSchoolLicenseCancellationRequestsLocators.save_btn);
//		commonFunctions.waitElementToBeClickable(adminSchoolLicenseCancellationRequestsLocators.save_btn);
//		adminSchoolLicenseCancellationRequestsLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}

}
