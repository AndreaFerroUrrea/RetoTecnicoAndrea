Feature: user role

  Scenario: Test different user roles
    Given Andrea is a client who needs to log in
    When she wants to try the different roles
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
    Then she should see the appropriate result for each role