package StepDefinitions;
import Pages.LoginPage;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static Helpers.Hooks.driver;

public class StepDefinitionsProductsPage {

    ProductsPage productsPage = new ProductsPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user has successfully logged in")
    public void the_user_has_successfully_logged_in() {
        loginPage.succesfullLogin("standard_user","secret_sauce");
    }

    @When("the user is at the Products page, they should see the Products title")
    public void the_user_is_at_the_Products_page_they_should_see_the_title() {
        Assert.assertTrue(productsPage.verifyProductsPage());
    }

    @And("the products should be sorted alphabetically from A to Z")
    public void and_the_products_should_be_sorted_alphabetically_from_A_to_Z() {
        Assert.assertTrue(productsPage.checkInitialSorting());
    }

    @When("the user clicks on the filter and chooses price low to high")
    public void the_user_clicks_on_the_filter_and_chooses() {
        productsPage.filterByPricesLowToHigh();
    }

    @Then("the products should be sorted by prices descending order")
    public void the_products_should_be_sorted_by_prices_descending_order() {
        Assert.assertTrue(productsPage.verifySortingByPriceDescending());
    }
    @When("the user clicks on the Add to cart button for a product")
    public void the_user_clicks_on_the_Add_to_cart_button_for_a_product() {
        productsPage.clickOnAddToCartButtonBackpackProduct();
    }

    @Then("the Shopping Cart badge should be {int}")
    public void the_Shopping_Cart_badge_should_be(Integer int1) {
                Assert.assertEquals(int1,productsPage.verifyCartBadgeQuantity());
    }
    @Then("if they add another product")
    public void if_they_add_another_product() {
        productsPage.clickOnAddToCartButtonOnesieProduct();
    }

    @When("then clicks on the Remove button for the same product")
    public void then_clicks_on_the_Remove_button_for_the_same_product() {
        productsPage.clickRemoveForBackPackProduct();
    }
    @Then("the Shopping Cart badge should be clear")
    public void the_Shopping_Cart_badge_should_be_clear() {
      Assert.assertFalse(productsPage.verifyCartBadgePresence());
    }

}
