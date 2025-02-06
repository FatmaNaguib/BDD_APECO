package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialApplovalDocumentsPageLocators {	
	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement downloadPopup_btn;
	@FindBy (xpath ="	//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']//span[normalize-space()='Next']") public WebElement downloadDocNext_btn;	
	@FindBy (id="attachment")public WebElement attachment_uploader;
	@FindBy(xpath ="//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement attachmentsNext_btn;
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement pay_btn;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") public WebElement payNow_btn;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;	
}
