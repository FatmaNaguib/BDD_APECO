Feature:  User Applay For New Change School Location Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Applay For  Private School Renewal Application Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Change School Location Request
	Then User Enters Valid School Data
	Then User Enters Change School Location Request Attachments
	Then User Submits The  Change School Location Request
