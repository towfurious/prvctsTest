package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
            throw new IllegalStateException("Driver has not been initialized. " +
                    "Please call WebDriverFactory.startBrowser() before use this method");
        }
    }

    /**
     * Start browser
     */

    static void startDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);


            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        } else {
            throw new IllegalStateException("Driver has already been initialized. Quit it before using this method");
        }
    }

    /**
     * Finishes browser
     */

    static void finishDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void await() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.withMessage("Wait");
    }
}