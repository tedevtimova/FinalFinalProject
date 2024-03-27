package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    public static WebDriverWait getExplicitWait(WebDriver driver) {
        return new WebDriverWait(driver, 4);

    }
}
