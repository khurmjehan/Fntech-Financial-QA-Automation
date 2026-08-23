Feature: Mortgage Calculator Verification

  Scenario: Calculate monthly mortgage payment
    Given I navigate to the mortgage calculator application
    When I enter a home value of "300000"
    And I enter a down payment of "60000"
    And I click the calculate button
    Then the mortgage calculation should process successfully
