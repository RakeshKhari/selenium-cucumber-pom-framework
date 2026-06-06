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

    By successMsg = By.className("complete-header");

    public void completeCheckout() {


        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.urlContains(
                        "checkout-step-one"));

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(firstName));

        System.out.println(
                driver.findElement(firstName).isDisplayed());

        System.out.println(
                driver.findElement(firstName).isEnabled());

        driver.findElement(firstName)
                .sendKeys("Rakesh");

        driver.findElement(lastName)
                .sendKeys("Khari");

        driver.findElement(zipCode)
                .sendKeys("110001");

        driver.findElement(continueBtn).click();

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(finishBtn));

        driver.findElement(finishBtn).click();
    }

    public String getSuccessMessage() {

        return driver.findElement(successMsg)
                .getText();
    }
}