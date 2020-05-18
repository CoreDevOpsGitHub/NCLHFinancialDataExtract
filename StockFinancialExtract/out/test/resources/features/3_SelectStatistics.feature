Feature: Search Stock Symbol: Insert Stock Symbol into Search Bar

  Scenario Outline: Search Stock Symbol
    Given The user goes to the login page
    When  The user enter the stock symbol "<stocksymbol>"
    And  The user selects the Statistics tab
    Then  The valuation measures header appears

    Examples:
      | stocksymbol    |
      | NCLH |


