package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminApprovalofAnnualActivitiesandProgramsLocators {

	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]") 	public WebElement  employeeApproval_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-star-inserted\"]") 	public WebElement  returnedApproval_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	
	@FindBy(xpath = "//button[@class=\"btn btn-danger\"]") 	public WebElement  employeeReject_btn;
	@FindBy(xpath = "//label[@class=\"form-label mt-4 ng-star-inserted\"]//following::app-select[1] //following::ng-select[1]") public WebElement employeeAction_ddl;
	@FindBy(xpath = "(//span[@class=\"ng-option-label ng-star-inserted\"])[1]") public WebElement employeeActionValue1ddl;
	@FindBy(xpath = "//button[@class=\"btn btn-warning\"]") 	public WebElement  employeeReturn_btn;
}
