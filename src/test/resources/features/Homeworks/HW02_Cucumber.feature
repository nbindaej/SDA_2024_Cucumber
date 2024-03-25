Feature: Homework 02
  Click buttons to see message 'All Buttons Clicked!

  @Clicking
  Scenario: S01 Click buttons
    Given open the website "https://testpages.eviltester.com/styled/dynamic-buttons-simple.html"
    Then Click on "start" button and wait
    And Click on "One" button and wait
    Then Click on "Two" button and wait
    And Click on "Three" button and wait
    Then Verify "All Buttons Clicked" message Displayed
    And close the page


