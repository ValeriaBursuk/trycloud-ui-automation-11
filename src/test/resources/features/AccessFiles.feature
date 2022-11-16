Feature:
@wip04
  Scenario Outline: Test login with valid credentials
    Given user on the login page
    When user enters valid "<username>" and valid "<password>" and clicks login button
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA"
    And user click the top-left checkbox of the table
    Then verify all the files are selected

    Examples:
      | username | password    |
      | User11   | Userpass123 |
      | User41   | Userpass123 |
      | User71   | Userpass123 |
      | User101  | Userpass123 |
#update
