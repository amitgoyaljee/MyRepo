Feature: Login to SauceDemo
  @pico
  Scenario: Valid login
    Given I open the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I add "Sauce Labs Backpack"
#    remove item from cart--->"Sauce Labs Backpack" not have information so will pass with costructor
    Then remove item from cart
    And verify item removed