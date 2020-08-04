Feature: Register

  Background: Skip Greeting and Permission
    Given Skip Greeting

  @registration
  Scenario Outline: Verify password must > 6 Character
    Given access register screen
    When register using "<password>"
    Then should see alert message minimum password character
    Examples:
    |     password    |
    |     1           |
    |     test1       |

    @registration
    Scenario Outline: Required Field
    Given access register screen
    When register using "<firstname>" "<email>" "<password>"
    Then shouldnt be able submit
    Examples:
      |     firstname    |     email         |     password    |
      |                 |                   |                 |
      |                 | aadd14@gmail.com  |     password    |
      |  Sapirolan      |                   |     password    |
      |  Sapirolan      | aadd14@gmail.com  |                 |

  @registration
  Scenario: Register with username has registered
    Given access register screen
    When register using email has registered
    Then should see alert message invalid register

  @registration
  Scenario: Valid register account
    Given access register screen
    When filled valid data
    Then register successfull

