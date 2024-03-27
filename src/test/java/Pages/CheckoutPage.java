package Pages;

import Helpers.Waits;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage {

    private WebDriver driver;
    By checkoutButton = By.name("checkout");
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By zipCode = By.name("postalCode");
    By continueButton = By.id("continue");
    By itemTotal = By.className("summary_subtotal_label");
    By tax = By.className("summary_tax_label");
    By total = By.className("summary_total_label");
    By finishButton = By.id("finish");
    By insideCartLabel = By.xpath("//span[contains(text(),'Your Cart')]");
    By checkoutOverviewLabel = By.xpath("//span[contains(text(),'Checkout: Overview')]");
    By successMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyCartPage() {
        Waits.getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(insideCartLabel));
        boolean cartTitle = driver.findElement(insideCartLabel).isDisplayed();
        return cartTitle;
    }

    public void clickOnCheckoutButton() {
        Assert.assertTrue(driver.findElement(checkoutButton).isEnabled());
        driver.findElement(checkoutButton).click();
    }

    public void fillInTheForm(String firstn, String lastn, String zip) {
        Assert.assertTrue(driver.findElement(firstNameField).getAttribute("value").isEmpty());
        driver.findElement(firstNameField).sendKeys(firstn);
        Assert.assertTrue(driver.findElement(firstNameField).getAttribute("value").contains(firstn));
        Assert.assertTrue(driver.findElement(lastNameField).getAttribute("value").isEmpty());
        driver.findElement(lastNameField).sendKeys(lastn);
        Assert.assertTrue(driver.findElement(lastNameField).getAttribute("value").contains(lastn));
        Assert.assertTrue(driver.findElement(zipCode).getAttribute("value").isEmpty());
        driver.findElement(zipCode).sendKeys(zip);
        Assert.assertTrue(driver.findElement(zipCode).getAttribute("value").contains(zip));
    }

    public void clickOnContinueButton() {
      Assert.assertTrue(driver.findElement(continueButton).isEnabled());
        driver.findElement(continueButton).click();
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
        Assert.assertTrue(driver.findElement(finishButton).isEnabled());
        driver.findElement(finishButton).click();
    }

    public String success() {
        Waits.getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        String successm = driver.findElement(successMessage).getText();
        return successm;
    }
}


