package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRequestsPageLocators {

	
	 @FindBy(xpath = "//input[@placeholder='Request ID']") public WebElement searchRequest_Txtbox;
	 @FindBy(xpath = "//span[@class=\"ant-input-suffix ng-star-inserted\"]") public WebElement search_Icon;
	 @FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]") public WebElement details_Btn;
	 @FindBy(xpath = "//tbody/tr[1]/td[1]") public WebElement requestRefNumber;
	 @FindBy(xpath = "//button[normalize-space()='Reply']") public WebElement reply_Btn;
	 @FindBy(xpath = "(//textarea[@placeholder='Type description'])[2]") public WebElement comment_Txtarea;
	 @FindBy(xpath = "(//button[normalize-space()='Save'])[2]") public WebElement save_Btn;
		@FindBy(xpath = "//button//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
		
}