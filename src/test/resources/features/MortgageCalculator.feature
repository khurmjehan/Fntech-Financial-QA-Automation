Feature: Mortgage Calculator Verification

  Scenario Outline: Calculate monthly mortgage payment with multiple data sets
    Given I navigate to the mortgage calculator application
    When I enter a home value of "<HomeValue>"
    And I enter a down payment of "<DownPayment>"
    And I click the calculate button
    Then the mortgage calculation should process successfully

    Examples:
      | HomeValue | DownPayment |
      | 300000    | 60000       |
      | 500000    | 100000      |
      | 750000    | 150000      |
