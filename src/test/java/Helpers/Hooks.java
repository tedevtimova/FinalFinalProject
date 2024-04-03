package Helpers;

import Helpers.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    public static WebDriver driver;

    @Before
    public void startBrowser() {
        driver = BrowserFactory.getDriver();
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            BrowserFactory.closeBrowser();
        }
    }
}


