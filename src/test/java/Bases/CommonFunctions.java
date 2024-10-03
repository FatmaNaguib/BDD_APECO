package Bases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CommonFunctions extends APECOTestBase {

	Actions actions = new Actions(driver);
	public CommonFunctions() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public void enterddlValue(WebElement dllName, String dllValue) {
		dllName.click();
		dllName.sendKeys(dllValue);
		dllName.sendKeys(Keys.RETURN);
	}
	
	public void moveToWebElement(WebElement webElement) {
	
		actions.moveToElement(webElement);
		actions.perform();
	}
	

	
	public Boolean isActiveButton(WebElement webElement) {
		Boolean webElementIsActive = webElement.isEnabled();
		return webElementIsActive;
	}
	
	
	public String uplodedFilePath(String fileName) {
		
		String filePath = "D:\\My Projects\\BDD_APECO\\src\\test\\resources\\UploadFiles";
		String fullFilePath = filePath + fileName;
		return fullFilePath;
	}
	
	public String getLableText(WebElement webElementt) {
		
		String lableText = webElementt.getText();
		return lableText;
	
		}
	
	
public void uploadfile(WebElement uploaderName,String fileName ) throws AWTException, InterruptedException {
	
	moveToWebElement(uploaderName);
	//js.executeScript("window.scrollBy(0,1000);");
	String fullFilePath = uplodedFilePath(fileName);
	 StringSelection str = new StringSelection(fullFilePath);
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
	 try {
	 uploaderName.click();
	Thread.sleep(3000);
	 Robot robot = new Robot();
     //pressing enter
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
     //releasing ctrl+v
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
     //pressing enter
	 robot.keyPress(KeyEvent.VK_ENTER);
	  //releasing enter
     robot.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(5000);

	 } catch (Exception exp) {
		 exp.printStackTrace();
	 }
	
}
}
