package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LicenseRenewalLocators {

	@FindBy (xpath ="//input[@id=\"schoolProfessionalLicenseAjmanEDDValid1Year\"]")public WebElement schoolProfessionalLicenseAjmanEDDValid1Year_uploader;
	@FindBy (xpath ="//input[@id=\"safetyComplianceCertificateAjmanCivilDefenseValid1Year\"]")public WebElement safetyComplianceCertificateAjmanCivilDefenseValid1Year_uploader;
	@FindBy (xpath ="//input[@id=\"healthSupervisionContractValid1Year\"]")public WebElement healthSupervisionContractValid1Year_uploader;
	@FindBy (xpath ="//input[@id=\"schoolClinicLicense\"]")public WebElement schoolClinicLicense_uploader;	
	@FindBy (xpath ="//input[@id=\"physicianPracticeLicense\"]")public WebElement sphysicianPracticeLicense_uploader;
	
	@FindBy (xpath ="//input[@id=\"nurseLicense\"]")public WebElement nurseLicense_uploader;
	@FindBy (xpath ="//input[@id=\"buildingValidityLetterAjmanMunicipalityValid1Year\"]")public WebElement buildingValidityLetterAjmanMunicipalityValid1Year_uploader;

	@FindBy (xpath ="//input[@id=\"leaseAgreementOwnershipDocumentValid\"]")public WebElement leaseAgreementOwnershipDocumentValid_uploader;
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//button[@class=\"ant-btn ng-star-inserted ant-btn-lg\"]") public WebElement confirmation_btn;
	
	@FindBy(xpath = "//button[@class=\"btn btn-lg btn-primary ng-star-inserted\"]") public WebElement pay_btn;
	@FindBy(xpath = " //button[@class=\"ant-btn ant-btn-primary ant-btn-lg\"]") public WebElement payNow_btn;;
	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;
}

