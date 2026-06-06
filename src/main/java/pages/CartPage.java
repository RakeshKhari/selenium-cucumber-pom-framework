package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By cartIcon = By.className("shopping_cart_link");

    By cartItem = By.className("inventory_item_name");

    By checkoutBtn = By.id("checkout");

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public boolean isProductVisible() {
        return driver.findElement(cartItem).isDisplayed();
    }

    public void clickCheckout() {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                        ExpectedConditions
                                .elementToBeClickable(checkoutBtn))
                .click();

        System.out.println(
                "URL After Checkout Click = "
                        + driver.getCurrentUrl());
    }
}