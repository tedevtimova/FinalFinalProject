package StepDefinitions;

import Pages.CheckoutPage;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import static Helpers.Hooks.driver;

public class StepDefinitionsCheckoutPage {


    CheckoutPage checkoutPage = new CheckoutPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);

    @When("products Sauce Labs Onesie and Sauce Labs Backpack are added to the basket")
    public void they_add_products_Sauce_Labs_Onesie_and_Sauce_Labs_Backpack_to_the_basket() {
    productsPage.clickOnAddToCartButtonOnesieProduct();
    productsPage.clickOnAddToCartButtonBackpackProduct();
    }

    @And("the Basket icon is clicked")
    public void click_on_the_Basket_icon() {
        productsPage.clickOnCartButton();
    }

    @Then("the Your cart page is loaded")
    public void they_are_redirected_to_the_Your_cart_page() {
      Assert.assertTrue(checkoutPage.verifyCartPage());
    }

    @When("the Checkout button is clicked")
    public void they_click_on_the_Checkout_button() {
      checkoutPage.clickOnCheckoutButton();
    }

    @And("the form is filled with {string},{string} and {string}")
    public void fill_in_the_form_with_and(String string, String string2, String string3) {
    checkoutPage.fillInTheForm(string,string2,string3);
    }

    @And("the Continue button is clicked")
    public void click_on_the_Continue_button() {
    checkoutPage.clickOnContinueButton();
    }

    @Then("the {string} page should be loaded, with the following details {string},{string} and {string}")
    public void they_should_see_the_page_with_the_following_details_and(String string, String string2, String string3, String string4) {
      Assert.assertEquals(checkoutPage.verifyCheckoutOverview(),string);
      Assert.assertEquals(checkoutPage.verifySubTotal(),string2);
      Assert.assertEquals(checkoutPage.verifyTax(),string3);
      Assert.assertEquals(checkoutPage.verifyTotal(),string4);
    }

    @And("when the Finish button is clicked")
    public void when_they_click_on_the_Finish_button() {
    checkoutPage.clickOnTheFinishButton();
    }

    @Then("a success {string} should be displayed")
    public void they_should_see_a_success(String string) {
    Assert.assertEquals(checkoutPage.success(),string);
    }








}
