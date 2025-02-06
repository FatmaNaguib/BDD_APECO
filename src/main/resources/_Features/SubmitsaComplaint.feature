Feature:  User Submits a Complaint Successfully 

@UserLogin 
Scenario: Check That User Can Submit a Complaint Successfully 

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has School Valid License
	Then The Applicant Submits a New Complaint Request
	Then The School Representative Can Reply The Complaint
	Then The Review Employee Closes The Complaint