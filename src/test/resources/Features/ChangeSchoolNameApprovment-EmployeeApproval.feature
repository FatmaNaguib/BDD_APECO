Feature: Employee Approvs The Change School Name Request

@AdminLogin 
Scenario: Employee Approvs The Change School Name Request


	Given The user is on admin login page
	When The user enters employee username and employeepassword and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Change School Name Request
	Then The Employee Opens The Request Details
	Then The Employee Aprroves The Change School Name Request