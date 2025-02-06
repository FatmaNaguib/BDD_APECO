package Definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;


import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_AppointmentNotificationforEmployees extends APECOTestBase{

	private final ScenarioContext scenarioContext;
	
	public AllActionsDefinition_AppointmentNotificationforEmployees(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
	}
	@Then("The Applicant Applies for a New Appointment Notification for Employees in Private Schools Request")
	public void the_applicant_applies_for_a_new_appointment_notification_for_employees_in_private_schools_request() throws InterruptedException, AWTException, IOException {
		driver.get("https://apeco-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/auth/login");
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		 userServicesPageActions.clickAppointmentNotificationforEmployeesRequestLink();
		 String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		 userSchoolsListActions.selectSchool(licensedSchoolName);
	//	 userSchoolsListActions.selectSchool("New Education School 37913");
		 
			apointmentNotificationforEmployeesActions.enterEmployeesGeneralData("Permanent notification");
			apointmentNotificationforEmployeesActions.enterBasicCandidateData("Mahmoud Shaker", "Emirati", "Male", "Math", "Australian", "Pre-Kindergarten", "Teacher", "Single", "2001-12-17", "UAE", "123456789987654", "2031-12-17", "A12345", "2031-12-17", "Muslim", "2031-12-17", "مدينة عجمان", "fatma_naguib22@hotmail.com", "010052265598");
			apointmentNotificationforEmployeesActions.enterEmployeeQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");	
			apointmentNotificationforEmployeesActions.uploadEmployeeAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");	
			apointmentNotificationforEmployeesActions.payRequestfees();
			String apointmentNotificationforEmployeesRequestNumber = apointmentNotificationforEmployeesActions.getRequestNumber();
			scenarioContext.setData("apointmentNotificationforEmployeesRequestNumber",apointmentNotificationforEmployeesRequestNumber );
			assertTrue(apointmentNotificationforEmployeesRequestNumber.length() > 0);
	//		Thread.sleep(1000);
			commonFunctions.implicitWait(10);
			userWorkspacePageActions.logout();	
	}
	
	@Then("The Employee Aprroves The Appointment Notification for Employees in Private Schools Request")
	public void the_employee_aprroves_the_appointment_notification_for_employees_in_private_schools_request() throws InterruptedException, IOException, AWTException {
		Thread.sleep(1000);
		driver.get(properties.getProperty("AdminPortalUrl"));
	//	driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		adminLoginPageActions.selectEngLang();
		  adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));  
		String  apointmentNotificationforEmployeesRequestNumber = (String) scenarioContext.getData("apointmentNotificationforEmployeesRequestNumber");		 
		adminAgentQueueActions.adminSearchforaRequest(apointmentNotificationforEmployeesRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen(apointmentNotificationforEmployeesRequestNumber);
			adminAppointmentNotificationforEmployeesActions.employeeApprovesTheAppointmentNotificationforEmployeesRequest();	
			 adminAgentQueueActions.checkRequestStatus(apointmentNotificationforEmployeesRequestNumber, "Closed - Accepted");
//			   adminAgentQueueActions.adminOpenAgentQueueScreen();
//				 commonFunctions.implicitWait(20);
//				    adminAgentQueueActions.adminRequestSearchAfterAction(String.valueOf(apointmentNotificationforEmployeesRequestNumber));
//				 commonFunctions.implicitWait(10);
//				 
//			        String requestStatus =adminAgentQueueActions.getRequestServiceAndStatus();
//			    
//			        System.out.println("Request Status: " + requestStatus);
//			         assertEquals(requestStatus,"Closed - Accepted");
			        //adminAgentQueueActions.adminLogout();
	}
}
