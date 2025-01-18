Feature:  UserApply for New Change or Add Partner Request Successfully 

@UserLogin 
Scenario: Check Thet  User Can Apply for New Change or Add Partner Request Successfully

	Given  User loged in and is on Workspace Page
	When User Navigats to The Services Screen
	When User Starts New Change or Add Partner Request
	Then The Applicant Starts Add New Owners Request
	Then The Applicant Enters The Owner's Personal Details
	Then The Applicant Enters Owner's Passport Details
	Then The Applicant Enters Residence Details
	Then The Applicant Enters Owner's Qualifications Details
	Then The Applicant Enters Marital Status Details
	Then The Applicant Enters Owner's Father and Mother Details
	Then The Applicant Enters Owner's Housing Details
	Then The Applicant Downloads the Introduction Documents
	Then The Applicant Uploads The Required Documents
	Then The Applicant Admints The Correctness of All Provided Data
		Then The Applicant Pays The Change or Add Partner Request Fees
