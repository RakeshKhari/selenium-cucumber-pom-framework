package utilities;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class ScreenshotUtil {

    public static void captureScreenshot(
            WebDriver driver,
            String fileName) {

        try {

            File source =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File destination =
                    new File("screenshots/"
                            + fileName + ".png");

            FileUtils.copyFile(source, destination);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}