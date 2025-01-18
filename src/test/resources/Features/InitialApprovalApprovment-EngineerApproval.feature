Feature: Engineer Approvs The Initial Approval Request

@AdminLogin 
Scenario: Engineer Approvs The Initial Approval Request


	Given The user is on admin login page
	When The user enters The Engineer's' username and Engineer's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The Employee Searchs for the Request
	Then The Employee Opens The Request Detail
	Then The Engineer Aprroves The Initial Approval Request