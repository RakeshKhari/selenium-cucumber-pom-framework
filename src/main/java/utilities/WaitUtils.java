package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitUtils {

    public static void waitForElement(
            WebDriver driver,
            By locator) {

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(locator));
    }
}