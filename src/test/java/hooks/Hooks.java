package hooks;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ScreenshotUtil;

public class Hooks {

    @Before
    public void setup() {

        DriverFactory.initDriver();

        DriverFactory.driver.get(
                "https://www.saucedemo.com/");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            ScreenshotUtil.captureScreenshot(
                    DriverFactory.driver,
                    scenario.getName());
        }

        DriverFactory.driver.quit();
    }
}