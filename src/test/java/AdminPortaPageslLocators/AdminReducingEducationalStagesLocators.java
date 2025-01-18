package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminReducingEducationalStagesLocators {

@FindBy(xpath = "//button[@class=\"btn btn-primary ng-star-inserted\"]") public WebElement approve_btn;
	
	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]") public WebElement engineerRateApprove_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']") public WebElement complete_btn;
	
	@FindBy(xpath = "//input[@placeholder=\"English School Location / Plot Number\"]") public WebElement engineerApprovalLocationEn_Textbox;
	@FindBy(xpath = "//input[@placeholder=\"Arabic School Location / Plot Number\"]") public WebElement engineerApprovalLocationAr_Textbox;
							
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-star-inserted\"]") public WebElement initialVisitApprove_btn;
}
