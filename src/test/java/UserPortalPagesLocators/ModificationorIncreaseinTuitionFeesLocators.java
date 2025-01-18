package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModificationorIncreaseinTuitionFeesLocators {

	@FindBy(xpath = "(//input[@placeholder=\"New tuition fees\"])[1]") public WebElement newTuitionfees1_Textbox;
	@FindBy(xpath = "(//input[@placeholder=\"New school book fees\"])[1]") public WebElement newschoolbookfees1_Textbox;
	@FindBy(xpath = "(//input[@placeholder=\"New school uniform fees\"])[1]") public WebElement newschooluniformfees1_Textbox;
	
	@FindBy(xpath = "(//input[@placeholder=\"New tuition fees\"])[2]") public WebElement newTuitionfees2_Textbox;
	@FindBy(xpath = "(//input[@placeholder=\"New school book fees\"])[2]") public WebElement newschoolbookfees2_Textbox;
	@FindBy(xpath = "(//input[@placeholder=\"New school uniform fees\"])[2]") public WebElement newschooluniformfees2_Textbox;
	
	@FindBy(xpath = "(//input[@placeholder=\"New tuition fees\"])[3]") public WebElement newTuitionfees3_Textbox;
	@FindBy(xpath = "(//input[@placeholder=\"New school book fees\"])[3]") public WebElement newschoolbookfees3_Textbox;
	@FindBy(xpath = "(//input[@placeholder=\"New school uniform fees\"])[3]") public WebElement newschooluniformfees3_Textbox;
	
	@FindBy(xpath = "//input[@placeholder='New Annual Transportation Fees in UAE (one direction)']") public WebElement newOneDirectionTransportationfeesTextbox;
	 @FindBy(xpath = "//input[@placeholder='New Annual Transportation Fees in UAE (two directions)']") public WebElement newTwoDirectionTransportationfeesTextbox;
	 @FindBy(xpath = "//button[span ='Next']") public WebElement nextButton;
	 
	 @FindBy (xpath ="//label[@for='officiallyLicensedAuthorizedManual']//following::span[1]")public WebElement officiallyLicensedAuthorizedManual_uploader;
	 @FindBy (xpath ="//label[@for='financialReport']//following::span[1]")public WebElement financialReport_uploader;
	 @FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	 @FindBy(xpath = "//button[span ='Pay']") public WebElement payButton;
	 @FindBy(xpath = "//button[span ='Pay Now']") public WebElement payNowButton;
		@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
		@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
		@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
	 
}
