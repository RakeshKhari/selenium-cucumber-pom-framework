package stepdefinitions;

import base.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage login =
            new LoginPage(DriverFactory.driver);

    @Given("User launches SauceDemo application")
    public void launchApp() {
        // Browser Hooks.java se launch ho raha hai
    }

    @Given("User is logged into SauceDemo")
    public void user_is_logged_into_sauce_demo() {

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
    }

    @When("User enters valid username and password")
    public void validLogin() {

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
    }

    @When("User enters invalid username and password")
    public void invalidLogin() {

        login.enterUsername("wrong");
        login.enterPassword("wrong");
    }

    @And("User clicks login button")
    public void clickLogin() {

        login.clickLogin();
    }

    @Then("User should navigate to Products page")
    public void verifyLogin() {

        Assert.assertTrue(
                DriverFactory.driver.getCurrentUrl()
                        .contains("inventory"));
    }

    @Then("User should see login error message")
    public void verifyError() {

        Assert.assertTrue(
                login.getErrorMessage()
                        .contains("Username"));
    }
}