
package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.CancleSchoolLicenseLocators;

public class CancleSchoolLicenseActions extends APECOTestBase{
	CommonFunctions commonFunctions = new CommonFunctions();
	CancleSchoolLicenseLocators cancleSchoolLicenseLocators;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public CancleSchoolLicenseActions() throws IOException {		
		cancleSchoolLicenseLocators = new CancleSchoolLicenseLocators();
		PageFactory.initElements(driver, cancleSchoolLicenseLocators);
	}

	
	public void resoneofSchoolCancellation(String reasonofCancellation, String  reason) {
	commonFunctions.moveToWebElement(cancleSchoolLicenseLocators.reasonofCancellation_ddl);
	commonFunctions.enterddlValue(cancleSchoolLicenseLocators.reasonofCancellation_ddl, reasonofCancellation);
	cancleSchoolLicenseLocators.reasonoTextArea.sendKeys(reason);
	cancleSchoolLicenseLocators.commitmentCheckbox.click();
	cancleSchoolLicenseLocators.studentStatusSettlementCheckbox.click();
	cancleSchoolLicenseLocators.staffStatusSettlementCheckbox.click();
	cancleSchoolLicenseLocators.licenseCancelationNext_btn.click();
	}
	public void attachSchoolCancellationAttachments(String cancellationRequestAuthorizedByLicenseHolder_uploader, String latestCommercialLicense_uploader) throws AWTException, InterruptedException {
		
		commonFunctions.uploadfile(cancleSchoolLicenseLocators.cancellationRequestAuthorizedByLicenseHolder_uploader, cancellationRequestAuthorizedByLicenseHolder_uploader);
		commonFunctions.uploadfile(cancleSchoolLicenseLocators.latestCommercialLicense_uploader, cancellationRequestAuthorizedByLicenseHolder_uploader);
		Thread.sleep(2000);
		cancleSchoolLicenseLocators.dataAcknowledge_Checkbox.click();
		cancleSchoolLicenseLocators.pay_btn.click();
		
	}
	
	public String  submitCancelSchoolLicenseRequest() throws InterruptedException {
		cancleSchoolLicenseLocators.Submit_btn.click();
		Thread.sleep(1000);
		 String msg = cancleSchoolLicenseLocators.confirmation_msg.getText();
		 String SchoolLicenseCancellationRequestNumber = msg.replaceAll("[^0-9]","");
		cancleSchoolLicenseLocators.confirmation_btn.click();
		return SchoolLicenseCancellationRequestNumber;
	}
	
}
