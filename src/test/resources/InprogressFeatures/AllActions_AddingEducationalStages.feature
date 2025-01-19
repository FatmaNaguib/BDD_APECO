Feature: Adding Educational Stages Request

@UserLogin  
Scenario: The User Can Apply forAdding Educational Stages Request And The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
  Then The Applicant Applies for a New Adding Educational Stages Request 
   Then The Engineer Aprroves The Adding Educational Stages Request
  Then The Employee Aprroves The Adding Educational Stages Request 