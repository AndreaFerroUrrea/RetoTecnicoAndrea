Feature: Test user role

  Scenario: test standard user
    Given Andrea is a client who needs to log in
    When she wants to try standard user
    Then she should login successfully

  Scenario: test locked_out_user
    Given Andrea is a client who needs to log in
    When she wants to test a blocked user
    Then she sees an informative message

  Scenario: test problem_user
    Given Andrea is a client who needs to log in
    When she wants to test a troubled user
    Then she sees errors in the products


  Scenario: test performance_glitch_user
    Given Andrea is a client who needs to log in
    When she wants to test a user with performance issues
    Then she has errors when logging in

