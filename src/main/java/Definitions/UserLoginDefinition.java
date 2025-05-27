package Definitions;

import java.io.IOException;

import Bases.APECOTestBase;
import io.cucumber.java.en.Given;

public class UserLoginDefinition extends APECOTestBase {
	public UserLoginDefinition() throws IOException {
		super();
		UserPagesInitialization();

	}
	@Given("User Logged to The system2")
	public void user_logged_to_thesystem2() throws IOException {
		userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
	}
}
