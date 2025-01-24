package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminAppointmentNotificationforEmployeesLocators;
import Bases.APECOTestBase;

public class AdminAppointmentNotificationforEmployeesActions extends APECOTestBase {

	AdminAppointmentNotificationforEmployeesLocators adminAppointmentNotificationforEmployeesLocators;
	public AdminAppointmentNotificationforEmployeesActions() throws IOException {
		adminAppointmentNotificationforEmployeesLocators = new AdminAppointmentNotificationforEmployeesLocators();
		PageFactory.initElements(driver,adminAppointmentNotificationforEmployeesLocators);
	}
	public void employeeApprovesTheAppointmentNotificationforEmployeesRequest() throws AWTException, InterruptedException {
		adminAppointmentNotificationforEmployeesLocators.approve_btn.click();
		commonFunctions.clickWebElement(adminAppointmentNotificationforEmployeesLocators.save_btn);
		adminAgentQueueActions.adminLogout();
	}
	
}
