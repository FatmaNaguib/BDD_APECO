package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortaPageslLocators.AdminModificationorIncreaseinTuitionFeesLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;

public class AdminModificationorIncreaseinTuitionFeesActions  extends APECOTestBase {

	CommonFunctions commonFunctions = new CommonFunctions();
	AdminModificationorIncreaseinTuitionFeesLocators  adminModificationorIncreaseinTuitionFeesLocators;
	
	public AdminModificationorIncreaseinTuitionFeesActions() throws IOException {
		
		adminModificationorIncreaseinTuitionFeesLocators  = new AdminModificationorIncreaseinTuitionFeesLocators();
		
	}

	public void employeeApprovesTheModificationorIncreaseinTuitionFeesRequest() throws AWTException, InterruptedException {
		commonFunctions.waitElementToBevisible(adminModificationorIncreaseinTuitionFeesLocators.employeeApproval_btn);
		commonFunctions.clickWebElement(adminModificationorIncreaseinTuitionFeesLocators.employeeApproval_btn);
		commonFunctions.clickWebElement(adminModificationorIncreaseinTuitionFeesLocators. save_btn);

	}
}
