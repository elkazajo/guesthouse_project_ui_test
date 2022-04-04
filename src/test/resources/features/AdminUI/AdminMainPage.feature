Feature: As an Admin I want to be able to see and interact with all the elements on the page

  Background:
    Given I open main admin page
    When I fill in 'username' input with 'admin'
    And I fill in 'password' input with 'password'
    And I click on login button


  Scenario: Check if all the main elements are visible and active
    Then 'Rooms' button should be displayed and enabled
    Then 'Report' button should be displayed and enabled
    Then 'Branding' button should be displayed and enabled
    Then Notification button should be displayed and enabled
    Then 'Front Page' button should be displayed and enabled
    Then 'Logout' button should be displayed and enabled

