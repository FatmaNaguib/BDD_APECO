package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminInitialApprovalRequestDetailsLocators {

	@FindBy(xpath = "//button[normalize-space()='Approve']") 
	public WebElement employeeApprove_btn;

	
@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']") 
	public WebElement EngineerApprove_btn;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Type description\"]") 
	public WebElement comments_TextArea;
	
	@FindBy(xpath ="for=\"input-file\"") 
	public WebElement uploaderLabel;
	
	@FindBy(xpath ="//input[@id=\"input-file\"]") 
	public WebElement initialApprovalfile_Uploader;
	
	@FindBy(xpath = "//input[@placeholder=\"School Location / Plot Number\"]") 
	public WebElement engineerApprovalLocation_Textbox;
	
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 
	public WebElement save_btn;
	
	@FindBy(xpath = "//span[@class=\"d-inline-flex ms-2 ng-star-inserted\"]") public WebElement licensedSchoolName_Lable;
	
	@FindBy(xpath = "//button[normalize-space()='Reject']") 	public WebElement  employeeReject_btn;
	@FindBy(xpath = "//label[@class=\"form-label mt-4 ng-star-inserted\"]//following::app-select[1] //following::ng-select[1]") public WebElement employeeAction_ddl;
	@FindBy(xpath = "(//span[@class=\"ng-option-label ng-star-inserted\"])[1]") public WebElement employeeActionValue1ddl;
	@FindBy(xpath = "//button[normalize-space()='Return']") 	public WebElement  employeeReturn_btn;
}
