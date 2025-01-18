package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAndLogout_AdminDefinition extends APECOTestBase {

	
	public LoginAndLogout_AdminDefinition() throws IOException {
		AdminPagesInitialization();
	}

	
/*	@Given("^The user is on admin login page$")
	public void user_is_on_admin_login_page() throws InterruptedException {
		adminLoginPageActions.selectEngLang();
	}
	@When("The user enters The Review Employee's username and Review Employee's password and click on login button")
	public void the_user_enters_the_review_employee_s_username_and_review_employee_s_password_and_click_on_login_button() throws IOException {
		adminLoginPageActions.adminLogin(properties.getProperty("reviewEmployeeUsername"), properties.getProperty("reviewEmployeePassword"));
	}
	@When("^The user enters employee username and employeepassword and click on login button$")
	public void user_enters_employeeusername_and_employeepassword_and_click_on_login_button() throws IOException, InterruptedException {
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
	}

	@Then("^The user is navigated to the Admin Services List$")
	public void user_is_navigated_to_the_admin_services_list() {
		System.out.println("user is navigated to the Admin Services List");
	}*/

	@When("The user enters The Admin School Manager's username and Admin School Manager's password and click on login button")
	public void the_user_enters_the_admin_school_manager_s_username_and_admin_school_manager_s_password_and_click_on_login_button() throws IOException, InterruptedException {
		adminLoginPageActions.selectEngLang();
		adminLoginPageActions.adminLogin(properties.getProperty("adminSchoolManagerUsername"), properties.getProperty("adminSchoolManagerPassword"));
	}


@Given("The Admin School Manager is loged in")
public void the_admin_school_manager_is_loged_in() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("adminSchoolManagerUsername"), properties.getProperty("adminSchoolManagerPassword"));
}

@Given("The Employee is Logged in To The System")
public void the_employee_is_logged_in_to_the_system() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("employeeUsername"), properties.getProperty("employeePassword"));
}
@When("The Employee log out")
public void the_employee_log_out() throws InterruptedException {
   adminAgentQueueActions.adminLogout();
}

@Then("The Admin Logsin")
public void the_admin_logsin() {
	adminLoginPageActions.selectEngLang();
    adminLoginPageActions.adminLoginurl("https://apeco-admin-portal-qc.graycliff-e2cfdb11.eastus.azurecontainerapps.io/login");
}

@Given("The Engineer is logged in")
public void the_engineer_is_logged_in() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
}

@Given("The Employee is logged in")
public void the_employee_is_logged_in() throws IOException, InterruptedException {
	adminLoginPageActions.selectEngLang();
	adminLoginPageActions.adminLogin(properties.getProperty("employee_01@hotmail.com"), properties.getProperty("Ap@ssw0rd"));
}


}
