@test
Feature: End to end test of full cycle - user logs in, adds 2 products to the basket and successfully checks out.

 Background:
  Given the user has successfully logged in

 Scenario Outline:Buying a product with successful checkout
  When products Sauce Labs Onesie and Sauce Labs Backpack are added to the basket
  And  the Basket icon is clicked
  Then the Your cart page is loaded
  When the Checkout button is clicked
  And the form is filled with "<first name>","<last name>" and "<zip code>"
   And the Continue button is clicked
   Then the "Checkout: Overview" page should be loaded, with the following details "<item total>","<tax>" and "<total>"
   And when the Finish button is clicked
   Then a success "<message>" should be displayed
   Examples:
   |first name|last name|zip code|item total|tax|total|message|
   |Teodora|Evtimova|9000|Item total: $37.98|Tax: $3.04|Total: $41.02|Thank you for your order!|