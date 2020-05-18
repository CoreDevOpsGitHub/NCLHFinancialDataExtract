Feature: Search Stock Symbol: Insert Stock Symbol into Search Bar

  Scenario Outline: Search Stock Symbol
    Given The user goes to the login page
    When  The user enter the stock symbol "<stocksymbol>"
    When  The user selects the Statistics tab
    When  The user captures the profit data

    Examples:
      | stocksymbol    |
      | NCLH |


