@smoke
Feature: As a user, I should be able to add file to favorites
  User Story:
  As a user, I should be able to access Files module - Favorites button

  Background:
    Given user on the Dashboard page
    When the user clicks the "Files" Files module

  Scenario: User can add a file to Favorites from the given options
    When the user clicks action-icon from any file on the page And user choose the Add to favorites option
    And user click the Favorites "Favorites" sub-module on the left side
    Then Verify the chosen file is listed on the table


  Scenario: User creates a file and adds it to Favorites with Star icon
    When user clicks on Add New Folder, adds Folder name and enters information
    And user clicks on Star icon in the opened side view
    And user click the Favorites "Favorites" sub-module on the left side
    Then Verify the chosen file is listed on the table