package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminSchoolLicenseCancellationRequestsLocators {
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]") public WebElement approve_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-success ng-star-inserted\"]") public WebElement depManagerApproval_btn;
	
	@FindBy(xpath = "//button[@class=\"btn btn-success ng-star-inserted\"]") public WebElement departmentManagerApprove_btn;

}
