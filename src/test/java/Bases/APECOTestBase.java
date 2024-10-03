package Bases;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import UserPortalPagesActions.UserLoginPageActions;
import UserPortalPagesActions.UserWorkspacePageActions;

import Util.TestUtil;




public class APECOTestBase {

	public static  Properties properties ;
	public static  WebDriver driver;
	
	public static  UserLoginPageActions userLoginPageActions;
	public static UserWorkspacePageActions userWorkspacePageActions ;
	
	public void initialization() throws IOException {
		
		properties = new Properties();
		FileInputStream confgFile = new FileInputStream("D:\\My Projects\\BDD_APECO\\src\\test\\java\\Config\\confg.properties");
		properties.load(confgFile);
		
		String	browserName = properties.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
				chromeOptions.addArguments("--incognito");
			
			driver = new ChromeDriver(chromeOptions);

		}else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
            throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
		
		driver.get(properties.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLACIT_WAIT));	

	  
	    
	}
	
	public void PagesInitialization() throws IOException {
		userLoginPageActions = new UserLoginPageActions();
		userWorkspacePageActions = new UserWorkspacePageActions();
	}
	
	
	
	

	}
