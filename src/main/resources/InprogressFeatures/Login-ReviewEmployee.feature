Feature: Review Employee Portal Login 

@AdminLogin 
Scenario: Review Employee login successfully with valid credentials


	Given The user is on admin login page
	When The user enters The Review Employee's username and Review Employee's password and click on login button
	Then The user is navigated to the Admin Services List