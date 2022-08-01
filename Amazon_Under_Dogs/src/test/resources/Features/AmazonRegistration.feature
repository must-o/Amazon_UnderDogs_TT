Feature: Registration
  User Should Be Able To Register For A New Amazon Account

  Background: Given  User is on the Amazon Create Account page

  @chrome 
  Scenario: Amazon Registration with invalid info using email
    When User inputs " " in the name field
    And User inputs "email" in email field
    And User inputs "pass" in the password field
    And User inputs "pass" in the re-enter password field
    And User clicks continue
    Then User should see name field error message "Enter your name"
    And User should see email field error message "Wrong or Invalid email"
    * User should see password field error message  "Minimum 6 characters required"
    * User should see password2 field error message "Passwords must match"


  #@firefox @smoke @regression
  #Scenario Outline: Amazon Registration with invalid info using email
    #When I input <name> in the name field
    #And I input <email> in email field
    #And I input <password> in the password field
    #And I input <password2> in the re-enter password field
    #And I click continue
    #Then I should be redirected to comlete puzzle captcha page
    #Examples: 
      #| name  | email                   | password  | password2 | result |
      #| Talen | talentechtest@gmail.com | April2022 |           | failed |
      #| Talen | talentechtest@gmail.com |           | April2022 | failed |
      #| Talen | talentechtest           | April2022 | April2022 | failed |
      #| Talen |                         | April2022 | April2022 | failed |
      #|       | talentechtest@gmail.com |           |           | failed |
