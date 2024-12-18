
Feature: Create new Account
  
  Scenario Outline: Create New Account 
    Given user is present on the create new account page 
    When user enters <Firstname> <Lastname> in correct format
		When user enter <Email> <Password> and <ConfirmPassword> 
    And user clicks on the create new account button 
    Then user should see a message account created successfully
 
 	Examples: 
 	|Firstname       |Lastname        |Email 								|Password 			|ConfirmPassword  	  |
 	|Akshay					 |Metkari					|akaei@gmail.com	    |Hello@abc			|Hello@abc						|