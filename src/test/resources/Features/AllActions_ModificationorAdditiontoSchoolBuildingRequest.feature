Feature: Modification or Addition  a Private School Building Request

@UserLogin  
Scenario: The User Can Apply for a Modification or Addition  a Private School Building Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
  Then The Applicant Applies for a New Modification or Addition  a Private School Building request
    Then The Engineer Reviews the Engineering Plan for The Modification or Addition a Private School Building Request
  Then The Engineer Completes the Initial Technical Approval File for The Modification or Addition a Private School Building Request
  Then The Applicant Confirms the Site is Ready
Then The Engineer Approves the Initial Visit
Then The Applicant Pays the Modification or Addition a Private School Building Request fees