@AllLinks
Feature: Google links

  Background: 
    Given Open google application

  @GmailTest
  Scenario: Test Gmail link
    When Click on Gmail link
    Then Gmail page should display

  @ImagesLink
  Scenario: Test Images Link
    When Click on Images Link
    Then Images Page should display

  @AdvtLink
  Scenario: Test Advt Link
    When Click on Advt Link
    Then Advt page should display

  @BusinessLink
  Scenario: Test Business link
    When Click on Business link
    Then Business page should display
