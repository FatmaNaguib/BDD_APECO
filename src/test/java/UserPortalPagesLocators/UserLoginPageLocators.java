package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserLoginPageLocators  {
	@FindBy(id= "exampleInputEmail1") 
	public WebElement userNameTextbox;
	
	@FindBy(id = "exampleInputPassword1")
	public WebElement passwordTextbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//h4[@class='title']")
	public WebElement workSpaceLable;	
	

	
}
