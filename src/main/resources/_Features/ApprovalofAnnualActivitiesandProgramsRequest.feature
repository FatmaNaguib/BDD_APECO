Feature: Approval of Annual Activities and Programs Request

@UserLogin  
Scenario: The User Can Apply for Approval of Annual Activities and Programs Request And The Request is approved Successfully

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has School Valid License
Then The Applicant Applies for a New Annual Activities and Programs Request
Then The Employee Approves The Annual Activities and Programs