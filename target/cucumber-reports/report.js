$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features//fullScenario.feature");
formatter.feature({
  "name": "End to end test of full cycle - user logs in, adds 2 products to the basket and successfully checks out.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buying a product with successful checkout",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "products Sauce Labs Onesie and Sauce Labs Backpack are added to the basket",
  "keyword": "When "
});
formatter.step({
  "name": "the Basket icon is clicked",
  "keyword": "And "
});
formatter.step({
  "name": "the Your cart page is loaded",
  "keyword": "Then "
});
formatter.step({
  "name": "the Checkout button is clicked",
  "keyword": "When "
});
formatter.step({
  "name": "the form is filled with \"\u003cfirst name\u003e\",\"\u003clast name\u003e\" and \"\u003czip code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the Continue button is clicked",
  "keyword": "And "
});
formatter.step({
  "name": "the \"Checkout: Overview\" page should be loaded, with the following details \"\u003citem total\u003e\",\"\u003ctax\u003e\" and \"\u003ctotal\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "when the Finish button is clicked",
  "keyword": "And "
});
formatter.step({
  "name": "a success \"\u003cmessage\u003e\" should be displayed",
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "products Sauce Labs Onesie and Sauce Labs Backpack are added to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_add_products_Sauce_Labs_Onesie_and_Sauce_Labs_Backpack_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Basket icon is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.click_on_the_Basket_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Your cart page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_are_redirected_to_the_Your_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Checkout button is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_click_on_the_Checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the form is filled with \"Teodora\",\"Evtimova\" and \"9000\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.fill_in_the_form_with_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Continue button is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.click_on_the_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Checkout: Overview\" page should be loaded, with the following details \"Item total: $37.98\",\"Tax: $3.04\" and \"Total: $41.02\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.they_should_see_the_page_with_the_following_details_and(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when the Finish button is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitionsCheckoutPage.when_they_click_on_the_Finish_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a success \"Thank you for your order!\" should be displayed",
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
});