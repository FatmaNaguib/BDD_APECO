package Bases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import AdminPortalPagesActions.AdminLoginPageActions;
import AdminPortalPagesActions.AdminServicesListPageActions;

import Util.TestUtil;

public class AdminTestBase {

	public static Properties properties ;
	public static WebDriver driver;
	
	public static AdminLoginPageActions adminLoginPageActions;
	public static AdminServicesListPageActions adminServicesListPageActions;
	
	public void  adminInitialization() throws IOException {

		properties = new Properties();
		String configPath = System.getProperty("config.path", "config.properties");
		FileInputStream configfile = new FileInputStream(configPath);
		properties.load(configfile);
		
		String	adminBrowserName = properties.getProperty("AdminBrowser");
		
		if(adminBrowserName.equals("chrome")) {
		
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			chromeOptions.addArguments("--incognito");
			
			driver = new ChromeDriver(chromeOptions);
			
		}else if (adminBrowserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
            throw new IllegalArgumentException("Browser not supported: " + adminBrowserName);
        }
		
		driver.get(properties.getProperty("AdminPortalUrl"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLACIT_WAIT));
		
	}

		public void AdminPagesInitialization() throws IOException {
		adminLoginPageActions = new AdminLoginPageActions();
		adminServicesListPageActions = new AdminServicesListPageActions();
			
		}
	
}
