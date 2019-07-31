import base.BaseTest;
import org.testng.annotations.Test;

import static base.WebDriverFactory.getDriver;
import static base.util.LogHelper.getLogger;
import static org.testng.Assert.assertEquals;


public class FirstTest extends BaseTest {

    @Test
    public void test() {
        getDriver().get("http://book.theautomatedtester.co.uk");
        getPageMain().getChapterOne().click();
        assertEquals(getPageMain().getTextField().getText(), "Assert that this text is on the page");
        getLogger().info("Assertion complete!");
        getPageChapterOne().getHomePage().click();
        getLogger().info("Returned on Homepage");
    }
}
