Feature: Apply And approve New Initial Approval Three Stages Request Successfully

@UserLogin 
Scenario: Check Thaat User Can Applay For New Initial Approval Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Initial Approval Request
	Then User is Navigated to Personal Data Screen
	When User Clicks on Next Button in Application Information Step
	Then  User Enters Owner's Personal Details
	Then User Enters Owner's Passport Details
	Then User Enters Residence Details
	Then User Enters Owner's Qualifications Details
	Then User Enters Marital Status Details
	Then User Enters Owner's Father and Mother Details
	Then User Enters Owner's Housing Details
	Then User Enters Owner's Shared Percentage Details
	Then User Enters School Details 
	Then User Enters Curriculum Details
	Then User Downloads Intoduction Documents
	Then User Uploads Intoduction Document
	Then User Pays The Request fees


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
	