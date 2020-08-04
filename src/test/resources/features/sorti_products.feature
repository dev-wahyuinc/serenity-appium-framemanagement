Feature: Sort Products

  Background: Set Location
    Given Skip Greeting
    And set Location to Ragunan
    And choose one of the markets

@test @sortProducts
Scenario: Sort Products by A to Z
Given at Products List from Category Promotions
When i sort products by AZ
Then should display sort by AZ