Feature: Filter products
  Scenario: Check products filter
    Given Andrea as a customer sees the products
    When she wants to filter the products from highest to lowest price
    Then she sees the product with a value of "$49.99" as the first in the list