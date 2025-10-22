Feature: my first featue

  Scenario Outline: The delivery type of automobile spare parts is dependent on the destination city of delivery.

    Given User is raising a delivery request for automobile spare parts

    When User enters the <"city">, a <"delivery type"> is set as a system default

    Then User submits delivery request
    Examples:
      |  city | delivery type|
      | Athens | Regular |
      | Delhi  | Regular |
      | Kolkata| Premium |
      | Houston| Premium |
@amit
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
#    When User Navigate to LogIn Page
#    And User enters Credentials to LogIn
#      | testuser_1 | Test@153 |
#    Then Message displayed Login Successfully

  @amit
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
#    When User Navigate to LogIn Page
#    Then Message displayed Login Successfully
  @par
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    Then Message displayed Login Successfully

  @par
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    Then Message displayed Login Successfully


  @drive
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page1