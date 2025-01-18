Feature: Change School Location Request



@UserLogin  
Scenario: The User Can Apply Change School Location Request And The Request is approved Successfully

  Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid Licens
 Then The Applicant Apply For Change School Location Request
 Then The Engineer Approves the Change School Location Request Engineering Plan
Then The Engineer Completes the Change School Location Request Field Technical Approval File
Then The Applicant Approves the Change School Location Request Site is Ready
Then The Engineer Completes the Change School Location Request Field Visit
Then The Employee Approves the Change School Location Request
Then The Applicant Pays The Change School Location Request fees

