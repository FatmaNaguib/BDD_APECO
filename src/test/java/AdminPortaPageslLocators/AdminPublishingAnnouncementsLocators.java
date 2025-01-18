package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPublishingAnnouncementsLocators {

	@FindBy(xpath = "//button[normalize-space(text())=\"Approve\"]") 
	public WebElement approve_btn;
	
	
	
	@FindBy(xpath = "//button[normalize-space(text())=\"Save\"]") 
	public WebElement approvalSave_btn;
}
