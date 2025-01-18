package UserPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import UserPortalPagesLocators.UserSchoolsListLocators;

public class UserSchoolsListActions extends APECOTestBase {

	UserSchoolsListLocators userSchoolsListLocators;
	
	public UserSchoolsListActions() throws IOException {
		userSchoolsListLocators = new UserSchoolsListLocators();
		 PageFactory.initElements(driver, userSchoolsListLocators);
	}
	
    public static String[] schoolName() {
		int randomNumber = commonFunctions.createRandomNumber();
		String schoolNameAr = "مدرسة العلم الحديث"+ " " +randomNumber;
		String schoolNameEng = "New Education School"+ " " +randomNumber;
		  return new String[]{schoolNameAr,schoolNameEng};
    }
    
    public WebElement findElementByDynamicValue(String dynamicValue) {
        String xpath = String.format("//span[normalize-space()='%s']", dynamicValue);
        return driver.findElement(By.xpath(xpath));
    }
    
public void selectSchool( String licensedSchoolName) throws InterruptedException {
//	System.out.println(adminInitialApprovalRequestDetailsActions.licensedSchoolName());
	//adminInitialApprovalRequestDetailsActions.getLicensedSchoolName();
	commonFunctions.moveToWebElement(findElementByDynamicValue(licensedSchoolName));
	WebElement schoolElement = findElementByDynamicValue(licensedSchoolName);
	commonFunctions.clickWebElement(schoolElement);
	//schoolElement.click();
	}
/*public void selectSchool2( ) throws InterruptedException {
	System.out.println(adminInitialApprovalRequestDetailsActions.licensedSchoolName());
	String schoolName = adminInitialApprovalRequestDetailsActions.licensedSchoolName();;
	commonFunctions.moveToWebElement(findElementByDynamicValue(schoolName));
	WebElement schoolElement = findElementByDynamicValue(schoolName);
	schoolElement.click();
	}*/

}
