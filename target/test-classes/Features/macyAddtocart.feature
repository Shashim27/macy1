
Feature: Add and item to cart and view bag
@chrome
  Scenario: User should be able to add item in cart and view item in the bag
    Given User is on "https://www.macys.com/shop/shoes/high-heels?id=71123"
    When User sort item by best seller from dropdown menu
    Then user is able to see item based on best seller filter
    When User clicks on an item
    And User choose a color
    And User choose a size
    And User Clicks on Add to bag
    And User Clicks on View bag from the new window
    Then User is able to see the item added in the bag
