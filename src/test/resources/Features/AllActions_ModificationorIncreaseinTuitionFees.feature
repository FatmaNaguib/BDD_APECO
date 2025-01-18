Feature: Modification or Increase in Tuition Fees Request

@UserLogin  
Scenario: The User Can Apply for Modification or Increase in Tuition Fees Request And The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
  Then The Applicant Applies for a New Modification or Increase in Tuition Fees
  Then The Employee Aprroves The Modification or Increase in Tuition Fees Request