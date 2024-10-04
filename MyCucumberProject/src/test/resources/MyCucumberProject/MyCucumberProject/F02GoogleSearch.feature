Feature: Test Google Search

  Scenario: To validate google search functionality
    Given I Open google
    When I enter text in searchbox
    And I hit enter
    Then Valid search should display
