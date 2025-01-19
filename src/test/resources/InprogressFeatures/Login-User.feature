Feature: APECO User Login

@UserLogin
Scenario: Login with valid credentials


	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens