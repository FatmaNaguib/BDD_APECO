package UserPortalPagesActions;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.AddingEducationalStagesLocators;

public class AddingEducationalStagesActions extends APECOTestBase {
	CommonFunctions commonFunctions = new CommonFunctions();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	AddingEducationalStagesLocators addingEducationalStagesLocators;
	public AddingEducationalStagesActions() throws IOException {
		super();
		addingEducationalStagesLocators = new AddingEducationalStagesLocators();
		PageFactory.initElements(driver,addingEducationalStagesLocators);
	}
	
	public void enterSchoolData(
			String applicantPhone, String relationshipSchoolBuilding			
			) throws InterruptedException, AWTException {
		js.executeScript("window.scrollBy(0,1500)");
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.applicantPhone_Textbox);
		addingEducationalStagesLocators.applicantPhone_Textbox.clear();
		addingEducationalStagesLocators.applicantPhone_Textbox.sendKeys(applicantPhone);
		addingEducationalStagesLocators.relationshipSchoolBuilding_Textbox.sendKeys(relationshipSchoolBuilding);
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.nextButton);
		addingEducationalStagesLocators.nextButton.click();
	}

	public void addingThefourthEducationalStages(
			String stage, String capacity,
			String numberofClassRooms, String grade,
			String newTuitionFees,String newSchoolBookFees,String newSchoolUniformFees
			) throws AWTException, InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.curriculum_Collabs);
		addingEducationalStagesLocators.curriculum_Collabs.click();
		addingEducationalStagesLocators.addStageBtn.click();
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.stages_collabs);
		addingEducationalStagesLocators.stages_collabs.click();
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.stage4_ddl);
		commonFunctions.enterddlValue(addingEducationalStagesLocators.stage4_ddl, stage);
		addingEducationalStagesLocators.capacity4_TextBox.sendKeys(capacity);
		addingEducationalStagesLocators.numberofClassRooms4_TextBox.sendKeys(numberofClassRooms);
		js.executeScript("window.scrollBy(0,1000)");
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.newTuitionFees_TextBox);
		commonFunctions.enterddlValue(addingEducationalStagesLocators.grades4_ddl,grade);
		addingEducationalStagesLocators.newTuitionFees_TextBox.sendKeys(newTuitionFees);
		addingEducationalStagesLocators.newSchoolBookFees_TextBox.sendKeys(newSchoolBookFees);
		addingEducationalStagesLocators.newSchoolUniformFees_TextBox.sendKeys(newSchoolUniformFees);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.nextButton);
		addingEducationalStagesLocators.nextButton.click();
	}

	public void addingEducationalStagesAttachments(
			String officialLetter, String currentApprovedEngineeringPlan, 
			String newEngineeringPlanAfterGradeChange, String landMap
			) throws AWTException, InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.uploadfile(addingEducationalStagesLocators.officialLetterUploader, officialLetter);
		commonFunctions.uploadfile(addingEducationalStagesLocators.currentApprovedEngineeringPlanUploader, currentApprovedEngineeringPlan);
		commonFunctions.uploadfile(addingEducationalStagesLocators.newEngineeringPlanAfterGradeChangeUploader,newEngineeringPlanAfterGradeChange);
		commonFunctions.uploadfile(addingEducationalStagesLocators.landMapUploader,landMap);
		Thread.sleep(1000);
		addingEducationalStagesLocators.nextButton.click();
	}
	
	public void payRequestfees() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		commonFunctions.moveToWebElement(addingEducationalStagesLocators.dataAcknowledge_Checkbox);
		addingEducationalStagesLocators.dataAcknowledge_Checkbox.click();
		addingEducationalStagesLocators.paymentAcknowledge_Checkbox.click();
		addingEducationalStagesLocators.submitButton.click();
	}
	
	public String confirmRequest() throws InterruptedException {
		commonFunctions.waitElementToBevisible(addingEducationalStagesLocators.confirmation_msg);
		 String msg =addingEducationalStagesLocators.confirmation_msg.getText();
		 String addingEducationalStages = msg.replaceAll("[^0-9]","");
		commonFunctions.clickWebElement(addingEducationalStagesLocators.confirmation_btn);
		return addingEducationalStages;
	}
}
