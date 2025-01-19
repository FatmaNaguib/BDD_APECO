Feature:  User Applay For New Reducing Educational Stages Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Applay For Reducing Educational Stages Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Reducing Educational Stages Request
	Then User Selects Reducing Educational Stages for the Reducing Educational Stages Request
	Then User Enters for The Reducing Educational Stages Request Request Attachments
	Then User Submits The Reducing Educational Stages Request

