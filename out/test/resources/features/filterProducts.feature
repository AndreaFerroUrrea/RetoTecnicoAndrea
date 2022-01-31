Feature: Filter products
  Scenario: Check products filter
    Given Andrea as a customer sees the products
    When she wants to filter the products from highest to lowest price
    Then she sees the products from highest to lowest price