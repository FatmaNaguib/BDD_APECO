package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminChangeSchoolManagerLocators;
import Bases.APECOTestBase;

public class AdminChangeSchoolManagerActions extends APECOTestBase {
	
	private AdminChangeSchoolManagerLocators adminChangeSchoolManagerLocators;
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	public AdminChangeSchoolManagerActions() throws IOException {
		adminChangeSchoolManagerLocators = new AdminChangeSchoolManagerLocators();
		
		PageFactory.initElements(driver,adminChangeSchoolManagerLocators);
	}
	public void reviewEmployeelFinalApproval(String comment) throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminChangeSchoolManagerLocators.approve_btn);
		adminChangeSchoolManagerLocators.approve_btn.click();
		adminChangeSchoolManagerLocators.comments_TextArea.sendKeys(comment);
		commonFunctions.waitElementToBeClickable(adminChangeSchoolManagerLocators.save_btn);
		adminChangeSchoolManagerLocators.save_btn.click();
		adminAgentQueueActions.adminLogout();
	}
	
	
	
}
