package UserPortalPagesLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class UserServicesPageLocators {

	
	@FindBy(xpath = "//nz-page-header-title[text() = 'Services']")
	public WebElement servicesPageheaderlable;
	
	@FindBy(xpath="//button[@class='ant-btn']")
	public 	WebElement newRequestButton;
	
	@FindBy(xpath = "//span[@class='title'][normalize-space()='Initial Approval for School']")
	public WebElement initialApprovalServiceLink;
	
	
	//div[normalize-space()='Parent Services']
	
	@FindBy(xpath = "//div[normalize-space()='Education Services']")
	public WebElement  educationServices;
	
	@FindBy(xpath = "//nz-select-item[@title='Education Services']")
	public WebElement  serviceType_ddl;
	
	
	
	@FindBy (xpath = "//body") 
	public WebElement pageBody;
	
	
	
}
