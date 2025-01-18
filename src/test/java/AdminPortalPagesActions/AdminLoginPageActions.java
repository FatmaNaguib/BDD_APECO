package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminloginPageLocatore;

import Bases.APECOTestBase;
import Bases.CommonFunctions;

public class AdminLoginPageActions extends APECOTestBase {
	 AdminloginPageLocatore adminLoginPageLcators;
	
	public AdminLoginPageActions() throws IOException {
		super();
		 adminLoginPageLcators  = new AdminloginPageLocatore();
		PageFactory.initElements(driver, adminLoginPageLcators);
		
	}

	public void selectEngLang() {
	String dir =	CommonFunctions.getPagedir(adminLoginPageLcators.pageHtml);
	if("rtl".equals(dir)) {
		adminLoginPageLcators.english_btn.click();
	}
	}
	
	public void adminLogin(String adminUserName, String adminPassword) throws IOException, InterruptedException {
		adminLoginPageLcators.adminUsername_Textbox.sendKeys(adminUserName);
		adminLoginPageLcators.adminPassword_Textbox.sendKeys(adminPassword);
	//commonFunctions.clickWebElement(adminLoginPageLcators.adminLoginButton);
	Thread.sleep(1000);
		adminLoginPageLcators.adminLoginButton.click();			
		//return new AdminServicesListPageLocators();
	}

	public void adminLoginurl(String url) {
		driver.get(url);
	}
}
