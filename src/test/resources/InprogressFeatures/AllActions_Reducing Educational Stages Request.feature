Feature: Reducing Educational Stages Request



@UserLogin  	
Scenario: The User Can Apply for 	Approval of Annual Activities and Programs Request And The Request is approved Successfully

   Given The Applicant Has an Approved Initial approval request
  Given  The Applicant Has School Valid License
 Then The Applicant Apply For Reducing Educational Stages Request
  Then The Engineer Approves the Reducing Educational Stages Engineering Plan
Then The Engineer Completes the Reducing Educational Stages Request Field Technical Approval File
Then The Employee Approves the Reducing Educational Stages Request
Then The Applicant Pays The Reducing Educational Stages Request fees