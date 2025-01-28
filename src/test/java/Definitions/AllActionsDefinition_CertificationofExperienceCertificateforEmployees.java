package Definitions;

import java.awt.AWTException;
import java.io.IOException;


import Bases.APECOTestBase;
import Util.ScenarioContext;
import io.cucumber.java.en.Then;

public class AllActionsDefinition_CertificationofExperienceCertificateforEmployees  extends APECOTestBase {

	
	private final ScenarioContext scenarioContext;
	public AllActionsDefinition_CertificationofExperienceCertificateforEmployees(ScenarioContext scenarioContext) throws IOException {
		this.scenarioContext = scenarioContext;
		AdminPagesInitialization();
		UserPagesInitialization();
	}

	@Then("The Applicant Applies for a New Certification of Experience Certificate for Employees Request")
	public void the_applicant_applies_for_a_new_certification_of_experience_certificate_for_employees_request() throws IOException, InterruptedException, AWTException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		userWorkspacePageActions.clickonSideMenu_Services_link();
		userServicesPageActions.clickexperienceCertificateforEmployeesServiceLink();	
		String licensedSchoolName = (String) scenarioContext.getData("licensedSchoolName");
		userSchoolsListActions.selectSchool(licensedSchoolName);	
	//	userSchoolsListActions.selectSchool("New Education School 93688");	
		employeesExperienceCertificateRatificationActions.enterExperienceCertificateData("Mohamed Samir","محمد سمير","English", "اللغة الانجليزية","English Teacher","مدرس لغة انجليزية", "British", "Pre-Kindergarten", "2020-11-04", "2023-11-04");
		employeesExperienceCertificateRatificationActions.enterExperienceCertificateAttachments("UploadFile.pdf","UploadFile.pdf");
		employeesExperienceCertificateRatificationActions.payExperienceCertificateRequestRequestfees();
		String CertificationofExperienceCertificateforEmployeesRequestNumber =  employeesExperienceCertificateRatificationActions.getRequestNumber();
		scenarioContext.setData("CertificationofExperienceCertificateforEmployeesRequestNumber",CertificationofExperienceCertificateforEmployeesRequestNumber);
		//Thread.sleep(1000);
		commonFunctions.implicitWait(10);
		userWorkspacePageActions.logout();
	}

	@Then("The Employee Approves The Certification of Experience Certificate for Employees Request")
	public void the_employee_approves_the_certification_of_experience_certificate_for_employees_request() throws InterruptedException, IOException, AWTException {
		Thread.sleep(1000);
		  driver.get("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
		  adminLoginPageActions.selectEngLang();	  
			adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
			String CertificationofExperienceCertificateforEmployeesRequestNumber = (String) scenarioContext.getData("CertificationofExperienceCertificateforEmployeesRequestNumber");
		    adminAgentQueueActions.adminSearchforaRequest(CertificationofExperienceCertificateforEmployeesRequestNumber);
			adminAgentQueueActions.adminOpenRequestDetailsScreen();
			adminAppointmentNotificationforEmployeesActions.employeeApprovesTheAppointmentNotificationforEmployeesRequest();
	}
}
