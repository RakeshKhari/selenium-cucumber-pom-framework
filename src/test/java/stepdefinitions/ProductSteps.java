package stepdefinitions;

import pages.ProductPage;
import base.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class ProductSteps {

    ProductPage product =
            new ProductPage(DriverFactory.driver);

    @When("User lands on Products page")
    public void productsPage() {}

    @Then("User should see 6 products")
    public void verifyCount() {

        Assert.assertEquals(
                product.getProductCount(),
                6);
    }
}