package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppointmentNotificationforEmployeesDefinition extends APECOTestBase  {
	
	
	public AppointmentNotificationforEmployeesDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}

	@When("User Starts New Appointment Notification for Employees in Private Schools Request")
	public void user_starts_new_appointment_notification_for_employees_in_private_schools_request() throws InterruptedException {
	   userServicesPageActions.clickAppointmentNotificationforEmployeesRequestLink();
	   userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
	}

	@Then("User Enters Employee Data")
	public void user_enters_employee_data() throws InterruptedException, AWTException {
		apointmentNotificationforEmployeesActions.enterEmployeesGeneralData("Permanent notification");
		apointmentNotificationforEmployeesActions.enterBasicCandidateData("Mahmoud Shaker", "Emirati", "Male", "Math", "Australian", "Pre-Kindergarten", "Teacher", "Single", "2001-12-17", "UAE", "123456789987654", "2031-12-17", "A12345", "2031-12-17", "Muslim", "2031-12-17", "مدينة عجمان", "fatma_naguib22@hotmail.com", "010052265598");
		apointmentNotificationforEmployeesActions.enterEmployeeQualificationsData("Bachelor's Degree", "Engineering", "2020-11-05", "Cairo university","UploadFile.pdf","UploadFile.pdf","UploadFile.pdf");
		
	}

	@Then("User Attaches The New Appointment Notification for Employees Request Documents")
	public void user_attaches_the_new_appointment_notification_for_employees_request_documents() throws AWTException, InterruptedException {
		apointmentNotificationforEmployeesActions.uploadEmployeeAttachments("UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "UploadFile.pdf", "Omar.jpeg", "UploadFile.pdf", "UploadFile.pdf");
	}

	@Then("User Pays The New Appointment Notification for Employees Request Fees")
	public void user_pays_the_new_appointment_notification_for_employees_request_fees() throws InterruptedException {
		apointmentNotificationforEmployeesActions.payRequestfees();
		apointmentNotificationforEmployeesActions.getRequestNumber();
	}

}
