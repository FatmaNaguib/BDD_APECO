package StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import AdminPortalPagesActions.AdminInitialApprovalRequestDetailsActions;
import Bases.APECOTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserApplyforApprovalforInternationalTravelDefinition extends APECOTestBase {

	public UserApplyforApprovalforInternationalTravelDefinition() throws IOException {
		super();
		UserPagesInitialization();
	}

	
@Given("^User Loged in and is on Workspace Pagee$")
	public void user_loged_in_and_is_on_workspace_pagee() throws IOException {
		  userLoginPageActions.userlogin(properties.getProperty("username"), properties.getProperty("password"));
		    System.out.println("1-User Loged in and is on Workspace Page");
		    
	}

	@When("^User Navigats to The Services Screenn$")
	public void user_navigats_to_the_services_screenn() throws IOException {
		userWorkspacePageActions.clickonSideMenu_Services_link();
		// String servicesHeaderLable;
		// servicesHeaderLable = userServicesPageActions.getServicesPageHeaderText();
//		assertEquals(servicesHeaderLable,"Services");
		 System.out.println("2-User Navigats to The Services Screen");
	}

	@Then("^User Starts New  International Travel Request$")
	public void user_starts_new_international_travel_request() throws InterruptedException {
		userServicesPageActions.clickInternationalTravelServiceLink();
		userSchoolsListActions.selectSchool(AdminInitialApprovalRequestDetailsActions.licensedSchoolName);
		 System.out.println("3-User Starts New  International Travel Request");
	}

	@Then("^User Enters Valid Data in All Fields and Sumbits The Requesttt$")
	public void user_enters_valid_data_in_all_fields_and_sumbits_the_requesttt() throws AWTException, InterruptedException {
		//"British",
	   approvalforInternationalTravelActions.submitInternationalTravelRequest("Egypt",  "Pre-Kindergarten", "2025-11-20", "2025-11-22", "Goal of The Trip", "Emad Ali", "01005065998", "employee_01@hotmail.com", "Daily Trip Program","Academic Plan.pdf");
	}
	
}
