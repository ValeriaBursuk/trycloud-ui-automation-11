Feature: As a user, I should be able to login to TryCloud app

  Scenario Outline: Test login with valid credentials
    Given user on the login page
    When user enters valid "<username>" and valid "<password>" and clicks login button
    Then user should be launched at the dashboard page

    Examples:
      | username | password    |
      | User11   | Userpass123 |
      | User41   | Userpass123 |
      | User71   | Userpass123 |
      | User101  | Userpass123 |