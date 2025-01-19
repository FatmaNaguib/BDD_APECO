Feature:  User Submits a Complaint Successfully 

@UserLogin 
Scenario: Check That User Can Submit a Complaint Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The Services Screen
	When User Submits a New Complaint Request
	Then User Enters Valid Applicant Data
	Then User Enters Valid Complaint Data
	Then User Enters Valid Complaint Attachments
	Then User Submits The Request
	
	@UserLogin 
Scenario: Check That School Representative Can Reply The Complaint Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The All Reuests Screen
	When User Searchs The Complaint Number
	Then User Opnes Request Details Screen
	Then User Replies and Submit The Complaint 
	
	
@AdminLogin 
Scenario: Review Employee Can Closes The Complaint Successfully

	Given The user is on admin login page
	When The user enters The Review Employee's username and Review Employee's password and click on login button
	Then The user is navigated to the Admin Services List
	Then The user Searchs for The Complaint
	Then User Opnes Complaint Details Screen
	Then User Closes The Complaint 
	
