package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminInitialApprovalRequestDetailsLocators {

	@FindBy(xpath = "//button[@class='btn btn-primary']") 
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
	
	@FindBy(xpath = "//a[@class=\"d-inline-flex ms-2 ng-star-inserted\"]") public WebElement licensedSchoolName_Lable;
	
}
