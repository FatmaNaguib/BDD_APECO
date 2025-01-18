package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPermitbyanExternalEntityLocators {

	@FindBy(xpath = "//select-input[@ng-reflect-name='eventType']//nz-select//input[1]") public WebElement eventType_ddl;
	@FindBy(xpath = "//textarea[@id='implementationMechanism']") public WebElement implementationMechanism_TextArea;
	@FindBy(xpath = "//textarea[@id='attendeeNames']") public WebElement attendeeNames_TextArea;
	@FindBy(xpath = "//input[@id='thirdPartyName']") public WebElement thirdPartyName_TextBox;
	@FindBy(xpath = "//input[@id='coordinatorSchoolName']") public WebElement coordinatorSchoolName_Textbox;
	@FindBy(xpath = "//input[@id='coordinatorPhoneNumber']") public WebElement coordinatorPhoneNumber_Textbox;
	@FindBy(xpath = "//input[@placeholder='Date and time of the event (Date From)']") public WebElement dateFrom_Datepicker;
	@FindBy(xpath = "//input[@placeholder='Date and time of the event (Date To)']") public WebElement dateTo_Datepicker;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement eventdataNext_btn;
	
	@FindBy (xpath ="//label[@for='managerLetter']//following::span[1]")public WebElement managerLetter_uploader;
	
	@FindBy (xpath ="//label[@for='administrativeApproval']//following::span[1]")public WebElement administrativeApproval_uploader;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement eventAttachmentsNext_btn;
	
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
	}
