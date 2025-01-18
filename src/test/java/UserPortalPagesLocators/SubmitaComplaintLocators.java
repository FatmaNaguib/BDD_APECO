package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitaComplaintLocators {

	@FindBy (id = "studentName") public WebElement studentName_TextBox;
	@FindBy (id = "phoneNumber") public WebElement phoneNumber_ddl;
	 @FindBy(xpath = "//button[span ='Next']") public WebElement next_Btn;
	 @FindBy(xpath = "//label[@for='schoolId']//following::input[1]") public WebElement school_ddl;
	 @FindBy (id ="complaint") public WebElement complaint_TextArea;
	 @FindBy(xpath = "//span[normalize-space()='Add']") public WebElement add_Btn;
	 @FindBy (xpath =" //label[@for='attachment']//following::span[1]")public WebElement attachment_uploader;
	 @FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
		@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
		@FindBy(xpath = "//span[normalize-space()='Okay']") public WebElement confirmation_btn;
}