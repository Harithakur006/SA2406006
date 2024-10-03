Feature: Google Title functionality

  Scenario: To validate google title functionality
    Given Open google
    When Read the title
    Then Title should be Google
