package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternationalTravelLocators {
	
	@FindBy(id = "destination") public WebElement destinationTextbox;
	@FindBy(xpath = " //label[@for='curriculum']//following::input[1]") public WebElement Curriculum_ddl;
	@FindBy(xpath = " //label[@for='stage']//following::input[1]") public WebElement targetedStages_ddl;
	@FindBy(xpath = "//input[@placeholder='Departure Date']") public WebElement departureDateDatepicker;
	@FindBy(xpath = "//input[@placeholder='Return Date']") public WebElement returnDateDatepicker;
	@FindBy(id = "goalOfTheTrip") public WebElement goalofTheTripTextarea;
	@FindBy(id = "coordinatorName") public WebElement coordinatorNameTextbox;
	@FindBy(id = "coordinatorPhoneNumber") public WebElement coordinatorPhoneNumberTextbox;
	@FindBy(id = "email") public WebElement emailTextbox;
	@FindBy(id = "dailyTripProgram") public WebElement dailyTripProgramTextbox;
	@FindBy(xpath ="//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement travelDataNext_btn;
	@FindBy(xpath ="//span[normalize-space()='Next']") public WebElement attachmentsNext_btn;
	@FindBy (xpath = "//body") 	public WebElement pageBody;
	
	@FindBy(xpath ="//span[@class='ng-star-inserted']") public WebElement addAttachments_btn;
	@FindBy(xpath ="//span[@class='anticon anticon-down']//*[name()='svg']") public WebElement attachmentExpand_btn;
	@FindBy (xpath = "//label[@for='invitationFile']//following::span[1]") public WebElement invitationUploader;
	
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//span[normalize-space()='Submit']") public WebElement submit_btn;
	//@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-lg ng-star-inserted\"]//span[@class=\"ng-star-inserted\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
}
