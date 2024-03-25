Feature: Name of the feature file
  This is the description of feature file

  Background: The name of background
    Given I open the browser
    And I am on the google homepage

  @Mytag
  Scenario: The name of scenario
    When I search for amazon on google
    Then I should see amazon on the result
    Then I close the browser

  Scenario: The name of scenario
    When I search for "facebook" on google
    Then I should see "facebook" on the result
    Then I close the browser
