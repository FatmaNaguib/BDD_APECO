package UserPortalPagesLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class UserWorkspacePageLocators  {

	
	@FindBy(xpath = "//nz-page-header-title[@class='ant-page-header-heading-title ng-star-inserted']")
	public WebElement workspaceHeader;
	
	@FindBy(xpath = "//div[@id='nav-content']")
	public WebElement sideMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Services']")
	public	WebElement sidemenu_servicesLink;
	
	

}