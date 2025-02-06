package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminloginPageLocatore  {
	@FindBy(xpath = "//html") 
	public WebElement pageHtml;
	
	@FindBy(xpath = "//button[@class='btn btn-link lang-switch en-font']") 
	public WebElement english_btn;
	
	@FindBy(id="email") 
	public WebElement adminUsername_Textbox;
	
	@FindBy(id= "password") 
	 public WebElement adminPassword_Textbox;
	
	@FindBy(xpath = "//button[@class='login-btn btn btn-main w-100 mt-5']") 
	public	WebElement adminLoginButton;
}
