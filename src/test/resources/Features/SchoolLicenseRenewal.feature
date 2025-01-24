Feature: School License Renewal Request

@UserLogin  
Scenario: The User Can Apply for School License Renewal Request And The Request is approved Successfully

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has a Valid School Name 
Then The Applicant Applies for a New School License Renewal Request
Then The Employee Approves The School License Renewal Request
Then The Applicant Pays The School License Renewal Request Fees