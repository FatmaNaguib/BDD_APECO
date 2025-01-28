package Bases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class CommonFunctions extends APECOTestBase {

	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public CommonFunctions() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void fluentWait(WebElement webElement ) {
		Wait<WebDriver> wait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(40))  // Maximum time to wait
			    .pollingEvery(Duration.ofMillis(500)) // Interval between each poll
			    .ignoring(NoSuchElementException.class); // Exceptions to ignore
	    wait.until(driver -> {
	        // Check if the element is displayed
	        return webElement.isDisplayed() ? webElement : null;
	    });
			//	wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
			//	wait.until(ExpectedConditions.elementToBeClickable(webElementName));
	}
	
	
public void clickWebElement(WebElement webElement, String block) {
	commonFunctions.waitElementToBevisible(webElement);
	js.executeScript("arguments[0].scrollIntoView({ behavior: 'instant', block: '"+block+"' });", webElement);
	commonFunctions.waitElementToBeClickable(webElement);
	js.executeScript("arguments[0].click();", webElement);
}

public void clickWebElement(WebElement webElement) {
	clickWebElement(webElement, "end");
}	

	public void waitElementToBevisible(WebElement webElementName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(webElementName));
	}
	
	public void waitElementToBeClickable(WebElement webElementName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(webElementName));
	}
	
	public void moveToWebElement(WebElement webElement) {
		actions.moveToElement(webElement);
		actions.perform();
	}
	
	public void enterddlValue(WebElement dllName, String dllValue) {
		dllName.click();
		dllName.sendKeys(dllValue);
		dllName.sendKeys(Keys.RETURN);
	}
	
	public static String getPagedir(WebElement pageHtml) {
        String dir = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.dir;");
		return dir;
	}
	
	public void enterCurriculumddlValue(WebElement dllName, String dllValue) throws InterruptedException {
		dllName.click();
		dllName.sendKeys(dllValue);
		Thread.sleep(1000);
		dllName.sendKeys(Keys.RETURN);
	}
	
	public Boolean isActiveButton(WebElement webElement) {
		Boolean webElementIsActive = webElement.isEnabled();
		return webElementIsActive;
	}
		
	public String uplodedFilePath(String fileName) {	
		String filePath = "./src/test/resources/UploadFiles/";
		String fullFilePath = filePath + fileName;
		fullFilePath = Paths.get(fullFilePath).toAbsolutePath().toString();
		return fullFilePath;
	}
	
	public String getLableText(WebElement webElementt) {
		String lableText = webElementt.getText();
		return lableText;
	
		}
	
	public void  clicknextButton(WebElement buttonLink) {
		buttonLink.click();
	}

	public void uploadfile(WebElement uploaderName,String fileName ) throws AWTException, InterruptedException {
		js.executeScript("arguments[0].style.display='block';", uploaderName);
		waitElementToBevisible(uploaderName);
		waitElementToBeClickable(uploaderName);
		moveToWebElement(uploaderName);
		String fullFilePath = uplodedFilePath(fileName);	
		uploaderName.sendKeys(fullFilePath);
		Thread.sleep(5000);
	}
	public void approvalUploadfile(WebElement uploaderName,String fileName ) throws AWTException, InterruptedException {

		
		js.executeScript("arguments[0].style.display='block';", uploaderName);

		moveToWebElement(uploaderName);
		String fullFilePath = uplodedFilePath(fileName);	
		uploaderName.sendKeys(fullFilePath);
		driver.switchTo().defaultContent();
		uploaderName.sendKeys(fullFilePath);
		commonFunctions.implicitWait(50);
	}
	public int createRandomNumber() {
		 Random random = new Random();
		 int randomNumber = random.nextInt(100000);
		return randomNumber;
	}
//public void uploadfile(WebElement uploaderName,String fileName ) throws AWTException, InterruptedException {
//	
//	moveToWebElement(uploaderName);
//	//js.executeScript("window.scrollBy(0,1000);");
//	String fullFilePath = uplodedFilePath(fileName);
//	 StringSelection str = new StringSelection(fullFilePath);
//	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
//	 try {
//	 uploaderName.click();
//	Thread.sleep(3000);
//	 Robot robot = new Robot();
//     //pressing enter
//	 robot.keyPress(KeyEvent.VK_CONTROL);
//	 robot.keyPress(KeyEvent.VK_V);
//     //releasing ctrl+v
//	 robot.keyRelease(KeyEvent.VK_CONTROL);
//	 robot.keyRelease(KeyEvent.VK_V);
//     //pressing enter
//	 robot.keyPress(KeyEvent.VK_ENTER);
//	  //releasing enter
//     robot.keyRelease(KeyEvent.VK_ENTER);
//     Thread.sleep(5000);
//
//	 } catch (Exception exp) {
//		 exp.printStackTrace();
//	 }
//	
//}




}
