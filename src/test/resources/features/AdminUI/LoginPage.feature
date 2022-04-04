Feature:

  Background:
    Given I open login page

  Scenario: Check if admin login page is functional
      Then 'username' input field is displayed
      And 'password' input field is displayed
      And Login button is displayed and enabled

  @runDebug
  Scenario: Check if I can login
    When I fill in 'username' input with 'admin'
    And I fill in 'password' input with 'password'
    And I click on login button
    Then 'Logout' button should be displayed and enabled
