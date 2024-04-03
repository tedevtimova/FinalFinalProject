package Pages;

import Helpers.Waits;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage {

    private WebDriver driver;
    By checkoutButtonLocator = By.name("checkout");
    By firstNameFieldLocator = By.name("firstName");
    By lastNameFieldLocator = By.name("lastName");
    By zipCodeLocator = By.name("postalCode");
    By continueButtonLocator = By.id("continue");
    By itemTotal = By.className("summary_subtotal_label");
    By tax = By.className("summary_tax_label");
    By total = By.className("summary_total_label");
    By finishButtonLocator = By.id("finish");
    By insideCartLabel = By.xpath("//span[contains(text(),'Your Cart')]");
    By checkoutOverviewLabel = By.xpath("//span[contains(text(),'Checkout: Overview')]");
    By successMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String verifyCartPage() {
        Waits.getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(insideCartLabel));
        String cartTitle = driver.findElement(insideCartLabel).getText();
        return cartTitle;
    }

    public void clickOnCheckoutButton() {
        WebElement checkoutButton = driver.findElement(checkoutButtonLocator);
        Assert.assertTrue("Checkout button is not present", checkoutButton.isEnabled());
        checkoutButton.click();
    }

    public void fillInTheForm(String firstn, String lastn, String zip) {
        WebElement firstNameField = driver.findElement(firstNameFieldLocator);
        Assert.assertTrue("First name field is not displayed", firstNameField.getAttribute("value").isEmpty());
        firstNameField.sendKeys(firstn);
        Assert.assertTrue("First name field input does not match", firstNameField.getAttribute("value").contains(firstn));
        WebElement lastNameField = driver.findElement(lastNameFieldLocator);
        Assert.assertTrue("Last name field is not displayed", lastNameField.getAttribute("value").isEmpty());
        lastNameField.sendKeys(lastn);
        Assert.assertTrue("Last name field input does not match", lastNameField.getAttribute("value").contains(lastn));
        WebElement zipCode = driver.findElement(zipCodeLocator);
        Assert.assertTrue("Zip code field is not displayed", zipCode.getAttribute("value").isEmpty());
        zipCode.sendKeys(zip);
        Assert.assertTrue("Zip code field input does not match", zipCode.getAttribute("value").contains(zip));
    }

    public void clickOnContinueButton() {
        WebElement continueButton = driver.findElement(continueButtonLocator);
        Assert.assertTrue("Continue button is not displayed", continueButton.isEnabled());
        continueButton.click();
    }

    public String verifyCheckoutOverview() {
        Waits.getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(checkoutOverviewLabel));
        String checkoutOverview = driver.findElement(checkoutOverviewLabel).getText();
        return checkoutOverview;
    }

    public String verifySubTotal() {
        String subtotal = driver.findElement(itemTotal).getText();
        return subtotal;
    }

    public String verifyTax() {
        String taxDisplayed = driver.findElement(tax).getText();
        return taxDisplayed;
    }

    public String verifyTotal() {
        String totalIsDisplayed = driver.findElement(total).getText();
        return totalIsDisplayed;
    }

    public void clickOnTheFinishButton() {
        WebElement finishButton = driver.findElement(finishButtonLocator);
        Assert.assertTrue("Finish button is not displayed", finishButton.isEnabled());
        finishButton.click();
    }

    public String success() {
        Waits.getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        String successm = driver.findElement(successMessage).getText();
        return successm;
    }
}


