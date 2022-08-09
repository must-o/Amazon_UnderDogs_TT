Feature: Amazon Sign-in Feature
  User Should Be Able To Sign-in with an Amazon Account
#Background: User is on the Amazon Sign-in page

  @chrome @smoke @s7001
  Scenario: Amazon Sign-in with valid credentials using email
    Given User is on the Amazon Sign-in page
    When User enters valid email "TalenTechTest@gmail.com" in email text box
    And User clicks on the continue button
    And User enters valid password "April2022" in password text box
    And User clicks on the Sign-in button
    Then User should be should be redirected to the home page of amazon

  @chrome @smoke @s7001
  Scenario: Amazon Sign-in functionality with valid email and invalid password
    Given User is on the Amazon Sign-in page
    When User enters valid email "TalenTechTest@gmail.com"  in text box
    And User clicks on the continue button
    And User enters invalid password "111111111" in password text box
    And User clicks on the Sign-in button
    Then User should receive an error message "There was a problem"

  @chrome @smoke @s7001
  Scenario: User should get an error message if invalid email is provided
    Given User is on the Amazon Sign-in page
    When User enters valid email "TalenTechTest@@gmail.com" in email text box
    And User clicks on the continue button
    Then User should receive an error message "There was a problem"

  @chrome @smoke @s7001
  Scenario: Amazon login functionality without entering email
    Given User is on the Amazon Sign-in page
    When User does not enter anything "" in email in text box
    And User clicks on the continue button
    Then User should receive error message "Enter your email or mobile phone number"