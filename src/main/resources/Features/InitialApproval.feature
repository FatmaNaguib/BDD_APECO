Feature: Initial application - Submission for a Private School Permit Request

@UserLogin  
Scenario: Submit Initial application - Submission for a Private School Permit Request Can Be Submites and Approved successfully

 Given Given  User Logged to The system
Then The Applicant Applys For a New Initial application Request
Then The Employee Approves The Initial application Request
Then The Engineer Approves The Initial application Request

@UserLogin  
Scenario: Submit Initial application - Submission for a Private School Permit Request Can Be Submites and Rejected by The Employee successfully

 Given Given  User Logged to The system
Then The Applicant Applys For a New Initial application Request
Then The Employee Rejects The Initial application Request
 
@UserLogin  
Scenario: Submit Initial application - Submission for a Private School Permit Request Can Be Submites and Rejected by The Engineer successfully

 Given Given  User Logged to The system
Then The Applicant Applys For a New Initial application Request
Then The Employee Approves The Initial application Request
Then The Engineer Rejects The Initial application Request

@UserLogin  
Scenario: The Applicant Resubmits The Returned Initial application - Submission for a Private School Permit Request and \t successfully

 Given Given  User Logged to The system
Then The Applicant Applys For a New Initial application Request
Then The Employee Returns The Initial application Request
Then The Applicant Resubmits The Initial application Request
Then The Employee Approves The Initial application Request
Then The Engineer Approves The Initial application Request
