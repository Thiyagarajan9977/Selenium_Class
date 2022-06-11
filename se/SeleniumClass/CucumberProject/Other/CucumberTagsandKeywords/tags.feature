Feature: To Validate the facebook login functionlality

Background:
Given The user should  be in FB page

@Smoke
Scenario Outline: To Validate the login functionality with invalid credentials
When The user has to fill "<userName>" and "<password>"
And  The user has to click the login buttona	
Then The user should navigate to the invalid login pages

Examples:
|userName|password|
| Thiyagu | 786 |


@Sanity
Scenario: To Validate the login functionalitys

When  	The user has to fill createUserName and passwords
And 		The user has to click the login buttone
Then 		The user should navigate to the invalid login pagess
  
@Regression
Scenario: To Validate the login functionalityes

When  	The user has to fill userName and passwordas 
And 		The user has to click the login buttones	
Then 		The user should navigate to the invalid login pagys  

@Smoke
Scenario: To check the scenario one login 
When The second user has to fill two 
And  The second user has to fill three	
Then The second user has to fill four

@Sanity
Scenario: To check the scenario second login 
When The second user has to fill two one 
And  The second user has to fill three one	
Then The second user has to fill four one
  
@Regression
Scenario: To check the scenario third login 
When The second user has to fill two two 
And  The second user has to fill three two	
Then The second user has to fill four two