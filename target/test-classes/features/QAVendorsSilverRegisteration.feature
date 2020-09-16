#Author       :  QAMentor
#Scenario     :  Registration of new user with silver plan
#Application  :  QAVendors
Feature: Registration with silver plan

  Background:
    Given browser is "firefox"

  @register
  Scenario Outline: User registration with Silver plan
    Given user navigates to the QAVendors App
    Then user verify the title "<title1>" in the app
    When user clicks on "Get Listed Today" button
    Then user verify the title "<title2>" in the app
    When user clicks on "silver plan Create Listing" button
    Then user verify the title "<title3>" in the app
    When user enters mail "<email>" and confirm "<email>" for the plan
    And user enters password "<password>" and confirm "<password>" for the plan
    And user clicks on captcha checkbox
    And user clicks on "Create My Profile" button
    Then Congratulations message should successfully appear in a popup
    When user clicks on "Continue to Vendor now" button
    Then user verify the title "<title4>" in the app
    And Dashboard page should be displayed
    When user closes chat window pop up if it is opened
    And user clicks on "User Account Menu" button
    And user clicks on "Logout" button
    Then user verify the title "Login Now - qavendors.com" in the app


    Examples:
      | email                  | password  | title1                                                        | title2                      | title3                                            | title4                          |
      | qacult.demo1@gmail.com | qamentor1 | Top and Best qa testing outsourcing companies - Qavendors.com | Join QAvendors.com - Today! | Silver Account Secure Signup - Join QAvendors.com | Home - My QAvendors.com Account |
