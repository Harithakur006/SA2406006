Feature: Amazon search functionality

  Scenario: To validate search feature on amazon
    Given Open amazon
    When I search for "iPhone"
    And I click on Search button
    Then Search result should display