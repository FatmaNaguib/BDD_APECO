package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminChangeSchoolNameLocators {

	
	@FindBy(xpath = "//button[@class='btn btn-success']") public WebElement approve_btn;
	@FindBy(xpath = "//textarea[@placeholder=\"Type description\"]") public WebElement commentsTxtarea;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	
	
}
