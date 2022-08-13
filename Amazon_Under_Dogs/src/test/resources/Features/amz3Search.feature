#Author: Mahamud Sikder; mahamudun@gmail.com
#Summery: Amazon Search Feature testing on "Project - Amazon.com"
Feature: Amazon.com Product Search and ATC
  This feature will test amazon.com search functionality

  Background: 
    Given User is on amazon home page

  @chrome @AMZ-5
  Scenario Outline: Verify for invalid product
    When User enters an "<invalid_product>" name in the search box
    And Click on search button
    Then No link shows up on "<no_results>" page

    Examples: 
      | invalid_product                | no_results     |
      | আমি সত্যিই আশা করি এটি কাজ করে | No results for |

  @chrome @AMZ-5
  Scenario: Search for a valid product
    When User clicks on the Search box
    And Enter a valid product name "Echo"
    And Click on search button
    Then Links related to the Product display on "RESULTS" page
    When User clicks on Echo Dot Fourth Gen
    Then Echo product page opens
    When User clicks add to cart
    And Clicks X to close pop-up window
    Then User should be redirected to Cart page
    And User should see added to cart confirmation "Added to Cart"
