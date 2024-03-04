$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features//fullScenario.feature");
formatter.feature({
  "name": "End to end test of full cycle - user logs in, adds 2 products to the basket and successfully checks out.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Buying a product with successful checkout",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "they add products Sauce Labs Onesie and Sauce Labs Backpack to the basket",
  "keyword": "When "
});
formatter.step({
  "name": "click on the Basket icon",
  "keyword": "And "
});
formatter.step({
  "name": "they are redirected to the Your cart page",
  "keyword": "Then "
});
formatter.step({
  "name": "they click on the Checkout button",
  "keyword": "When "
});
formatter.step({
  "name": "fill in the form with \"\u003cfirst name\u003e\",\"\u003clast name\u003e\" and \"\u003czip code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on the Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "they should see the \"Checkout: Overview\" page with the following details \"\u003citem total\u003e\",\"\u003ctax\u003e\" and \"\u003ctotal\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "when they click on the Finish button",
  "keyword": "And "
});
formatter.step({
  "name": "they should see a success \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "zip code",
        "item total",
        "tax",
        "total",
        "message"
      ]
    },
    {
      "cells": [
        "Teodora",
        "Evtimova",
        "9000",
        "Item total: $37.98",
        "Tax: $3.04",
        "Total: $41.02",
        "Thank you for your order!"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user has successfully logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_has_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buying a product with successful checkout",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "they add products Sauce Labs Onesie and Sauce Labs Backpack to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_add_products_Sauce_Labs_Onesie_and_Sauce_Labs_Backpack_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the Basket icon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.click_on_the_Basket_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they are redirected to the Your cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_are_redirected_to_the_Your_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they click on the Checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_click_on_the_Checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill in the form with \"Teodora\",\"Evtimova\" and \"9000\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.fill_in_the_form_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.click_on_the_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they should see the \"Checkout: Overview\" page with the following details \"Item total: $37.98\",\"Tax: $3.04\" and \"Total: $41.02\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_should_see_the_page_with_the_following_details_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when they click on the Finish button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.when_they_click_on_the_Finish_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they should see a success \"Thank you for your order!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_should_see_a_success(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("classpath:Features//login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Unsuccessful login with credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "the login should be unsuccessful and the user should see a \"\u003cmessage\u003e\" that the credentials are incorrect",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secrets_sauce",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    },
    {
      "cells": [
        "standard_userr",
        "secret_sauce",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is at the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_is_at_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessful login with credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters invalid \"standard_user\" and \"secrets_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_enters_invalid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login should be unsuccessful and the user should see a \"Epic sadface: Username and password do not match any user in this service\" that the credentials are incorrect",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_login_should_be_unsuccessful_and_the_user_should_see_a_that_the_credentials_are_incorrect(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is at the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_is_at_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessful login with credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters invalid \"standard_userr\" and \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_enters_invalid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login should be unsuccessful and the user should see a \"Epic sadface: Username and password do not match any user in this service\" that the credentials are incorrect",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_login_should_be_unsuccessful_and_the_user_should_see_a_that_the_credentials_are_incorrect(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Unsuccessful login without credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user leaves username and password empty",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "the login should be unsuccessful and the user should see a \"\u003cmessage\u003e\" that credentials are required",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "message"
      ]
    },
    {
      "cells": [
        "Epic sadface: Username is required"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is at the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_is_at_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessful login without credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user leaves username and password empty",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_leaves_username_and_password_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login should be unsuccessful and the user should see a \"Epic sadface: Username is required\" that credentials are required",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.theLoginShouldBeUnsuccessfulAndTheUserShouldSeeAThatCredentialsAreRequired(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "the login should be successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is at the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_is_at_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters valid \"standard_user\" and \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_user_enters_valid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsLoginPage.the_login_should_be_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("classpath:Features//productsPage.feature");
formatter.feature({
  "name": "Products page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user has successfully logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_has_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify products page and alphabetical sorting of products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is at the Products page, they should see the Products title",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_is_at_the_Products_page_they_should_see_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the products should be sorted alphabetically from A to Z",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.and_the_products_should_be_sorted_alphabetically_from_A_to_Z()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user has successfully logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_has_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User filters prices from low to high",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user clicks on the filter and chooses price low to high",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_clicks_on_the_filter_and_chooses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the products should be sorted by prices descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_products_should_be_sorted_by_prices_descending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user has successfully logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_has_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add 2 products and check cart badge number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user clicks on the Add to cart button for a product",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_clicks_on_the_Add_to_cart_button_for_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Shopping Cart badge should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_Shopping_Cart_badge_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "if they add another product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.if_they_add_another_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Shopping Cart badge should be 2",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_Shopping_Cart_badge_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user has successfully logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_has_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "If a user adds and then removes a product, verify that the Shopping cart badge is clear",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user clicks on the Add to cart button for a product",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_user_clicks_on_the_Add_to_cart_button_for_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then clicks on the Remove button for the same product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.then_clicks_on_the_Remove_button_for_the_same_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Shopping Cart badge should be clear",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsProductsPage.the_Shopping_Cart_badge_should_be_clear()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});