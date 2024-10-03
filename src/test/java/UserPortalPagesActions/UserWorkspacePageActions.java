package UserPortalPagesActions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
//import UserPortalPagesLocators.UserLoginPageLocators;
import UserPortalPagesLocators.UserServicesPageLocators;
import UserPortalPagesLocators.UserWorkspacePageLocators;
import Util.TestUtil;

public class UserWorkspacePageActions extends APECOTestBase {

	
	Actions Actions = new Actions(driver);
	
	private UserWorkspacePageLocators userWorkspacePageLocators;
	
	public UserWorkspacePageActions() throws IOException {
		super();
		 userWorkspacePageLocators = new UserWorkspacePageLocators();
		PageFactory.initElements(driver,userWorkspacePageLocators);
	}
	

	public void sideMenu_hover() {
		Actions.moveToElement(userWorkspacePageLocators.sideMenu).perform();
		
	}
	
public static String getworkspaceHeader() throws IOException{

		String workSpaceHeaderLable;
		UserWorkspacePageActions userWorkspacePageActions = new UserWorkspacePageActions() ;
		workSpaceHeaderLable =  userWorkspacePageActions.userWorkspacePageLocators.workspaceHeader.getText();
		return workSpaceHeaderLable;
	}

public UserServicesPageLocators clickonSideMenu_Services_link() throws IOException {
	Actions.moveToElement(userWorkspacePageLocators.sideMenu).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLACIT_WAIT));
	userWorkspacePageLocators.sidemenu_servicesLink.click() ;
	return new UserServicesPageLocators();
	
}
	
	
	
}
