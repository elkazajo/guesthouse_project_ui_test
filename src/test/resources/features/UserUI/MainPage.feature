Feature: As a User I want to be able to see and interact with all the elements on the page

  Background:
    Given I open main page

  Scenario: Check if all the main elements are visible and active
    When the guest house logo is displayed
    Then Rooms title is displayed
    And Contact form is displayed
    And Map is displayed

  Scenario Outline: Check if calendar and booking buttons are displayed after clicking on "Book this room" button
    When I click on 'Book this room' button
    Then Calendar should be displayed
    And "<Button name>" button should be displayed and active at booking block

    Examples:
      | Button name |
      | Today       |
      | Back        |
      | Next        |
      | Book        |
      | Cancel      |


  Scenario Outline: Check if booking input fields are displayed after clicking on "Book this room" button
    When I click on 'Book this room' button
    And "<Input name>" input field should be displayed at booking block

    Examples:
      | Input name |
      | Firstname  |
      | Lastname   |
      | Email      |
      | Phone      |


  Scenario Outline: Check if booking input fields are displayed after clicking on "Book this room" button
    When Contact form is displayed
    Then "<Input id>" input field should be displayed at contact block
    And 'Submit' button is displayed and active at contact block

    Examples:
      | Input id    |
      | name        |
      | email       |
      | phone       |
      | subject     |
      | description |


  Scenario Outline: Check if I can leave my contact data
    When fill in 'name' input field with my "<name>"
    And  fill in 'email' input field with my "<email>"
    And  fill in 'phone' input field with my "<phone>"
    And  fill in 'subject' input field with my "<subject>"
    And  fill in 'description' input field with my "<description>"
    And I click on 'Submit' button
    Then Thank you message should be displayed


    Examples:
      | name  | email        | phone        | subject              | description                                     |
      | Steve | jobs@alma.kz | +77777777777 | Need a room for test | Need a new room to test all the elements inside |

  Scenario Outline: Check if I can leave my contact data
    When I click on 'Book this room' button
    And I pick dates of my stay from '11' to '16'
    And fill in 'Firstname' input field with my "<Firstname>"
    And fill in 'Lastname' input field with my "<Lastname>"
    And fill in 'Email' input field with my "<Email>"
    And fill in 'Phone' input field with my "<Phone>"
    And I click on 'Book' button
    Then 'Booking Successful!' message should be displayed
    And 'Close' button should be displayed and active


    Examples:
      | Firstname | Lastname | Email        | Phone        |
      | Steve     | Jobs     | jobs@alma.kz | +77777777777 |