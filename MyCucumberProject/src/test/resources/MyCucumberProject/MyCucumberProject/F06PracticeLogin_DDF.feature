Feature: Test practice login page

  Scenario Outline: Verify the login functionality
    Given Open "https://practice.expandtesting.com/login"
    When Enter the user name as "<UserName>"
    When Enter the password as "<Password>"
    And Click on the Login button
    Then Home page should be display

    Examples: 
      | UserName  | Password             |
      | practice  | SuperSecretPassword! |
      | pradyumna | pradyumna123         |
      | hari      | hari123              |
      | practice  | SuperSecretPassword! |
      | ruksar    | ruksar123            |
      | atul      | atul123              |
