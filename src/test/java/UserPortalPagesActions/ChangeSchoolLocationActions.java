package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import UserPortalPagesLocators.ChangeSchoolLocationLocators;

public class ChangeSchoolLocationActions extends APECOTestBase{

	ChangeSchoolLocationLocators changeSchoolLocationLocators;
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public ChangeSchoolLocationActions() throws IOException {
		super();
		changeSchoolLocationLocators = new ChangeSchoolLocationLocators();
		PageFactory.initElements(driver, changeSchoolLocationLocators);
	}
	//String genderText, 
	public void enterSchoolDetails(
			String requestType,String consultant, 
			 String schoolAddress, String genderText,
			 String locationNumberEn	, String locationNumberAr,
			String landArea ,String buildingArea,String typeBuildingMaterials,
			String TotalIndoorCourtArea,
			String totalExternalCanopyArea, String relationshiptoSchoolBuilding
		) throws AWTException, InterruptedException {
		commonFunctions.moveToWebElement(changeSchoolLocationLocators.requestType_ddl);
		commonFunctions.enterddlValue(changeSchoolLocationLocators.requestType_ddl, requestType);
		changeSchoolLocationLocators.consultantTextbox.clear();
		changeSchoolLocationLocators.consultantTextbox.sendKeys(consultant);
		changeSchoolLocationLocators.schoolAddressTextbox.clear();
		changeSchoolLocationLocators.schoolAddressTextbox.sendKeys(schoolAddress);
		js.executeScript("window.scrollBy(0,500)");
		//commonFunctions.moveToWebElement(changeSchoolLocationLocators.gender_ddl);
		//commonFunctions.enterddlValue(changeSchoolLocationLocators.gender_ddl, genderText);
		changeSchoolLocationLocators.locationNumberEn_Textbox.clear();
		changeSchoolLocationLocators.locationNumberEn_Textbox.sendKeys(locationNumberEn);
		changeSchoolLocationLocators.locationNumberAr_Textbox.clear();
		changeSchoolLocationLocators.locationNumberAr_Textbox.sendKeys(locationNumberAr);
		//changeSchoolLocationLocators.locationNumberAr_Textbox.clear();
		//commonFunctions.moveToWebElement(changeSchoolLocationLocators.buildingOwnership_ddl);
		//commonFunctions.enterddlValue(changeSchoolLocationLocators.landOwnership_ddl, landOwnershipText);
		//commonFunctions.enterddlValue(changeSchoolLocationLocators.buildingOwnership_ddl, buildingOwnershipText);
		//js.executeScript("window.scrollBy(0,1000)");
		changeSchoolLocationLocators.landAreaTextbox.clear();
		changeSchoolLocationLocators.landAreaTextbox.sendKeys(landArea);
		changeSchoolLocationLocators.buildingAreaTextbox.clear();
		changeSchoolLocationLocators.buildingAreaTextbox.sendKeys(buildingArea);
	//	js.executeScript("window.scrollBy(0,2000)");
		changeSchoolLocationLocators.totalIndoorCourtAreaTextbox.clear();
		changeSchoolLocationLocators.totalIndoorCourtAreaTextbox.sendKeys(TotalIndoorCourtArea);
		changeSchoolLocationLocators.totalExternalCanopyAreaTextbox.clear();
		changeSchoolLocationLocators.totalExternalCanopyAreaTextbox.sendKeys(totalExternalCanopyArea);
		changeSchoolLocationLocators.typeBuildingMaterialsTextbox.clear();
		changeSchoolLocationLocators.typeBuildingMaterialsTextbox.sendKeys(typeBuildingMaterials);
		changeSchoolLocationLocators.relationshiptoSchoolBuildingTextbox.clear();
		changeSchoolLocationLocators.relationshiptoSchoolBuildingTextbox.sendKeys(relationshiptoSchoolBuilding);
		commonFunctions.moveToWebElement(changeSchoolLocationLocators.nextBtn);
		changeSchoolLocationLocators.nextBtn.click();
		
	}
	//	
	public void uploadAttachments(
			String newEngineeringPlan,
			 String landMap,
			String timePlan, String parentsInformaingPlan,
			String validLeaseContractOrTitleDeed, 
			String certificateFromMunicipalityCivilDefense 
			) throws AWTException, InterruptedException {
		js.executeScript("window.scrollBy(0,-1000)");
		//Thread.sleep(1000);
		commonFunctions.uploadfile(changeSchoolLocationLocators.newEngineeringPlan_uploader, newEngineeringPlan);
		commonFunctions.uploadfile(changeSchoolLocationLocators.landMap_uploader, landMap);
		commonFunctions.uploadfile(changeSchoolLocationLocators.timePlan_uploader, timePlan);
		commonFunctions.uploadfile(changeSchoolLocationLocators.parentsInformaingPlan_uploader, parentsInformaingPlan);
		commonFunctions.uploadfile(changeSchoolLocationLocators.validLeaseContractOrTitleDeed_uploader, validLeaseContractOrTitleDeed);
		commonFunctions.uploadfile(changeSchoolLocationLocators.certificateFromMunicipalityCivilDefense_uploader, certificateFromMunicipalityCivilDefense);
		js.executeScript("window.scrollBy(0,300)");
		commonFunctions.moveToWebElement(changeSchoolLocationLocators.attachmentsNext_btn);
		Thread.sleep(1000);
		changeSchoolLocationLocators.attachmentsNext_btn.click();
	}
	public void submitChangeSchoolLocationRequest(){
		changeSchoolLocationLocators.dataAcknowledge_Checkbox.click();
		changeSchoolLocationLocators.submit_btn.click();
	}
	
	public String getRequestNumber() throws InterruptedException {
		Thread.sleep(1000);
	String msg = changeSchoolLocationLocators.confirmation_msg.getText();
	 String changeSchoolLocationRequestNumber = msg.replaceAll("[^0-9]","");
	 commonFunctions.clickWebElement(changeSchoolLocationLocators.confirmation_btn);
	return changeSchoolLocationRequestNumber;
	}

	public void siteIsReady() {
		commonFunctions.clickWebElement(changeSchoolLocationLocators.siteisReadyBtn);
		commonFunctions.clickWebElement(changeSchoolLocationLocators.save_btn);
		
	}
	
	public void payRequestfees() throws InterruptedException {
		commonFunctions.waitElementToBevisible(changeSchoolLocationLocators.pay_btn);
		commonFunctions.moveToWebElement(changeSchoolLocationLocators.pay_btn);
		changeSchoolLocationLocators.pay_btn.click();
		commonFunctions.moveToWebElement(changeSchoolLocationLocators.payNow_btn);
		changeSchoolLocationLocators.payNow_btn.click();
		commonFunctions.waitElementToBevisible(changeSchoolLocationLocators.submit_btn);
		changeSchoolLocationLocators.submit_btn.click();	
		commonFunctions.moveToWebElement(changeSchoolLocationLocators.okay_btn);
		commonFunctions.waitElementToBevisible(changeSchoolLocationLocators.okay_btn);
		changeSchoolLocationLocators.okay_btn.click();
		Thread.sleep(3000);
	}
}


