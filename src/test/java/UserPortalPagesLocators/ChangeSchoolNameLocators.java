package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeSchoolNameLocators {

	@FindBy (xpath ="//input[@id='schoolNameEn']")public WebElement schoolNameEn_textBox;
	@FindBy (xpath ="//div[@class='ant-form-item-control-input-content ng-tns-c4065450863-39']//input[@id='schoolNameAr']")public WebElement schoolNameAr_textBox;
	
	
	@FindBy (xpath ="//input[@id='newSchoolNameEn']")public WebElement newSchoolNameEn_textBox;	
	@FindBy (xpath ="//label[@for='schoolNameAr']//following::input[@placeholder=\"New school name (Arabic)\"]")public WebElement newSchoolNameAr_textBox;
	
	@FindBy (xpath ="//label[@for='newSchoolNameReservationFile']//following::span[1]")public WebElement newSchoolNameReservationFile_uploader;
	@FindBy (xpath ="//label[@for='licenseHolderNameChangeLetter']//following::span[1]")public WebElement licenseHolderNameChangeLetter_uploader;
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement pay_btn;
	@FindBy(xpath = "//button[@nztype=\"primary\"]") public WebElement payNow_btn;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
}
