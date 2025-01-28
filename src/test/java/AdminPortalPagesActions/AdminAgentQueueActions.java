package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminAgentQueueLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;


public class AdminAgentQueueActions extends APECOTestBase {
	AdminAgentQueueLocators adminAgentQueueLocators;
	CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	public AdminAgentQueueActions() throws IOException {
		adminAgentQueueLocators = new AdminAgentQueueLocators();
		PageFactory.initElements(driver, adminAgentQueueLocators);
	}
	
	public void adminSearchforaRequest(String requestNumber) throws InterruptedException {
		commonFunctions.moveToWebElement(adminAgentQueueLocators.saerch_Textbox);
		adminAgentQueueLocators.saerch_Textbox.sendKeys(requestNumber);
	}
	
	public void adminSearchforaRequest2(String requestNumber, WebElement webElement ) throws InterruptedException {
		commonFunctions.moveToWebElement(adminAgentQueueLocators.saerch_Textbox);		
		js.executeScript("arguments[0].value='"+ requestNumber +"';", webElement);
		adminAgentQueueLocators.saerch_Textbox.sendKeys(requestNumber);
	}
	
	
	public void adminOpenRequestDetailsScreen()  {
		commonFunctions.clickWebElement(adminAgentQueueLocators.requestNumberLink);
	}
	
	public void adminLogout() throws InterruptedException {
		commonFunctions.fluentWait(adminAgentQueueLocators.adminNameLink);
		commonFunctions.clickWebElement(adminAgentQueueLocators.adminNameLink);
		commonFunctions.clickWebElement(adminAgentQueueLocators.adminLogoutLink);

	}

	
}
