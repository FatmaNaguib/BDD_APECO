package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminEventPermitbyanExternalEntityLocators;
import Bases.APECOTestBase;

public class AdminEventPermitbyanExternalEntityActions extends APECOTestBase {

	AdminEventPermitbyanExternalEntityLocators adminEventPermitbyanExternalEntityLocators;
	public AdminEventPermitbyanExternalEntityActions() throws IOException {

		adminEventPermitbyanExternalEntityLocators = new AdminEventPermitbyanExternalEntityLocators();
		PageFactory.initElements(driver,adminEventPermitbyanExternalEntityLocators) ;
	}
	public void adminApprovesTheEventPermitbyanExternalEntity() {
		adminEventPermitbyanExternalEntityLocators.approve_Btn.click();
		adminEventPermitbyanExternalEntityLocators.approvalSave_btn.click();
		
	}
}
