Feature: fb1 Login scripts

  @smoke
  Scenario: Invalid fb1 login
    Given i log into the fb
    Then verify the invalid login page
    And application "Logs in" successfully
