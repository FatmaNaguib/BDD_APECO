Feature: Change School Name 

@UserLogin  
Scenario: The User Can Applay Change School Name Request And The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
  Then The Applicant Applies for a new Change School Manager Request
  Then The Employee Aprroves The Change School Name Request