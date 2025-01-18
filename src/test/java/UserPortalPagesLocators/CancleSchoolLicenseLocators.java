package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancleSchoolLicenseLocators {
	
	@FindBy(xpath = "//label[@for='cancelReason']//following::input[1]") public WebElement reasonofCancellation_ddl;
	@FindBy(id = "reason") public WebElement reasonoTextArea;
	
	@FindBy(xpath = "//checkbox-input[@ng-reflect-name=\"commitment\"]") public WebElement commitmentCheckbox;
	@FindBy(xpath = "//checkbox-input[@ng-reflect-name=\"studentStatusSettlement\"]") public WebElement studentStatusSettlementCheckbox;
	@FindBy(xpath = "//checkbox-input[@ng-reflect-name=\"staffStatusSettlement\"]") public WebElement staffStatusSettlementCheckbox;	
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") public  WebElement licenseCancelationNext_btn;
    
	@FindBy (xpath ="//label[@for='cancellationRequestAuthorizedByLicenseHolder']//following::span[1]")public WebElement cancellationRequestAuthorizedByLicenseHolder_uploader;	
	@FindBy (xpath ="//label[@for='latestCommercialLicense']//following::span[1]")public WebElement latestCommercialLicense_uploader;	
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement pay_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement  Submit_btn;
	//@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-lg ng-star-inserted\"]//span[@class=\"ng-star-inserted\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
	
}
