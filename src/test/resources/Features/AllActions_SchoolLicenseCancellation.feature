Feature: School License Cancellation Request

@UserLogin  
Scenario: The User Can Apply For School License Cancellation Request Request And The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
    Then The Applicant Applies for a New School License Cancellation Request
        Then The Employee Approves The School License Cancellation request
        Then The Department Manager Approves The School License Cancellation Request
  