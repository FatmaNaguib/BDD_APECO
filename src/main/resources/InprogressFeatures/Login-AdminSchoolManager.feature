Feature: Admin School Manager Portal Login 

@AdminLogin 
Scenario: Admin School Manager login successfully with valid credentials


	Given The user is on admin login page
	When The user enters The Admin School Manager's username and Admin School Manager's password and click on login button
	Then The user is navigated to the Admin Services List