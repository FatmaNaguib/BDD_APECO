package Bases;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v129.network.Network;
import org.openqa.selenium.devtools.v129.network.model.RequestId;
import org.openqa.selenium.devtools.v129.network.model.Response;

import org.openqa.selenium.firefox.FirefoxDriver;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import AdminPortaPageslLocators.AdminInitialApprovalRequestDetailsLocators;
import AdminPortaPageslLocators.AdminloginPageLocatore;
import AdminPortaPageslLocators.AdminSchoolRenewalRequestDetailsLocators;
import AdminPortalPagesActions.AdminAgentQueueActions;
import AdminPortalPagesActions.AdminChangeOrAddPartnerActions;
import AdminPortalPagesActions.AdminChangeSchoolLocationActions;
import AdminPortalPagesActions.AdminChangeSchoolManagerActions;
import AdminPortalPagesActions.AdminChangeSchoolNameActions;
import AdminPortalPagesActions.AdminComplaintActions;
import AdminPortalPagesActions.AdminFinalApprovalActions;
import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import AdminPortalPagesActions.AdminLoginPageActions;
import AdminPortalPagesActions.AdminModificationorAdditiontoSchoolBuildingActions;
import AdminPortalPagesActions.AdminModificationorIncreaseinTuitionFeesActions;
import AdminPortalPagesActions.AdminPublishingAnnouncementsActions;
import AdminPortalPagesActions.AdminReducingEducationalStagesActions;
import AdminPortalPagesActions.AdminSchoolLicenseCancellationRequestsActions;
import AdminPortalPagesActions.AdminSchoolRenewalRequestDetailsActions;
import AdminPortalPagesActions.AdminServicesListPageActions;
import UserPortalPagesActions.InternationalTravelActions;
import UserPortalPagesActions.AddingEducationalStagesActions;
import UserPortalPagesActions.AnnualActivitiesandProgramsActions;
import UserPortalPagesActions.AppointmentNotificationforEmployeesActions;
import UserPortalPagesActions.CancleSchoolLicenseActions;
import UserPortalPagesActions.ChangeOrAddPartnerActions;
import UserPortalPagesActions.ChangeSchoolLocationActions;
import UserPortalPagesActions.ChangeSchoolManagerActions;
import UserPortalPagesActions.ChangeSchoolNameActions;
import UserPortalPagesActions.EmployeesExperienceCertificateRatificationActions;
import UserPortalPagesActions.EventPermitbyanExternalEntityActions;
import UserPortalPagesActions.FinalApprovalActions;
import UserPortalPagesActions.InitialApplovalDocumentsPageActions;
import UserPortalPagesActions.InitialApplovalOwnersProfilesPageActions;
import UserPortalPagesActions.InitialApplovalSchoolInformationPageActions;
import UserPortalPagesActions.PublishingAnnouncementsPageActions;
import UserPortalPagesActions.ReducingEducationalStagesActions;
import UserPortalPagesActions.SubmitaComplaintActions;
import UserPortalPagesActions.UserLoginPageActions;
import UserPortalPagesActions.UserRequestsPageActions;
import UserPortalPagesActions.UserSchoolsListActions;
import UserPortalPagesActions.UserServicesPageActions;
import UserPortalPagesActions.UserWorkspacePageActions;
import UserPortalPagesActions.LicenseRenewalActions;
import UserPortalPagesActions.ModificationorAdditiontoSchoolBuildingActions;
import UserPortalPagesActions.ModificationorIncreaseinTuitionFeesActions;
import UserPortalPagesActions.PartnerWithdrawalRequestActions;
import UserPortalPagesLocators.InternationalTravelLocators;
import UserPortalPagesLocators.CancleSchoolLicenseLocators;
import UserPortalPagesLocators.ChangeSchoolManagerLocators;
import UserPortalPagesLocators.ChangeSchoolNameLocators;
import UserPortalPagesLocators.EmployeesExperienceCertificateRatificationLocators;
import UserPortalPagesLocators.EventPermitbyanExternalEntityLocators;
import UserPortalPagesLocators.FinalApprovalLocators;
import UserPortalPagesLocators.InitialApplovalDocumentsPageLocators;
import UserPortalPagesLocators.InitialApplovalOwnersProfilesPageLocators;
import UserPortalPagesLocators.InitialApplovalSchoolInformationPageLocators;
import UserPortalPagesLocators.LicenseRenewalLocators;
import UserPortalPagesLocators.PublishingAnnouncementsPageLocators;
import  UserPortalPagesLocators.UserServicesPageLocators;
import Util.TestUtil;


public class APECOTestBase {

	public static  Properties properties ;
	public static  WebDriver driver;
	
	public static UserServicesPageLocators userServicesPageLocators;
	
	public static  UserLoginPageActions userLoginPageActions;
	public static UserWorkspacePageActions userWorkspacePageActions ;
	
	public static InitialApplovalOwnersProfilesPageActions initialApplovalOwnersProfilesPageActions;
	public 	static InitialApplovalOwnersProfilesPageLocators initialApplovalOwnersProfilesPageLocators;
	
	public static InitialApplovalSchoolInformationPageLocators initialApplovalSchoolInformationPageLocatoes;
	public static InitialApplovalSchoolInformationPageActions initialApplovalSchoolInformationPageActions;
	
	public static InitialApplovalDocumentsPageActions initialApplovalDocumentsPageActions;
	public static InitialApplovalDocumentsPageLocators initialApplovalDocumentsPageLocators;
	
	public static  FinalApprovalActions finalApprovalActions;
	public static  FinalApprovalLocators finalApprovalLocators;
	
	
	public static 	PublishingAnnouncementsPageLocators publishingAnnouncementsPageLocatos;
	public static PublishingAnnouncementsPageActions publishingAnnouncementsPageActions;
	
	public static InternationalTravelLocators approvalforInternationalTravelLocators ;
	public static InternationalTravelActions approvalforInternationalTravelActions;
	
	public static 	UserSchoolsListActions userSchoolsListActions;
	public static UserSchoolsListActions selectSchoolActions;
	
	public static LicenseRenewalLocators licenseRenewalLocators;
	public static LicenseRenewalActions  licenseRenewalActions;
	

	public static ChangeSchoolNameLocators changeSchoolNameLocators;
	public static ChangeSchoolNameActions changeSchoolNameActions;
	
	public static ChangeSchoolManagerLocators changeSchoolManagerLocators;
	public static ChangeSchoolManagerActions changeSchoolManagerActions;
	
	public static 	CancleSchoolLicenseLocators cancleSchoolLicenseLocators;
	public static 	CancleSchoolLicenseActions  cancleSchoolLicenseActions ;
	
	public  static EventPermitbyanExternalEntityActions eventPermitbyanExternalEntityActions;
	public  static EventPermitbyanExternalEntityLocators eventPermitbyanExternalEntityLocators;
	
	public  static EmployeesExperienceCertificateRatificationLocators employeesExperienceCertificateRatificationLocators;
	public  static EmployeesExperienceCertificateRatificationActions employeesExperienceCertificateRatificationActions;

	
	public  static ChangeOrAddPartnerActions changeOrAddPartnerActions;
	public  static PartnerWithdrawalRequestActions partnerWithdrawalRequestActions;
	public static AppointmentNotificationforEmployeesActions apointmentNotificationforEmployeesActions;
	public static ChangeSchoolLocationActions changeSchoolLocationActions;
	public static UserServicesPageActions userServicesPageActions;
	public static ModificationorAdditiontoSchoolBuildingActions modificationorAdditiontoSchoolBuildingActions;
	public static ModificationorIncreaseinTuitionFeesActions modificationorIncreaseinTuitionFeesActions;
	public static AddingEducationalStagesActions addingEducationalStagesActions;
	public static ReducingEducationalStagesActions reducingEducationalStagesActions;
	public static AnnualActivitiesandProgramsActions annualActivitiesandProgramsActions;
	public static UserRequestsPageActions userRequestsPageActions;
	public static SubmitaComplaintActions submitaComplaintActions;
	public static CommonFunctions commonFunctions;
	
	public static AdminLoginPageActions adminLoginPageActions;
	public static AdminServicesListPageActions adminServicesListPageActions;
	public static AdminloginPageLocatore adminLoginPageLcators;
	public static AdminAgentQueueActions adminAgentQueueActions;
	public static AdminSchoolRenewalRequestDetailsActions adminRequestDetailsActions;
	public static AdminSchoolRenewalRequestDetailsLocators aminRequestDetailsLocators;
	public static AdminInitialApprovalRequestDetailsActions adminInitialApprovalRequestDetailsActions;
	public static AdminPublishingAnnouncementsActions adminPublishingAnnouncementsActions;
	public static  AdminComplaintActions adminComplaintActions;
	public static	AdminFinalApprovalActions adminFinalApprovalActions;
	public static AdminChangeSchoolNameActions adminChangeSchoolNameActions;
	public static AdminInitialApprovalRequestDetailsLocators adminInitialApprovalRequestDetailsLocators;
	public  static AdminChangeSchoolManagerActions adminChangeSchoolManagerActions;
	public  static AdminModificationorIncreaseinTuitionFeesActions adminModificationorIncreaseinTuitionFeesActions;
	public  static AdminModificationorAdditiontoSchoolBuildingActions adminModificationorAdditiontoSchoolBuildingActions;
	public  static AdminSchoolLicenseCancellationRequestsActions adminSchoolLicenseCancellationRequestsActions;
	public static AdminChangeOrAddPartnerActions adminChangeOrAddPartnerActions;
	public static AdminSchoolRenewalRequestDetailsActions adminSchoolRenewalRequestDetailsActions;
	public static AdminChangeSchoolLocationActions adminChangeSchoolLocationActions;
	public static AdminReducingEducationalStagesActions adminReducingEducationalStagesActions;

	 public APECOTestBase() throws IOException {
			properties = new Properties();
			FileInputStream confgFile = new FileInputStream("./src/test/java/Config/confg.properties");
			properties.load(confgFile);
	 }
	
	
	public void initialization(String url) throws IOException {

		String	browserName = properties.getProperty("browser");
	    setupDriver(browserName);
        driver.get(url);
        configureDriver();
	}
	

	   
	   private void setupDriver(String browserName) {
		if(browserName.equals("chrome")) {
			
	
			ChromeOptions chromeOptions = new ChromeOptions();
			
			
		chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			chromeOptions.addArguments("--disable-extensions");
			 boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));
	        if (isHeadless) {
	        	chromeOptions.addArguments("--headless");
	        	chromeOptions.addArguments("--window-size=1920,1080");
	        }

	        System.out.println("Headless mode: " + isHeadless);
			
	//	chromeOptions.addArguments("--headless");
		/*
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
			chromeOptions.merge(desiredCapabilities);*/
			
			
		//	chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			chromeOptions.addArguments("--incognito");
			
			driver = new ChromeDriver(chromeOptions);
			
		}else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
            throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
	   }
	
		
		 private void configureDriver() {

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLACIT_WAIT));	
	}
		 
		 public class ResponseWrapper {
			    public JsonObject Json = null;
			    public String String = null;
			}
		 public ResponseWrapper  setDevTools(String url) {
			// System.out.println(url);
				DevTools devTools = ((ChromeDriver) driver).getDevTools();
				devTools.createSession();
				devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty())); 
			    final ResponseWrapper responseWrapper = new ResponseWrapper();

				devTools.addListener(Network.responseReceived(), responseReceived ->{
					Response response = responseReceived.getResponse();
					RequestId requestId = responseReceived.getRequestId();
					//System.out.println(response.getUrl());
					if(response.getStatus()==200 && response.getUrl().equals(url)) {
						//System.out.println("match: "+response.getUrl());
			            String responseBody = devTools.send(Network.getResponseBody(requestId)).getBody();
			            responseWrapper.String = responseBody;
			            responseWrapper.Json = JsonParser.parseString(responseBody).getAsJsonObject();
					}								
				});
			    return responseWrapper;
		 }
		
	
	public void UserPagesInitialization() throws IOException {
		userLoginPageActions = new UserLoginPageActions();
		userWorkspacePageActions = new UserWorkspacePageActions();
		userServicesPageActions = new UserServicesPageActions();
		userSchoolsListActions = new UserSchoolsListActions();
		
		
		initialApplovalOwnersProfilesPageLocators = new InitialApplovalOwnersProfilesPageLocators();
		initialApplovalOwnersProfilesPageActions= new InitialApplovalOwnersProfilesPageActions();
		
		
		initialApplovalSchoolInformationPageLocatoes = new InitialApplovalSchoolInformationPageLocators();
		 initialApplovalSchoolInformationPageActions = new InitialApplovalSchoolInformationPageActions();
		 
		 initialApplovalDocumentsPageLocators = new InitialApplovalDocumentsPageLocators();
		 initialApplovalDocumentsPageActions = new InitialApplovalDocumentsPageActions();
		 
		 finalApprovalActions = new FinalApprovalActions();
		 finalApprovalLocators = new FinalApprovalLocators();
		 
		 publishingAnnouncementsPageLocatos = new  PublishingAnnouncementsPageLocators();
		 publishingAnnouncementsPageActions = new PublishingAnnouncementsPageActions();
		 
		 changeSchoolNameLocators = new ChangeSchoolNameLocators();
		 changeSchoolNameActions =new  ChangeSchoolNameActions();
		 
		 approvalforInternationalTravelLocators = new InternationalTravelLocators();
		 approvalforInternationalTravelActions = new InternationalTravelActions();
		 
		 eventPermitbyanExternalEntityActions = new EventPermitbyanExternalEntityActions();
		 eventPermitbyanExternalEntityLocators = new EventPermitbyanExternalEntityLocators();
		 

		 licenseRenewalLocators = new LicenseRenewalLocators();
		 licenseRenewalActions = new LicenseRenewalActions();
		 changeSchoolLocationActions = new ChangeSchoolLocationActions();
		 changeSchoolManagerLocators = new ChangeSchoolManagerLocators();
		 changeSchoolManagerActions = new ChangeSchoolManagerActions();
		 changeOrAddPartnerActions = new ChangeOrAddPartnerActions();
			cancleSchoolLicenseLocators = new CancleSchoolLicenseLocators();
			cancleSchoolLicenseActions = new CancleSchoolLicenseActions();
			employeesExperienceCertificateRatificationActions = new EmployeesExperienceCertificateRatificationActions();
			employeesExperienceCertificateRatificationLocators  = new EmployeesExperienceCertificateRatificationLocators();
			partnerWithdrawalRequestActions = new PartnerWithdrawalRequestActions();
			apointmentNotificationforEmployeesActions = new AppointmentNotificationforEmployeesActions();
			modificationorAdditiontoSchoolBuildingActions = new ModificationorAdditiontoSchoolBuildingActions();
			modificationorIncreaseinTuitionFeesActions = new ModificationorIncreaseinTuitionFeesActions();
			addingEducationalStagesActions = new AddingEducationalStagesActions();
			reducingEducationalStagesActions = new ReducingEducationalStagesActions();
			annualActivitiesandProgramsActions = new AnnualActivitiesandProgramsActions();
			submitaComplaintActions = new SubmitaComplaintActions();
		 userServicesPageLocators = new UserServicesPageLocators();
		 userRequestsPageActions = new UserRequestsPageActions();
		commonFunctions = new CommonFunctions();
		
		
		
	}
		public void AdminPagesInitialization() throws IOException {
		adminLoginPageActions = new AdminLoginPageActions();
		adminLoginPageLcators  = new AdminloginPageLocatore();
		adminServicesListPageActions = new AdminServicesListPageActions();
		adminAgentQueueActions = new AdminAgentQueueActions();
		adminRequestDetailsActions = new AdminSchoolRenewalRequestDetailsActions();
		adminInitialApprovalRequestDetailsActions = new AdminInitialApprovalRequestDetailsActions();
		 adminPublishingAnnouncementsActions = new AdminPublishingAnnouncementsActions();
		 adminComplaintActions = new  AdminComplaintActions();
		 adminFinalApprovalActions = new  AdminFinalApprovalActions();
		 adminChangeSchoolNameActions = new AdminChangeSchoolNameActions();
			adminInitialApprovalRequestDetailsLocators = new AdminInitialApprovalRequestDetailsLocators();
			adminChangeSchoolManagerActions = new AdminChangeSchoolManagerActions();
			adminModificationorIncreaseinTuitionFeesActions = new AdminModificationorIncreaseinTuitionFeesActions();
			adminModificationorAdditiontoSchoolBuildingActions = new AdminModificationorAdditiontoSchoolBuildingActions();
			adminSchoolLicenseCancellationRequestsActions = new AdminSchoolLicenseCancellationRequestsActions();
			adminChangeOrAddPartnerActions = new AdminChangeOrAddPartnerActions();
			adminSchoolRenewalRequestDetailsActions = new AdminSchoolRenewalRequestDetailsActions();
			adminChangeSchoolLocationActions = new AdminChangeSchoolLocationActions();
			adminReducingEducationalStagesActions = new AdminReducingEducationalStagesActions ();
		}

	}
