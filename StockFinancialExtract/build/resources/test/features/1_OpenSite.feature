Feature: Login Page: Insert Username and Password

  Scenario Outline: Login Correctly
    Given The user goes to the login page
    Then  The user will see the company logo

    Examples:
      | user    | password     |
      | devteam | C0llaborate! |

