Feature:  User Applay For New Initial Approval Two Stages Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Applay For New Initial Approval Request Successfully

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
	Then User Enters Curriculum Details for Two Stages
	Then User Downloads Intoduction Documents
	Then User Uploads Intoduction Document
	