package Pages;

import Helpers.Waits;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");


    public void enterUsername(String name) {
        WebElement usernameField = driver.findElement(username);
        Assert.assertTrue("Username is not empty", usernameField.getAttribute("value").isEmpty());
        usernameField.sendKeys(name);
        Assert.assertTrue("Entered username input and displayed text do not match", usernameField.getAttribute("value").contains(name));
    }

    public void enterPassword(String pass) {
        WebElement passwordField = driver.findElement(password);
        Assert.assertTrue("Password is not empty", passwordField.getAttribute("value").isEmpty());
        passwordField.sendKeys(pass);
        Assert.assertTrue("Entered password input and displayed text do not match", passwordField.getAttribute("value").contains(pass));
    }

    public void clickOnLogin() {
        WebElement loginButton = driver.findElement(login);
        Assert.assertTrue("Login button is not displayed", loginButton.isEnabled());
        loginButton.click();
    }

    public void clearFields() {
        WebElement usernameField = driver.findElement(username);
        WebElement passwordField = driver.findElement(password);
        passwordField.clear();
        usernameField.clear();
    }

    public void succesfullLogin(String name, String pass) {

        driver.get("https://www.saucedemo.com/");
        Waits.getExplicitWait(driver).until(ExpectedConditions.elementToBeClickable(username));
        WebElement usernameField = driver.findElement(username);
        usernameField.sendKeys(name);
        Assert.assertTrue("Displayed username does not match input",usernameField.getAttribute("value").contains(name));
        WebElement passwordField = driver.findElement(password);
        passwordField.sendKeys(pass);
        Assert.assertTrue("Displayed username does not match input",passwordField.getAttribute("value").contains(pass));
        WebElement loginButton = driver.findElement(login);
        Assert.assertTrue("Login button is not displayed",loginButton.isEnabled());
        loginButton.click();
    }
}
