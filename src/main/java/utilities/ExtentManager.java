package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "reports/ExtentReport.html");

            spark.config()
                    .setReportName(
                            "Selenium Cucumber Automation Report");

            spark.config()
                    .setDocumentTitle(
                            "Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Framework",
                    "Selenium + Cucumber + TestNG");

            extent.setSystemInfo(
                    "Tester",
                    "Rakesh Khari");
        }

        return extent;
    }
}