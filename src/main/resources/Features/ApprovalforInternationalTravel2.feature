Feature:  User Applay For New International Travel Request Successfully

@UserLogin 
Scenario: Check Thet  User Applay For New International Travel Request Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
Then The Applicant Applies for a New International Travel Request
Then The Employee Approves The International Travel Request
