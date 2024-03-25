Feature: Name of the feature file
  This is the description of feature file

  Scenario: The name of scenario
    Given I open the browser
    And I am on the google homepage
    When I search for amazon on google
    Then I should see amazon on the result
    Then I close the browser

  Scenario: The name of scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "facebook" on google
    Then I should see "facebook" on the result
    Then I close the browser
