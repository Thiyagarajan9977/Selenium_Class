Feature: To Validate the facebook login functionlality

Scenario: To Validate the login functionality with invalid credentials

Given 	The user should be in FB login page
When  	The user has to fill userName and password 
And 		The user has to click the login button	
Then 		The user should navigate to the invalid login page
  