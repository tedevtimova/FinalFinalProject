package StepDefinitions;
import Pages.LoginPage;
import Pages.ProductsPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import static StepDefinitions.Hooks.driver;

public class StepDefinitionsLoginPage {

    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);

    @Given("the user is at the Login page")
    public void the_user_is_at_the_Login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters invalid {string} and {string}")
    public void the_user_enters_invalid_and(String string, String string2) {
        loginPage.enterUsername(string);
        loginPage.enterPassword(string2);
    }

    @And("clicks on the Login button")
    public void clicks_on_the_Login_button() {
     loginPage.clickOnLogin();
    }

    @Then("the login should be unsuccessful and the user should see a {string} that the credentials are incorrect")
    public void the_login_should_be_unsuccessful_and_the_user_should_see_a_that_the_credentials_are_incorrect(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
    }

    @When("the user leaves username and password empty")
    public void the_user_leaves_username_and_password_empty() {
        loginPage.clearFields();
    }

    @Then("the login should be unsuccessful and the user should see a {string} that credentials are required")
    public void theLoginShouldBeUnsuccessfulAndTheUserShouldSeeAThatCredentialsAreRequired(String arg0) {
        Assert.assertTrue(driver.getPageSource().contains(arg0));
    }

    @When("the user enters valid {string} and {string}")
    public void the_user_enters_valid_and(String string, String string2) {
        loginPage.enterUsername(string);
        loginPage.enterPassword(string2);
    }

    @Then("the login should be successful")
    public void the_login_should_be_successful() {
        productsPage.verifyLogin();
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }
}
