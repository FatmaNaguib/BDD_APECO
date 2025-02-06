package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminEmployeesExperienceCertificateRatificationLocators;
import Bases.APECOTestBase;

public class AdminEmployeesExperienceCertificateRatificationActions  extends APECOTestBase {
	AdminEmployeesExperienceCertificateRatificationLocators adminEmployeesExperienceCertificateRatificationLocators;
	public AdminEmployeesExperienceCertificateRatificationActions() throws IOException {
		adminEmployeesExperienceCertificateRatificationLocators = new AdminEmployeesExperienceCertificateRatificationLocators();
		PageFactory.initElements(driver,adminEmployeesExperienceCertificateRatificationLocators);
	}
	public  void employeeApprovesTheEmployeesExperienceCertificateRatificationRequest() throws AWTException, InterruptedException {
		
		adminEmployeesExperienceCertificateRatificationLocators.employeeApproval_btn.click();
		commonFunctions.clickWebElement(adminEmployeesExperienceCertificateRatificationLocators.save_btn);
		adminAgentQueueActions.adminLogout();

	}
}
