package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminSchoolRenewalRequestDetailsLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;

public class AdminSchoolRenewalRequestDetailsActions extends APECOTestBase {

	AdminSchoolRenewalRequestDetailsLocators adminRequestDetailsLocators ;
	CommonFunctions commonFunctions = new CommonFunctions();
	public AdminSchoolRenewalRequestDetailsActions() throws IOException {
		super();
		adminRequestDetailsLocators = new AdminSchoolRenewalRequestDetailsLocators();
		PageFactory.initElements(driver, adminRequestDetailsLocators);

	}

	public void employeeApprovesTheSchoolRenewalRequest() {
		adminRequestDetailsLocators.approve_btn.click();
		adminRequestDetailsLocators.approvalSave_btn.click();
	}
}
