package AdminPortalPagesActions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminAgentQueueLocators;
import Bases.APECOTestBase;
import Bases.CommonFunctions;



public class AdminAgentQueueActions extends APECOTestBase {
	AdminAgentQueueLocators adminAgentQueueLocators;
	CommonFunctions commonFunctions = new CommonFunctions();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 Actions actions = new Actions(driver);
	 
	public AdminAgentQueueActions() throws IOException {
		adminAgentQueueLocators = new AdminAgentQueueLocators();
		PageFactory.initElements(driver, adminAgentQueueLocators);
	}
	
	public void adminSearchforaRequest( String requestNumber) throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminAgentQueueLocators.requestLink);
		actions.sendKeys(adminAgentQueueLocators.saerch_Textbox,requestNumber);
		actions.build().perform();
		Thread.sleep(2000);
	}	
	
	public void adminRequestSearchAfterAction(String requestNumber) throws InterruptedException {
		commonFunctions.waitElementToBevisible(adminAgentQueueLocators.requestLink2);
		actions.sendKeys(adminAgentQueueLocators.saerch_Textbox,requestNumber);
		actions.build().perform();
		Thread.sleep(2000);
	}	
	
	public void adminOpenRequestDetailsScreen(String requestNumber)  {
		commonFunctions.implicitWait(10);
		commonFunctions.waitElementToBevisible(adminAgentQueueLocators.requestLink);
		String searchRequestLink = adminAgentQueueLocators.requestLink.getText();
 if (searchRequestLink.contains(requestNumber))   {
	 commonFunctions.clickWebElement(adminAgentQueueLocators.requestLink);
		}
 else {
     System.out.println("Request Not Found");
 }
		
	}
	
	public void checkRequestStatus(String requestNumber, String expectedRequestStatus) throws InterruptedException {
		 
		commonFunctions.implicitWait(10);
		 
		adminAgentQueueActions.adminOpenAgentQueueScreen();
			 commonFunctions.implicitWait(20);
			    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(requestNumber));
			 commonFunctions.implicitWait(10);
			 
		        String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
		    
		        System.out.println("Request Status: " + requestStatus);
		       assertEquals(requestStatus,expectedRequestStatus);
		     //   adminAgentQueueActions.adminLogout();
	}
	
	
	
	
	public void adminOpenAgentQueueScreen() throws InterruptedException {
	commonFunctions.waitElementToBevisible(adminAgentQueueLocators.servicesSideMenu_Btn);
		commonFunctions.clickWebElement(adminAgentQueueLocators.servicesSideMenu_Btn);
		commonFunctions.clickWebElement(adminAgentQueueLocators.agentQueue_Btn);
	}
	public  String getRequestServiceAndStatus() {
		commonFunctions.implicitWait(10);
		commonFunctions.waitElementToBevisible(adminAgentQueueLocators.requestStatus);
		String requestStatus = adminAgentQueueLocators.requestStatus.getText();
		return requestStatus;
	}
	
	
	
	public void adminLogout() throws InterruptedException {
		commonFunctions.fluentWait(adminAgentQueueLocators.adminNameLink);
		commonFunctions.clickWebElement(adminAgentQueueLocators.adminNameLink);
		commonFunctions.clickWebElement(adminAgentQueueLocators.adminLogoutLink);

	}

	
}
