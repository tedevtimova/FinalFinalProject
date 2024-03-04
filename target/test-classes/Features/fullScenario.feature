Feature: End to end test of full cycle - user logs in, adds 2 products to the basket and successfully checks out.

 Background:
  Given the user has successfully logged in

 Scenario Outline:Buying a product with successful checkout
  When they add products Sauce Labs Onesie and Sauce Labs Backpack to the basket
  And  click on the Basket icon
  Then they are redirected to the Your cart page
  When they click on the Checkout button
  And fill in the form with "<first name>","<last name>" and "<zip code>"
   And click on the Continue button
   Then they should see the "Checkout: Overview" page with the following details "<item total>","<tax>" and "<total>"
   And when they click on the Finish button
   Then they should see a success "<message>"
   Examples:
   |first name|last name|zip code|item total|tax|total|message|
   |Teodora|Evtimova|9000|Item total: $37.98|Tax: $3.04|Total: $41.02|Thank you for your order!|