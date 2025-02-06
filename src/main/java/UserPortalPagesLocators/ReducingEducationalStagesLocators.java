package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReducingEducationalStagesLocators {

	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-lg btn-primary ng-star-inserted\"]") public WebElement pay_btn;
	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary ant-btn-lg\"]") public WebElement payNow_btn;
	@FindBy(xpath = "(//input)[1]") public WebElement firstEducationalStageCheckBox;
	 @FindBy(xpath = "//button[span ='Next']") public WebElement nextButton;
	 
	 @FindBy (xpath = "//input[@id=\"officialDocumentSignedByLicenseHolder\"]") public WebElement officialDocumentSignedByLicenseHolderUploader;
	 @FindBy (xpath = "//input[@id=\"currentEngineeringPlanApproved\"]") public WebElement currentEngineeringPlanApprovedUploader;
	 @FindBy (xpath = "//input[@id=\"newEngineeringPlanIssued\"]") public WebElement newEngineeringPlanIssuedUploader;
	 @FindBy (xpath = "//input[@id=\"landMap\"]") public WebElement landMapUploader;
	 
	 @FindBy(xpath = "(//input[@type='checkbox'])[1]") public WebElement dataAcknowledge_Checkbox;
	 @FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary ant-btn-lg ng-star-inserted\"]//span") public WebElement submitButton;
	 
		@FindBy(xpath = "//button[@class='ant-btn']") public WebElement submit_btn;
		@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
		@FindBy(xpath = "//button//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
		@FindBy(xpath = "//button[@class=\"btn btn-lg btn-primary ng-star-inserted\"]") public WebElement postPay_btn;}
