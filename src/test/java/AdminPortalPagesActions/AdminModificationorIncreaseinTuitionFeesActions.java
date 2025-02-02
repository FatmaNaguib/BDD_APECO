package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminModificationorIncreaseinTuitionFeesLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;

public class AdminModificationorIncreaseinTuitionFeesActions  extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	AdminModificationorIncreaseinTuitionFeesLocators adminModificationorIncreaseinTuitionFeesLocators;
	
	public AdminModificationorIncreaseinTuitionFeesActions() throws IOException {
		
		adminModificationorIncreaseinTuitionFeesLocators  = new AdminModificationorIncreaseinTuitionFeesLocators();
		PageFactory.initElements(driver,adminModificationorIncreaseinTuitionFeesLocators);
	}

	public void employeeApprovesTheModificationorIncreaseinTuitionFeesRequest() throws AWTException, InterruptedException {
		
		//commonFunctions.clickWebElement(adminModificationorIncreaseinTuitionFeesLocators.employeeApproval_btn);
		adminModificationorIncreaseinTuitionFeesLocators.employeeApproval_btn.click();
		commonFunctions.clickWebElement(adminModificationorIncreaseinTuitionFeesLocators.save_btn);
		//adminAgentQueueActions.adminLogout();
		

	}
}
