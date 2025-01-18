package UserPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.UserRequestsPageLocators;

public class UserRequestsPageActions  extends APECOTestBase {
	CommonFunctions commonFunctions = new CommonFunctions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	UserRequestsPageLocators userRequestsPageLocators;
	
	public UserRequestsPageActions() throws IOException {
		userRequestsPageLocators = new UserRequestsPageLocators();
		PageFactory.initElements(driver, userRequestsPageLocators);
	}

	public void searchForaRequestbyNumber(
			String requestNo
			) throws InterruptedException {
		commonFunctions.clickWebElement(userRequestsPageLocators.searchRequest_Txtbox);
		userRequestsPageLocators.searchRequest_Txtbox.sendKeys(requestNo);
		userRequestsPageLocators.search_Icon.click();
	}
	
	public void clickDetailsButton() throws InterruptedException {
		commonFunctions.clickWebElement(userRequestsPageLocators.searchRequest_Txtbox);
		commonFunctions.waitElementToBevisible(userRequestsPageLocators.details_Btn);
		userRequestsPageLocators.details_Btn.click();
	}
	
	public void replyComplaint(
			String comments
			) throws InterruptedException {
		userRequestsPageLocators.reply_Btn.click();
		userRequestsPageLocators.comment_Txtarea.sendKeys(comments);
		userRequestsPageLocators.save_Btn.click();
		Thread.sleep(1000);
		userRequestsPageLocators.confirmation_btn.click();
	}
}
