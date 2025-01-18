package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.InitialApplovalSchoolInformationPageLocators;

public class InitialApplovalSchoolInformationPageActions  extends APECOTestBase {

	InitialApplovalSchoolInformationPageLocators initialApplovalSchoolInformationPageLocatoes;
	 CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;

	
	public InitialApplovalSchoolInformationPageActions() throws IOException {
		super();
		 initialApplovalSchoolInformationPageLocatoes = new InitialApplovalSchoolInformationPageLocators();
		PageFactory.initElements(driver,  initialApplovalSchoolInformationPageLocatoes);
	}
	


	public void enterSchoolDetails(
			String requestType, String arabicSchoolName, 
			String englishSchoolName, String consultant, 
			 String schoolAddress, String genderText, String locationNumberEn, 
			 String locationNumberAr,
			 String landOwnershipText,String buildingOwnershipText,
			String landArea ,String buildingArea,
			String TotalIndoorCourtArea,
			String totalExternalCanopyArea, String relationshiptoSchoolBuilding,
			String applicantPhone, 		
			String schoolReservationUploader,
			String engPlaneFile, String landMapFile) throws AWTException, InterruptedException {
	
	
		js.executeScript("window.scrollBy(0,-3000)");
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.requestType_ddl);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.requestType_ddl, requestType);
		initialApplovalSchoolInformationPageLocatoes.arabicSchoolNameTextbox.sendKeys(arabicSchoolName);
		initialApplovalSchoolInformationPageLocatoes.englishSchoolNameTextbox.sendKeys(englishSchoolName);
		initialApplovalSchoolInformationPageLocatoes.consultantTextbox.sendKeys(consultant);
		initialApplovalSchoolInformationPageLocatoes.schoolAddressTextbox.sendKeys(schoolAddress);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.gender_ddl);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.gender_ddl, genderText);
		initialApplovalSchoolInformationPageLocatoes.locationNumberEn_Textbox.sendKeys(locationNumberEn);
		initialApplovalSchoolInformationPageLocatoes.locationNumberAr_Textbox.sendKeys(locationNumberAr);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.buildingOwnership_ddl);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.landOwnership_ddl, landOwnershipText);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.buildingOwnership_ddl, buildingOwnershipText);
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.landAreaTextbox.sendKeys(landArea);
		initialApplovalSchoolInformationPageLocatoes.buildingAreaTextbox.sendKeys(buildingArea);
		js.executeScript("window.scrollBy(0,2000)");
		initialApplovalSchoolInformationPageLocatoes.totalIndoorCourtAreaTextbox.sendKeys(TotalIndoorCourtArea);
		initialApplovalSchoolInformationPageLocatoes.totalExternalCanopyAreaTextbox.sendKeys(totalExternalCanopyArea);
		initialApplovalSchoolInformationPageLocatoes.relationshiptoSchoolBuildingTextbox.sendKeys(relationshiptoSchoolBuilding);
		initialApplovalSchoolInformationPageLocatoes.applicantPhoneTextbox.sendKeys(applicantPhone);
		commonFunctions.uploadfile(initialApplovalSchoolInformationPageLocatoes.schoolReservationUploader, schoolReservationUploader);
		commonFunctions.uploadfile(initialApplovalSchoolInformationPageLocatoes.engPlaneUploader, engPlaneFile);
		commonFunctions.uploadfile(initialApplovalSchoolInformationPageLocatoes.landMapUploader, landMapFile);
		js.executeScript("window.scrollBy(0,-3000)");
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.curriculumTab);
		initialApplovalSchoolInformationPageLocatoes.curriculumTab.click();
	
	}


	public void enterOneStageCurriculumDetails(
			String curriculum, 
			String stage1,	String grades1,
			String capacity1, String numberofClassRooms1
			) throws InterruptedException {

		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.curriculum_ddl);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.curriculum_ddl, curriculum);
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage1_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.stage1_ddl, stage1);
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.grades1_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.grades1_ddl, grades1);		
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.capacity1_TextBox.sendKeys(capacity1);
		initialApplovalSchoolInformationPageLocatoes.numberOfClassRooms1_TextBox.sendKeys(numberofClassRooms1);
		
		js.executeScript("window.scrollBy(0,3000)");
		commonFunctions.waitElementToBeClickable(initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn);
		initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn.click();
	}

	public void enterTwoStageCurriculumDetails(
			String curriculum, 
			String stage1,	String grades1,
			String capacity1, String numberofClassRooms1,
			String stage2,	String grades2,
			String capacity2, String numberofClassRooms2
			) throws InterruptedException {

		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.curriculum_ddl);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.curriculum_ddl, curriculum);
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage1_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.stage1_ddl, stage1);
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.grades1_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.grades1_ddl, grades1);		
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.capacity1_TextBox.sendKeys(capacity1);
		initialApplovalSchoolInformationPageLocatoes.numberOfClassRooms1_TextBox.sendKeys(numberofClassRooms1);
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.addStage_btn);
		initialApplovalSchoolInformationPageLocatoes.addStage_btn.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage2Collaps_btn);
		initialApplovalSchoolInformationPageLocatoes.stage2Collaps_btn.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage2_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.stage2_ddl, stage2);
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.grades2_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.grades2_ddl, grades2);		
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.capacity2_TextBox.sendKeys(capacity2);
		initialApplovalSchoolInformationPageLocatoes.numberOfClassRooms2_TextBox.sendKeys(numberofClassRooms2);
		js.executeScript("window.scrollBy(0,2000)");	
		commonFunctions.waitElementToBeClickable(initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn);
		initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn.click();
	}
	
	public void enterCurriculumDetails(
			String curriculum, 
			String stage1,	String grades1,
			String capacity1, String numberofClassRooms1,
			String stage2,	String grades2,
			String capacity2, String numberofClassRooms2,
			String stage3,	String grades3,
			String capacity3, String numberofClassRooms3
			) throws InterruptedException {

		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.curriculum_ddl);
		commonFunctions.enterddlValue(initialApplovalSchoolInformationPageLocatoes.curriculum_ddl, curriculum);
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage1_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.stage1_ddl, stage1);
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.grades1_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.grades1_ddl, grades1);		
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.capacity1_TextBox.sendKeys(capacity1);
		initialApplovalSchoolInformationPageLocatoes.numberOfClassRooms1_TextBox.sendKeys(numberofClassRooms1);
		
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.addStage_btn);
		initialApplovalSchoolInformationPageLocatoes.addStage_btn.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage2Collaps_btn);
		initialApplovalSchoolInformationPageLocatoes.stage2Collaps_btn.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage2_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.stage2_ddl, stage2);
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.grades2_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.grades2_ddl, grades2);		
		initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.capacity2_TextBox.sendKeys(capacity2);
		initialApplovalSchoolInformationPageLocatoes.numberOfClassRooms2_TextBox.sendKeys(numberofClassRooms2);
//		
//		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.addStage_btn);
//		
//		initialApplovalSchoolInformationPageLocatoes.addStage_btn.click();
		commonFunctions.clickWebElement(initialApplovalSchoolInformationPageLocatoes.addStage_btn);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage3Collaps_btn);
		initialApplovalSchoolInformationPageLocatoes.stage3Collaps_btn.click();
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.stage3_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.stage3_ddl, stage3);
		js.executeScript("window.scrollBy(0,1000)");
		//initialApplovalSchoolInformationPageLocatoes.pageBody.click();
	commonFunctions.clickWebElement(initialApplovalSchoolInformationPageLocatoes.pageBody);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.grades3_ddl);
		commonFunctions.enterCurriculumddlValue(initialApplovalSchoolInformationPageLocatoes.grades3_ddl, grades3);		
		//initialApplovalSchoolInformationPageLocatoes.pageBody.click();
		js.executeScript("window.scrollBy(0,1000)");
		initialApplovalSchoolInformationPageLocatoes.capacity3_TextBox.sendKeys(capacity3);
		initialApplovalSchoolInformationPageLocatoes.numberOfClassRooms3_TextBox.sendKeys(numberofClassRooms3);
		js.executeScript("window.scrollBy(0,1000)");	
		js.executeScript("window.scrollBy(0,3000)");
		commonFunctions.waitElementToBeClickable(initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn);
		commonFunctions.moveToWebElement(initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn);
		initialApplovalSchoolInformationPageLocatoes.schoolDetailsNext_btn.click();
	}

	
	
}
