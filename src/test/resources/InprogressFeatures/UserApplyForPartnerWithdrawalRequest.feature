Feature:  User Apply for New Partner Withdrawal Request Successfully 

@UserLogin 
Scenario: Check Thet  User Can Apply for New Partner Withdrawal Request Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The Services Screen
	When User Starts New Partner Withdrawal Request
	Then User Selects a Partner
	Then User Enters  Partners Percentage
	Then User attaches The request Documents
	Then User Pays The  Request fees