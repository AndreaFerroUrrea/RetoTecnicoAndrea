Feature: Tax Value
  Scenario: check tax calculations
    Given Andrea as a customer when making a purchase
    When she consults the tax value of the purchase
    Then she checks that the tax is <08>
  Scenario: Validate final value
    Given Andrea as Swag Labs customer
    When she buys a product
    Then she checks if the value is correct