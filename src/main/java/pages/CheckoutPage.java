package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");

    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");

    By successMsg = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    public void completeCheckout() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for correct page
        wait.until(ExpectedConditions.urlContains("checkout-step-one"));

        // Fill form
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Rakesh");
        driver.findElement(lastName).sendKeys("Khari");
        driver.findElement(zipCode).sendKeys("110001");

        // Continue button (safe click)
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();

        // IMPORTANT: wait for next page load
        wait.until(ExpectedConditions.urlContains("checkout-step-two"));

        // Finish button FIX (most important change)
        By finishBtn = By.id("finish");

        wait.until(ExpectedConditions.visibilityOfElementLocated(finishBtn));
        wait.until(ExpectedConditions.elementToBeClickable(finishBtn));

        driver.findElement(finishBtn).click();
    }

    public String getSuccessMessage() {

        return driver.findElement(successMsg)
                .getText();
    }
}