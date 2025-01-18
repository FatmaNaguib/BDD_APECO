package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminChangeSchoolNameLocators;
import Bases.APECOTestBase;

public class AdminChangeSchoolNameActions extends APECOTestBase {
 
	AdminChangeSchoolNameLocators adminChangeSchoolNameLocators;
	public AdminChangeSchoolNameActions() throws IOException {
		adminChangeSchoolNameLocators = new AdminChangeSchoolNameLocators();
		PageFactory.initElements(driver,adminChangeSchoolNameLocators);
	}
	
	public void employeelApproval(String comments) {
		commonFunctions.waitElementToBevisible(adminChangeSchoolNameLocators.approve_btn);
		adminChangeSchoolNameLocators.approve_btn.click();
		adminChangeSchoolNameLocators.commentsTxtarea.sendKeys(comments);
		commonFunctions.waitElementToBeClickable(adminChangeSchoolNameLocators.save_btn);
		adminChangeSchoolNameLocators.save_btn.click();
	}

}
