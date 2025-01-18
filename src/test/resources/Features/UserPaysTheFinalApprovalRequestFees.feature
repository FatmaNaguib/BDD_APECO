Feature:  User Pays The Final Approval Request Fees Successfully 
	
	@UserLogin 
Scenario: Check That The Applicant Can Pay The Final Approval Request Fees Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The All Reuests Screen
	When User Searchs The Final approval Request
	Then User Opnes Request Details Screen
	Then User Pays The Final Approval Request fees