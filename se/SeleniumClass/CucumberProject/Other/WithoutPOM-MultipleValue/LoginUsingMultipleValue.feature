Feature: To Validate the facebook login functionlality

Scenario Outline: To Validate the login functionality with invalid credentials

Given 	The Another user should be in FB login page
When  	The Another user has to fill userName "<userName>" and password "<password>" 
And 		The Another user has to click the login button	
Then 		The Another user should navigate to the invalid login page

Examples:
|userName|password|
|Raja|123456789|
|Kumar|98765432|
|Madhu|54698712|
|Kavin|41254121|  