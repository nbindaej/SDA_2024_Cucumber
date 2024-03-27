Feature:

  Scenario Outline:
    Given I open the browser
    And I am on the google homepage
    When I search for "<searchInput>" on google
    Then I should see "<searchInput>" on the result
    Then  I close the browser
    Examples:
      | searchInput |
      | Norah       |
      | Sarah       |