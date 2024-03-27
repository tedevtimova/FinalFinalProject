package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By loginbutton = By.id("login-button");

    public void enterUsername(String name) {
        Assert.assertTrue(driver.findElement(username).getAttribute("value").isEmpty());
        driver.findElement(username).sendKeys(name);
        Assert.assertTrue(driver.findElement(username).getAttribute("value").contains(name));
    }

    public void enterPassword(String pass) {
        Assert.assertTrue(driver.findElement(password).getAttribute("value").isEmpty());
        driver.findElement(password).sendKeys(pass);
        Assert.assertTrue(driver.findElement(password).getAttribute("value").contains(pass));
    }

    public void clickOnLogin() {
        Assert.assertTrue(driver.findElement(loginbutton).isEnabled());
        driver.findElement(loginbutton).click();
    }

    public void clearFields() {
        driver.findElement(username).clear();
        driver.findElement(password).clear();
    }

    public void succesfullLogin(String name, String pass) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(username).sendKeys(name);
        Assert.assertTrue(driver.findElement(username).getAttribute("value").contains(name));
        driver.findElement(password).sendKeys(pass);
        Assert.assertTrue(driver.findElement(password).getAttribute("value").contains(pass));
        Assert.assertTrue(driver.findElement(loginbutton).isEnabled());
        driver.findElement(loginbutton).click();
    }
}
