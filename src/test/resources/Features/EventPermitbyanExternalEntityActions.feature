Feature: Event Permit by an External Entity Actions Request

@UserLogin  
Scenario: The User Can Apply forEvent Permit by an External Entity Actions Request And The Request is approved Successfully

Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has School Valid License
 Then The Applicant Applies for a New Event Permit by an External Entity Actions Request
 Then The Employee Approves The Event Permit by an External Entity Actions Request
 
