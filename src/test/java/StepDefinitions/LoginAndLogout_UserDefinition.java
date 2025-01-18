package StepDefinitions;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import Bases.APECOTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAndLogout_UserDefinition extends APECOTestBase  {
	
	public LoginAndLogout_UserDefinition() throws IOException {
		UserPagesInitialization();

	}
	@Given("User Logged to The system")
	public void user_logged_to_thesystem() throws IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}

	@Then("The application is logged out")
	public void the_application_is_logged_out() {
		userWorkspacePageActions.logout();
	}
	
	@When("User Logged To The system")
	public void user_logged_to_the_system() throws IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}
	
	@When("^User enters username and password and click on login button$")
	public void user_enters_username_and_password_and_click_on_login_button() throws IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}
	
	
	@Then("^User should be able to login sucessfully and wrokspace page opens$")
	public void user_should_be_able_to_login_sucessfully_and_wrokspace_page_opens() throws IOException {
		String workspacePageHeader =userWorkspacePageActions.getworkspaceHeader();
		System.out.println(workspacePageHeader);
		assertEquals(workspacePageHeader, "Workspace");
	}
	
}
