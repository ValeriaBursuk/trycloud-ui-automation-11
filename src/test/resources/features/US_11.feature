
Feature: Talks module feature
  User story: As a user, I should be able to access to Talks module.

  Background: For the scenarios in feature file, user is expected to be on dashboard page

   Given user on the dashboard page
   When the user clicks the "Talk" module

  @anastasiya1
  Scenario: Verify users have access to Talks module
    #Given user on the dashboard page
    #When the user clicks the "Talk" module
    Then verify the page title is "Talk - Trycloud QA"

  @anastasiya2
  Scenario Outline: verify users to send a message
    #Given user on the dashboard page
    #When the user clicks the "Talk" module
    And user enters the "<Username>" in the search box
    And user clicks on the "<Username>" on the dropdown menu
    And user writes a "<Message>"
    And user clicks to submit button
    Then the user should be able to see the "<Message>" is displayed on the conversation log

    Examples:
      | Username | Message |
      | User26   | welcome |