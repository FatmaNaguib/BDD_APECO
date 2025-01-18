package StepDefinitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.When;

public class Login_EngineerDefinition extends APECOTestBase {

	public Login_EngineerDefinition() throws IOException {
		UserPagesInitialization();
	}

	@When("The user enters The Engineer's' username and Engineer's password and click on login button")
	public void the_user_enters_the_engineer_s_username_and_engineer_s_password_and_click_on_login_button() throws IOException, InterruptedException {
		
		adminLoginPageActions.adminLogin(properties.getProperty("engineerUsername"), properties.getProperty("engineerPassword"));
	}


}
