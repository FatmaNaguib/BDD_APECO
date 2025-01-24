Feature:  User Applay For New Publishing Announcements for Private Schools Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Applay For New Publishing Announcements for Private Schoolsl Request Successfully

  Given The Applicant Has an Approved Initial approval request
  Given The Applicant Has School Valid License
Then The Applicant Applies for a New Publishing Announcements for Private Schools Request
Then The Employee Approves The Publishing Announcements for Private Schools Request
 