package base.core;


import base.pages.Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static base.core.LogHelper.getLogger;


public class BaseTest extends Page {
    @BeforeClass
    public void setUp() {
        WebDriverFactory.startDriver();
        getLogger().info("Initiating application.");
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.finishDriver();
        getLogger().info("Exiting application.");
    }
}