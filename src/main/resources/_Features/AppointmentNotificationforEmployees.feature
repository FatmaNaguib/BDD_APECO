Feature:  Appointment Notification for Employees Request

@UserLogin  
Scenario: The User Can Apply for Appointment Notification for Employees Request And The Request is approved Successfully

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has School Valid License
   Then The Applicant Applies for a New Appointment Notification for Employees in Private Schools Request
  Then The Employee Aprroves The Appointment Notification for Employees in Private Schools Request