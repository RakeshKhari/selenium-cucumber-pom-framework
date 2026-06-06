package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By products = By.className("inventory_item");

    By addToCart =
            By.id("add-to-cart-sauce-labs-backpack");

    public int getProductCount() {

        List list =
                driver.findElements(products);

        return list.size();
    }

    public void addProductToCart() {
        driver.findElement(addToCart).click();
    }
}