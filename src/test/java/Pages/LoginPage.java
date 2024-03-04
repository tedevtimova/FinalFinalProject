package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

public LoginPage(WebDriver driver){
    this.driver = driver;
}

By username = By.id("user-name");
By password = By.id("password");
By loginbutton = By.id("login-button");

public void enterUsername(String name){
driver.findElement(username).sendKeys(name);
}

public void enterPassword(String pass){
    driver.findElement(password).sendKeys(pass);
}

public void clickOnLogin(){
    driver.findElement(loginbutton).click();
}

public void clearFields(){
    driver.findElement(username).clear();
    driver.findElement(password).clear();
}

public void succesfullLogin(String name, String pass){
    driver.get("https://www.saucedemo.com/");
    driver.findElement(username).sendKeys(name);
    driver.findElement(password).sendKeys(pass);
    driver.findElement(loginbutton).click();
}
}
