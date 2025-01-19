Feature:  User Applay For New Adding Educational Stages Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Applay For Adding Educational Stages Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Adding Educational Stages Request
	Then User Enters Valid School Data for the Adding Educational Stages Request
	Then User Enters Valid Educational Stages Data for The Adding Educational Stages Request
	Then User Enters for The Adding Educational Stages Request Request Attachments
	Then User Submits The Adding Educational Stages Request

