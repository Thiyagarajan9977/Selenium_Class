Feature: To Validate the facebook login functionlality

  Scenario: To Validate the login functionality with invalid credentials
    
    Given The Another user should be in FB login page
    
    When The Another user has to fill userName and password
     
      #  1d without Header using list .aslist
      #	   0        1
      | Thiyagu | 123456678 |
      
    When The second user has to fill userName and password
    
        #  2d without Header using list .aslists	
      	#	   0        1      #	     
      | Thiyagu | 123456678 | #0 
      | Rajan		| 987654321 | #1
      | kumar		| 983265741 | #2
      
    Then The Another user has to click the create button
    
    And The user has to enter the personal details
    		
      #	 1d with Header using Map .asMap	
      #   0            1
      | firstName | Thiagaraj |
    	| lastName | sudhakarr |
    	| mobiles | 9876541310|
    	| newpassword | 987123@Ab	| 
    
    And The user has to click the sign up button    
    
    Then The page refresh and moving to Home page
    
     #	 2d with Header using Map .asMaps	    
     #	   	0     			   1							
      | userName		 | password | 
      | Rajasudhakar | Raja@123 |
      | thiyagurajan | rajas@321|
      | Avenkalaskhmi| raja@111 |   
                  