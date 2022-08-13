Feature: Amazon Payment Feature
  This feature will cover the testing of Payment and shipping functionality

  Background: 
    Given User is on Amazon Cart login page
    And clicks signInToYourAccount
    And User inputs "TalenTechTest@gmail.com" in the email field
    And clicks continue
    And user inputs "April2022" in the password field
    And clicks submit
    And clicks proceedTOCheckout

  @chrome @smoke @s0077
  Scenario: Shipping Address with Invalid info
    When clicks removeButton under the saved address
    And User inputs "765432 1st Building" in Apt, Suite, Unit, Building field
    And User inputs "The Great Big City" in the City field
    And User selects "New York" in the State field
    And User inputs "11372" in the Zip Code field
    And User clicks Use This Address
    Then User should see error message "Review your address"

  @chrome @smoke @s0077
  Scenario: Shipping Address with valid info
    When User inputs "74-09 37th Ave" in the Street Address field
    And User inputs "Suite #203 Bruson Building" in Apt, Suite, Unit, Building field
    And User inputs "Jackson Heights" in the City field
    And User selects "New York" in the State field
    And User inputs "11372" in the Zip Code field
    And User clicks Use This Address
    Then User should see Select a Payment Method page
