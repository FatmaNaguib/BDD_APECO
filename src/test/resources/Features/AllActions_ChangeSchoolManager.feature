Feature: Change School Manager.

@UserLogin  
Scenario: The User Can Applay Change School Manager RequestAnd The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
  Then The Applicant Applies for a new Change School Manager Request
 Then The Review Employee Rats the Study Plan for The Change School Manager Request
Then The Review Employee Schedules Meeting for The School Manager 
Then The Admin School Manager Approves the Scheduled Meeting for The Change School Manager Request
Then The Review Employee Meets the School Manager for The Change School Manager Request
Then The Review Employee Approves His Final Approval for The Change School Manager Request
Then User Pays for The Change School Manager Request