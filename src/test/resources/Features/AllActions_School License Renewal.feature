Feature: School License Renewal Request

@UserLogin  
Scenario: The User Can Apply For School License Renewal Request Request And The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
 Then The Applicant Applies for a New School License Renewal Request
 Then The Employee Approves The School License Renewal Request
 Then The Applicant Pays The School License Renewal Request Fees