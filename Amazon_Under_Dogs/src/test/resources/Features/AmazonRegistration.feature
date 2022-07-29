Feature: Registration
  User Should Be Able To Register For A New Amazon Account

  Background: 
     User is on the Amazon 'Create Account' page


  @firefox @smoke @regression
  Scenario Outline: Amazon Registration with invalid info using email
    Given I am inputting new credentials
    When I input <name> in the name field
    And I input <email> in email field
    And I input <password> in the password field
    And I input <password2> in the re-enter password field
    And I click continue
    Then I should be redirected to comlete puzzle captcha page

    Examples: 
      | name  | email                   | password  | password2 | result |
      | Talen | talentechtest@gmail.com | April2022 |           | failed |
      | Talen | talentechtest@gmail.com |           | April2022 | failed |
      | Talen | talentechtest           | April2022 | April2022 | failed |
      | Talen |                         | April2022 | April2022 | failed |
      |       |    talentechtest@gmail.com                     |           |           | failed |
