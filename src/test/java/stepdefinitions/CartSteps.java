package stepdefinitions;

import pages.CartPage;
import pages.ProductPage;
import base.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CartSteps {

    ProductPage product =
            new ProductPage(DriverFactory.driver);

    CartPage cart =
            new CartPage(DriverFactory.driver);

    @When("User adds product to cart")
    public void addProduct() {

        product.addProductToCart();
    }

    @And("User opens cart page")
    public void openCart() {

        cart.openCart();
    }

    @Then("Product should be visible inside cart")
    public void verifyCart() {

        Assert.assertTrue(
                cart.isProductVisible());
    }
}