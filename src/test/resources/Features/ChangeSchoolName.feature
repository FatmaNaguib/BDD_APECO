Feature: Change School Name 

@UserLogin  
Scenario: The User Can Applay Change School Name Request And The Request is approved Successfully

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has a Valid School Name 
  Then The Applicant Applies for a New Change School Name Request
  Then The Employee Aprroves The Change School Name Request