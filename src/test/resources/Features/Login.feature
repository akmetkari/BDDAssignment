@sanity
Feature: user login to the application

  Scenario Outline: user login to the application 
    Given user is on the landing page of the application 
    When user provides correct <Username> and <Password> 
    And clicks on the login button 
    Then user should see <Result> login message

    Examples:
    |Username                |Password         |Result    |
    |akmei@gmail.com				 |Hello@abc				 |Success   | 