package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingEducationalStagesLocators {

	@FindBy(xpath = "//input[@placeholder='Applicant Phone']") public WebElement applicantPhone_Textbox;
	@FindBy(id="relationshipSchoolBuilding") public WebElement relationshipSchoolBuilding_Textbox;
	 @FindBy(xpath = "//button[span ='Next']") public WebElement nextButton;
	 
	 @FindBy(xpath = "(//button[@class='ant-btn ant-btn-lg ant-btn-icon-only'])[1]") public WebElement curriculum_Collabs;
	 @FindBy(xpath = "(//button[@class='ant-btn ant-btn-lg ant-btn-icon-only'])[8]") public WebElement stages_collabs;
	 @FindBy(xpath = "//span[normalize-space()='Add Stage']") public WebElement addStageBtn;
	 @FindBy (xpath = "(//label[@for='stage']//following::input[1])[4]")  public WebElement stage4_ddl;
	 @FindBy (xpath = "(//label[@for='capacity']//following::input[1])[4]")  public WebElement capacity4_TextBox;
	@FindBy (xpath = "(//label[@for='numberOfClassrooms']//following::input[1])[4]")  public WebElement numberofClassRooms4_TextBox;
	@FindBy (xpath = "(//label[@for='grade']//following::input[1])[4]")  public WebElement grades4_ddl;
	 
		
		@FindBy (xpath = "(//input[@placeholder=\"New tuition fees\"])[4]")  public WebElement newTuitionFees_TextBox;
		@FindBy (xpath = "(//input[@placeholder=\"New school book fees\"])[4]")  public WebElement newSchoolBookFees_TextBox;
		@FindBy (xpath = "(//input[@placeholder=\"New school uniform fees\"])[4]")  public WebElement newSchoolUniformFees_TextBox;
		
		@FindBy (xpath = " //input[@id=\"officialLetterSignedByLicenseOwner\"]") public WebElement officialLetterUploader;
		@FindBy (xpath = " //input[@id=\"currentApprovedEngineeringPlan\"]") public WebElement currentApprovedEngineeringPlanUploader;
		@FindBy (xpath = " //input[@id=\"newEngineeringPlanAfterGradeChange\"]") public WebElement newEngineeringPlanAfterGradeChangeUploader;
		@FindBy (xpath = "//input[@id=\"landMap\"]") public WebElement landMapUploader;
		
		 @FindBy(xpath = "(//input[@type='checkbox'])[1]") public WebElement dataAcknowledge_Checkbox;
		 @FindBy(xpath = "(//input[@type='checkbox'])[2]") public WebElement paymentAcknowledge_Checkbox;
		 @FindBy(xpath = "//button[span='Submit']") public WebElement submitButton;
		 @FindBy(xpath = "//button[span='Pay Now']") public WebElement payNowButton;
			@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement submit_btn;
			@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
			@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
			
			@FindBy(xpath = "(//button[@class=\"ant-btn btn btn-main flex-grow-1\"])[2]") public WebElement save_btn;
			@FindBy(xpath = "//button[@class='btn btn-lg btn-primary ng-star-inserted']") public WebElement siteisReadyBtn;
			@FindBy(xpath = "//button[@class='btn btn-lg btn-primary ng-star-inserted']") public WebElement pay_btn;
			@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;
			@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") public WebElement payNow_btn;
			
			@FindBy(xpath = "(//button//span[@class=\"ng-star-inserted\"])[1]") public WebElement  initialTechnicalapproval_btn;
			@FindBy(xpath = "(//button//span[@class=\"ng-star-inserted\"])[2]") public WebElement  approvedEngineeringDiagram_btn;
			@FindBy(xpath = "(//button//span[@class=\"ng-star-inserted\"])[3]") public WebElement  finalTechnicalApproval_btn;
			@FindBy(xpath = "(//button//span[@class=\"ng-star-inserted\"])[4]") public WebElement schoolFeesApproval_btn;
			@FindBy(xpath = "(//button//span[@class=\"ng-star-inserted\"])[5]") public WebElement  licensureDoc_btn;
}
