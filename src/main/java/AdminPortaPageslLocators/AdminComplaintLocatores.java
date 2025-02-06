package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminComplaintLocatores {

	@FindBy(xpath = "//button[@class='btn btn-success ng-star-inserted']") public WebElement close_Btn;
	@FindBy(xpath = "//textarea") public WebElement textArea;
	@FindBy(xpath = "//button[@class='btn btn-main flex-grow-1']") public WebElement save_Btn;
	
}
