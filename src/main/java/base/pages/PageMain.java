package base.pages;

import base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageMain {
    public PageMain(Page page) {
    }

    public WebElement getChapterOne() {
        return WebDriverFactory.getDriver().findElement(By.cssSelector("body > div.mainbody > ul > li:nth-child(1) > a"));
    }

    public WebElement getTextField() {
        return WebDriverFactory.getDriver().findElement(By.id("divontheleft"));
    }
}
