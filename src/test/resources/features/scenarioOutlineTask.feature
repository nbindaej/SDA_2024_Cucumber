Feature: Task 01

  Scenario Outline: Search for Keywords on Amazon
    * I open the browser
    Given the user navigates to the Ebay homepage
    When the user searches for "<value>"
    Then the user verifies that the search results contain "<value>"
    * I close the browser
    Examples:
      | value   |
      | mac     |
      | Windows |
      | linux   |
