package base.pages;

import base.core.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageMain {
    public PageMain(Page page) {
    }

    /* Priority of elements id > css > xpath
     Locators was captured by Chrome dev tools
     if "id" is absent, i got css
     by clicking copy "copy selector"
     */
    public WebElement getChapterOne() {
        return WebDriverFactory.getDriver().findElement(By.cssSelector("body > div.mainbody > ul > li:nth-child(1) > a"));
    }

    public WebElement getTextField() {
        return WebDriverFactory.getDriver().findElement(By.id("divontheleft"));
    }
}
