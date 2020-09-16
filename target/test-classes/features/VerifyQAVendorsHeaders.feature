#Author       :  QAMentor
#Scenario     :  Verify Headers on QAVendors portal
#Application  :  QAVendors
Feature: Verify Headers and sub headers on QAVendors portal

  Background:
    Given browser is "chrome"

  @headers
  Scenario: QAVendors Header Verification
    Given user navigates to the QAVendors App
    Then user verify the title "Top and Best qa testing outsourcing companies - Qavendors.com" in the app
    When user clicks on "HOME" Header
    Then user verify the title "Top and Best qa testing outsourcing companies - Qavendors.com" in the app
    And user embed the "Home" screenshot in the report
    When user clicks on below sub-headers and verify their respective page with screenshot in "ABOUT US" header
      | Who We Are                        |
      | How to choose the right QA Vendor |
    When user clicks on "HOW IT WORKS" Header
    Then user verify the title "How it works - qavendors.com" in the app
    And user embed the "HOW IT WORKS" screenshot in the report
    When user clicks on "QA VENDORS" Header
    Then user verify the title "QA Vendors Listings - Find QA Testing Vendor Listings" in the app
    And user embed the "QA VENDORS" screenshot in the report
    When user clicks on "GET MATCHED" Header
    Then user verify the title "Connect With QA Testing Vendors - Request Free Informations" in the app
    And user embed the "GET MATCHED" screenshot in the report
    When user clicks on below sub-headers and verify their respective page with screenshot in " RESOURCES" header
      | Our Blog           |
      | Articles           |
      | Deals & Promotions |
      | Photos             |
      | Reviews            |
      | QA Tools           |
      | Videos             |
      | Jobs               |
      | Events             |
    When user clicks on "JOIN TODAY" Header
    Then user verify the title "Join QAvendors.com - Today!" in the app
    And user embed the "JOIN TODAY" screenshot in the report
    When user clicks on "CONTACT US" Header
    Then user verify the title "Contact Us - qavendors.com" in the app
    And user embed the "CONTACT US" screenshot in the report