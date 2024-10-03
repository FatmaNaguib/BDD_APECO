package StepDefinitions;



import static org.testng.Assert.assertEquals;

import java.io.IOException;
import Bases.APECOTestBase;
import UserPortalPagesActions.UserLoginPageActions;
import UserPortalPagesActions.UserWorkspacePageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginDefinitions extends APECOTestBase  {
	

	
	/*public UserLoginDefinitions() throws IOException {
		super();

	}*/
	

	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		System.out.println("1-User is on login page");
	}
	
	
	@When("^User enters username and password and click on login button$")
	public void user_enters_username_and_password_and_click_on_login_button() throws IOException {
		
		UserLoginPageActions.login(properties.getProperty("username"), properties.getProperty("password"));
		System.out.println("2-User enters username and password and click on login button");
	}
	
	
	@Then("^User should be able to login sucessfully and wrokspace page opens$")
	public void user_should_be_able_to_login_sucessfully_and_wrokspace_page_opens() throws IOException {

		
				
		String workspacePageHeader =UserWorkspacePageActions.getworkspaceHeader();
		System.out.println(workspacePageHeader);
		assertEquals(workspacePageHeader, "Workspace");
		System.out.println("3-User should be able to login sucessfully and wrokspace page opens");
	}
}
