@henry
Feature:delete a file/folder.

  User Story: As a user, I should be able to delete a file/folder.

Background:
   Scenario Outline: Test login with valid credentials
    Given user on the login page
    When user enters valid "<username>" and valid "<password>" and clicks login button
    Then user should be launched at the dashboard page

    Examples:
      | username | password    |
      | User11   | Userpass123 |
     # | User41   | Userpass123 |
      #| User71   | Userpass123 |
     # | User101  | Userpass123 |



  Scenario: Verify users delete a file/folder

    When the user clicks the "Files" module
    And user click action-icon from any file on the page
    And user choose the "Delete f" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.