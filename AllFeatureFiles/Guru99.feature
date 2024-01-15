Feature: Test Guru99 Application

  Scenario: Test Register Functionality
    Given User is on register page
    When user enter firstname, lastname, phone, email in contact info
    Then user enter address, city, state, postal code, country in mailing info
    Then user enter username and password and confirm password
    And user click on submit button
