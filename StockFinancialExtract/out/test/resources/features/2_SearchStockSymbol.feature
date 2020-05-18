Feature: Search Stock Symbol: Insert Stock Symbol into Search Bar

  Scenario Outline: Search Stock Symbol
    Given The user goes to the login page
    When  The user enter the stock symbol "<stocksymbol>"
    Then  The user can view the buy stock button

    Examples:
      | stocksymbol    |
      | NCLH |
      | AAL |


