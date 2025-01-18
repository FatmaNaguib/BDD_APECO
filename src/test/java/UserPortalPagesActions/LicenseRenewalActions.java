package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.LicenseRenewalLocators;


public class LicenseRenewalActions extends APECOTestBase  {
	
	LicenseRenewalLocators licenseRenewalLocators;
	 CommonFunctions commonFunctions = new CommonFunctions();
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
		public LicenseRenewalActions() throws IOException {
			super();
			licenseRenewalLocators = new LicenseRenewalLocators();
			PageFactory.initElements(driver,licenseRenewalLocators);
		}
		
		public void submitlicenseRenewalRequest(
				String schoolProfessionalLicenseAjmanEDDValid1Year ,String safetyComplianceCertificateAjmanCivilDefenseValid1Year ,
				String healthSupervisionContractValid1Year  ,String schoolClinicLicense , 
				String sphysicianPracticeLicense,String nurseLicense , 
				String buildingValidityLetterAjmanMunicipalityValid1Year, String leaseAgreementOwnershipDocumentValid ) throws AWTException, InterruptedException {
			commonFunctions.uploadfile(licenseRenewalLocators.schoolProfessionalLicenseAjmanEDDValid1Year_uploader,schoolProfessionalLicenseAjmanEDDValid1Year);
			commonFunctions.uploadfile(licenseRenewalLocators.safetyComplianceCertificateAjmanCivilDefenseValid1Year_uploader,safetyComplianceCertificateAjmanCivilDefenseValid1Year);
			commonFunctions.uploadfile(licenseRenewalLocators.healthSupervisionContractValid1Year_uploader,healthSupervisionContractValid1Year);
			commonFunctions.uploadfile(licenseRenewalLocators.schoolClinicLicense_uploader,schoolClinicLicense);
			commonFunctions.uploadfile(licenseRenewalLocators.sphysicianPracticeLicense_uploader,sphysicianPracticeLicense);
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			commonFunctions.uploadfile(licenseRenewalLocators.nurseLicense_uploader,nurseLicense );
			commonFunctions.uploadfile(licenseRenewalLocators.buildingValidityLetterAjmanMunicipalityValid1Year_uploader,buildingValidityLetterAjmanMunicipalityValid1Year);
			commonFunctions.uploadfile(licenseRenewalLocators.leaseAgreementOwnershipDocumentValid_uploader,leaseAgreementOwnershipDocumentValid);
			Thread.sleep(2000);
			licenseRenewalLocators.dataAcknowledge_Checkbox.click();
			commonFunctions.clickWebElement(licenseRenewalLocators.submit_btn);
			//licenseRenewalLocators.submit_btn.click();
			
		}
		
		public String  confirmRequestl() throws InterruptedException {
			
			Thread.sleep(1000);
			commonFunctions.waitElementToBeClickable(licenseRenewalLocators.confirmation_msg);
			String msg = licenseRenewalLocators.confirmation_msg.getText();
			 String  schoolLicenseRenewalRequestNumber = msg.replaceAll("[^0-9]","");
			licenseRenewalLocators.confirmation_btn.click();
			return schoolLicenseRenewalRequestNumber;
			
		}
		public void postPayRequestfees() throws InterruptedException {
			commonFunctions.waitElementToBevisible(licenseRenewalLocators.pay_btn);
			commonFunctions.moveToWebElement(licenseRenewalLocators.pay_btn);
			licenseRenewalLocators.pay_btn.click();
			commonFunctions.moveToWebElement(licenseRenewalLocators.payNow_btn);
			licenseRenewalLocators.payNow_btn.click();
			commonFunctions.waitElementToBevisible(licenseRenewalLocators.submit_btn);
			licenseRenewalLocators.submit_btn.click();	
			commonFunctions.moveToWebElement(licenseRenewalLocators.okay_btn);
			commonFunctions.waitElementToBevisible(licenseRenewalLocators.okay_btn);
			licenseRenewalLocators. okay_btn.click();
			Thread.sleep(3000);
}
}