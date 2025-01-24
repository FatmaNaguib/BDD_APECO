package AdminPortaPageslLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminAddingEducationalStagesLocators{
	//button[@class="btn btn-primary"]
	
	@FindBy(xpath = "//button[@class='btn btn-primary']") public WebElement  approveandcompleteinitialfiles_Btn ;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']") public WebElement approve_btn;
	

}
