package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminInternationalTravelLocators {

	
	@FindBy(xpath ="//button[@class=\"btn btn-primary\"]") public WebElement approve_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
}
