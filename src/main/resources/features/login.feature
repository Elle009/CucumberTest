Feature: Adding book to the basket
  As a user I want to add book to the basket
  So I can pay for the book


  Scenario: Add book
    Given Click "Sign in" button
    Then input login
    Then input password
    And Click "Submit"button
    Then check is "logo" visible
    And input book name in search field
    And click on Search button
    And wait for book's name
    Then add book to the basket
    Then check book in the basket


