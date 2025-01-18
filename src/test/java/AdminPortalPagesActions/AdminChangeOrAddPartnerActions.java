package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminChangeOrAddPartnerLocators;
import Bases.APECOTestBase;

public class AdminChangeOrAddPartnerActions extends APECOTestBase {

	AdminChangeOrAddPartnerLocators adminChangeOrAddPartnerLocators;
	public AdminChangeOrAddPartnerActions() throws IOException {
		adminChangeOrAddPartnerLocators = new AdminChangeOrAddPartnerLocators();
		PageFactory.initElements(driver, adminChangeOrAddPartnerLocators);
	}

	public void employeeApprovesTheChangeOrAddPartnerApprovalRequest() throws AWTException, InterruptedException {
		commonFunctions.waitElementToBevisible(adminChangeOrAddPartnerLocators.review_btn);
		commonFunctions.clickWebElement(adminChangeOrAddPartnerLocators.review_btn);
		commonFunctions.clickWebElement(adminChangeOrAddPartnerLocators.save_btn);
		adminAgentQueueActions.adminLogout();
	}
	
	public void employeemployeeUploadSecurityPermitRequest(String initialApprovalfile) throws AWTException, InterruptedException {
		commonFunctions.waitElementToBevisible(adminChangeOrAddPartnerLocators.approve_btn);
		commonFunctions.clickWebElement(adminChangeOrAddPartnerLocators.approve_btn);
		//adminInitialApprovalRequestDetailsLocators.employeeApprove_btn.click();
		adminChangeOrAddPartnerLocators.comments_TextArea.sendKeys("The Request Has Been Approved By The Employee");
		commonFunctions.uploadfile(adminChangeOrAddPartnerLocators.initialApprovalfile_Uploader, initialApprovalfile);
		commonFunctions.clickWebElement(adminChangeOrAddPartnerLocators.save_btn);
		adminAgentQueueActions.adminLogout();
	}
	
	
}
