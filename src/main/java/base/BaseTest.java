package base;


import base.pages.Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest extends Page {
    @BeforeClass
    public void setUp() {
        WebDriverFactory.startDriver();
        logDebug("Initiating application.");
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.finishDriver();
        logDebug("Exiting application.");
    }
}