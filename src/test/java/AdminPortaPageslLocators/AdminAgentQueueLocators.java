package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminAgentQueueLocators {
	
	@FindBy(xpath = "//html") 
	public WebElement pageHtml;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[1]/div[1]/div[1]/agent-queue-page[1]/div[1]/div[1]/app-page-filters[1]/div[1]/div[1]/div[1]/app-search[1]/div[1]/input[1]") 
	public WebElement saerch_Textbox;

	@FindBy(xpath ="//div[@class='start-area']//i[@class='bx bx-search']") 
	public WebElement saerch_btn;
	
	@FindBy(xpath = "//a[@class='details hoverableLink']") 
	public WebElement requestNumberLink;
	
	
	@FindBy(xpath = "//div[@class='info']//p[@class='name']") 
	public WebElement adminNameLink;
	
	@FindBy(xpath = "//span[normalize-space()='Logout']") 
	public WebElement adminLogoutLink;
}
