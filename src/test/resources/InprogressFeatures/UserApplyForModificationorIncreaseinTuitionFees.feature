Feature:  User Applay For New Modification or Increase in Tuition Fees Request Successfully

@UserLogin 
Scenario: Check Thet  User Can Apply For Modification or Increase in Tuition Fees Request Successfully

	Given  User is on login page
	When User enters username and password and click on login button
	Then User should be able to login sucessfully and wrokspace page opens
	When User Navigats to The Services Screen
	Then User Starts New Modification or Increase in Tuition Fees Request
	Then User Enters Valid School fees Data
	Then User Enters Modification or Increase in Tuition Fees Request Attachments
	Then User Submits The Modification or Increase in Tuition Fees Request

