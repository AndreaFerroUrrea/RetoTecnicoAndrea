 Feature: fiscal value
  Scenario: Check tax calculations
    Given to Andrea as a customer when making a purchase of the most expensive product
    When you consult the fiscal value of the purchase
    Then check that the tax is "Tax: $2.40"

  Scenario: Validate final value
    Given to Andrea as a client of Swag Labs
    When she buys the most expensive product
    Then check if the total value is "Total: $32.39"