Feature: Certification of Experience Certificate for Employees

@UserLogin 
Scenario: Check Thet  User Applay For New Certification of Experience Certificate for Employees Request Successfully

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has a Valid School Name 
Then The Applicant Applies for a New Certification of Experience Certificate for Employees Request
Then The Employee Approves The Certification of Experience Certificate for Employees Request
