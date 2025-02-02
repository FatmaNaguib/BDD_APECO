Feature: Final Approval Service


@UserLogin  
Scenario: The User Can Apply Final Approval Service Request And The Request is approved Successfully


  Given The Applicant Has a Valid School Name 
 Then The Review Employee Rats the Study Plan for The Final Approval Request
Then The Review Employee Schedules Meeting for The Final Approval Request Manager
Then The Admin School Manager Approves The Scheduled Meeting
Then The Review Employee Meets The School Manager
Then The Engineer Aprroves The Final Approval Request
Then The Employee Aprroves The Final Approval Request