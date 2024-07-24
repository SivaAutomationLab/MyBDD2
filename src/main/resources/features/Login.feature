Feature: Test the login functionality

  Scenario Outline: Test the valid login

    Given User launches the web browser
    When User enters the valid "<username>" and "<password>"
    Then User clicks on submit button
    And  User validates the login screen

    Examples:
      | username | password |
      | Admin    | admin123 |
