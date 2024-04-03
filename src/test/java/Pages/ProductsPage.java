package Pages;

import Helpers.Waits;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

import static Helpers.Hooks.driver;

public class ProductsPage {

    private WebDriver driver;

    List<Double> pricesBeforeFilter = new ArrayList<>();

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By pageTitle = By.className("title");
    By shoppingCartButtonLocator = By.id("shopping_cart_container");
    By shoppingCartBadge = By.className("shopping_cart_badge");
    By burgerMenuLocator = By.id("react-burger-menu-btn");
    By logoutLinkLocator = By.linkText("Logout");
    By productsNames = By.className("inventory_item_name");
    By filter = By.className("product_sort_container");
    By productPrices = By.className("inventory_item_price");
    By productOnesieAddToCartLocator = By.id("add-to-cart-sauce-labs-onesie");
    By productBackpackAddToCartLocator = By.id("add-to-cart-sauce-labs-backpack");
    By productBackpackRemoveLocator = By.id("remove-sauce-labs-backpack");


    public void verifyLogin() {
        WebElement burgerMenu = driver.findElement(burgerMenuLocator);
        Waits.getExplicitWait(driver).until(ExpectedConditions.elementToBeClickable(burgerMenu));
        burgerMenu.click();
        Waits.getExplicitWait(driver).until(ExpectedConditions.elementToBeClickable(logoutLinkLocator));
        WebElement logoutLink = driver.findElement(logoutLinkLocator);
        Assert.assertTrue("Logout link is not displayed", logoutLink.isDisplayed());

    }

    public boolean verifyProductsPage() {
        Waits.getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(pageTitle));
        boolean productsTitle = driver.findElement(pageTitle).isDisplayed();
        return productsTitle;
    }

    public boolean checkInitialSorting() {
        List<WebElement> productNamesAfterLogin = driver.findElements(productsNames);
        List<String> productsNamesList = new ArrayList<>();
        for (WebElement element : productNamesAfterLogin) {
            productsNamesList.add(String.valueOf(element.getText()));
        }
        List<String> productsNameListSorted = new ArrayList<>(productsNamesList);
        Collections.sort(productsNameListSorted);
        return productsNamesList.equals(productsNameListSorted);
    }

    public void filterByPricesLowToHigh() {
        List<WebElement> priceElement = driver.findElements(productPrices);
        for (WebElement element : priceElement) {
            pricesBeforeFilter.add(Double.valueOf(element.getText().replace("$", "")));
            System.out.println(element.getText());
        }
        Select dropdown = new Select(driver.findElement(filter));
        dropdown.selectByVisibleText("Price (low to high)");
    }

    public boolean verifySortingByPriceDescending() {
        List<WebElement> priceElementFiltered = driver.findElements(productPrices);
        List<Double> pricesAfterFilter = new ArrayList<>();
        for (WebElement element : priceElementFiltered) {
            pricesAfterFilter.add(Double.valueOf(element.getText().replace("$", "")));
            System.out.println(element.getText());
        }
        Collections.sort(pricesBeforeFilter);
        return pricesBeforeFilter.equals(pricesAfterFilter);
    }

    public void clickOnAddToCartButtonOnesieProduct() {
        WebElement productOnesieAddToCart = driver.findElement(productOnesieAddToCartLocator);
        Assert.assertTrue("Product is not displayed", productOnesieAddToCart.isEnabled());
        productOnesieAddToCart.click();
    }

    public void clickOnAddToCartButtonBackpackProduct() {
        WebElement productBackpackAddToCart = driver.findElement(productBackpackAddToCartLocator);
        Assert.assertTrue("Product is not displayed", productBackpackAddToCart.isEnabled());
        productBackpackAddToCart.click();
    }

    public Integer verifyCartBadgeQuantity() {
        return Integer.parseInt(driver.findElement(shoppingCartBadge).getText());
    }

    public void clickRemoveForBackPackProduct() {
        WebElement productBackpackRemove = driver.findElement(productBackpackRemoveLocator);
        Assert.assertTrue("Remove button is not available", productBackpackRemove.isEnabled());
        productBackpackRemove.click();
    }

    public boolean verifyCartBadgePresence() {

        try {
            driver.findElement(shoppingCartBadge);
            return true;
        } catch (Exception e) {
            System.out.println("Exception thrown - counter is not present");
        }
        return false;
    }

    public void clickOnCartButton() {
        WebElement shoppingCartButton = driver.findElement(shoppingCartButtonLocator);
        Assert.assertTrue("Shopping cart button is not available", shoppingCartButton.isEnabled());
        shoppingCartButton.click();
    }
}




