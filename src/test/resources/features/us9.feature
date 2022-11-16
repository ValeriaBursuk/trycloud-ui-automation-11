Feature:  As a user, I should be able to write comments to files/folders

  @us9
  Scenario: Verify users to write comments to files/folder
    Given User logedIn and on the dashboard page
    When the user clicks the Files module
    And user click action-icon  from any file on the page
    And user choose the Details option
    And user write a comment "Comment" inside the input box
    And user click the submit button to post it
    Then Verify the comment is displayed in the comment section.