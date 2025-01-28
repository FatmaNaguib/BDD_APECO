package AdminPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminInitialApprovalRequestDetailsLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;

public class AdminInitialApprovalRequestDetailsActions extends APECOTestBase  {

	AdminInitialApprovalRequestDetailsLocators adminInitialApprovalRequestDetailsLocators;
	CommonFunctions commonFunctions = new CommonFunctions();

	public AdminInitialApprovalRequestDetailsActions() throws IOException {
		
		adminInitialApprovalRequestDetailsLocators = new AdminInitialApprovalRequestDetailsLocators();
		PageFactory.initElements(driver, adminInitialApprovalRequestDetailsLocators);
	}
	
	public void employeeApprovesTheInitialApprovalRequest(String initialApprovalfile) throws AWTException, InterruptedException {
		commonFunctions.waitElementToBevisible(adminInitialApprovalRequestDetailsLocators.employeeApprove_btn);
		commonFunctions.clickWebElement(adminInitialApprovalRequestDetailsLocators.employeeApprove_btn);
		adminInitialApprovalRequestDetailsLocators.comments_TextArea.sendKeys("The Request Has Been Approved By The Employee");
		commonFunctions.approvalUploadfile(adminInitialApprovalRequestDetailsLocators.initialApprovalfile_Uploader, initialApprovalfile);
		commonFunctions.implicitWait(10);
		commonFunctions.clickWebElement(adminInitialApprovalRequestDetailsLocators.save_btn);
	}
	
	public void engineerApprovesTheInitialApprovalRequest(String engineerApprovalLocation) throws AWTException, InterruptedException {
		commonFunctions.clickWebElement(adminInitialApprovalRequestDetailsLocators.EngineerApprove_btn);
		commonFunctions.clickWebElement(adminInitialApprovalRequestDetailsLocators.save_btn);
	}

	public static String licensedSchoolName = "null";
	public String getLicensedSchoolName() throws InterruptedException {
	//	Thread.sleep(2000);
		commonFunctions.fluentWait(adminInitialApprovalRequestDetailsLocators.licensedSchoolName_Lable);
		commonFunctions.waitElementToBevisible(adminInitialApprovalRequestDetailsLocators.licensedSchoolName_Lable);
		String licensedSchoolName =adminInitialApprovalRequestDetailsLocators.licensedSchoolName_Lable.getText();
		 System.out.println(licensedSchoolName);
		 return licensedSchoolName;
	}
}
