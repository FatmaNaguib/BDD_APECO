package UserPortalPagesActions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Bases.APECOTestBase;
import Bases.CommonFunctions;
import UserPortalPagesLocators.UserSchoolsListLocators;
import UserPortalPagesLocators.UserServicesPageLocators;


public class UserServicesPageActions extends APECOTestBase {
	
	
	CommonFunctions commonFunctions = new CommonFunctions();
	UserServicesPageLocators userServicesPageLocators;
	UserSchoolsListLocators userSchoolsListLocators;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions Actions = new Actions(driver);
	
	public UserServicesPageActions() throws IOException {
		 userServicesPageLocators = new UserServicesPageLocators() ;
		 userSchoolsListLocators = new UserSchoolsListLocators();
	    PageFactory.initElements(driver, userServicesPageLocators);
	}
	

	public Boolean servicesPagelableIsDisplayed() {
		return userServicesPageLocators.servicesPageheaderlable.isDisplayed();
	}
	
	public String getServicesPageHeaderText() {
	return userServicesPageLocators.servicesPageheaderlable.getText();
	}

public void startChangeSchoolNameRequest() throws InterruptedException {
		
		js.executeScript("window.scrollTo(0,0)");
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-change-name&PageIndex=1&PageSize=1000");
		userServicesPageLocators.changeSchoolNamelServiceLink.click();
		new WebDriverWait(driver, Duration.ofSeconds(25)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
		js.executeScript("window.scrollTo(0,0)");
		
}
		public void startNewInitialApprovalRequest() throws InterruptedException {
/*
			js.executeScript("window.scrollTo(0,0)");
			ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=initial-approval-school&PageIndex=1&PageSize=1000");
			userServicesPageLocators.initialApprovalServiceLink.click();
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(driver1 -> responseWrapper.Json!= null);
			int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

			if(draftRequests==0) {

				userServicesPageLocators.pageBody.click();
			}	if(draftRequests!=0) {
				userServicesPageLocators.newRequest_btn.click();
			}
			js.executeScript("window.scrollTo(0,0)");
			
			*/
			
			js.executeScript("window.scrollTo(0,0)");
			//ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=final-approval-school&PageIndex=1&PageSize=1000");
			String currentUrl = driver.getCurrentUrl();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			userServicesPageLocators.initialApprovalServiceLink.click();
			try {
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("draft-request-dialog")));
			    System.out.println("Modal dialog is displayed.");
			    js.executeScript("window.scrollTo(0,0)");
			    commonFunctions.clickWebElement(  userServicesPageLocators.newRequest_btn);
			 //   userServicesPageLocators.newRequest_btn.click();
			} catch (org.openqa.selenium.TimeoutException e) {
			    try {
			        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
			        System.out.println("Redirection detected. New URL: " + driver.getCurrentUrl());
			        js.executeScript("window.scrollTo(0,0)");
			        userServicesPageLocators.pageBody.click();
			    } catch (org.openqa.selenium.TimeoutException ex) {
			        System.out.println("Neither modal dialog appeared nor redirection occurred.");
			    }
			}
}

	
	public void clickschoolLicenseRenewalLink() throws InterruptedException {
	/*	js.executeScript("window.scrollTo(0,0)");
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-license-renewal&PageIndex=1&PageSize=1000");
		userServicesPageLocators.schoolLicenseRenewalServiceLink.click();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
		js.executeScript("window.scrollTo(0,0)");*/
		
		js.executeScript("window.scrollTo(0,0)");
		//ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=final-approval-school&PageIndex=1&PageSize=1000");
		String currentUrl = driver.getCurrentUrl();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		userServicesPageLocators.schoolLicenseRenewalServiceLink.click();
		try {
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("draft-request-dialog")));
		    System.out.println("Modal dialog is displayed.");
		    js.executeScript("window.scrollTo(0,0)");
		    commonFunctions.clickWebElement( userServicesPageLocators.newRequest_btn);
		   // userServicesPageLocators.newRequest_btn.click();
		} catch (org.openqa.selenium.TimeoutException e) {
		    try {
		        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
		        System.out.println("Redirection detected. New URL: " + driver.getCurrentUrl());
		        js.executeScript("window.scrollTo(0,0)");
		        userServicesPageLocators.pageBody.click();
		    } catch (org.openqa.selenium.TimeoutException ex) {
		        System.out.println("Neither modal dialog appeared nor redirection occurred.");
		    }
		}
		

	}

	
public void clickChangeSchoolManagerLink() throws InterruptedException {

		js.executeScript("window.scrollTo(0,0)");
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-change-manager&PageIndex=1&PageSize=1000");
		
		userServicesPageLocators.principalChangeServiceLink.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(50)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
		js.executeScript("window.scrollTo(0,0)");
	}

	
	public void clickPublishingAnnouncementsServiceLink() throws InterruptedException {
		
		js.executeScript("window.scrollTo(0,0)");
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=publish-advertisement&PageIndex=1&PageSize=1000");
		userServicesPageLocators.publishingAnnouncementsServiceLink.click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
		js.executeScript("window.scrollTo(0,0)");
		
	}
	public void clickInternationalTravelServiceLink() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,1000)");	
		commonFunctions.moveToWebElement(userServicesPageLocators.internationalTravelServiceLink);
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=international-travel&PageIndex=1&PageSize=1000");
		userServicesPageLocators.internationalTravelServiceLink.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
;
	}
	
	public void clickSchoolLicenseCancelationServiceLink() throws InterruptedException {
		
		commonFunctions.moveToWebElement(userServicesPageLocators.schoolLicenseCancelationServiceLink);

		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-license-cancellation&PageIndex=1&PageSize=1000");
		userServicesPageLocators.schoolLicenseCancelationServiceLink.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}

	
	}
	public void clickChangeSchoolManagerServiceLink() throws InterruptedException {
		
		commonFunctions.moveToWebElement(userServicesPageLocators.changeSchoolManagerServiceLink);

		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-change-manager&PageIndex=1&PageSize=1000");
		userServicesPageLocators.changeSchoolManagerServiceLink.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
	}
	
	public void clickEventPermitbyanExternalEntityServiceLink() throws InterruptedException {
		
		commonFunctions.moveToWebElement(userServicesPageLocators.eventPermitbyanExternalEntityServiceLink);
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=third-party-event-permit&PageIndex=1&PageSize=1000");
		userServicesPageLocators.eventPermitbyanExternalEntityServiceLink.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
	}
	
	public void clickexperienceCertificateforEmployeesServiceLink() throws InterruptedException {
		
		commonFunctions.moveToWebElement(userServicesPageLocators.experienceCertificateforEmployeesServiceLink);

		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=employees-experience-certificate&PageIndex=1&PageSize=1000");
		userServicesPageLocators.experienceCertificateforEmployeesServiceLink.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
	}
	
	
	public void clickeFinalApprovalServiceLink() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		//ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=final-approval-school&PageIndex=1&PageSize=1000");
		String currentUrl = driver.getCurrentUrl();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		userServicesPageLocators.finalApprovalServiceLink.click();
		try {
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("draft-request-dialog")));
		    System.out.println("Modal dialog is displayed.");
		    js.executeScript("window.scrollTo(0,0)");
		    commonFunctions.clickWebElement( userServicesPageLocators.newRequest_btn);
		   // userServicesPageLocators.newRequest_btn.click();
		} catch (org.openqa.selenium.TimeoutException e) {
		    try {
		        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
		        System.out.println("Redirection detected. New URL: " + driver.getCurrentUrl());
		        js.executeScript("window.scrollTo(0,0)");
		        userServicesPageLocators.pageBody.click();
		    } catch (org.openqa.selenium.TimeoutException ex) {
		        System.out.println("Neither modal dialog appeared nor redirection occurred.");
		    }
		}
		
	}
	
public void clickChangeorAddPartnerRequestLink() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
		ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-change-owners&PageIndex=1&PageSize=1000");
		userServicesPageLocators.changeorAddPartnerServiceLink.click();
		new WebDriverWait(driver, Duration.ofSeconds(40)).until(driver1 -> responseWrapper.Json!= null);
		int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

		if(draftRequests==0) {
			userServicesPageLocators.pageBody.click();
		}	if(draftRequests!=0) {
			userServicesPageLocators.newRequest_btn.click();
		}
		js.executeScript("window.scrollTo(0,0)");
}
			public void clickPartnerWithdrawalRequestLink() throws InterruptedException {
						js.executeScript("window.scrollTo(0,0)");
						ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-partner-withdrawal&PageIndex=1&PageSize=1000");
						userServicesPageLocators.PartnerWithdrawalServiceLink.click();
						new WebDriverWait(driver, Duration.ofSeconds(20)).until(driver1 -> responseWrapper.Json!= null);
						int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
					
						if(draftRequests==0) {
							userServicesPageLocators.pageBody.click();
						}	if(draftRequests!=0) {
							userServicesPageLocators.newRequest_btn.click();
						}
						js.executeScript("window.scrollTo(0,0)");
			}
			public void clickAppointmentNotificationforEmployeesRequestLink() throws InterruptedException {
						js.executeScript("window.scrollTo(0,0)");
						ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-notifying-staff-recruitment&PageIndex=1&PageSize=1000");
						userServicesPageLocators.appointmentNotificationforEmployeesServiceLink.click();
						new WebDriverWait(driver, Duration.ofSeconds(100)).until(driver1 -> responseWrapper.Json!= null);
						int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
		
						if(draftRequests==0) {
							userServicesPageLocators.pageBody.click();
						}	if(draftRequests!=0) {
							userServicesPageLocators.newRequest_btn.click();
						}
						js.executeScript("window.scrollTo(0,0)");
			}
			
			public void clickChangeSchoolLocationLink() throws InterruptedException {
			/*	js.executeScript("window.scrollTo(0,0)");
				ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=change-school-location&PageIndex=1&PageSize=1000");
				userServicesPageLocators.changeSchoolLocationServiceLink.click();				
				new WebDriverWait(driver, Duration.ofSeconds(20)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
				if(draftRequests==0) {
					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");*/
				
				
				
				js.executeScript("window.scrollTo(0,0)");
				//ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=final-approval-school&PageIndex=1&PageSize=1000");
				String currentUrl = driver.getCurrentUrl();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				commonFunctions.moveToWebElement(userServicesPageLocators.changeSchoolLocationServiceLink);
				userServicesPageLocators.changeSchoolLocationServiceLink.click();
				try {
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("draft-request-dialog")));
				    System.out.println("Modal dialog is displayed.");
				    js.executeScript("window.scrollTo(0,0)");
				    commonFunctions.clickWebElement(  userServicesPageLocators.newRequest_btn);
				 //   userServicesPageLocators.newRequest_btn.click();
				} catch (org.openqa.selenium.TimeoutException e) {
				    try {
				        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
				        System.out.println("Redirection detected. New URL: " + driver.getCurrentUrl());
				        js.executeScript("window.scrollTo(0,0)");
				        userServicesPageLocators.pageBody.click();
				    } catch (org.openqa.selenium.TimeoutException ex) {
				        System.out.println("Neither modal dialog appeared nor redirection occurred.");
				    }
				}
				
			}
			
			public void clickModificationorAdditiontoSchoolBuildingLink() throws InterruptedException {
				js.executeScript("window.scrollTo(0,0)");
				ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=adding-school-building&PageIndex=1&PageSize=1000");
				userServicesPageLocators.modificationorAdditiontoaSchoolServiceLink.click();				
				new WebDriverWait(driver, Duration.ofSeconds(50)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
				if(draftRequests==0) {
					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");
			}
		
			public void clickModificationorIncreaseinTuitionFeesLink() throws InterruptedException {
				js.executeScript("window.scrollTo(0,0)");
				ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=school-tuition-fees-increase&PageIndex=1&PageSize=1000");
				userServicesPageLocators.modificationorIncreaseinTuitionFeesServiceLink.click();				
				new WebDriverWait(driver, Duration.ofSeconds(20)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
				if(draftRequests==0) {
					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");
			}
			
			public void clickAddingEducationalStagesLink() throws InterruptedException {
				//js.executeScript("window.scrollTo(0,0)");
				commonFunctions.moveToWebElement(userServicesPageLocators.addingEducationalStagesServiceLink);
				ResponseWrapper responseWrapper = setDevTools( "https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=adding-school-stages&PageIndex=1&PageSize=1000");
				userServicesPageLocators.addingEducationalStagesServiceLink.click();				
				new WebDriverWait(driver, Duration.ofSeconds(13)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
				if(draftRequests==0) {
					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");
			}
			
			public void clickReducingEducationalStagesLink() throws InterruptedException {
			
			/*	js.executeScript("window.scrollBy(0,3500)");
			//	commonFunctions.moveToWebElement(userServicesPageLocators.reducingEducationalStagesServiceLink);
				ResponseWrapper responseWrapper = setDevTools( "https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=reducing-school-stages&PageIndex=1&PageSize=1000");
				userServicesPageLocators.reducingEducationalStagesServiceLink.click();				
				new WebDriverWait(driver, Duration.ofSeconds(14)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
				if(draftRequests==0) {
					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");*/
				
				
				js.executeScript("window.scrollTo(0,0)");
				//ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=final-approval-school&PageIndex=1&PageSize=1000");
				String currentUrl = driver.getCurrentUrl();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				commonFunctions.moveToWebElement(userServicesPageLocators.changeSchoolLocationServiceLink);
				userServicesPageLocators.reducingEducationalStagesServiceLink.click();	
				try {
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("draft-request-dialog")));
				    System.out.println("Modal dialog is displayed.");
				    js.executeScript("window.scrollTo(0,0)");
				    commonFunctions.clickWebElement(  userServicesPageLocators.newRequest_btn);
				 //   userServicesPageLocators.newRequest_btn.click();
				} catch (org.openqa.selenium.TimeoutException e) {
				    try {
				        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
				        System.out.println("Redirection detected. New URL: " + driver.getCurrentUrl());
				        js.executeScript("window.scrollTo(0,0)");
				        userServicesPageLocators.pageBody.click();
				    } catch (org.openqa.selenium.TimeoutException ex) {
				        System.out.println("Neither modal dialog appeared nor redirection occurred.");
				    }
				}
				
			}
			
			public void clickAnnualActivitiesandProgramsLink() throws InterruptedException {
				
				js.executeScript("window.scrollBy(0,3500)");
			commonFunctions.moveToWebElement(userServicesPageLocators.annualActivitiesandProgramsServiceLink);
				ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=plan-approval-school-trips&PageIndex=1&PageSize=1000");
				userServicesPageLocators.annualActivitiesandProgramsServiceLink.click();				
				new WebDriverWait(driver, Duration.ofSeconds(14)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;
				if(draftRequests==0) {
					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");
			}
			
			public void startSubmitaComplaintRequest() throws InterruptedException {
				
				userServicesPageLocators.serviceType_ddl.click();
				userServicesPageLocators.parentServices_ddlValue.click();
				Thread.sleep(1000);
				js.executeScript("window.scrollTo(0,0)");
				ResponseWrapper responseWrapper = setDevTools("https://apeco-gateway-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/ServiceDesk/api/Requests/GetRequests?Status=0&ServiceCode=submit-complaint&PageIndex=1&PageSize=1000");
				userServicesPageLocators.SubmitaComplaintServiceLink.click();
				new WebDriverWait(driver, Duration.ofSeconds(30)).until(driver1 -> responseWrapper.Json!= null);
				int draftRequests = responseWrapper.Json.has("draftRequests") ? responseWrapper.Json.get("draftRequests").getAsInt() : -1;

				if(draftRequests==0) {

					userServicesPageLocators.pageBody.click();
				}	if(draftRequests!=0) {
					userServicesPageLocators.newRequest_btn.click();
				}
				js.executeScript("window.scrollTo(0,0)");
	}

}
