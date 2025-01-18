package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import UserPortalPagesLocators.ModificationorAdditiontoSchoolBuildingLocators;

public class ModificationorAdditiontoSchoolBuildingActions extends APECOTestBase{

	ModificationorAdditiontoSchoolBuildingLocators modificationorAdditiontoSchoolBuildingLocators;
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public ModificationorAdditiontoSchoolBuildingActions() throws IOException {
		super();
		modificationorAdditiontoSchoolBuildingLocators = new ModificationorAdditiontoSchoolBuildingLocators();
		PageFactory.initElements(driver, modificationorAdditiontoSchoolBuildingLocators);	}
	
	public void enterSchoolDetails(
			String requestType,String consultant, 
			 String schoolAddress, String genderText,
			 String locationNumberEn	, String locationNumberAr,
			String landArea ,String buildingArea,
			String TotalIndoorCourtArea,
			String totalExternalCanopyArea, 
			String typeBuildingMaterials,
			String relationshiptoSchoolBuilding
		) throws AWTException, InterruptedException {
		commonFunctions.moveToWebElement(modificationorAdditiontoSchoolBuildingLocators.requestType_ddl);
		commonFunctions.enterddlValue(modificationorAdditiontoSchoolBuildingLocators.requestType_ddl, requestType);
		modificationorAdditiontoSchoolBuildingLocators.consultantTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.consultantTextbox.sendKeys(consultant);
		modificationorAdditiontoSchoolBuildingLocators.schoolAddressTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.schoolAddressTextbox.sendKeys(schoolAddress);
		js.executeScript("window.scrollBy(0,500)");
		//commonFunctions.moveToWebElement(changeSchoolLocationLocators.gender_ddl);
		//commonFunctions.enterddlValue(changeSchoolLocationLocators.gender_ddl, genderText);
		modificationorAdditiontoSchoolBuildingLocators.locationNumberEn_Textbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.locationNumberEn_Textbox.sendKeys(locationNumberEn);
		modificationorAdditiontoSchoolBuildingLocators.locationNumberAr_Textbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.locationNumberAr_Textbox.sendKeys(locationNumberAr);
		//changeSchoolLocationLocators.locationNumberAr_Textbox.clear();
		//commonFunctions.moveToWebElement(changeSchoolLocationLocators.buildingOwnership_ddl);
		//commonFunctions.enterddlValue(changeSchoolLocationLocators.landOwnership_ddl, landOwnershipText);
		//commonFunctions.enterddlValue(changeSchoolLocationLocators.buildingOwnership_ddl, buildingOwnershipText);
		//js.executeScript("window.scrollBy(0,1000)");
		modificationorAdditiontoSchoolBuildingLocators.landAreaTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.landAreaTextbox.sendKeys(landArea);
		modificationorAdditiontoSchoolBuildingLocators.buildingAreaTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.buildingAreaTextbox.sendKeys(buildingArea);
	//	js.executeScript("window.scrollBy(0,2000)");
		modificationorAdditiontoSchoolBuildingLocators.totalIndoorCourtAreaTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.totalIndoorCourtAreaTextbox.sendKeys(TotalIndoorCourtArea);
		modificationorAdditiontoSchoolBuildingLocators.totalExternalCanopyAreaTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.totalExternalCanopyAreaTextbox.sendKeys(totalExternalCanopyArea);
		modificationorAdditiontoSchoolBuildingLocators.typeBuildingMaterialsTextbox.sendKeys(typeBuildingMaterials);
		modificationorAdditiontoSchoolBuildingLocators.relationshiptoSchoolBuildingTextbox.clear();
		modificationorAdditiontoSchoolBuildingLocators.relationshiptoSchoolBuildingTextbox.sendKeys(relationshiptoSchoolBuilding);
		commonFunctions.moveToWebElement(modificationorAdditiontoSchoolBuildingLocators.nextBtn);
		modificationorAdditiontoSchoolBuildingLocators.nextBtn.click();
	}
	public void uploadAttachments(
			String officialLetter,
			 String currentEngineeringPlan,
			String newEngineeringPlan, String landMap 
			) throws AWTException, InterruptedException {
		js.executeScript("window.scrollBy(0,-1000)");
		//Thread.sleep(1000);
		commonFunctions.uploadfile(modificationorAdditiontoSchoolBuildingLocators.officialLetter_uploader, officialLetter);
		commonFunctions.uploadfile(modificationorAdditiontoSchoolBuildingLocators.currentEngineeringPlan_uploader,currentEngineeringPlan);
		commonFunctions.uploadfile(modificationorAdditiontoSchoolBuildingLocators.newEngineeringPlan_uploader, newEngineeringPlan);
		commonFunctions.uploadfile(modificationorAdditiontoSchoolBuildingLocators.landMap_uploader, landMap);
		js.executeScript("window.scrollBy(0,300)");
		commonFunctions.moveToWebElement(modificationorAdditiontoSchoolBuildingLocators.nextBtn);
		Thread.sleep(1000);
		modificationorAdditiontoSchoolBuildingLocators.nextBtn.click();
	}
	public void submitModificationorAdditiontoSchoolBuildingRequest(){
		modificationorAdditiontoSchoolBuildingLocators.dataAcknowledge_Checkbox.click();
		modificationorAdditiontoSchoolBuildingLocators.submit_btn.click();
	}
	
	public String confirmRequest() throws InterruptedException {
		Thread.sleep(1000);
		commonFunctions.waitElementToBevisible(modificationorAdditiontoSchoolBuildingLocators.confirmation_msg);
	String msg = modificationorAdditiontoSchoolBuildingLocators.confirmation_msg.getText();
	 String ModificationorAdditiontoSchoolBuildingRequest = msg.replaceAll("[^0-9]","");
	 System.out.println(ModificationorAdditiontoSchoolBuildingRequest);
	 commonFunctions.waitElementToBevisible(modificationorAdditiontoSchoolBuildingLocators.confirmation_btn);

	modificationorAdditiontoSchoolBuildingLocators.confirmation_btn.click();
	return ModificationorAdditiontoSchoolBuildingRequest;
	}
	
	public void siteIsReady() {
		commonFunctions.clickWebElement(modificationorAdditiontoSchoolBuildingLocators.siteisReadyBtn);
		commonFunctions.clickWebElement(modificationorAdditiontoSchoolBuildingLocators.save_btn);
		
	}
	
	public void payRequestfees() throws InterruptedException {
		commonFunctions.waitElementToBevisible(modificationorAdditiontoSchoolBuildingLocators.pay_btn);
		commonFunctions.moveToWebElement(modificationorAdditiontoSchoolBuildingLocators.pay_btn);
		modificationorAdditiontoSchoolBuildingLocators.pay_btn.click();
		commonFunctions.moveToWebElement(modificationorAdditiontoSchoolBuildingLocators.payNow_btn);
		modificationorAdditiontoSchoolBuildingLocators.payNow_btn.click();
		commonFunctions.waitElementToBevisible(modificationorAdditiontoSchoolBuildingLocators.submit_btn);
		modificationorAdditiontoSchoolBuildingLocators.submit_btn.click();	
		commonFunctions.moveToWebElement(modificationorAdditiontoSchoolBuildingLocators.okay_btn);
		commonFunctions.waitElementToBevisible(modificationorAdditiontoSchoolBuildingLocators.okay_btn);
		modificationorAdditiontoSchoolBuildingLocators.okay_btn.click();
		Thread.sleep(3000);
	}
	
}
