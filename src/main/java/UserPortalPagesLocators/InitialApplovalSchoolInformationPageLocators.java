package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialApplovalSchoolInformationPageLocators {

	
	
	@FindBy(xpath = "//select-input[@ng-reflect-name='requestType']//nz-select//input[1]") public WebElement requestType_ddl;
	
	@FindBy(id = "arabicSchoolName") public WebElement arabicSchoolNameTextbox;
	@FindBy(id = "englishSchoolName") public WebElement englishSchoolNameTextbox;
	@FindBy(id = "consultant") public WebElement consultantTextbox;
	@FindBy(id = "schoolAddress")  public WebElement schoolAddressTextbox;
    @FindBy(xpath = "//label[@for='Gender']//following::input[1]") public WebElement gender_ddl;
    @FindBy(id = "locationNumber") public WebElement locationNumberEn_Textbox;
    @FindBy(id = "locationNumberAr") public WebElement locationNumberAr_Textbox;
    @FindBy(xpath = "//label[@for='landOwnership']//following::input[1]")  public WebElement landOwnership_ddl;
    @FindBy(xpath = "//label[@for='ownershipBuilding']//following::input[1]") public WebElement buildingOwnership_ddl;
	@FindBy(xpath = "//label[@for='landArea']//following::input[1]") public WebElement landAreaTextbox;
	@FindBy(xpath = "//label[@for='buildingArea']//following::input[1]") public WebElement buildingAreaTextbox;
	@FindBy(xpath = "//label[@for='totalIndoorcourtArea']//following::input[1]") public WebElement totalIndoorCourtAreaTextbox;
	@FindBy(xpath = "//label[@for='totalExternalCanopyArea']//following::input[1]") public WebElement totalExternalCanopyAreaTextbox;
    @FindBy(id = "relationshipSchoolBuilding") public WebElement relationshiptoSchoolBuildingTextbox;
	@FindBy(xpath = "//label[@for='applicantPhone']//following::input[1]") public WebElement applicantPhoneTextbox;
	@FindBy (id="reservationFileSchool") public WebElement schoolReservationUploader;
	@FindBy (id="engPlane") public WebElement engPlaneUploader;
	@FindBy (id="landMap") public WebElement landMapUploader;
	@FindBy (xpath = "//body") public WebElement pageBody;
	@FindBy(xpath ="//div[@class=\"ant-tabs-tab ng-star-inserted\"]") public WebElement tabsList;
   @FindBy(xpath ="//div[@class=\"ant-tabs-tab ng-star-inserted\"]//button[1]") public WebElement curriculumTab;

	//Curriculum details
	
	@FindBy (xpath = "//select-input[@ng-reflect-name=\"curriculum\"]//nz-select//input")  public WebElement curriculum_ddl;
	
	@FindBy (xpath = "(//label[@for='stage']//following::input[1])[1]")  public WebElement stage1_ddl;
	@FindBy (xpath = "(//nz-option-item[@title=\"Pre-Kindergarten\"])[1]")  public WebElement SelectStage1_ddl;
	@FindBy (xpath = "(//label[@for='grades']//following::input[1])[1]")  public WebElement grades1_ddl;
	@FindBy (xpath = "(//div[@class='ant-select-item-option-content'])[1]")  public WebElement SelectGrades1_ddl;
	@FindBy (xpath = "(//label[@for='capacity']//following::input[1])[1]")  public WebElement capacity1_TextBox;
	@FindBy (xpath = "(//label[@for='numberOfClassrooms']//following::input[1])[1]")  public WebElement numberOfClassRooms1_TextBox;
	
	@FindBy (xpath = "//span[normalize-space()='Add Stage']")  public WebElement addStage_btn;
	
	@FindBy (xpath = "(//button[@class=\"ant-btn ant-btn-lg ant-btn-icon-only\"])[3]")  public WebElement stage2Collaps_btn;
	@FindBy (xpath = "(//label[@for='stage']//following::input[1])[2]")  public WebElement stage2_ddl;
	@FindBy (xpath = "(//nz-option-item[@title=\"Pre-Kindergarten\"])[2]")  public WebElement SelectStage2_ddl;
	@FindBy (xpath = "(//label[@for='grades']//following::input[1])[2]")  public WebElement grades2_ddl;
	@FindBy (xpath = "(//div[@class='ant-select-item-option-content'])[2]")  public WebElement SelectGrades2_ddl;
	@FindBy (xpath = "(//label[@for='capacity']//following::input[1])[2]")  public WebElement capacity2_TextBox;
	@FindBy (xpath = "(//label[@for='numberOfClassrooms']//following::input[1])[2]")  public WebElement numberOfClassRooms2_TextBox;
	
	@FindBy (xpath = "(//button[@class=\"ant-btn ant-btn-lg ant-btn-icon-only\"])[4]")  public WebElement stage3Collaps_btn;
	@FindBy (xpath = "(//label[@for='stage']//following::input[1])[3]")  public WebElement stage3_ddl;
	@FindBy (xpath = "(//nz-option-item[@title=\"Pre-Kindergarten\"])[3]")  public WebElement SelectStage3_ddl;
	@FindBy (xpath = "(//label[@for='grades']//following::input[1])[3]")  public WebElement grades3_ddl;
	@FindBy (xpath = "(//div[@class='ant-select-item-option-content'])[3]")  public WebElement SelectGrades3_ddl;
	@FindBy (xpath = "(//label[@for='capacity']//following::input[1])[3]")  public WebElement capacity3_TextBox;
	@FindBy (xpath = "(//label[@for='numberOfClassrooms']//following::input[1])[3]")  public WebElement numberOfClassRooms3_TextBox;
	

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']") public  WebElement schoolDetailsNext_btn;



    
	
}
