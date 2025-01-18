package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishingAnnouncementsPageLocators {

	@FindBy(xpath= "//label[@for='channelName']//following::input[1]") public WebElement channelName_ddl;
	
	@FindBy (xpath ="//label[@for='ad_attachment']//following::span[1]")public WebElement advertisement_uploader;
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement pay_btn;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;

}
