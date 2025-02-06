Feature:  UserApply for New Final Aproval Request Successfully 

@UserLogin 
Scenario: Check Thet  User Can Apply for New Final Aproval Request Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The Services Screen
	When User Starts New Final Aproval Request 
	Then User Enters Valid data in the School fees Step
	Then User Enters Valid data in the Manager Data Step
	Then User Enters Valid data in the Final Aproval Attachments Step
	Then User Sumbits The Final Aproval Request
	Then User Logs Out