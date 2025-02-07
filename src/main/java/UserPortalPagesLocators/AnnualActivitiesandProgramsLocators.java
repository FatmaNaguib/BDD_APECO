package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnualActivitiesandProgramsLocators {

	@FindBy(xpath ="//button[@id=\"nz-tabs-0-tab-3\"]") public WebElement coordinatorsDataTab;
	@FindBy(id ="CoordinatorName") public WebElement coordinatorsName_TextBox;
	@FindBy(xpath ="//input[@placeholder='Coordinator Phone Number']") public WebElement coordinatorsPhoneNumber;
	@FindBy(id ="email") public WebElement coordinatorsEmail_TextBox;
	@FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary ant-btn-lg ng-star-inserted\"])[2]") public WebElement nextButton;
	 @FindBy(xpath = "(//input[@type='checkbox'])[1]") public WebElement dataAcknowledge_Checkbox;
	 @FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary ant-btn-lg ng-star-inserted\"]") public WebElement save_Btn;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement pay_btn;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") public WebElement payNow_btn;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-lg btn-primary ng-star-inserted\"]") public WebElement resubmit_btn;
	@FindBy(xpath = "(//button[@class=\"ant-btn btn btn-main flex-grow-1\"])[2]") public WebElement resubmitSave_btn;
	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;		
				
}
