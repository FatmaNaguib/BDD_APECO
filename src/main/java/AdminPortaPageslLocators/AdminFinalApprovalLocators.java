package AdminPortaPageslLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class AdminFinalApprovalLocators  {
	
	@FindBy(xpath = "//button[@class='btn btn-primary']") public WebElement Approve_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']") 	public WebElement  scheduleMeeting_btn;
	@FindBy(xpath = "//input[@placeholder=\"Title\"]") public WebElement title_TextBox;
	@FindBy(xpath = "//input[@placeholder=\"Date\"]") 	public WebElement date_Datepicker;
	@FindBy(xpath = "//input[@placeholder=\"From\"]") 	public WebElement from_TxtBox;
	@FindBy(xpath = "//input[@placeholder=\"To\"]") 	public WebElement to_TxtBox;
	@FindBy(xpath = "//input[@placeholder=\"Location\"]") public WebElement location_TextBox;
	@FindBy(xpath = "//input[@placeholder=\"Description\"]") public WebElement description_TextBox;
	
	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']") public WebElement accept_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-star-inserted\"]") public WebElement done_btn;
	
	@FindBy(xpath = "//input[@placeholder=\"English School Location / Plot Number\"]") public WebElement engineerApprovalLocationEn_Textbox;
	@FindBy(xpath = "//input[@placeholder=\"Arabic School Location / Plot Number\"]") public WebElement engineerApprovalLocationAr_Textbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success ng-star-inserted']") public WebElement employeeApproval_btn;
	@FindBy(xpath = "//label[@class=\"form-label mt-4 ng-star-inserted\"]//following::app-select[1] //following::ng-select[1]") public WebElement employeeTypeofHiring_ddl;
	@FindBy(xpath = "(//span[@class=\"ng-option-label ng-star-inserted\"])[1]") public WebElement employeeTypeofHiringValue1ddl;
	@FindBy(xpath = "//a[@class='d-inline-flex ms-2']") public WebElement licensedSchoolName_Lable;

	

}
