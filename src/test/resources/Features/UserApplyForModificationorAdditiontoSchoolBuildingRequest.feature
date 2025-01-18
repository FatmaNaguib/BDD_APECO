Feature:  User Applay For New Modification or Addition to School Building Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Apply For Modification or Addition to School Building Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Modification or Addition to School Building Request
	Then User Enters Valid School Data for Modification or Addition to School Building Request
	Then User Enters Change School Location Request Attachments for Modification or Addition to School Building Request
	Then User Submits The Modification or Addition to School Building Request
