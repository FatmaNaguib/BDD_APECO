Feature: Apply And approve New Change School Name Request Successfully

@UserLogin 
Scenario: Check Thaat User Can Applay For New Initial Approval Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Applys for a New Initial Approval Three Stages Request Successfully

@AdminLogin 
Scenario: Employee Approvs The Initial Approval Request

	Given The user is on admin login page
	When The user enters employee username and employeepassword and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Request
	Then The Employee Opens The Request Details
	Then The Employee Aprroves The Initial Approval Request

@AdminLogin 
Scenario: Engineer Approvs The Initial Approval Request

	Given The user is on admin login page
	When The user enters The Engineer's' username and Engineer's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Request
	Then The Employee Opens The Request Details
	Then The Engineer Aprroves The Initial Approval Request


@UserLogin 
Scenario: Check Thet  User Can Apply for New Final Aproval Request Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The Services Screen
	When User Starts New Final Aproval Request 
Then User Applys for a New Final Approval Request Successfully

@AdminLogin 
Scenario: Review Employee Approvs The Final Approval Request

	Given The user is on admin login page
	When The user enters The Review Employee's username and Review Employee's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Final Approval Request
	Then The Employee Opens The Request Details
	Then The Review Employee Aprroves The Final Approval Request
	
@AdminLogin 
Scenario: Review Employee Scheduls Meeting for The Final Approval Request Manager Successfully

	Given The user is on admin login page
	When The user enters The Review Employee's username and Review Employee's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Final Approval Request
	Then The Employee Opens The Request Details
	Then The Review Employee Scheduls Meeting for The Final Approval Request Manager
	
	
	@AdminLogin 
Scenario: Admin School Manager Approvs The Scheduled Meeting Successfully


	Given The user is on admin login page
	When The user enters The Admin School Manager's username and Admin School Manager's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Final Approval Request
	Then The Employee Opens The Request Details
	Then The Admin School Manager Approves The Scheduled Meeting
	
@AdminLogin 
Scenario: Review Employee Meets The School Manager Successfully

	Given The user is on admin login page
	When The user enters The Review Employee's username and Review Employee's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Final Approval Request
	Then The Employee Opens The Request Details
	Then The Review Employee Meets The School Manager
	
	
	
	@AdminLogin 
Scenario: Engineer Approvs The Final  Approval Request

	Given The user is on admin login page
	When The user enters The Engineer's' username and Engineer's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Final Approval Request
	Then The Employee Opens The Request Details
	Then The Engineer Aprroves The Final Approval Request
	
@AdminLogin 
Scenario: Employee Approvs The Final  Approval Request

		Given The user is on admin login page
	When The user enters employee username and employeepassword and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Final Approval Request
	Then The Employee Opens The Request Details
	Then The Employee Aprroves The Final Approval Request
	
	
	@UserLogin 
Scenario: Check That The Applicant Can Pay The Final Approval Request Fees Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The All Reuests Screen
	When User Searchs The Final approval Request
	Then User Opnes Request Details Screen
	Then User Pays The Final Approval Request fees
	
	@UserLogin 
Scenario: Check Thet  User Can Applay for Change School Name Request Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The Services Screen
	Then User Starts New Change School Name Request
	Then User Enters Valid Data in All Fields and Sumbits The New Change School Name Request
	
	@AdminLogin 
Scenario: Employee Approvs The Change School Name Request


	Given The user is on admin login page
	When The user enters employee username and employeepassword and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Change School Name Request
	Then The Employee Opens The Request Details
	Then The Employee Aprroves The Change School Name Request