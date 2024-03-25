Feature: task 1

  Background:
    Given user goes to google page

  @Samsung
  Scenario: Samsung Search
    When user searches for "samsung"
    Then tests that the page title contains the word "samsung"
    And closes the page

  @Cucumber
  Scenario: Samsung Cucumber
    When user searches for "cucumber"
    Then tests that the page title contains the word "cucumber"
    And closes the page


