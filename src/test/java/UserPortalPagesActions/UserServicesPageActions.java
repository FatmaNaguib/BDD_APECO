package UserPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;


import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.UserServicesPageLocators;


public class UserServicesPageActions extends APECOTestBase {
	
	
CommonFunctions commonFunctions = new CommonFunctions();
	
public static UserServicesPageLocators userServicesPageLocators = new UserServicesPageLocators() ;

	public UserServicesPageActions() throws IOException {
		super();
	    PageFactory.initElements(driver,this);
	}
	
	
	
	public Boolean servicesPagelableIsDisplayed() {
		
		return userServicesPageLocators.servicesPageheaderlable.isDisplayed();
	}
	
	public String getServicesPageHeaderText() {
		
	return userServicesPageLocators.servicesPageheaderlable.getText();
	}

	public void ClickInitialApprovalLink() {
		
		userServicesPageLocators.serviceType_ddl.click();
		userServicesPageLocators.educationServices.click();
		userServicesPageLocators.pageBody.click();
		userServicesPageLocators.initialApprovalServiceLink.click();
		userServicesPageLocators.newRequestButton.click();
		
	}
	

}
