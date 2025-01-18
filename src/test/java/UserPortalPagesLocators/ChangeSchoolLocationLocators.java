package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeSchoolLocationLocators {

	@FindBy(xpath = "//select-input[@ng-reflect-name='requestType']//nz-select//input[1]") public WebElement requestType_ddl;
	@FindBy(id = "architecturalConsultant") public WebElement consultantTextbox;
	@FindBy(id = "schoolAddress")  public WebElement schoolAddressTextbox;
	@FindBy(xpath = "//label[@for='gender']//following::input[1]") public WebElement gender_ddl;
    @FindBy(id = "locationNumber") public WebElement locationNumberEn_Textbox;
    @FindBy(id="locationAr") public WebElement locationNumberAr_Textbox;
    @FindBy(xpath = "//label[@for='landOwnership']//following::input[1]")  public WebElement landOwnership_ddl;
    @FindBy(xpath = "//label[@for='ownershipBuilding']//following::input[1]") public WebElement buildingOwnership_ddl;
    @FindBy(xpath = "//label[@for='landArea']//following::input[1]") public WebElement landAreaTextbox;
    @FindBy(xpath = "//label[@for='buildingArea']//following::input[1]") public WebElement buildingAreaTextbox;
    @FindBy(xpath = "//label[@for='totalIndoorcourtArea']//following::input[1]") public WebElement totalIndoorCourtAreaTextbox;
	@FindBy(xpath = "//label[@for='totalExternalCanopyArea']//following::input[1]") public WebElement totalExternalCanopyAreaTextbox;
	@FindBy(id="typeBuildingMaterials") public WebElement typeBuildingMaterialsTextbox;
	 @FindBy(id = "relationshipSchoolBuilding") public WebElement relationshiptoSchoolBuildingTextbox;
	 @FindBy(xpath = "//span[normalize-space()='Next']") public WebElement nextBtn;
	 
	@FindBy (xpath ="(//nz-input-group[@ng-reflect-ng-class=\"[object Object]\"]//span[@class='choose-file-btn'])[1]")public WebElement newEngineeringPlan_uploader;
	@FindBy (xpath ="(//label[@for=\"file-input\"])[1]//following::span[@class=\"choose-file-btn\"][1]")public WebElement landMap_uploader;
	@FindBy (xpath ="(//label[@for=\"file-input\"])[2]//following::span[@class=\"choose-file-btn\"][1]")public WebElement timePlan_uploader;
	@FindBy (xpath ="(//label[@for=\"file-input\"])[3]//following::span[@class=\"choose-file-btn\"][1]")public WebElement parentsInformaingPlan_uploader;
	@FindBy (xpath ="(//label[@for=\"file-input\"])[4]//following::span[@class=\"choose-file-btn\"][1]")public WebElement validLeaseContractOrTitleDeed_uploader;
	@FindBy (xpath ="(//label[@for=\"file-input\"])[5]//following::span[@class=\"choose-file-btn\"][1]")public WebElement certificateFromMunicipalityCivilDefense_uploader;
	
	@FindBy (xpath ="//button[@class=\"ant-btn ant-btn-primary ant-btn-lg ng-star-inserted\"]")public WebElement attachmentsNext_btn;
	@FindBy(xpath = "//input[@type='checkbox']") public WebElement dataAcknowledge_Checkbox;
	@FindBy(xpath = "//button[normalize-space()='Submit']") public WebElement submit_btn;
	@FindBy(xpath = "//span[@class=\"font-weight-semibold fs-2rem\"]") public WebElement confirmation_msg;
	@FindBy(xpath = "//span[@class='ng-star-inserted']") public WebElement confirmation_btn;
	
	@FindBy(xpath = "(//button[@class=\"ant-btn btn btn-main flex-grow-1\"])[2]") public WebElement save_btn;
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary ng-star-inserted']") public WebElement siteisReadyBtn;
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary ng-star-inserted']") public WebElement pay_btn;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']") public WebElement payNow_btn;
	@FindBy(xpath = "//button[@class='ant-btn ng-star-inserted ant-btn-lg']") public WebElement okay_btn;
}
