package StepDefinitions;

import Pages.CheckoutPage;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static Helpers.Hooks.driver;

public class CheckoutPageTests {


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
        Assert.assertEquals("Your cart page text does not match", "Your Cart", checkoutPage.verifyCartPage());
    }

    @When("the Checkout button is clicked")
    public void they_click_on_the_Checkout_button() {
        checkoutPage.clickOnCheckoutButton();
    }

    @And("the form is filled with {string},{string} and {string}")
    public void fill_in_the_form_with_and(String firstn, String lastn, String zip) {
        checkoutPage.fillInTheForm(firstn, lastn, zip);
    }

    @And("the Continue button is clicked")
    public void click_on_the_Continue_button() {
        checkoutPage.clickOnContinueButton();
    }

    @Then("the {string} page should be loaded, with the following details {string},{string} and {string}")
    public void they_should_see_the_page_with_the_following_details_and(String checkoutOverview, String subtotal, String tax, String total) {
        Assert.assertEquals("Overview does not match", checkoutPage.verifyCheckoutOverview(), checkoutOverview);
        Assert.assertEquals("Subtotal does not match", checkoutPage.verifySubTotal(), subtotal);
        Assert.assertEquals("Tax does not match", checkoutPage.verifyTax(), tax);
        Assert.assertEquals("Total does not match", checkoutPage.verifyTotal(), total);
    }

    @And("when the Finish button is clicked")
    public void when_they_click_on_the_Finish_button() {
        checkoutPage.clickOnTheFinishButton();
    }

    @Then("a success {string} should be displayed")
    public void they_should_see_a_success(String successMessage) {
        Assert.assertEquals("Success message does not match", checkoutPage.success(), successMessage);
    }


}
