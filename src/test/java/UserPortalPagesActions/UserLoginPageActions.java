package UserPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import UserPortalPagesLocators.UserLoginPageLocators;
import UserPortalPagesLocators.UserWorkspacePageLocators;

public class UserLoginPageActions extends APECOTestBase {

	private  UserLoginPageLocators userLoginPageLocators;
	
	public UserLoginPageActions() throws IOException {
		super();
		 userLoginPageLocators = new UserLoginPageLocators();
		PageFactory.initElements(driver, userLoginPageLocators);

		
	}
	
	
	public static   UserWorkspacePageLocators login(String userName,String password) throws IOException {
		
		 UserLoginPageActions userLoginPageActions = new UserLoginPageActions();
		 userLoginPageActions.userLoginPageLocators.userNameTextbox.sendKeys(userName);
		 userLoginPageActions.userLoginPageLocators.passwordTextbox.sendKeys(password);
		 userLoginPageActions.userLoginPageLocators.loginButton.click();
		
		return new UserWorkspacePageLocators();
	}
	
	public Boolean workSpacelableIsDisplayed() {
		
		return userLoginPageLocators.workSpaceLable.isDisplayed();
	}
}
