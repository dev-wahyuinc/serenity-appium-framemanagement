Feature: Login

  Background: Skip Greeting and Permission
    Given Skip Greeting

  @test @login @regression @negative
  Scenario Outline: Submit with empty field
    Given in login screen
    When submit email with "<email>" and "<password>"
    Then shouldnt submit login
    Examples:
      |           email               |   password       |
      |                               |                  |
      |         email@gmail           |                  |
      |                               |   password123    |

  @login @regression @negative
  Scenario Outline: Invalid email format
    Given in login screen
    When submit email with "<email>" and "testqwe123"
    Then should see alert error Valid Email
    Examples:
      |           email               |
      |           aaaa                |
      |           email.co            |
      |           email@gmail         |
      |           email#gmail.com     |
      |           @gmail.com          |

  @login @regression
  Scenario: Invalid login
    Given in login screen
    When user wrong password and email
    Then should see Error Login

  @login @regression
  Scenario: Authentication with unregister email
    Given in login screen
    When user using unregister email or account
    Then should see Error Login

  @login @regression @validlogin
  Scenario: Login succesful
    Given in login screen
    When log in using a valid email address and password
    Then should be access to his account
