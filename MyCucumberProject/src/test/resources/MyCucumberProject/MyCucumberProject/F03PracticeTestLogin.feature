Feature: Test Practice Test Login

  Background: 
    Given Open Practice Test in browser

  Scenario: To validate login with valid data
    When Enter valid user name as "student"
    When Enter valid password as "Password123"
    And Click on Login button
    Then Home page should display

  Scenario: To validat login with invalid data
    When Enter invalid user name as "basavraj"
    When Enter invalid password as "basavraj123"
    And Click on Submit button
    Then error message should display
