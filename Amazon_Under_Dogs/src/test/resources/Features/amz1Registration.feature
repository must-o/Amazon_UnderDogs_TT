Feature: Amazon Registration Feature
  User Should Be Able To Register For A New Amazon Account

  Background: 
    Given Customer in Amazon Create Account page

  @chrome @smoke @s0801
  Scenario: Amazon Registration with invalid info using email should show error messages
    When User inputs "" in the name field
    And User inputs "email" in email field
    And User inputs "pass" in the password field
    And User inputs "passw" in the re-enter password field
    And User clicks continue
    Then User should see name field error message "Enter your name"
    And User should see email field error message "Wrong or Invalid email address or mobile phone number. Please correct and try again."
    * User should see password field error message  "Minimum 6 characters required"
    * User should see password2 field error message "Passwords must match"

  @chrome @smoke @s0801
  Scenario: Amazon Registration with valid info should redirect to captcha page
    When User inputs "Mustafa" in the name field
    And User inputs "talentest1@gmail.com" in email field
    And User inputs "Password2022" in the password field
    And User inputs "Password2022" in the re-enter password field
    And User clicks continue
    Then User should be redircted to the captcha puzzle page
