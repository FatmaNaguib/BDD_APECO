package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminChangeSchoolManagerLocators {

	
	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']") 	public WebElement  approve_btn;
	@FindBy(xpath = "//textarea[@placeholder=\"Type description\"]") 	public WebElement comments_TextArea;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;

}
