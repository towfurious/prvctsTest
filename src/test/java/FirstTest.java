import base.core.BaseTest;
import base.core.configuration.TestsConfig;
import org.testng.annotations.Test;

import static base.core.WebDriverFactory.getDriver;
import static base.core.LogHelper.getLogger;
import static org.testng.Assert.assertEquals;


public class FirstTest extends BaseTest {
    private String testUrl = TestsConfig.getConfig().getUrl();

    @Test
    public void test() {
        getDriver().get(testUrl);
        getPageMain().getChapterOne().click();
        assertEquals(getPageMain().getTextField().getText(), "Assert that this text is on the page");
        getLogger().info("Assertion complete!");
        getPageChapterOne().getHomePage().click();
        getLogger().info("Returned on Homepage");
    }
}
