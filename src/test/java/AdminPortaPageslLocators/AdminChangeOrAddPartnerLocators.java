package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminChangeOrAddPartnerLocators {

	@FindBy(xpath = "//button[@class='btn btn-success']") public WebElement review_btn;
	@FindBy(xpath = "//button[@class=\"btn btn-main flex-grow-1\"]") 	public WebElement save_btn;
	
	@FindBy(xpath = "//button[@class='btn btn-success ng-star-inserted']") public WebElement approve_btn;
	@FindBy(xpath = "//textarea[@placeholder=\"Type description\"]") 	public WebElement comments_TextArea;
	@FindBy(id="input-file") 	public WebElement initialApprovalfile_Uploader;
	


	
}
