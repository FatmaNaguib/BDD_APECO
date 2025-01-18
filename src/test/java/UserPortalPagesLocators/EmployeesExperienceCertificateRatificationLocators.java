package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class EmployeesExperienceCertificateRatificationLocators {
	
	@FindBy(xpath = "//button[normalize-space()='Employee Data']") public WebElement employeeData_tab;
	@FindBy (xpath = "//body") public WebElement pageBody;
	@FindBy(id = "name") public WebElement employeeNameEng_Textbox;
	@FindBy(id="nameAr") public WebElement employeeNameAr_Textbox;
	@FindBy(id = "speciality") public WebElement specializationEng_Textbox;
	@FindBy(id = "specialityAr") public WebElement specializationAr_Textbox;
	@FindBy(id="job") public WebElement jobTitleEng;
	@FindBy(id="jobAr") public WebElement jobTitleAr;
	@FindBy(xpath = "//label[@for='curriculum']//following::input[1]") public WebElement curriculum_ddl;
	@FindBy(xpath = "//label[@for='stage']//following::input[1]") public WebElement stages_ddl;
	@FindBy(xpath = "//label[@for='workingStartDate']//following::input[1]") public WebElement departureDateDatepicker;
	@FindBy(xpath = "//label[@for='workingLeaveDate']//following::input[1]") public WebElement returnDateDatepicker;
	@FindBy(xpath ="//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement experienceCertificateNext_btn;
	
	@FindBy (xpath = "//label[@for='nationalID']//following::span[1]") public WebElement nationalID_Uploader;
	@FindBy (xpath = "//label[@for='recruitmentNotification']//following::span[1]") public WebElement recruitmentNotification_Uploader;
	@FindBy(xpath ="//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public WebElement experienceCertificateAttachmentsNext_btn;
	
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//span[normalize-space()='Pay']") public WebElement pay_btn;
	@FindBy(xpath ="//button[@nztype='primary']") public WebElement payNow_btn;
	@FindBy(xpath = "//button[@class=\"ant-btn\"]") public WebElement submit_btn;
	
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
}
