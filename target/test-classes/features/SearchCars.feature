#Author: ncmalala@gmail.com
@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine
   In order to validate that
   the search cars page is working fine
   we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the Home Page "https://www.carsguide.com.au/" of CarsGuide Website
    When I move to the menu
      | Menu       |
      | buy + Sell |
      | reviews    |
    And Click on  "Search Cars link" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select car model as "1 Series" from AnyModel dropdown
    And select location as "SA - All" from AnyLocation dropdown
    And select price as "$10,000" from Price dropdown
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And The page title should be "Bmw 1 Series Under 10000 for Sale SA | carsguide"
