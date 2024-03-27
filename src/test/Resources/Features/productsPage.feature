Feature: Products page

  Background:
    Given the user has successfully logged in


  Scenario:Verify products page and alphabetical sorting of products
    When the user is at the Products page, they should see the Products title
    And the products should be sorted alphabetically from A to Z

  Scenario:User filters prices from low to high
    When the user clicks on the filter and chooses price low to high
    Then the products should be sorted by prices descending order

  Scenario:Add 2 products and check cart badge number
    When the user clicks on the Add to cart button for a product
    Then the Shopping Cart badge should be 1
    And if they add another product
    Then the Shopping Cart badge should be 2

  Scenario:If a user adds and then removes a product, verify that the Shopping cart badge is clear
    When the user clicks on the Add to cart button for a product
    And  then clicks on the Remove button for the same product
    Then the Shopping Cart badge should be clear
