#Author       :  QAMentor
#Scenario     :  Verify pagination on pages after keyword search on QAVendors portal
#Application  :  QAVendors
Feature: Verify pagination on pages after keyword search on QAVendors portal

  Background:
    Given browser is "firefox"

  @pagination
  Scenario Outline: QAVendors pagination verification after keyword search
    Given user navigates to the QAVendors App
    Then user verify the title "Top and Best qa testing outsourcing companies - Qavendors.com" in the app
    When user enters "<keyword>" in the keyword search box
    And user presses Enter key
    Then user verify the title "QA Testing Vendors - Find & Compare QA Vendors Professionals" in the app
    And user embed the "result page" screenshot in the report
    And page should display number of records shown on page with total number of records
    When user clicks on next button in pagination till last record is shown and take screenshot for every page
    And user clicks on previous button in pagination till first record is shown

    Examples:
      | keyword      |
      | testing      |
      | software     |
      | technologies |