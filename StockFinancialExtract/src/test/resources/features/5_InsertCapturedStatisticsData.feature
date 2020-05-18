Feature: Search Stock Symbol: Insert Stock Symbol into Search Bar

  Scenario Outline: Search Stock Symbol
    Given The user goes to the login page
    When  The user enter the stock symbol "<stocksymbol>"
    And  The user selects the Statistics tab
    And  The user captures the profit data
    And  The user inserts data into the database
    Then The user should see the statistics page loaded
    Examples:
      | stocksymbol    |
      | NCLH |
      | AAL |




