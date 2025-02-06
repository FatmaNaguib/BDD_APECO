Feature: Employee Approvs The Initial Approval Request

@AdminLogin 
Scenario: Employee Approvs The Initial Approval Request


	Given The user is on admin login page
	When The user enters employee username and employeepassword and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Request
	Then The Employee Opens The Request Details
	Then The Employee Aprroves The Initial Approval Request
	
	@AdminLogin 
Scenario: Employee Approves the Initial Approval Request

	Given The Employee is Logged in to the system
	Then The Employee Opens The Request Details
	Then The Employee Approves The Initial Approval Request
	