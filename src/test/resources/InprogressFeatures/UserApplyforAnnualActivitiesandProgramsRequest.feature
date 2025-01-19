Feature:  User Applay For New Annual Activities and Programs Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Applay For Annual Activities and Programs Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Annual Activities and Programs Request
	Then User Enters valid Annual Activities and Programs Request Data
	Then User Submits The Annual Activities and Programs Request

