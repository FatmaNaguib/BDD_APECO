package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminSchoolRenewalRequestDetailsLocators {

	@FindBy(xpath = "//button[@class='btn btn-success']") 
	public WebElement approve_btn;
	
	
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 
	public WebElement approvalSave_btn;
	
}
