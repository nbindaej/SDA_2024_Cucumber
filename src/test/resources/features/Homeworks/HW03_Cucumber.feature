Feature: Homework3
  The input form

  Background:
    Given open the website

  @SA
  Scenario: S01: Filling The input Form
    Then Insert "Norah" and "AbdulazizBinDaej" and "23"
    And Select the "Saudi Arabia"
    Then Click on submit button
    Then Verfiy "Input Validation Response" Displayed
    And Close the browser

  @Canada
  Scenario: S02: Filling The input Form
    Then Insert "Sarah" and "AbdulrahmanAziz" and "31"
    And Select the "Canada"
    Then Click on submit button
    Then Verfiy "Input Validation Response" Displayed
    And Close the browser

  @Japan
  Scenario: S03: Filling The input Form
    Then Insert "Areej" and "MohammedAbdulaziz" and "19"
    And Select the "Japan"
    Then Click on submit button
    Then Verfiy "Input Validation Response" Displayed
    And Close the browser



