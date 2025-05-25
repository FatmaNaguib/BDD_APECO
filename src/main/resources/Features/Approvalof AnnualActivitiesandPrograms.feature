Feature: Approval of Annual Activities and Programs Request


 
@UserLogin  
Scenario: The Employee Approves The Annual Activities and Programs Request Successfully

 Given The Applicant Has an Approved Initial approval request
 Given The Applicant Has School Valid License
Then The Applicant Applies for a New Annual Activities and Programs Request
Then The Employee Approves The Annual Activities and Programs

@UserLogin  
Scenario:  The Employee Rejests The Annual Activities and Programs Request Successfully

 Given The Applicant Has an Approved Initial approval request
 Given The Applicant Has School Valid License
Then The Applicant Applies for a New Annual Activities and Programs Request
Then The Employee Rejests The Approval of Annual Activities and Programs Request

@UserLogin  
Scenario: The Employee Returns The Annual Activities and Programs Request Successfully

 Given The Applicant Has an Approved Initial approval request
 Given The Applicant Has School Valid License
Then The Applicant Applies for a New Annual Activities and Programs Request
Then The Employee Returns The Approval of Annual Activities and Programs Request 

@UserLogin  
Scenario: The User Can Resubmit Returned Annual Activities and Programs Request Then The Request is approved by The Employee Successfully

 Given The Applicant Has an Approved Initial approval request
 Given The Applicant Has School Valid License
Then The Applicant Applies for a New Annual Activities and Programs Request
Then The Applicant Resubmits The Approval of Annual Activities and Programs Request
Then The Employee Approves The Annual Activities and Programs Request After Return
