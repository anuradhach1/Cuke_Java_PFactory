Feature: fb2 Login scripts

Background:
Given i log into the fb

  @regression
  Scenario: Invalid fb2 login
    Then verify the invalid login page
    And application "Logs in" successfully