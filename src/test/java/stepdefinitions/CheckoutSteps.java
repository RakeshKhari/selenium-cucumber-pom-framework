package stepdefinitions;

import pages.CartPage;
import pages.CheckoutPage;
import base.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CheckoutSteps {

    CartPage cart =
            new CartPage(DriverFactory.driver);

    CheckoutPage checkout =
            new CheckoutPage(
                    DriverFactory.driver);

    @When("User completes checkout process")
    public void checkoutProcess() {

        System.out.println(
                "Before checkout click URL = "
                        + DriverFactory.driver.getCurrentUrl());

        cart.clickCheckout();

        System.out.println(
                "After checkout click URL = "
                        + DriverFactory.driver.getCurrentUrl());

        checkout.completeCheckout();
    }

    @Then("Order should be placed successfully")
    public void verifyOrder() {

        Assert.assertEquals(
                checkout.getSuccessMessage(),
                "Thank you for your order!");
    }
}