  Feature: login
  As a user, user wants to login into the account
  so that user can use such facilities

  Scenario: user should be able to login with valid credentials
    Given user is on the login page
    When user type valid username as “jack123”
    And user type valid password as “j123456”
    And user click on the submit button
    Then user should be able to login successfully.

  Scenario: user should not be able to login with invalid credentials
    Given user is on login page
    When user type invalid username as “smith1234”
    And user type invalid password as “s123456”
    And user click on submit button
    Then user should not be able to login
    And error message should display.

  Scenario: user should not be able to login with valid username and invalid password
    Given user is on login page
    When user type valid username as “jack123”
    And user type invalid password as “s123456”
    And user click on submit button
    Then user should not be able to login
    And error message should display.

  Scenario: user should not be able to login with invalid username and valid password
    Given user is on the login page
    When user type invalid username as “smith1234”
    And user type valid password as “j123456”
    And user click on submit button
    Then user should not be able to login
    And error message should display.

  Scenario: user should not be able to login with valid username and blank password
    Given user is on the login page
    When user type valid username as “jack123”
    And user click on the submit button
    Then user should not be able to login
    And error message should display.

  Scenario: user should not be able to login with invalid username and blank password
    Given user is on the login page
    When user type invalid username as “smith1234”
    And click on the submit button
    Then user should not be able to login
    And error message should display.

  Scenario: user should not be able to login with blank username and valid password
    Given user is on the login page
    When user type valid password as “j123456”
    And user click on the submit button
    Then user should not be able to login
    And error message should display.

  Scenario: user should not be able to login with blank username and invalid password
    Given user is on the login page
    When user type invalid password as “s123456”